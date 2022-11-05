import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook sut;

    @BeforeEach
    void initial(){
        sut = new PhoneBook();
    }

    @Test
    void addReturnTest(){
       int expected = 1;

       assertEquals(expected,  sut.add("Test Name", "8-800-355-55-00"));

    }

    @Test
    void addCheckTest(){
        var expected = NullPointerException.class;
        assertThrows(expected, () -> sut.add(null, null));
    }

}
