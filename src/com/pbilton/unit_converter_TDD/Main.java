package com.pbilton.unit_converter_TDD;

public class Main {

    public static void main(String[] args) {
    //inputMethod 1 = console input, inputMethod 2 = JOptionPane input
        int inputMethod = 2;

        UnitFactor length = new Length();
        UnitFactor weight = new Weight();
        UnitFactor speed = new Speed();
        UnitFactor time = new Time();

    //gets required values from user using the Interaction interface
        consoleInteraction consoleInteraction = new consoleInteraction(length, weight, speed, time);
        panelInteraction panelInteraction = new panelInteraction(length, weight, speed , time);
        values_result values_result = new values_result(length, weight, speed, time, consoleInteraction, panelInteraction, inputMethod);
        values_result.selectInputMethod();

    //gets the conversion factors from the inputted values
        inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time, values_result);
        inMemorySetValues.setBaseValue();
        inMemorySetValues.setToUnitValue();

    //carries out the conversion using the inMemorySetValues
        unitConversion unitConversion = new unitConversion(inMemorySetValues);
        double result = unitConversion.convertValues();
        values_result.displayResults(result);

    }
}
