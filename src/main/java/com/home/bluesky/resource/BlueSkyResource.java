package com.home.bluesky.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.home.bluesky.beans.Emp;
import com.home.bluesky.beans.NewPostUI;

@Path("/v1")
@Service
public class BlueSkyResource {
	
	@Autowired
	private com.home.bluesky.processors.EmpRepository empRepository;
	@GET
	public Response returnAllPosts() {
		List<Emp> posts = empRepository.findAll();
		return Response.ok("Hello "+posts.get(0).getEmp_city()).build();
	}
	
	@POST
	@Path("/newPost")
	public Response newPostAdded(@RequestBody NewPostUI newPost) {
		return Response.ok("Hello "+newPost.getContent()).build();
	}

}
