package com.bdb.spring.demo.dto;

import com.bdb.spring.demo.constant.Gender;
import com.bdb.spring.demo.constant.Permission;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {
    private Long id;
    private String name;
    private Gender gender;
    private List<Permission> permissions;
}
