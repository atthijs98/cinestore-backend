package com.udemy.resources;

import com.udemy.api.ProductImage;
import com.udemy.api.mapper.ProductImageMapper;
import com.udemy.db.ProductImageDAO;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/productimages")
@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@RegisterMapper(ProductImageMapper.class)
public class ProductImageResource {
    ProductImageDAO productImageDAO;

    public ProductImageResource(ProductImageDAO productImageDAO) {this.productImageDAO = productImageDAO;}

    /**
     * get all from product
     * @param product_id
     * @return
     */
    @GET
    @Path("/{product_id}")
    public Response get(@PathParam("product_id") int product_id) {
        if (productImageDAO.findAllFromProduct(product_id) != null) {
            return Response.ok(productImageDAO.findAllFromProduct(product_id)).build();
        } else {
            return Response.status(404).build();
        }
    }

    /**
     * delete user by id
     * @param product_image_id
     */
    @DELETE
    @Path("/{product_image_id}")
    public void deleteById(@PathParam("product_image_id") int product_image_id) {productImageDAO.deleteById(product_image_id);}

    @POST
    public Response add(ProductImage productImage) {
        productImageDAO.insert(productImage);
        return Response.status(200).build();
    }

}
