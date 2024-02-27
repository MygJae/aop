package hello.aop.member;

import hello.aop.member.annotaion.MethodAop;

public class MemberServiceImpl implements MemberService{
    @Override
    @MethodAop("test value")
    public String hello(String param) {
        return "ok";
    }

    public String internal(String param) {
        return "ok";
    }


}

