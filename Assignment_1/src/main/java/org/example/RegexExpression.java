package org.example;

import org.example.Controller.CalculatorController;
import org.example.Objects.Monom;
import org.example.Objects.Polynomial;
import org.example.Views.CalculatorView;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;


public class RegexExpression {

    public Polynomial checkPolynom(JTextField textField)
    {
        Polynomial polynomial = new Polynomial();
        
        String p = textField.getText();

        String expressionReg = "([+-]?[0-9]+)[a-z](\\^([0-9]+))";
        String match = p;

        Pattern pt = Pattern.compile(expressionReg);
        Matcher mt = pt.matcher(match);

        ///int i=0;
        while(mt.find()) {

            ///mt.group(1) - coeficient
            ///mt.group(3) - exponent
            ///i++;
            int coef = parseInt(mt.group(1));
            int exp = parseInt(mt.group(3));
            Monom m =new Monom(exp,coef);
            polynomial.adaugarePolinom(m);
            ///System.out.println("Monom" + i +": "+ m.getCoeficient()+"^"+m.getExponent());
        }

        return polynomial;

    }

}
