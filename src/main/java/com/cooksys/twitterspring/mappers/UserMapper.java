package com.cooksys.twitterspring.mappers;

import java.util.Collection;

import org.mapstruct.Mapper;

import com.cooksys.twitterspring.dtos.UserDto;
import com.cooksys.twitterspring.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

	UserDto toDto(User u);

	Collection<UserDto> toDtos(Collection<User> users);

	User fromDto(UserDto dto);

	Collection<User> fromDtos(Collection<UserDto> dtos);

}
