package com.udemy.api.mapper;

import com.udemy.api.User;
import com.udemy.api.UserRole;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements ResultSetMapper<User> {
    @Override
    public User map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new User(resultSet.getInt("id"), resultSet.getString("uuid"), resultSet.getString("email"), resultSet.getString("first_name"), resultSet.getString("middle_name"),
                resultSet.getString("last_name"), resultSet.getDate("date_of_birth"), resultSet.getString("password"), UserRole.valueOf(resultSet.getString("user_role")), resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"));
    }
}
