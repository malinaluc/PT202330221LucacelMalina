package org.example.Controller;

import org.example.Functions.FunctionList;
import org.example.Objects.Monom;
import org.example.Objects.Polynomial;
import org.example.RegexExpression;
import org.example.SinglePointAcces.GUIFrameSinglePointAccess;
import org.example.Views.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

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
              Polynomial res = functionList.add(p1,p2);
              calculatorView.getRezultatTextPane().setText(res.toString(res));
            }
        });

        calculatorView.getScadereButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polynomial p1 = regexExpression.checkPolynom(calculatorView.getPrimulPolinomTextField());
                Polynomial p2 = regexExpression.checkPolynom(calculatorView.getAlDoileaPolinomTextField());
                Polynomial res = functionList.sub(p1,p2);
                calculatorView.getRezultatTextPane().setText(res.toString(res));
            }
        });


        calculatorView.getInmultireButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polynomial p1 = regexExpression.checkPolynom(calculatorView.getPrimulPolinomTextField());
                Polynomial p2 = regexExpression.checkPolynom(calculatorView.getAlDoileaPolinomTextField());
                Polynomial res = functionList.mul(p1,p2);
                calculatorView.getRezultatTextPane().setText(res.toString(res));
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
                Polynomial p1 = regexExpression.checkPolynom(calculatorView.getPrimulPolinomTextField());
                Polynomial res = functionList.deriv(p1);
                calculatorView.getRezultatTextPane().setText(res.toString(res));
            }
        });

        calculatorView.getIntegrareButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polynomial p1 = regexExpression.checkPolynom(calculatorView.getPrimulPolinomTextField());
                Polynomial res = functionList.integ(p1);
                calculatorView.getRezultatTextPane().setText(res.toStringIntegrare(res)+"+C");
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
