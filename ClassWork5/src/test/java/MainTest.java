import org.example.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

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

    @ParameterizedTest
    @MethodSource("numbers")
    public void shouldReturnStringWithNumberWithTwoNumbers(int number1, int number2, String answer){
        String res = main.returnStringWithNumber(number1, number2);

        Assertions.assertEquals(answer, res);
    }

    private static Stream<Arguments> numbers(){
        return Stream.of(
                Arguments.of(1, 2, "number 12"),
                Arguments.of(-1, -2, "number -1-2"),
                Arguments.of(22, 44, "number 2244"),
                Arguments.of(84756745, 27658756, "number 8475674527658756")
        );
    }



}
