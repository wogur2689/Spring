package hello.core.member;

public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository; //Null이면 터지기 때문에 객체를 지정

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    //MemberServiceImpl은 MemoryMemberRepository를 의존하지 않음.
    //이제 의존관계에 대한 고민은 외부(AppConfig)에 맡김.

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
