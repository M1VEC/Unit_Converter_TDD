package com.pbilton.unit_converter_TDD;

public interface Interaction {

    void setParentUnit();

    void setBaseUnitName(String[] availableUnits);

    void setBaseUnitQty();

    void setToUnitName(String[] availableUnits);
}
