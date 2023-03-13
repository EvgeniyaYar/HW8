
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.StatService;

public class StatServiceTest {

    @Test
    void findAmountSales() {
        StatService service = new StatService();
        int[] sales = {10, 5, 0, 2, 10, 25};
        int expected = 52;

        int actual = service.amountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMiddleAmountSales() {
        StatService service = new StatService();
        int[] sales = {10, 5, 8, 2, 10, 25};
        int expected = 10;

        int actual = service.middleAmountSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findNumberOfMaxMonth() {
        StatService service = new StatService();
        int[] sales = {10, 5, 8, 2, 10, 25};
        int expected = 6;

        int actual = service.numberOfMaxMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findNumberOfMinMonth() {
        StatService service = new StatService();
        int[] sales = {10, 5, 8, 2, 10, 25};
        int expected = 4;

        int actual = service.numberOfMinMonth(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthsLowerThanMiddle() {
        StatService service = new StatService();
        int[] sales = {10, 5, 8, 2, 10, 25};
        int expected = 3;

        int actual = service.salesLowerThanMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMonthsHigherThanMiddle() {
        StatService service = new StatService();
        int[] sales = {10, 5, 8, 2, 10, 25};
        int expected = 1;

        int actual = service.salesHigherThanMiddle(sales);

        Assertions.assertEquals(expected, actual);
    }
}
