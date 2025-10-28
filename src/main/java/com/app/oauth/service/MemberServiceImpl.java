package com.app.oauth.service;

import com.app.oauth.domain.dto.MemberResponseDTO;
import com.app.oauth.domain.vo.MemberVO;
import com.app.oauth.mapper.MemberMapper;
import com.app.oauth.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional(rollbackFor = Exception.class)
public class MemberServiceImpl implements MemberService {

    private final MemberDAO memberDAO;

    // 이메일 체크
    @Override
    public boolean existsByMemberEmail(String memberEmail) {
        return false;
    }

    // 회원 가입
    @Override
    public Map<String, String> register(MemberVO memberVO) {
        return Map.of();
    }

    // 회원 가입 소셜
    @Override
    public Map<String, String> registerSocial(MemberVO memberVO) {
        return Map.of();
    }

    // 회원 이메일로 아이디 조회
    @Override
    public Long getMemberIdByMemberEmail(String memberEmail) {
        return 0L;
    }


    @Override
    public MemberResponseDTO getMemberById(Long id) {
        return null;
    }


    @Override
    public void modify(MemberVO memberVO) {

    }

    @Override
    public void withdraw(Long id) {

    }
}
