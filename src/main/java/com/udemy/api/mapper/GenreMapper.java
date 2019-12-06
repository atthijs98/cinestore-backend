package com.udemy.api.mapper;

import com.udemy.api.Genre;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreMapper implements ResultSetMapper<Genre> {
    @Override
    public Genre map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        return new Genre(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getTimestamp("created_at"), resultSet.getTimestamp("updated_at"));
    }
}
