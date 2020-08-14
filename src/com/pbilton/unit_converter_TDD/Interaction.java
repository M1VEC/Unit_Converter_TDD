package com.pbilton.unit_converter_TDD;

public interface Interaction {

    void setParentUnit();

    void setBaseUnitName();

    void setBaseUnitQty();

    void setToUnitName();

    String getBaseUnitName();

    String getToUnitName();

    double getBaseQty();

    int getParentType();
}
