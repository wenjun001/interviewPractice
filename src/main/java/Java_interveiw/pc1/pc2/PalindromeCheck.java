package Java_interveiw.pc1.pc2;

/**
 * Created by xiu on 5/15/17.
 */
public class PalindromeCheck {

    public static boolean isPalindrome(String str){
        if(str == null || "".equals(str)) return  true;
        char[] org = str.toCharArray();
        for(int i = 0; i<str.length()/2;i++){
            if(org[i] != org[str.length()-i-1]){
                return false;
            }
        }
        return true;
    }
}
