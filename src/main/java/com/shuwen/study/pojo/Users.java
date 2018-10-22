package com.shuwen.study.pojo;

import lombok.Builder;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

/**
 * @author hetiantian
 * @date 2018/10/21
 */
@Builder
@Data
public class Users {
    /**
     * 自增唯一id
     */
    private Long id;

    /**
     * date类型的时间
     */
    private Date timeDate;

    /**
     * timestamp类型的时间
     */
    private Timestamp timeTimestamp;

    /**
     * long类型的时间
     */
    private long timeLong;
}
