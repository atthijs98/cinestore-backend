package com.udemy.resources;

import com.udemy.api.Genre;
import com.udemy.api.mapper.GenreMapper;
import com.udemy.db.GenreDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/genres")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(GenreMapper.class)
public class GenreResource {
    GenreDAO genreDAO;

    public GenreResource(GenreDAO genreDAO) {this.genreDAO = genreDAO;}

    /**
     * GET all genres
     * @return
     */
    @GET
    public Response getAll(){
        if (genreDAO.getAll() != null) {
            return Response.ok(genreDAO.getAll()).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * INSERT genre
     * @param genre
     * @return
     */
    @POST
    public Response add(Genre genre) {
        genreDAO.insert(genre);
        return Response.status(200).build();
    }

    @DELETE
    @Path("/{genre_id}")
    public void deleteGenre(@PathParam("genre_id") int genre_id) {
        genreDAO.deleteById(genre_id);
    }
}
