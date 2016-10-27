package homework;

import org.junit.Before;
import org.junit.BeforeClass;
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
    private static Calculator calculator;
    private static JTextField textField;


    @Before
    public void SetUp() {
        calculator = Mockito.mock(Calculator.class); // Frame class
        textField = Mockito.mock(JTextField.class);
    }

    @Test
    public void calculatePrepaymentTest() {

        when(calculator.getPrepayment()).thenReturn(textField);
        when(textField.getText()).thenReturn("5");

        CalculateCredit calculateCredit  = new CalculateCredit(calculator); //class to do calculate stuff
        assertEquals(950F, calculateCredit.calculatePrepayment(1000));
    }

    @Test
    public void calculateAnnuityPaymentTest() {
        when(calculator.getAnnualRate()).thenReturn(textField);
        when(textField.getText()).thenReturn("10");

        textField = Mockito.mock(JTextField.class);

        when(calculator.getPrepayment()).thenReturn(textField);
        when(textField.getText()).thenReturn("0");

        CalculateCredit calculateCredit = new CalculateCredit(calculator);
        assertEquals(879.16F,calculateCredit.calculateAnnuityPayment(10000,12));
    }

    @Test
    public void calculateOnceCommissionTest() {
        when(calculator.getOneTimeComPercent()).thenReturn(textField);
        when(textField.getText()).thenReturn("2.5");

        textField = Mockito.mock(JTextField.class);

        when(calculator.getOneTimeComSum()).thenReturn(textField);
        when(textField.getText()).thenReturn("500");

        CalculateCredit calculateCredit = new CalculateCredit(calculator);
        assertEquals(750F,calculateCredit.calculateOnceCommission(10000));
    }

    @Test
    public void calculateMonthlyCommissionTest() {
        when(calculator.getMonthlyComPercent()).thenReturn(textField);
        when(textField.getText()).thenReturn("2.7");

        textField = Mockito.mock(JTextField.class);

        when(calculator.getMonthlyComSum()).thenReturn(textField);
        when(textField.getText()).thenReturn("300");

        CalculateCredit calculateCredit = new CalculateCredit(calculator);
        assertEquals(6840F,calculateCredit.calculateMonthlyCommission(10000,12));
    }







}
