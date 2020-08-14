package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testConsoleInteraction {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    consoleInteraction consoleInteraction = new consoleInteraction(length, weight, speed, time);

    @Test
    public void testOpeningMenu(){
        String unitType = "parent unit";
        consoleInteraction.printParentUnitList(unitType);
    }

    @Test
    public void testSetParentUnit(){
        int var = consoleInteraction.setParentUnit();
        Assertions.assertEquals(2,var);
    }

    @Test
    public void testAvailableUnits(){
        consoleInteraction.getUnitList(2);

    }
}
