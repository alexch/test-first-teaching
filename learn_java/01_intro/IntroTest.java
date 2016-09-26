import junit.framework.TestCase;
import org.junit.Assert.*;

public class IntroTest extends TestCase
{
    Intro intro = new Intro();

    public void testHello()
    {
        assertNotSame("HelloHaja", intro.sayHello());
    }

    public void testGoodbye()
    {

        assertEquals("Goodbye", intro.sayGoodbye());
    }

}
