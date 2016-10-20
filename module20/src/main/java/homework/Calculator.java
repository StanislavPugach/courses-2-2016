package homework;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Stanislav Pugach on 13.10.2016.
 */
class Calculator extends JFrame  {
    private static final Integer[] AVAILABLE_TERM = {1,2,3,4,5,6,7,8,10,15,20,25,30};
    private CalculateCredit calculateCredit = new CalculateCredit(this);

    private JPanel panel = new JPanel();
    private JLabel purchaseAmount = new JLabel("Сумма покупки");
    private JLabel annualRate = new JLabel("Ставка, % годовых");
    private JLabel prepayment = new JLabel("Аванс, %");
    private JLabel term = new JLabel("Срок");
    private JLabel oneTimeComPersent = new JLabel("Одноразовая комиссия, %");
    private JLabel oneTimeComSumm = new JLabel("Одноразовая комиссия, сумма");
    private JLabel monthlyComPersent = new JLabel("Ежемесячная комиссия, %");
    private JLabel monthlyComSum = new JLabel("Ежемесячная комиссия, сумма");

    private JTextField PurchaseAmount = new JTextField();
    private JTextField AnnualRate = new JTextField();
    private JTextField Prepayment = new JTextField("0");
    private JTextField OneTimeComPersent = new JTextField("0");
    private JTextField OneTimeComSum = new JTextField("0");
    private JTextField MonthlyComPersent = new JTextField("0");
    private JTextField MonthlyComSum = new JTextField("0");
    private JComboBox Term = new JComboBox(AVAILABLE_TERM);
    private JTextArea ResultText = new JTextArea();
    private JButton calculateButton = new JButton("Calculate");


    public Calculator(String title){
        super(title);
        init();
    }

    private void init(){
        setSize(470,400);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        setLocation(xPos,yPos);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(panel);

        panel.setLayout(null);
        panel.add(purchaseAmount);
        panel.add(annualRate);
        panel.add(prepayment);
        panel.add(term);
        panel.add(oneTimeComPersent);
        panel.add(oneTimeComSumm);
        panel.add(monthlyComPersent);
        panel.add(monthlyComSum);

        panel.add(PurchaseAmount);
        panel.add(AnnualRate);
        panel.add(Prepayment);
        panel.add(OneTimeComPersent);
        panel.add(OneTimeComSum);
        panel.add(MonthlyComPersent);
        panel.add(MonthlyComSum);
        panel.add(Term);
        panel.add(ResultText);

        purchaseAmount.setBounds(10,10,150,20);
            annualRate.setBounds(250,10,150,20);
        prepayment.setBounds(10,80,150,20);
            term.setBounds(250,80,150,20);
        oneTimeComPersent.setBounds(10,150,170,20);
            oneTimeComSumm.setBounds(250,150,200,20);
        monthlyComPersent.setBounds(10,210,170,20);
            monthlyComSum.setBounds(250,210,200,20);

        PurchaseAmount.setBounds(10,40,150,20);
            AnnualRate.setBounds(250,40,150,20);
        Prepayment.setBounds(10,110,150,20);
            Term.setBounds(250,110,150,20);
        OneTimeComPersent.setBounds(10,180,150,20);
            OneTimeComSum.setBounds(250,180,150,20);
        MonthlyComPersent.setBounds(10,250,150,20);
            MonthlyComSum.setBounds(250,250,150,20);
        ResultText.setBounds(10,300,200,50);

        panel.add(calculateButton);
        calculateButton.setBounds(330,320,100,30);

        calculateButton.addActionListener(calculateCredit);

    }

    public JTextField getPurchaseAmount() {
        return PurchaseAmount;
    }

    public JTextField getAnnualRate() {
        return AnnualRate;
    }

    public JTextField getPrepayment() {
        return Prepayment;
    }

    public JTextField getOneTimeComPercent() {
        return OneTimeComPersent;
    }

    public JTextField getOneTimeComSum() {
        return OneTimeComSum;
    }

    public JTextField getMonthlyComPercent() {
        return MonthlyComPersent;
    }

    public JTextField getMonthlyComSum() {
        return MonthlyComSum;
    }

    public JComboBox getTerm() {
        return Term;
    }

    public JTextArea getResultText() {
        return ResultText;
    }
}
