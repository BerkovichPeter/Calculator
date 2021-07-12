package Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculatorTest {
    @Parameterized.Parameters
    public static Collection<Object[]> input(){
        return Arrays.asList(new Object[][]{{1, 2, "+", 3}, {4, 2, "-", 2}, {6, 8, "+", 14}, {8, 3, "-", 5}});


    }
    private long elem1;
    private long elem2;
    private String operation;
    private long expected;
    public CalculatorTest(long elem1, long elem2, String operation, long expected){
        this.elem1 = elem1;
        this.elem2 = elem2;
        this.operation = operation;
        this.expected = expected;
    }

    @Test
    public void test() {
        assertEquals( Calculator.calculate(elem1, elem2, operation), expected );
    }
}
