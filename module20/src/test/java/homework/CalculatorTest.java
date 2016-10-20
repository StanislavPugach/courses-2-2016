package homework;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.swing.*;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by Stanislav Pugach on 18.10.2016.
 */


@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

    @Test
    public void calculatePrepaymentTest() {
        Calculator calculator = Mockito.mock(Calculator.class); // Frame class
        CalculateCredit calculateCredit  = Mockito.mock(CalculateCredit.class); //class to do calculate stuff
        JTextField prepaymentField = Mockito.mock(JTextField.class);
        when(calculator.getPrepayment()).thenReturn(prepaymentField);
        when(prepaymentField.getText()).thenReturn("5");
        assertEquals(950, calculateCredit.calculatePrepayment(1000));
    }


}
