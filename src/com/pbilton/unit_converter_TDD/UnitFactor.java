package com.pbilton.unit_converter_TDD;

public interface UnitFactor {

     double CreateInStandard(double standard);

     double getValueInStandard(String unitName) ;

     String[] getUnitList();

     }
