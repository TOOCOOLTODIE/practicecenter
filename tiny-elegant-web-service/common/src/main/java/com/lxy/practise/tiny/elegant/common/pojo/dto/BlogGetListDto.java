package com.lxy.practise.tiny.elegant.common.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 博客列表dto
 * @author luo
 * @date 2022/04/19 02:39
 **/
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BlogGetListDto {
    private String name;
    private int age;


}
