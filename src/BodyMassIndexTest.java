import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BodyMassIndexTest {
    @Test
public  void BodyMassIndex(){
    BodyMassIndex b = new BodyMassIndex(72,120);
assertEquals(35.2,b.BmiScoreCalculator(60,180));


    }


    @Test
    void ctgryTester() {
        BodyMassIndex b = new BodyMassIndex(72,120);
        assertEquals("Category...: Underweight",b.ctgryTester(17.5));
        assertEquals("Category...: Normal weight",b.ctgryTester(18.5));
        assertEquals("Category...: Normal weight",b.ctgryTester(24.9));
        assertEquals("Category...: Overweight",b.ctgryTester(25));
        assertEquals("Category...: Overweight",b.ctgryTester(29.9));
        assertEquals("Category...: Obesity",b.ctgryTester(30));
    }
}