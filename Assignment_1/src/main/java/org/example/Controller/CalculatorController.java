package org.example.Controller;

import org.example.SinglePointAcces.GUIFrameSinglePointAccess;
import org.example.Views.CalculatorView;

public class CalculatorController {

    CalculatorView calculatorView;
    public void startLogic()
    {
        calculatorView = new CalculatorView();
        GUIFrameSinglePointAccess.changePanel(calculatorView.getPanel1(),"Calculator");


    }
}
