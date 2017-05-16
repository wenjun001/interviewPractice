package Java_interveiw;

import Java_interveiw.pc1.pc2.ReverseUtil;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by xiu on 5/15/17.
 */
public class ReverseUtilTest extends TestCase {
    public ReverseUtilTest( String testName )
    {
        super( testName );
    }

    public static Test suite()
    {
        return new TestSuite( ReverseUtilTest.class );
    }


    public void testReverseCase1() {
        assertEquals("", ReverseUtil.reverse(""));
        assertEquals("abcd", ReverseUtil.reverse("dcba"));

    }


}
