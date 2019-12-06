package com.udemy.db;

import com.udemy.api.Product;
import com.udemy.api.mapper.ProductMapper;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(ProductMapper.class)
public interface ProductDAO {

    @SqlQuery("select * from product")
    List<Product> getAll();

    @SqlUpdate("delete from product where id = :product_id")
    int deleteById(@Bind("product_id") int product_id);

    @SqlQuery("select * from product where id = :product_id")
    Product findById(@Bind("product_id") int product_id);

    @SqlUpdate("insert into product (name, runtime, poster, plot, year, price) values (:name, :runtime, :poster, :plot, :year, :price)")
    int insert(@BindBean Product product);
}
