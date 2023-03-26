package org.example.Objects;

import org.jetbrains.annotations.NotNull;

import java.util.Collections;
import java.util.TreeMap;

public class Polynomial {

    private TreeMap<Integer, Monom> polynomial = new TreeMap<>();

    public Polynomial() {
    }

    public TreeMap<Integer, Monom> getPolynomial() {
        return polynomial;
    }

    public void setPolynomial(TreeMap<Integer, Monom> polynomial) {
        this.polynomial = polynomial;
    }

    public void adaugarePolinom(Monom a) ///adaugam un monom in TreeMap
    {
        polynomial.put(a.getExponent(),a);
    }


    public String toString( Polynomial p) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(Monom m : p.getPolynomial().descendingMap().values() )
        {
            int coeficient = m.getCoeficient();
            int exponent = m.getExponent();
            if(coeficient== 0)
            {
                continue;
            }
            if(coeficient < 0)
            {
                sb.append("-");
                coeficient = (-1)*coeficient;
            }else if (i>0)
            {
                sb.append("+");
            }
            i++;
            if(coeficient!= 1 || exponent == 0)
            {
                sb.append(coeficient);
            }
            if(exponent > 0)
            {
                sb.append("x");
            }
            if(exponent > 1)
            {
                sb.append("^").append(exponent);
            }
        }
        if(sb.length()==0)
            return "0";
        return sb.toString();
    }

    public String toStringIntegrare( Polynomial p) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(Monom m : p.getPolynomial().descendingMap().values() )
        {
            double coeficient = m.getCoeficientIntegrare();
            int exponent = m.getExponent();
            if(coeficient== 0)
            {
                continue;
            }
            if(coeficient < 0)
            {
                sb.append("-");
                coeficient = (-1.0)*coeficient;
            }
            else if (i>0)
            {
                sb.append("+");
            }
            i++;
            if(coeficient!= 1.0 || exponent == 0)
            {
                sb.append(String.format("%.2f",coeficient));
            }
            if(exponent > 0)
            {
                sb.append("x");
            }
            if(exponent > 1)
            {
                sb.append("^").append(exponent);
            }
        }
        if(sb.length()==0)
            return "0";
        return sb.toString();
    }
}
