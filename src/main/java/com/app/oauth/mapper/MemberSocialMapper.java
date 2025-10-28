package com.app.oauth.mapper;

import com.app.oauth.domain.vo.MemberSocialVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberSocialMapper {


    public void insert(MemberSocialVO memberSocialVO);
    public List<String> selectAll(Long id);



}
