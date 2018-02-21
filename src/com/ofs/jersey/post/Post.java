package com.ofs.jersey.post;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/service")
public class Post {

	 @POST
	 public Response postStrMsg( String msg) {
		 String output = "Response from POST method : " + msg;
	     return Response.status(200).entity(output).build();
	 }
	 
	 @GET
	 public Response getStrMsg(@QueryParam("param") String msg1) {
		 String output = "Response from GET method : " + msg1;
	     return Response.status(200).entity(output).build();
	 }
	
}
