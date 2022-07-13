package com.bdb.spring.demo.mapper;

import com.bdb.spring.demo.dto.UserDto;
import com.bdb.spring.demo.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
//    @Mapping(target = "name", ignore = true)
    UserDto toDto (User user);
}
