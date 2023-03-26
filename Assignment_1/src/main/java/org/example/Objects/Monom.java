package org.example.Objects;

public class Monom {

    private Integer exponent;

    private Integer coeficient;

    private Double coeficientIntegrare;

    public Monom(Integer exponent, Integer coeficient) {
        this.exponent = exponent;
        this.coeficient = coeficient;
    }

    public Monom(Integer exponent, Double coeficientIntegrare) {
        this.exponent = exponent;
        this.coeficientIntegrare = coeficientIntegrare;
    }

    public Double getCoeficientIntegrare() {
        return coeficientIntegrare;
    }

    public void setCoeficientIntegrare(Double coeficientIntegrare) {
        this.coeficientIntegrare = coeficientIntegrare;
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
