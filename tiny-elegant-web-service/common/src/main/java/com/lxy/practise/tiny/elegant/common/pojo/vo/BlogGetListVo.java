package com.lxy.practise.tiny.elegant.common.pojo.vo;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 获取博客列表vo
 * @author luo
 * @date 2022/04/18 20:37
 **/
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BlogGetListVo {
    private String name;
    private int age;
}
