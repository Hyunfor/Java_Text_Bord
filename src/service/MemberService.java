package service;

import infra.Container;
import repository.MemberRepository;

import java.util.Scanner;

public class MemberService {

    private Scanner sc;

    private MemberRepository memberRepository;

    public MemberService(){
        this.sc = Container.sc;
        this.memberRepository = Container.memberRepository;

    }

    public int saveMember(String loginId, String password, String name){
        return memberRepository.saveMember(loginId, password, name);
    }

}
