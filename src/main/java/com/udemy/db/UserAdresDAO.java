package com.udemy.db;

import com.udemy.api.UserAdres;
import com.udemy.api.mapper.UserAdresMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

@RegisterMapper(UserAdresMapper.class)
public interface UserAdresDAO {

    @SqlUpdate("insert into user_adres(user_id, country, postal_code, street_name, street_number) values" +
            "(:user_id, :country, :postal_code, :street_name, :street_number)")
    int insert(@BindBean UserAdres userAdres);

    @SqlUpdate("delete from user_adres where id = :user_adres_id")
    int deleteById(@Bind("user_adres_id") int user_adres_id);
}
