package com.udemy.api.mapper;

import com.udemy.api.Product;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductMapper implements ResultSetMapper<Product> {
    @Override
    public Product map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Product(resultSet.getInt("id"), resultSet.getString("international_title"), resultSet.getString("original_title"), resultSet.getString("romanized_title"), resultSet.getString("runtime"),
                resultSet.getString("poster"), resultSet.getString("plot"), resultSet.getString("year"),
                resultSet.getDouble("price"), resultSet.getInt("in_stock"), resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"));
    }
}
