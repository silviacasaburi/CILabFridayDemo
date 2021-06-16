import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }


    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("FlaG");
        assertFalse(myString.detectCapitalUse());

    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("softwareengineering");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void returnTheCurrentString1() {
        myString.setString("Hello");
        System.out.println(myString.getString());
        assertEquals("Hello", myString.getString());
    }

    @Test
    public void returnNullForEmptyString() {
        myString.setString("null");
        System.out.println(myString.getString());
        assertNull( myString.getString());
    }
    @Test
    public void setValueToString(String string) {
       //String string = new String;
        System.out.println(myString);
      //  assertEquals( string, string.setValueToString());
        assertEquals("myString", myString);
    }
}
