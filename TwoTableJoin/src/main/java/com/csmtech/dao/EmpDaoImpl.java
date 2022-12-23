package com.csmtech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.csmtech.entity.EmpDto;
import com.csmtech.util.DbUtil;

public class EmpDaoImpl implements EmpDao {
	private final static String readRecords="select emp_id,emp_name,salary,hire_date,dept_id from emp";
	private final static String addEmpQuery="insert into emp(emp_name,salary,hire_date,dept_id) values(?,?,?,?)";
	private Connection con=null;
	private PreparedStatement ps=null;
	private Statement st=null;
	private ResultSet rs=null;
	Integer noOfRecAff=0;
	public Integer saveEmp(EmpDto empDto) {
		con=DbUtil.getDbConnection();
		try {
			ps=con.prepareStatement(addEmpQuery);
			ps.setString(1, empDto.getEmpName());
			ps.setDouble(2, empDto.getSalary());
			ps.setDate(3, new java.sql.Date(empDto.getHireDate().getTime()));
			ps.setLong(4, empDto.getDeptId());
			noOfRecAff=ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
		return noOfRecAff;
	}
	@Override
	public List<EmpDto> getAllRecords() {
		con=DbUtil.getDbConnection();
		List<EmpDto> empDtoList=null;
		try {
			ps=con.prepareStatement(readRecords);
			rs=ps.executeQuery();
			if(rs.next()!=false) {
				empDtoList=new ArrayList<EmpDto>();
				do {
					EmpDto empDto=new EmpDto();
					empDto.setEmpId(rs.getLong(1));
					empDto.setEmpName(rs.getString(2));
					empDto.setSalary(rs.getDouble(3));
				}while();
			}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.closeDbConnection();
		return null;
	}

}
