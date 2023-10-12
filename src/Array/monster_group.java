package Array;

public class monster_group {
    public static void main(String[] args) {
        String ss = "PPPPPP@PPP@PP$PP";
        int ans = solution(ss);
        System.out.println(ans);
    }

    public static int solution(String s){
        int a = 0, ans = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            a++;
            if(s.charAt(i) == '@' || s.charAt(i) =='$'){
                ans = Math.min(a, ans);
                a = 0;
            }
        }
        ans = Math.min(a,ans);

        return ans;
    }
}
