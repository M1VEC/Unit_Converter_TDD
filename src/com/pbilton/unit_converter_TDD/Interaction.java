package com.pbilton.unit_converter_TDD;

public interface Interaction {

    int setParentUnit();

    void setBaseUnitName(String[] availableUnits);

    String setBaseUnitQty();

    String setToUnitName();
}
