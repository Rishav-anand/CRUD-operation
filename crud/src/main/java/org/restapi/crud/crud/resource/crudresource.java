package org.restapi.crud.crud.resource;

import java.sql.SQLException;
import java.util.ArrayList;

import org.restapi.crud.crud.model.crudmodel;
import org.restapi.crud.crud.service.crudservice;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/crud")
public class crudresource {
	
	crudservice service = new crudservice();
	// insert data
	@Path("/insertion")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public crudmodel addUser(crudmodel user) {
		 return service.insertUser(user);
		
	}
	
	//retrive data
	@Path("/retrieve")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getUser() throws SQLException {
		 return service.getUser();
		
	}
	
	//retrive data using id
	@Path("/retrieveById/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<crudmodel>  getUser(@PathParam("id") int id) throws SQLException {
		return service.getUserById(id);
		
	}
	
	// update data
	@Path("/updateUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public crudmodel updateUser(crudmodel user) {
		 return service.updatetUser(user);
		
	}
	
	//delete data
	@Path("/deleteUserById/{id}")
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public int deleteUser(@PathParam("id") int id) {
		return service.deletetUser(id);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
