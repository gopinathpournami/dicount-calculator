import org.example.discountcalculator.Bill;
import org.example.discountcalculator.DiscountCalculator;
import org.example.discountcalculator.User;
//import org.junit.Test

public class calculatorTest {
    @Test
    public void testEmployeeDiscount(){
        User user = new User(true,false,false);
        Bill bill = new  Bill(1000,200);
        DiscountCalculator calculator = new DiscountCalculator();
        double netPayableAmount = calculator.calculateNetPayableAmount(user,bill);
        assertEquals(700,netPayableAmount,.01);
    }
}
