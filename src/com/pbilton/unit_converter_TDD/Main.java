package com.pbilton.unit_converter_TDD;

public class Main {

    public static void main(String[] args) {

        UnitFactor length = new Length();
        UnitFactor weight = new Weight();
        UnitFactor speed = new Speed();
        UnitFactor time = new Time();

    consoleInteraction consoleInteraction = new consoleInteraction(length, weight, speed, time);
    int parentType = consoleInteraction.setParentUnit();
    String[] availableUnits = consoleInteraction.getUnitList(parentType);
    consoleInteraction.setBaseUnitName(availableUnits);
    }
}
