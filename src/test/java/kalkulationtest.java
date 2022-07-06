import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.mkn.konovalova.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class kalkulationtest {
    @Test
    void addition(){
        String actual = Main.calculate( "1" , "+", "1");
        assertEquals("2", actual);

    }
    @Test
    void addition2(){
        String actual = Main.calculate("2", "*", "2");
        assertEquals("4", actual);

    }
    @Test
    void addition3(){
        String actual = Main.calculate( "1" , "/", "0");
        assertEquals("Деление на 0 невозможно", actual);

    }
    @Test
    void addition4(){
        String actual = Main.calculate( "1/2" , "+", "1");
        assertEquals("3/2", actual);

    }
    @Test
    void addition5(){
        String actual = Main.calculate( "2/5" , "*", "1/4");
        assertEquals("1/10", actual);

    }
    @Test
    void addition6(){
        String actual = Main.calculate( "3/2" , "-", "1/2");
        assertEquals("1", actual);

    }@Test
    void addition7(){
        String actual = Main.calculate( "3/4" , "/", "1/2");
        assertEquals("3/2", actual);

    }
    @Test
    void addition8(){
        String actual = Main.calculate( "8" , "/", "2");
        assertEquals("4", actual);

    }
    @Test
    void addition9(){
        String actual = Main.calculate( "45" , "-", "12");
        assertEquals("33", actual);

    }
    @Test
    void addition10(){
        String actual = Main.calculate( "54" , "&", "5");
        assertEquals("Ошибка, некоректный ввод", actual);

    }

}
