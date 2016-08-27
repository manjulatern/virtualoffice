package com.ncit.api;

import java.util.List;

import com.ncit.entity.Role;

public interface RoleService {

	//Retrieve
	public List<Role> getRoles();
	
	//Create
	public boolean addRole(Role role);
	
	//Update
	public boolean updateRole(Role role, int id);
	
	//Delete
	public boolean deleteRole(Role role);
	
	//Get Role By ID
	public Role getRoleById(int id);
	
}
