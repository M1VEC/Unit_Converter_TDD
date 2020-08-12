package com.pbilton.unit_converter_TDD;

public class inMemoryValues {
    private UnitFactor length;

    public inMemoryValues(UnitFactor length) {
        this.length = length;
    }

    public double getBaseUnitValue(String baseUnitName){
        double baseUnit = length.getValueInStandard(baseUnitName);
        return baseUnit;
    }

    public double getToUnitValue(String toUnitName){
        double toUnit = length.getValueInStandard(toUnitName);
        return toUnit;
    }

    public double getBaseAmount(double amount){
        double baseQty = amount;
        return baseQty;
    }

    public double convertValues(double baseUnit,double toUnit, double baseQty){
        double result = (baseUnit*baseQty)/toUnit;
        return result;
    }
}
