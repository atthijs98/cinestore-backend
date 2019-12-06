package com.udemy.db;

import com.udemy.api.User;
import com.udemy.api.mapper.UserMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(UserMapper.class)
public interface UserDAO {
    @SqlQuery("select * from user")
    List<User> getAll();

    @SqlQuery("select * from user where id = :user_id")
    User findById(@Bind("user_id") int user_id);

    @SqlUpdate("delete from user where user_id = :user_id")
    int deleteById(@Bind("user_id") int user_id);

    @SqlUpdate("insert into user(email, first_name, middle_name, last_name, date_of_birth, password, user_role, uuid) values" +
            "(:email, :first_name, :middle_name, :last_name, :date_of_birth, :password, :user_role, :uuid)")
    int insert(@BindBean User user);

    @SqlQuery("select * from user where email = :email")
    User findByEmail(@Bind("email") String email);
}
