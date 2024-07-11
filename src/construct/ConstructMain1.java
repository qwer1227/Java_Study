package construct;

public class ConstructMain1 {
    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("정성민",25,90);
        MemberConstruct member2 = new MemberConstruct("user2",15);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct s : members) {
            System.out.println("이름 : " + s.name + "나이 : " + s.age + "성적 : " + s.grade);
        }
    }
}
