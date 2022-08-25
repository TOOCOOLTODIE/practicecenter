package com.lxy.practise.tiny.elegant.common.pojo.dto;

import com.lxy.practise.tiny.elegant.common.mapperstruct.BlogGetListMapper;
import com.lxy.practise.tiny.elegant.common.pojo.vo.BlogGetListVo;
import org.junit.Assert;
import org.junit.Test;

public class BlogGetListDtoTest {


    @Test
    public void getName() {
        BlogGetListDto luo = BlogGetListMapper.BLOG_GET_LIST_MAPPER.vo2Dto(BlogGetListVo
                .builder()
                .name("luo")
                .age(18)
                .build());

        Assert.assertEquals("luo", luo.getName());
    }

    @Test
    public void getAge() {
    }

    @Test
    public void setName() {
    }

    @Test
    public void setAge() {
    }
}
