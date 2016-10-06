/*
 * Created by JFormDesigner on Mon Sep 12 18:57:35 EEST 2016
 */

package com.courses.spalah.homework;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author unknown
 */
public class Directory extends JFrame {
    private DataManage dataManage;

    public Directory() {
        initComponents();

    }

    private void saveAction(ActionEvent e) {
        Person person = new Person(first_nameIn.getText(),last_nameIn.getText(),addressIn.getText());
        dataManage = new PersonManageDB();
        dataManage.save(person);
    }

    private void readAction(ActionEvent e) {
        dataManage = new PersonManageDB();
        Person person = (Person)dataManage.load(Integer.parseInt(ID.getText()));
        first_nameOut.setText(person.getFirstName());
        last_nameOut.setText(person.getLastName());
        addressOut.setText(person.getAddress());
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Stanislav Pugach
        first_nameIn = new JTextField();
        last_nameIn = new JTextField();
        addressIn = new JTextField();
        save = new JButton();
        first_nameOut = new JTextField();
        last_nameOut = new JTextField();
        addressOut = new JTextField();
        read = new JButton();
        ID = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setVisible(true);
        Container contentPane = getContentPane();

        //---- first_nameIn ----
        first_nameIn.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));

        //---- save ----
        save.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
        save.addActionListener(e -> saveAction(e));

        //---- read ----
        read.setText("\u041f\u0440\u043e\u0447\u0438\u0442\u0430\u0442\u044c");
       read.addActionListener(e -> readAction(e));

        //---- label1 ----
        label1.setText("\u0418\u043c\u044f");
        label1.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label2 ----
        label2.setText("\u0418\u043c\u044f");
        label2.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label3 ----
        label3.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
        label3.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label4 ----
        label4.setText("\u0410\u0434\u0440\u0435\u0441");
        label4.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label5 ----
        label5.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
        label5.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label6 ----
        label6.setText("\u0410\u0434\u0440\u0435\u0441");
        label6.setHorizontalAlignment(SwingConstants.CENTER);

        //---- label7 ----
        label7.setText("ID");
        label7.setHorizontalAlignment(SwingConstants.CENTER);

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(save, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(385, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(first_nameIn, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(last_nameIn, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(first_nameOut, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(read, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                                    .addGap(42, 42, 42)
                                    .addGroup(contentPaneLayout.createParallelGroup()
                                        .addComponent(last_nameOut, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(contentPaneLayout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(contentPaneLayout.createParallelGroup()
                                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ID, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE))))))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addComponent(addressIn, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressOut, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20))))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(109, 109, 109)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(label3)
                        .addComponent(label4))
                    .addGap(3, 3, 3)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(addressIn, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addComponent(last_nameIn, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addComponent(first_nameIn, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(save, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                            .addComponent(label7)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(read, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
                        .addComponent(ID, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(label5)
                        .addComponent(label6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(first_nameOut, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addComponent(last_nameOut, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
                        .addComponent(addressOut, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
                    .addGap(16, 16, 16))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Stanislav Pugach
    private JTextField first_nameIn;
    private JTextField last_nameIn;
    private JTextField addressIn;
    private JButton save;
    private JTextField first_nameOut;
    private JTextField last_nameOut;
    private JTextField addressOut;
    private JButton read;
    private JTextField ID;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
