package com.pbilton.unit_converter_TDD;

public class Main {

    public static void main(String[] args) {

        UnitFactor length = new Length();
        UnitFactor weight = new Weight();
        UnitFactor speed = new Speed();
        UnitFactor time = new Time();

    //gets required values from user using the Interaction interface
    consoleInteraction consoleInteraction = new consoleInteraction(length, weight, speed, time);
    SetValues setValues = new SetValues(length, weight, speed, time, consoleInteraction);
    setValues.setUnitValues();

    //gets the conversion factors from the inputted values
    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time);
    inMemorySetValues.setParentType(consoleInteraction.getParentType());
    inMemorySetValues.setBaseValue(consoleInteraction.getBaseUnitName());
    inMemorySetValues.setBaseAmount(consoleInteraction.getBaseQty());
    inMemorySetValues.setToUnitValue(consoleInteraction.getToUnitName());

    //carries out the conversion using the inMemorySetValues
    unitConversion unitConversion = new unitConversion(inMemorySetValues);
    double result = unitConversion.convertValues();
    consoleInteraction.printConversion(result);
    }
}
