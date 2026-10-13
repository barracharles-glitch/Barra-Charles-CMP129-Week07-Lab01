public class Member {
    private String name="", membershipID="";

    public Member (String n, String m){
        name = n;
        membershipID = m;
    }

    public String getID(){
        return membershipID;
    }
}
