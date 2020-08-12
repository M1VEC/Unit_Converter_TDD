package com.pbilton.unit_converter_TDD;

public interface UnitFactor {

     double CreateInStandard(double centimeters);

     double getValueInStandard(String BaseUnit) ;

     String[] getUnitList();

     }
