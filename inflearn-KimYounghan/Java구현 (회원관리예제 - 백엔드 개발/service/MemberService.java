package hello.spring.service;

import hello.spring.domain.Member;
import hello.spring.repository.MemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    /*
    회원가입
     */

    public Long join(Member member) {
        //같은 이름이 있는 중복 회원이 없어야함.
        validateDuplicateMember(member);
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> { //findByName의 결과는 있는가 없는가
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }

    /*
    전체회원 조회
     */

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
