package com.pbilton.unit_converter_TDD;

public class SetValues {
    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private consoleInteraction consoleInteraction;


    public SetValues(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time, consoleInteraction consoleInteraction) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
        this.consoleInteraction = consoleInteraction;
    }

    public void setUnitValues() {
        consoleInteraction.setParentUnit();
        consoleInteraction.getUnitList();
        consoleInteraction.setBaseUnitName();
        consoleInteraction.setBaseUnitQty();
        consoleInteraction.setToUnitName();
    }
}
