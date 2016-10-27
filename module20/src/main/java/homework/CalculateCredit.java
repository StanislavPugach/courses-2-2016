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


    public CalculateCredit(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float amount = Float.parseFloat(calculator.getPurchaseAmount().getText());
        int countOfMonth = (int)((calculator.getTerm().getSelectedItem()))*12;
        annuityMonthPayment = calculateAnnuityPayment(amount,countOfMonth);
        interestExpense = calculateInterestExpense(amount,countOfMonth);
        overpayment = calculateOnceCommission(amount) + calculateMonthlyCommission(amount,countOfMonth) + interestExpense;
        displayResult();
    }


    protected float calculateAnnuityPayment(float amount,int countOfMonth){
        float rate = Float.parseFloat(calculator.getAnnualRate().getText());
        amount = this.calculatePrepayment(amount);
        double monthlyRate = (rate/12)/100;
        float result = (float)(amount * monthlyRate * (1 + 1 / (Math.pow(1 + monthlyRate,countOfMonth) - 1)));
        return (float)(Math.round(result * 100.0) / 100.0);
    }

    protected float calculatePrepayment(float amount){
        float prepaymentInPercent = Float.parseFloat(calculator.getPrepayment().getText());
        if (prepaymentInPercent != 0){
            float prepayment =  amount * prepaymentInPercent / 100;
            amount -= prepayment;
        }
        return amount;
    }

    protected float calculateOnceCommission(float amount){
        float onceCommissionPercent = Float.parseFloat(calculator.getOneTimeComPercent().getText());
        float onceCommissionSum = Float.parseFloat(calculator.getOneTimeComSum().getText());
        float commission = amount * onceCommissionPercent / 100;
        commission += onceCommissionSum;
        return commission;
    }

    protected float calculateMonthlyCommission(float amount, int countOfMonth){
        float monthlyComPercent = Float.parseFloat(calculator.getMonthlyComPercent().getText());
        float monthlyComSum = Float.parseFloat(calculator.getMonthlyComSum().getText());
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
