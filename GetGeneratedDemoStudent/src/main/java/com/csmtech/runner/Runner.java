package com.csmtech.runner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.csmtech.util.DbUtil;

public class Runner {

	public static void main(String[] args) {
		// System.out.println(DbUtil.getDbConnection());
		Connection con = DbUtil.getDbConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// automatic id generated in id_generator
			ps=con.prepareStatement("insert into id_generator values()", Statement.RETURN_GENERATED_KEYS);
			ps.executeUpdate();
			rs = ps.getGeneratedKeys();
			if (rs.next())
				System.out.println(rs.getLong(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
