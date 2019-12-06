package com.udemy.api.mapper;

import com.udemy.api.ProductImage;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductImageMapper implements ResultSetMapper<ProductImage> {
    @Override
    public ProductImage map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new ProductImage(resultSet.getInt("id"), resultSet.getInt("product_id"), resultSet.getString("name"),
                resultSet.getString("path"), resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"));
    }
}
