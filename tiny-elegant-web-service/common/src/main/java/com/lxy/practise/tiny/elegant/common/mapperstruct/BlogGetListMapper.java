package com.lxy.practise.tiny.elegant.common.mapperstruct;

import com.lxy.practise.tiny.elegant.common.pojo.dto.BlogGetListDto;
import com.lxy.practise.tiny.elegant.common.pojo.vo.BlogGetListVo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * 博客列表vo转换dto
 *
 * @author luo
 * @date 2022/04/19 02:40
 **/
@Mapper
public interface BlogGetListMapper {
    BlogGetListMapper BLOG_GET_LIST_MAPPER = Mappers.getMapper(BlogGetListMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "age", target = "age")
    BlogGetListDto vo2Dto(BlogGetListVo vo);
}
