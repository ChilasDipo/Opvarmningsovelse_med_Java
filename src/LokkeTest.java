import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LokkeTest {


    @Test
    void test1(){
        Lokke lokke = new Lokke();
        lokke.program("3");
        lokke.program("3");
        assertEquals("3.0",lokke.program("3"));
    }
    @Test
    void test2(){
        Lokke lokke = new Lokke();
        assertEquals("Stop",lokke.program("q"));
    }
    @Test
    void test3(){
        Lokke lokke = new Lokke();
        assertEquals("Stop",lokke.program("Q"));
    }
    @Test
    void test4(){
        Lokke lokke = new Lokke();
        assertEquals("Fail",lokke.program("s"));
    }


}