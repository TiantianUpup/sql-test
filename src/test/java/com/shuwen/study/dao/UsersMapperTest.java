package com.shuwen.study.dao;

import com.shuwen.study.BaseTest;
import com.shuwen.study.pojo.Users;
import org.junit.Test;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

public class UsersMapperTest extends BaseTest {
    @Resource
    private UsersMapper usersMapper;

    @Test
    public void test() {
        for (int i = 0; i < 500000; i++) {
            long time = System.currentTimeMillis();
            usersMapper.saveUsers(Users.builder().timeDate(new Date(time)).timeLong(time).timeTimestamp(new Timestamp(time)).build());
        }
    }
}
