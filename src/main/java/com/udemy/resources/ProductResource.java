package com.udemy.resources;

import com.udemy.api.Product;
import com.udemy.api.mapper.ProductMapper;
import com.udemy.db.ProductDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.awt.*;

@Path("/products")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(ProductMapper.class)
public class ProductResource {
    ProductDAO productDAO;

    public ProductResource(ProductDAO productDAO) {this.productDAO = productDAO;}

    /**
     * get all products
     * @return
     */
    @GET
    public Response getAll(){
        if (productDAO.getAll() != null) {
            return Response.ok(productDAO.getAll()).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * get product by id
     * @param product_id
     * @return
     */
    @GET
    @Path("/{product_id}")
    public Response get(@PathParam("product_id") int product_id) {
        if (productDAO.findById(product_id) != null) {
            return Response.ok(productDAO.findById(product_id)).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * delete product by id
     * @param product_id
     */
    @DELETE
    @Path("/{product_id}")
    public void deleteById(@PathParam("product_id") int product_id) {productDAO.deleteById(product_id);}

    @POST
    public Response add(Product product) {
        productDAO.insert(product);
        return Response.status(200).build();
    }

}
