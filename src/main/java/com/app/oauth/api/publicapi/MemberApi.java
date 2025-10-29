package com.app.oauth.api.publicapi;


import com.app.oauth.domain.dto.ApiResponseDTO;
import com.app.oauth.domain.vo.MemberVO;
import com.app.oauth.service.MemberService;
import io.swagger.v3.oas.models.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/members/*")
public class MemberApi {

    private final MemberService memberService;

    // 회원가입
    @PostMapping("register")
    public ResponseEntity<ApiResponseDTO> register(@RequestBody MemberVO memberVO) {
         memberService.register(memberVO);
        return ResponseEntity.status(HttpStatus.CREATED).body(ApiResponseDTO.of("회원 가입이 완료되었습니다"));
    }

    // 회원수정
    @PutMapping("modify")
    public ResponseEntity<ApiResponseDTO> modify(@RequestBody MemberVO memberVO) {
        memberService.modify(new MemberVO());
        return ResponseEntity.status(HttpStatus.OK).body(ApiResponseDTO.of("정보 수정이 완료되었습니다"));
    }


    // 회원탈퇴
    @DeleteMapping("unregister")
    public ResponseEntity<ApiResponseDTO> unregister(@RequestBody Long id) {
        memberService.withdraw(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body(ApiResponseDTO.of("회원 탈퇴가 완료되었습니다"));
    }




}
