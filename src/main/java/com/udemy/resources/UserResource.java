package com.udemy.resources;

import com.udemy.api.User;
import com.udemy.api.mapper.UserMapper;
import com.udemy.db.UserDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(UserMapper.class)
public class UserResource {
    public UserDAO userDAO;

    public UserResource(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    /**
     * Get all users
     * @return
     */
    @GET
    public Response getAll(){
        if (userDAO.getAll() != null) {
            return Response.ok(userDAO.getAll()).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * Get user by id
     * @param user_id
     * @return
     */
    @GET
    @Path("/{user_id}")
    public Response get(@PathParam("user_id") int user_id) {
        if (userDAO.findById(user_id) != null) {
            return Response.ok(userDAO.findById(user_id)).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * Delete user by id
     * @param user_id
     */
    @DELETE
    @Path("/{user_id}")
    public void deleteById(@PathParam("user_id") int user_id) {
        userDAO.deleteById(user_id);
    }

    /**
     * Create new user
     * @param user
     * @return
     */
    @POST
    public Response add(User user) {
        userDAO.insert(user);
        return Response.status(200).build();
    }

}
