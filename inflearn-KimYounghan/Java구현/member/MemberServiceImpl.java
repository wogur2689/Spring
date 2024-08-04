package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository  memberRepository = new MemoryMemberRepository(); //Null이면 터지기 때문에 객체를 지정

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
