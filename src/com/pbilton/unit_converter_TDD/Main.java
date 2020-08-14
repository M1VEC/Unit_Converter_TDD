package com.pbilton.unit_converter_TDD;

public class Main {

    public static void main(String[] args) {

        UnitFactor length = new Length();
        UnitFactor weight = new Weight();
        UnitFactor speed = new Speed();
        UnitFactor time = new Time();

    consoleInteraction consoleInteraction = new consoleInteraction(length, weight, speed, time);
    consoleInteraction.setParentUnit();
    consoleInteraction.getUnitList();
    consoleInteraction.setBaseUnitName();
    consoleInteraction.setBaseUnitQty();
    consoleInteraction.setToUnitName();

    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time);
    inMemorySetValues.setParentType(consoleInteraction.getParentType());
    inMemorySetValues.setBaseValue(consoleInteraction.getBaseUnitName());
    inMemorySetValues.setBaseAmount(consoleInteraction.getBaseQty());
    inMemorySetValues.setToUnitValue(consoleInteraction.getToUnitName());

    unitConversion unitConversion = new unitConversion(inMemorySetValues);
    double result = unitConversion.convertValues();
    consoleInteraction.printConversion(result);
    }
}
