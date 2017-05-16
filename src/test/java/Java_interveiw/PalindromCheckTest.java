package Java_interveiw;

import Java_interveiw.pc1.pc2.PalindromeCheck;
import junit.framework.TestCase;

/**
 * Created by xiu on 5/15/17.
 */
public class PalindromCheckTest extends TestCase {

    public void testPalindromCase1() {
        assertTrue(PalindromeCheck.isPalindrome("abba"));
        assertTrue(PalindromeCheck.isPalindrome("ababa"));
        assertFalse(PalindromeCheck.isPalindrome("ababba"));
    }
}
