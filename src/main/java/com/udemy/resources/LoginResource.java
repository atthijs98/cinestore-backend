package com.udemy.resources;

import com.udemy.api.Login;
import com.udemy.api.mapper.LoginMapper;
import com.udemy.db.UserDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(LoginMapper.class)
public class LoginResource {
    UserDAO userDAO;

    public LoginResource(UserDAO userDAO) {this.userDAO = userDAO;}

    @POST
    public Response getUserLogin(@Valid Login login) {
        if (userDAO.findByEmail(login.getEmail()) != null) {
            if (userDAO.findByEmail(login.getEmail()).getPassword().equals(login.getPassword())) {
                return Response.ok(userDAO.findByEmail(login.getEmail())).build();
            }
            else {
                return Response.status(404).build();
            }
        }
        else {
            return Response.status(404).build();
        }
    }
}
