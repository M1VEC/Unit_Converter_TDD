package com.pbilton.unit_converter_TDD;

import javax.swing.*;

public class values_result {
    private final int inputMethod;
    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private consoleInteraction consoleInteraction;
    private panelInteraction panelInteraction;
    private String baseUnitName;
    private String toUnitName;
    private double baseQty;
    private int parentType;

    public values_result(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time, consoleInteraction consoleInteraction, panelInteraction panelInteraction, int inputMethod) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
        this.consoleInteraction = consoleInteraction;
        this.panelInteraction = panelInteraction;
        this.inputMethod = inputMethod;
    }

    public void selectInputMethod(){
        if (inputMethod == 1)
            setUnitValuesConsole();
        else
            setUnitValuesPanel();
    }

    public int getParentType(){
        if (inputMethod == 1)
            parentType = consoleInteraction.getParentType();
        else
            parentType = panelInteraction.getParentType();
        return parentType;
    }

    private void setUnitValuesConsole() {
        consoleInteraction.setParentUnit();
        consoleInteraction.setUnitList();
        consoleInteraction.setBaseUnitName();
        consoleInteraction.setBaseUnitQty();
        consoleInteraction.setToUnitName();
    }

    private void setUnitValuesPanel() {
        panelInteraction.setParentUnit();
        panelInteraction.setBaseUnitName();
        panelInteraction.setBaseUnitQty();
        panelInteraction.setToUnitName();
    }

    public String getBaseUnitName(){
        if (inputMethod == 1)
            baseUnitName = consoleInteraction.getBaseUnitName();
        else
            baseUnitName = panelInteraction.getBaseUnitName();
        return baseUnitName;
    }

    public double getBaseUnitQty(){
        if (inputMethod == 1)
            baseQty = consoleInteraction.getBaseQty();
        else
            baseQty = panelInteraction.getBaseQty();
        return baseQty;
    }

    public String getToUnitName(){
        if (inputMethod == 1)
            toUnitName = consoleInteraction.getToUnitName();
        else
            toUnitName = panelInteraction.getToUnitName();
        return toUnitName;
    }

    public void displayResults(double result){
        if (inputMethod == 1)
            consoleInteraction.printConversion(result);
        else
            panelInteraction.printConversion(result);
    }

}
