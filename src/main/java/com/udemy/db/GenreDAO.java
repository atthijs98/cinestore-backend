package com.udemy.db;

import com.udemy.api.Genre;
import com.udemy.api.mapper.GenreMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(GenreMapper.class)
public interface GenreDAO {

    @SqlQuery("select * from genre")
    List<Genre> getAll();

    @SqlUpdate("insert into genre (name) values (:name)")
    int insert(@BindBean Genre genre);

    @SqlUpdate("delete from genre where id = :genre_id")
    int deleteById(@Bind("genre_id") int genre_id);

}
