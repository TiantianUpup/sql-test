package com.shuwen.study.dao;

import com.shuwen.study.pojo.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;

/**
 * @author hetiantian
 * @date 2018/10/21
 */
@Mapper
public interface UsersMapper {
    @Insert("insert into users(time_date, time_timestamp, time_long) value(#{timeDate}, #{timeTimestamp}, #{timeLong})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int saveUsers(Users users);
}
