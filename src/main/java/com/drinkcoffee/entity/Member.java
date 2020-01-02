package com.drinkcoffee.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: skyzc
 * Date: 2020/1/3
 * Time: 0:35
 * To change this template use File | Settings | File Templates.
 * Description:
 */
/*
*   Member 成员实体类
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Member implements Serializable {

    private static final long serialVersionUID = 431881350474256063L;

    private Long id;
    private String name;
    private Integer gender;

}
