package com.udemy.db;

import com.udemy.api.ProductImage;
import com.udemy.api.mapper.ProductImageMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(ProductImageMapper.class)
public interface ProductImageDAO {
    @SqlQuery("select * from product_image where product_id = :product_id")
    ProductImage findAllFromProduct(@Bind("product_id") int product_id);

    @SqlUpdate("delete from product_image where id = :product_user_id")
    int deleteById(@Bind("product_image_id") int product_image_id);

    @SqlUpdate("insert into product_image (product_id, name, path) values (:product_id, :name, :path)")
    int insert(@BindBean ProductImage productImage);
}
