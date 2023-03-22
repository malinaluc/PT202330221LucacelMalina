package org.example.Controller;

import org.example.Functions.FunctionList;
import org.example.Objects.Monom;
import org.example.Objects.Polynomial;
import org.example.RegexExpression;
import org.example.SinglePointAcces.GUIFrameSinglePointAccess;
import org.example.Views.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CalculatorController {

    CalculatorView calculatorView;
    RegexExpression regexExpression;

    public void startLogic()
    {
        calculatorView = new CalculatorView();
        GUIFrameSinglePointAccess.changePanel(calculatorView.getPanel1(),"Calculator");
        FunctionList functionList = new FunctionList();
        regexExpression = new RegexExpression();

        calculatorView.getAdunareButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              Polynomial p1 = regexExpression.checkPolynom(calculatorView.getPrimulPolinomTextField());
              Polynomial p2 = regexExpression.checkPolynom(calculatorView.getAlDoileaPolinomTextField());

              for(Monom m : p1.getPolynomial().values())
              {
                  System.out.println(m.getCoeficient()+"x^"+m.getExponent());
              }

              System.out.println("\n");

              for(Monom m : p2.getPolynomial().values())
              {
                    System.out.println(m.getCoeficient()+"x^"+m.getExponent());
              }
            }


        });

        calculatorView.getScadereButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        calculatorView.getInmultireButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        calculatorView.getImpartireButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        calculatorView.getDerivareButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        calculatorView.getIntegrareButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        calculatorView.getStergeTotButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculatorView.getPrimulPolinomTextField().setText("");
                calculatorView.getAlDoileaPolinomTextField().setText("");
                calculatorView.getRezultatTextPane().setText("");
            }
        });

    }
}
