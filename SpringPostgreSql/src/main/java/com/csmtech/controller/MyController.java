package com.csmtech.controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.asm.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.CallableStatementCreator;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/proc")
	public void test() {
		List<SqlParameter> paramList = new ArrayList<SqlParameter>();
		paramList.add(new SqlParameter(Type.INT));
		paramList.add(new SqlOutParameter("vstate_name",Type.CHAR));
		paramList.add(new SqlOutParameter("vcountry_name",Type.CHAR));
		Map<String,Object> resMap = jdbcTemplate.call(new CallableStatementCreator() {
			@Override
			public CallableStatement createCallableStatement(Connection con) throws SQLException {
				CallableStatement cs = con.prepareCall("CALL getStateCountryByStateId(?,?,?)");
				cs.setInt(1, 1631);
				cs.registerOutParameter(2,Types.VARCHAR);
				cs.registerOutParameter(3,Types.VARCHAR);
				return cs;
			}
		},paramList);
		System.out.println(resMap);
	}
	

}