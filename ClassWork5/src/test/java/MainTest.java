import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
    Main main;
    @BeforeEach
    public void before(){
        main = new Main();
    }

    @Test
    public void shouldSumPositiveNumbers(){
        int res = main.sumNumbers(4);

        Assertions.assertEquals(15, res);
    }

    @Test
    public void shouldSumNegativeNumbers(){
        int res = main.sumNumbers(-4);

        Assertions.assertEquals(7, res);
    }

    @Test
    public void shouldReturnStringWithNumber(){
        String res = main.returnStringWithNumber(6);

        Assertions.assertNotNull(res);
        Assertions.assertEquals("number 6", res);
        //not equal, потому что это 2 разные ссылки на разные объекты

    }
}
