package com.pedro_a10.LojaAPI.mapper;

import com.pedro_a10.LojaAPI.dto.userdto.UserRequestDTO;
import com.pedro_a10.LojaAPI.dto.userdto.UserResponseDTO;
import com.pedro_a10.LojaAPI.entity.User;
import org.mapstruct.*;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

  UserResponseDTO toResponseDTO(User user);

  @Mapping(target = "id", ignore = true)
  @Mapping(target = "employee", ignore = true)
  User toEntity(UserRequestDTO dto);

  List<UserResponseDTO> toResponseDTOList(List<User> users);

  @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
  @Mapping(target = "id", ignore = true)
  @Mapping(target = "employee", ignore = true)
  void updateEntityFromDTO(UserRequestDTO dto, @MappingTarget User entity);
}
