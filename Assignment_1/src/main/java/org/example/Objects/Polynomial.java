package org.example.Objects;

import java.util.TreeMap;

public class Polynomial {

    private TreeMap<Integer, Monom> polynomial = new TreeMap<>();

    public Polynomial() {
        this.polynomial = polynomial;
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
}
