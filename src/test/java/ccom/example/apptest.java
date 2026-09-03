import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testRegularBooking() {
        App app = new App();
        assertEquals(1000.0, app.calculateCost(2, "Regular"), 0.01);
    }

    @Test
    public void testPremiumBooking() {
        App app = new App();
        assertEquals(2400.0, app.calculateCost(3, "Premium"), 0.01);
    }

    @Test
    public void testDiscount() {
        App app = new App();
        assertEquals(6480.0, app.calculateCost(6, "VIP"), 0.01);
    }
}
