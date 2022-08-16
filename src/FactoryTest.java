import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FactoryTest {
    @Test
    void testInstitutional(){
        GetPlanFactory factory = new GetPlanFactory();

        Plan plan = factory.getPlan("INSTITUTIONAL");
        plan.setRate();

        int units = 25;
        double expectedBill = plan.calculateBill(units);
        assertEquals(expectedBill,112.5);
    }
}
