package betamovie.betamovie.mapper;

import betamovie.betamovie.dto.request.UserCreateRequest;
import betamovie.betamovie.dto.request.UserUpdateRequest;
import betamovie.betamovie.dto.response.UserResponse;
import betamovie.betamovie.entity.UserTest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserTest toUser(UserCreateRequest request);
    UserResponse toUserResponse(UserTest userTest);
    void updateUser(@MappingTarget UserTest userTest, UserUpdateRequest request);
}
