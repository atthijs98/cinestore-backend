package com.udemy.resources;


import com.udemy.api.UserAdres;
import com.udemy.api.mapper.UserAdresMapper;
import com.udemy.db.UserAdresDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/useradreses")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(UserAdresMapper.class)
public class UserAdresResource {
    UserAdresDAO userAdresDAO;

    public UserAdresResource(UserAdresDAO userAdresDAO) {this.userAdresDAO = userAdresDAO;}

    /**
     * insert userAdres
     * @param userAdres
     * @return
     */
    @POST
    public Response add(UserAdres userAdres) {
        userAdresDAO.insert(userAdres);
        return Response.status(200).build();
    }


    @DELETE
    @Path("/{user_adres_id}")
    public void deleteUserAdres(@PathParam("user_adres_id") int user_adres_id) {
        userAdresDAO.deleteById(user_adres_id);
    }

}
