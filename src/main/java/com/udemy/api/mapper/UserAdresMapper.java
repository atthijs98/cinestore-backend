package com.udemy.api.mapper;

import com.udemy.api.UserAdres;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAdresMapper implements ResultSetMapper<UserAdres> {
    @Override
    public UserAdres map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new UserAdres(resultSet.getInt("id"), resultSet.getInt("user_id"), resultSet.getString("country"),
                resultSet.getString("postal_code"), resultSet.getString("street_name"), resultSet.getString("street_number"),
                resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"));
    }
}
