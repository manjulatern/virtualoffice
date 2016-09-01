package com.ncit.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ncit.api.UserService;
import com.ncit.dbconnection.DatabaseConnection;
import com.ncit.dbconnection.DatabaseConnectionImpl;
import com.ncit.entity.Role;
import com.ncit.entity.User;

public class UserServiceImpl implements UserService {

	DatabaseConnection dbConnection = new DatabaseConnectionImpl();
	Statement statement = dbConnection.doConnection();

	@Override
	public boolean isUserValid(User user) {

		String query = "SELECT * from users where username = '"
				+ user.getUsername() + "' and password = '"
				+ user.getPassword() + "'";

		try {
			ResultSet rs = statement.executeQuery(query);

			if (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<User> getUserList() {

		List<User> userList = new ArrayList<User>();

		String query = "SELECT * from users";

		try {
			ResultSet rs = statement.executeQuery(query);

			while (rs.next()) {
				User user = new User();

				user.setId(rs.getInt("id"));
				user.setFirstName(rs.getString("first_name"));
				user.setLastName(rs.getString("last_name"));
				user.setUsername(rs.getString("username"));
				user.setAddress(rs.getString("address"));
				user.setCreatedDate(rs.getDate("created_date"));
				user.setEmail(rs.getString("email"));
				user.setMobile(rs.getString("mobile"));
				user.setPassword(rs.getString("password"));
				user.setStatus(rs.getString("status"));

				int roleId = rs.getInt("role_id");

				String query1 = "SELECT * from roles where id = " + roleId + "";

				ResultSet rs1 = statement.executeQuery(query1);

				Role role = new Role();
				while (rs1.next()) {
					role.setId(rs.getInt("id"));
					role.setName(rs.getString("name"));
					role.setDescription(rs.getString("description"));
				}

				user.setRole(role);

				// add user to List
				userList.add(user);

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User getUserDetail(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
