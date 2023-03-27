import org.example.Functions.FunctionList;
import org.example.Objects.Polynomial;
import org.example.RegexExpression;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class OperationsTest {
    Polynomial p1 = new Polynomial();
    Polynomial p2 = new Polynomial();
    Polynomial p1Afisare = new Polynomial();
    Polynomial p2Afisare = new Polynomial();
    @Before
    public void init()
    {
        p1 = RegexExpression.checkPolynomialUnitTest("1x^3+4x^2+5x^0");
        p2 = RegexExpression.checkPolynomialUnitTest("3x^2-2x^1+1x^0");
        p1Afisare = RegexExpression.checkPolynomialUnitTest("1x^3+4x^2+5x^0");
        p2Afisare = RegexExpression.checkPolynomialUnitTest("3x^2-2x^1+1x^0");
    }
    @Test
    public void addTestRight() {assertEquals("x^3+7x^2-2x+6", FunctionList.add(p1,p2).toString(FunctionList.add(p1Afisare,p2Afisare)));}

    @Test
    public void addTestWrong() {assertNotEquals("x^3-7x^2-2x+6", FunctionList.add(p1,p2).toString(FunctionList.add(p1Afisare,p2Afisare)));}

    @Test
    public void subTestRight() {assertEquals("x^3+x^2+2x+4", FunctionList.sub(p1,p2).toString(FunctionList.sub(p1Afisare,p2Afisare)));}

    @Test
    public void subTestWrong() {assertNotEquals("x^3-x^2+2x+4", FunctionList.sub(p1,p2).toString(FunctionList.sub(p1Afisare,p2Afisare)));}

    @Test
    public void mulTestRight() {assertEquals("3x^5+10x^4-7x^3+19x^2-10x+5", FunctionList.mul(p1,p2).toString(FunctionList.mul(p1Afisare,p2Afisare)));}

    @Test
    public void mulTestWrong() {assertNotEquals("3x^5-10x^4-7x^3+19x^2-10x+5", FunctionList.mul(p1,p2).toString(FunctionList.mul(p1Afisare,p2Afisare)));}

    @Test
    public void derivTestRight()
    {
        assertEquals("3x^2+8x", FunctionList.deriv(p1).toString(FunctionList.deriv(p1)));
    }

    @Test
    public void derivTestWrong() {assertNotEquals("3x^2-8x", FunctionList.deriv(p1).toString(FunctionList.deriv(p1)));}

    @Test
    public void integTestRight() {assertEquals("0.25x^4+1.33x^3+5.00x+C", FunctionList.integ(p1).toStringIntegrare(FunctionList.integ(p1))+"+C");}

    @Test
    public void integTestWrong() {assertNotEquals("0.25x^4-1.33x^3+5.00x+C", FunctionList.integ(p1).toStringIntegrare(FunctionList.integ(p1))+"+C");}

}
