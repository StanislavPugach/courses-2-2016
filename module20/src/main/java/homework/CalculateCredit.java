package homework;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Stanislav Pugach on 16.10.2016.
 */
class CalculateCredit implements ActionListener {
    private Calculator calculator;
    private float annuityMonthPayment;
    private float interestExpense;
    private float overpayment;

    private float amount;
    private int countOfMonth;
    private float rate;
    private int prepaymentInPercent;
    private int onceCommissionPercent;
    private int onceCommissionSum;
    private int monthlyComPercent;
    private int monthlyComSum;

    public CalculateCredit(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        initFrameVariables();
        annuityMonthPayment = calculateAnnuityPayment(amount,countOfMonth);
        interestExpense = calculateInterestExpense(amount,countOfMonth);
        overpayment = calculateOnceCommission(amount) + calculateMonthlyCommission(amount,countOfMonth) + interestExpense;
        displayResult();
    }

    protected void initFrameVariables(){
        amount = Integer.parseInt(calculator.getPurchaseAmount().getText());
        countOfMonth = (int)((calculator.getTerm().getSelectedItem()))*12;
        rate = Float.parseFloat(calculator.getAnnualRate().getText());
        prepaymentInPercent = Integer.parseInt(calculator.getPrepayment().getText());
        onceCommissionPercent = Integer.parseInt(calculator.getOneTimeComPercent().getText());
        onceCommissionSum = Integer.parseInt(calculator.getOneTimeComSum().getText());
        monthlyComPercent = Integer.parseInt(calculator.getMonthlyComPercent().getText());
        monthlyComSum = Integer.parseInt(calculator.getMonthlyComSum().getText());
    }

    protected float calculateAnnuityPayment(float amount,int countOfMonth){
        amount = calculatePrepayment(amount);
        double monthlyRate = (rate/12)/100;
        return  (float)(amount * monthlyRate * (1 + 1 / (Math.pow(1 + monthlyRate,countOfMonth) - 1)));
    }

    protected float calculatePrepayment(float amount){
        prepaymentInPercent = Integer.parseInt(calculator.getPrepayment().getText());
        if (prepaymentInPercent != 0){
            float prepayment =  amount * prepaymentInPercent / 100;
            amount -= prepayment;
        }
        return amount;
    }

    private float calculateOnceCommission(float amount){
        float commission = amount * onceCommissionPercent / 100;
        commission += onceCommissionSum;
        return commission;
    }

    private float calculateMonthlyCommission(float amount, int countOfMonth){
        float commission =  countOfMonth * (amount * monthlyComPercent / 100);
        commission += monthlyComSum * countOfMonth;
        return commission;
    }

    private float calculateInterestExpense(float amount, int countOfMonth){
        return annuityMonthPayment * countOfMonth - amount;
    }



    private void displayResult(){
        calculator.getResultText().setText("Ежемесячный платеж: "
                + annuityMonthPayment
                + "\nПроцентные расходы: "
                + interestExpense
                + "\nПереплата: "
                + overpayment);
    }
}
