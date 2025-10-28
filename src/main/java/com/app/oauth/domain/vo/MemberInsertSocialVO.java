package com.app.oauth.domain.vo;

import lombok.Data;

@Data
public class MemberInsertSocialVO {

    private Long id;
    private String memberEmail;
    private String memberPicturePath;
    private String memberPictureName;
    private String memberName;
    private String memberNickName;
    private String memberProvider;

    {
        this.setMemberPicturePath("/default");
        this.setMemberPictureName("member.jgp");
        this.setMemberNickName("닉네임");
        this.setMemberProvider("local");
    }



}
