package org.example.Functions;

import org.example.Objects.Monom;
import org.example.Objects.Polynomial;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class FunctionList {
    public static Polynomial add(Polynomial a, Polynomial b)
    {
        Polynomial result = new Polynomial();
        for(Monom m1 : a.getPolynomial().descendingMap().values())
        {
            if(b.getPolynomial().containsKey(m1.getExponent()))
            {
                int coef = b.getPolynomial().get(m1.getExponent()).getCoeficient() + m1.getCoeficient() ;
                Monom res = new Monom(m1.getExponent(),coef);
                result.adaugarePolinom(res);
                b.getPolynomial().remove(m1.getExponent());
            }
            else
            {
                result.adaugarePolinom(m1);
            }
        }
        for(Monom m2 : b.getPolynomial().descendingMap().values())
        {
            Monom res = new Monom(m2.getExponent(),m2.getCoeficient());
            result.adaugarePolinom(res);
        }
        return result;
    }
    public static Polynomial sub(Polynomial a , Polynomial b)
    {
        Polynomial result = new Polynomial();
        for(Monom m1 : a.getPolynomial().descendingMap().values())
        {
            if(b.getPolynomial().containsKey(m1.getExponent()))
            {
                int coef =m1.getCoeficient() -b.getPolynomial().get(m1.getExponent()).getCoeficient();
                Monom res = new Monom(m1.getExponent(),coef);
                result.adaugarePolinom(res);
                b.getPolynomial().remove(m1.getExponent());
            }
            else
            {
                result.adaugarePolinom(m1);
            }
        }
        for(Monom m2 : b.getPolynomial().descendingMap().values())
        {
            Monom res = new Monom(m2.getExponent(),(m2.getCoeficient()*(-1)));
            result.adaugarePolinom(res);
        }
        return result;
    }
    public static Polynomial mul(Polynomial a, Polynomial b) {
        Polynomial result = new Polynomial();
        TreeMap<Integer, ArrayList<Monom>> auxMap = new TreeMap<>();
        int exp = 0 , coef =0;
        for (Monom m1 : a.getPolynomial().descendingMap().values()) {
            ArrayList<Monom> list = new ArrayList<>();
            for (Monom m2 : b.getPolynomial().descendingMap().values()) {
                coef = m1.getCoeficient() * m2.getCoeficient();
                exp = m1.getExponent() + m2.getExponent();
                if (!auxMap.containsKey(exp)) {
                    auxMap.put(exp, new ArrayList<>());
                }
                auxMap.get(exp).add(new Monom(exp, coef));
            }
        }
        for (Map.Entry<Integer, ArrayList<Monom>> entry : auxMap.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<Monom> list1 = new ArrayList<>();
            list1 = entry.getValue();
            int sum = 0;
            for (Monom monom : list1) {
                sum = sum + monom.getCoeficient();
            }
            Monom rez = new Monom(key,sum);
            result.adaugarePolinom(rez);
        }
        return result;
    }
    public static Polynomial deriv(Polynomial a)
    {
        Polynomial result = new Polynomial();
        for(Monom m1 : a.getPolynomial().descendingMap().values())
        {
            if(m1.getExponent()==0)
            {
                a.getPolynomial().remove(m1.getExponent());
            }
            else
            {
                int coef = m1.getCoeficient() * m1.getExponent();
                int exp = m1.getExponent() -1;
                Monom rez = new Monom(exp, coef);
                result.adaugarePolinom(rez);
            }
        }
        return result;
    }
    public static Polynomial integ(Polynomial a)
    {
        Polynomial result = new Polynomial();
        for(Monom m1 : a.getPolynomial().descendingMap().values()) {

            double exp = m1.getExponent() + 1;
            double coef = m1.getCoeficient() / exp;
            Monom  rez = new Monom((int)exp,coef);
            result.adaugarePolinom(rez);
        }
        return result;
    }
}




