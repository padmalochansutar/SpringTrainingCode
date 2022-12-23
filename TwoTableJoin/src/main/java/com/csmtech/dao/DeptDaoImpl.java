package com.csmtech.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.entity.DeptDto;
import com.csmtech.util.DbUtil;

public class DeptDaoImpl implements DeptDao {
	private final static String allDeptSelectQuery = "select dept_id,dept_name from dept";
	private Connection con = null;

	@Override
	public List<DeptDto> getAllDepts() {
		
		List<DeptDto> deptDtoList = null;
		try (Connection con =DbUtil.getDbConnection();  Statement st = con.createStatement();) {
			try (ResultSet rs = st.executeQuery(allDeptSelectQuery);) {
				if (rs.next() != false) {
					deptDtoList = new ArrayList<DeptDto>();
					do {
						DeptDto deptDto = new DeptDto();
						deptDto.setDeptId(rs.getLong(1));
						deptDto.setDeptName(rs.getString(2));
						deptDtoList.add(deptDto);
					} while (rs.next());
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return deptDtoList;
	}

	

}
