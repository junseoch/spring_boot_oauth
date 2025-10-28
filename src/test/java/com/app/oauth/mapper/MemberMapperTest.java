package com.app.oauth.mapper;

import com.app.oauth.domain.vo.MemberInsertSocialVO;
import com.app.oauth.domain.vo.MemberSocialVO;
import com.app.oauth.domain.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class MemberMapperTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void select() {
        log.info("select: {}", memberMapper.select(1L));
    }

    @Test
    void selectIdByMemberEmail() {
        log.info("{}", memberMapper.selectIdByMemberEmail("test123@gmail.com"));
    }

    @Test
    void selectAll() {
        log.info("selectAll: {}", memberMapper.selectAll());
    }

    @Test
    void existsByMemberEmail() {
        log.info("existsByMemberEmail: {}", memberMapper.existsByMemberEmail("test123@gmail.com"));
    }

    @Test
    void insert() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberEmail("test123@gmail.com");
        memberVO.setMemberPassword("1234");
        memberVO.setMemberName("홍길동");
        memberMapper.insert(memberVO);
    }

    @Test
    void insertSocial() {
        MemberInsertSocialVO memberInsertSocialVO = new MemberInsertSocialVO();
        memberInsertSocialVO.setMemberEmail("test456@gmail.com");
        memberInsertSocialVO.setMemberName("홍길동");
        memberMapper.insertSocial(memberInsertSocialVO);
    }

    @Test
    void update() {
        MemberVO memberVO = new MemberVO();
        memberVO.setId(1L);
        memberVO.setMemberEmail("test555@gmail.com");
        memberVO.setMemberPassword("1234999");
        memberVO.setMemberName("장보고보고");
        memberMapper.update(memberVO);
    }

    @Test
    void delete() {
        MemberVO memberVO = new MemberVO();

    }
}