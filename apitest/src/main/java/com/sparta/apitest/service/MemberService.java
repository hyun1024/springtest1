package com.sparta.apitest.service;

import com.sparta.apitest.dto.MemberResponseDto;
import com.sparta.apitest.repository.MemberRepository;
import com.sparta.apitest.entity.Member;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository=memberRepository;
    }
    public MemberResponseDto findMember(Long id) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new NullPointerException("회원 상세 조회 실패"));
        return new MemberResponseDto(member);
    }

    public List<MemberResponseDto> findAllMember() {
        return memberRepository.findAll().stream().map(MemberResponseDto::new).toList();
    }
}