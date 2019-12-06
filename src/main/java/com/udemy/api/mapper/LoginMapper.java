package com.udemy.api.mapper;

import com.udemy.api.Login;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginMapper implements ResultSetMapper<Login> {
    @Override
    public Login map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Login(resultSet.getString("email"), resultSet.getString("password"));
    }
}
