/*
 * Created by JFormDesigner on Thu Jul 14 14:00:56 EEST 2016
 */

package com.courses.spalah.Calculator;

import java.awt.*;
import java.awt.event.*;
 import javax.swing.*;

import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 * @author Stanislav Pugach
 */
public class Calculator extends JFrame {

    public Calculator() {
        initComponents();
    }

    private StringBuilder stringOfNumbers = new StringBuilder();
    private float previous = 0.0F;


    private void printExpression(StringBuilder stringOfNumbers) {
        text.setText(stringOfNumbers.toString());
    }

    private void printExpression(float number) {
        text.setText(String.valueOf(number));
    }

    private void zeroActionPerformed(ActionEvent e) {
        stringOfNumbers.append("0");
        printExpression(stringOfNumbers);
    }

    private void oneActionPerformed(ActionEvent e) {
        stringOfNumbers.append("1");
        printExpression(stringOfNumbers);
    }

    private void twoActionPerformed(ActionEvent e) {
        stringOfNumbers.append("2");
        printExpression(stringOfNumbers);
    }

    private void threeActionPerformed(ActionEvent e) {
        stringOfNumbers.append("3");
        printExpression(stringOfNumbers);
    }

    private void fourActionPerformed(ActionEvent e) {
        stringOfNumbers.append("4");
        printExpression(stringOfNumbers);
    }

    private void fiveActionPerformed(ActionEvent e) {
        stringOfNumbers.append("5");
        printExpression(stringOfNumbers);
    }

    private void sixActionPerformed(ActionEvent e) {
        stringOfNumbers.append("6");
        printExpression(stringOfNumbers);
    }

    private void sevenActionPerformed(ActionEvent e) {
        stringOfNumbers.append("7");
        printExpression(stringOfNumbers);
    }

    private void eightActionPerformed(ActionEvent e) {
        stringOfNumbers.append("8");
        printExpression(stringOfNumbers);
    }

    private void nineActionPerformed(ActionEvent e) {
        stringOfNumbers.append("9");
        printExpression(stringOfNumbers);
    }

    private void commaActionPerformed(ActionEvent e) {
        stringOfNumbers.append(".");
        printExpression(stringOfNumbers);
    }

    private void plusActionPerformed(ActionEvent e) {
        stringOfNumbers.append(" + ");
        printExpression(stringOfNumbers);
    }

    private void minusActionPerformed(ActionEvent e) {
        stringOfNumbers.append(" - ");
        printExpression(stringOfNumbers);
    }

    private void multiplyActionPerformed(ActionEvent e) {
        stringOfNumbers.append(" * ");
        printExpression(stringOfNumbers);
    }

    private void divideActionPerformed(ActionEvent e) {
        stringOfNumbers.append(" / ");
        printExpression(stringOfNumbers);
    }

    private void equalActionPerformed(ActionEvent e) {

        String[] array = stringOfNumbers.toString().split(" ");

        float argument_1 = 0.0F;
        String operator = "";
        float argument_2 = 0.0F;

        if (array[0].equals("")) {
            argument_1 = previous;
        } else {
            argument_1 = Float.parseFloat(array[0]);
        }

        operator = array[1];
        argument_2 = Float.parseFloat(array[2]);

        float result = culculate(argument_1, argument_2, operator);
        previous = result;
        printExpression(result);
        stringOfNumbers = new StringBuilder();

    }

    private static float culculate(float a, float b, String operator) {
        float result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
        }
        return result;
    }


    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Stanislav Pugach
        zero = new JButton();
        seven = new JButton();
        eight = new JButton();
        nine = new JButton();
        divide = new JButton();
        equal = new JButton();
        comma = new JButton();
        plus = new JButton();
        four = new JButton();
        one = new JButton();
        five = new JButton();
        two = new JButton();
        six = new JButton();
        three = new JButton();
        multiply = new JButton();
        minus = new JButton();
        text = new JTextField();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();

        //---- zero ----
        zero.setText("0");
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zeroActionPerformed(e);
            }
        });

        //---- seven ----
        seven.setText("7");
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sevenActionPerformed(e);
            }
        });

        //---- eight ----
        eight.setText("8");
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eightActionPerformed(e);
            }
        });

        //---- nine ----
        nine.setText("9");
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nineActionPerformed(e);
            }
        });

        //---- divide ----
        divide.setText("/");
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                divideActionPerformed(e);
            }
        });

        //---- equal ----
        equal.setText("=");
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                equalActionPerformed(e);
            }
        });

        //---- comma ----
        comma.setText(",");
        comma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commaActionPerformed(e);
            }
        });

        //---- plus ----
        plus.setText("+");
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                plusActionPerformed(e);
            }
        });

        //---- four ----
        four.setText("4");
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fourActionPerformed(e);
            }
        });

        //---- one ----
        one.setText("1");
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                oneActionPerformed(e);
            }
        });

        //---- five ----
        five.setText("5");
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fiveActionPerformed(e);
            }
        });

        //---- two ----
        two.setText("2");
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                twoActionPerformed(e);
            }
        });

        //---- six ----
        six.setText("6");
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sixActionPerformed(e);
            }
        });

        //---- three ----
        three.setText("3");
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                threeActionPerformed(e);
            }
        });

        //---- multiply ----
        multiply.setText("*");
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                multiplyActionPerformed(e);
            }
        });

        //---- minus ----
        minus.setText("-");
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                minusActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .add(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .add(contentPaneLayout.createParallelGroup()
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(one, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(two, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .add(zero, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(contentPaneLayout.createParallelGroup()
                                        .add(seven, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .add(four, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.RELATED)
                                    .add(contentPaneLayout.createParallelGroup()
                                        .add(five, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .add(eight, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))))
                            .addPreferredGap(LayoutStyle.RELATED)
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.LEADING, false)
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(nine, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED)
                                    .add(divide, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(comma, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(plus, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(six, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(multiply, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(three, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(minus, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(LayoutStyle.UNRELATED)
                            .add(equal, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .add(text, GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                    .add(14, 14, 14)
                    .add(text, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.UNRELATED)
                    .add(contentPaneLayout.createParallelGroup(GroupLayout.TRAILING)
                        .add(equal, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(contentPaneLayout.createSequentialGroup()
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(seven, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(eight, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(nine, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(divide, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .add(18, 18, 18)
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(four, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(five, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(six, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(multiply, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                            .add(contentPaneLayout.createParallelGroup()
                                .add(contentPaneLayout.createSequentialGroup()
                                    .add(18, 18, 18)
                                    .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                        .add(one, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                        .add(two, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                        .add(three, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.RELATED, 9, Short.MAX_VALUE))
                                .add(GroupLayout.TRAILING, contentPaneLayout.createSequentialGroup()
                                    .addPreferredGap(LayoutStyle.RELATED, 9, Short.MAX_VALUE)
                                    .add(minus, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                    .add(18, 18, 18)))
                            .add(contentPaneLayout.createParallelGroup(GroupLayout.BASELINE)
                                .add(zero, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .add(comma, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                                .add(plus, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))))
                    .add(18, 18, 18))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Stanislav Pugach
    private JButton zero;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton divide;
    private JButton equal;
    private JButton comma;
    private JButton plus;
    private JButton four;
    private JButton one;
    private JButton five;
    private JButton two;
    private JButton six;
    private JButton three;
    private JButton multiply;
    private JButton minus;
    private JTextField text;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
