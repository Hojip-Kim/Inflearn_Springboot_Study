package hello.hellospring.repository;


import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository { // 멤버 저장
    Member save(Member member); // 회원 저장
    Optional<Member> findById(Long id); // 아이디로 회원을 찾는것을 만듬.
    Optional<Member> findByName(String name); // 이름으로 찾음
    List<Member> findAll(); // 찾은 모든회원 리스트 반

}
