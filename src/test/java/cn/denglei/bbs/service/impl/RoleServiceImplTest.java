package cn.denglei.bbs.service.impl;

import cn.denglei.bbs.entity.Role;
import cn.denglei.bbs.service.RoleService;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* RoleServiceImpl Tester. 
* 
* @author <Authors name>
* @version 1.0 
*/ 
public class RoleServiceImplTest { 

    RoleService roleService=new RoleServiceImpl();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: selectAllRole() 
* 
*/ 
@Test
public void testSelectAllRole() throws Exception { 
//TODO: Test goes here...
    //List<Role> list=roleService.selectAllRole();
    /*Role role=roleService.selectRoleById(3);
    System.out.println(role.getId());*/
} 

/** 
* 
* Method: selectAllRoleByPage(int page) 
* 
*/ 
@Test
public void testSelectAllRoleByPage() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: selectRoleByUserId(int id) 
* 
*/ 
@Test
public void testSelectRoleByUserId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: addRole(int id, String user_id, String role, int level) 
* 
*/ 
@Test
public void testAddRole() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: editRole(int id, String role, int level) 
* 
*/ 
@Test
public void testEditRole() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: deleteRole(int id, int userid) 
* 
*/ 
@Test
public void testDeleteRole() throws Exception { 
//TODO: Test goes here... 
} 


} 
