package Java_interveiw.pc1.pc2;

/**
 * Created by xiu on 5/15/17.
 */
public class ReverseUtil {

    public  static String reverse(String orginal){
        if(orginal == null || "".equals(orginal)) return "";
        char[] orginalCharArray = orginal.toCharArray();
        for (int i = 0; i<orginalCharArray.length/2;i++){
            char temp = orginalCharArray[i];
            orginalCharArray[i] = orginalCharArray[orginalCharArray.length-i-1];
            orginalCharArray[orginalCharArray.length-i-1] = temp;

        }
        return new String(orginalCharArray);
    }
}
