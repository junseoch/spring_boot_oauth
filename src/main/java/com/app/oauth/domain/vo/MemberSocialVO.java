package com.app.oauth.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MemberSocialVO {
    private Long id;
    private String memberSocialProviderId;
    private String memberSocialProvider;
    private Long memberId;
}
