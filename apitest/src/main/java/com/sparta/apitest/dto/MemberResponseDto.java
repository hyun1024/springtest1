package com.sparta.apitest.dto;

import com.sparta.apitest.entity.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private final Long id;
    private final String name;
    private final String email;
    private final String pw;

    public MemberResponseDto(Member member) {
        this.id=member.getId();
        this.name=member.getName();
        this.email=member.getEmail();
        this.pw=member.getPassword();
    }
}