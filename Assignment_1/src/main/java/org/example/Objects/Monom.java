package org.example.Objects;

public class Monom {

    private Integer exponent;

    private Integer coeficient;

    public Monom(Integer exponent, Integer coeficient) {
        this.exponent = exponent;
        this.coeficient = coeficient;
    }

    public Integer getExponent() {
        return exponent;
    }

    public void setExponent(Integer exponent) {
        this.exponent = exponent;
    }

    public Integer getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(Integer coeficient) {
        this.coeficient = coeficient;
    }
}
