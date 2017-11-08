package com.xuhu.demo.utils.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * Created by xuhu on 2017/11/8.
 */
@Mapper
public interface UserInfoConvert {
    UserInfoConvert INSTANCE = Mappers.getMapper(UserInfoConvert.class);

}
