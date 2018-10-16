package com.sndj.xmll.role;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author yuechao 2018/10/16
 */

@Data
public class SysRole {


    //    +-------------+-------------+------+-----+---------+----------------+
//            | Field       | Type        | Null | Key | Default | Extra          |
//            +-------------+-------------+------+-----+---------+----------------+
//            | id          | bigint(20)  | NO   | PRI | NULL    | auto_increment |
//            | role_name   | varchar(50) | YES  |     | NULL    |                |
//            | enabled     | int(11)     | YES  |     | NULL    |                |
//            | create_by   | bigint(20)  | YES  |     | NULL    |                |
//            | create_time | datetime    | YES  |     | NULL    |                |
//            +-------------+-------------+------+-----+---------+----------------+
    private Long id;


    private String roleName;


    private Integer enabled;


    private Long createBy;


    private LocalDateTime createTime;
}
