import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void testDate32() {
        int day = 32;
        int month = 12;
        int year = 2022;
        boolean expected = false;
        boolean result = NextDay.checkDate(day,month,year);
        assertEquals(expected, result);
    }
    @Test
    void testDate2() {
        int day = 29;
        int month = 2;
        int year = 2024;
        String expected = "Day: 1, Month: 3, Year: 2024";
        String result = NextDay.nextDay(day,month,year);
        assertEquals(expected, result);
    }


}