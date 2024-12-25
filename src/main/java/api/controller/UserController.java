package api.controller;

import api.repository.UserRepository;
import common.User;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path(value = "/user")
public class UserController {

    @Inject
    private UserRepository userRepo;

    @GET
    @Path(value = "id/${id}")
    public User getUserById(@PathParam("id") Integer id){
        return userRepo.findById(Long.parseLong(String.valueOf(id)));
    }
}
