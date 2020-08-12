package com.pbilton.unit_converter_TDD;

public class inMemoryValues {
    private UnitFactor length;
    private UnitFactor weight;
    private double baseUnit;
    private double baseQty;
    private double toUnit;
    private int parentType;

    public inMemoryValues(UnitFactor length, UnitFactor weight, int parentType) {
        this.length = length;
        this.weight = weight;
        this.parentType = parentType;
    }

    public double setBaseUnitValue(String baseUnitName){
        baseUnit = length.getValueInStandard(baseUnitName);
        return baseUnit;
    }

    public double setToUnitValue(String toUnitName){
        toUnit = length.getValueInStandard(toUnitName);
        return toUnit;
    }

    public double setBaseAmount(double amount){
        baseQty = amount;
        return baseQty;
    }

    public double convertValues(double baseUnit,double toUnit, double baseQty){
        double result = (baseUnit*baseQty)/toUnit;
        return result;
    }
}
