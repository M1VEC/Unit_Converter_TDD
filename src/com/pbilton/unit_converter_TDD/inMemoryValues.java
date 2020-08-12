package com.pbilton.unit_converter_TDD;

public class inMemoryValues {
    private UnitFactor length;
    private UnitFactor weight;
    private double baseUnit;
    private double baseQty;
    private double toUnit;


    public inMemoryValues(UnitFactor length, UnitFactor weight) {
        this.length = length;
        this.weight = weight;

    }

    private double setUnitValue( int parentType, String unitName){    //used to get baseUnitValue and toUnitValue
        double value = 0;
        if (parentType == 1){
            value = length.getValueInStandard(unitName);
        }
        else if (parentType == 2){
            value = weight.getValueInStandard(unitName);
        }
        else if (parentType == 3) {
            //do something
        }
        else if (parentType == 4){
            //do something else
        }
        return value;
    }

    public double setBaseValue(int type, String baseUnitName){
        baseUnit = setUnitValue(type, baseUnitName);
        return baseUnit;
    }

    public double setToUnitValue(int type, String toUnitName){
        toUnit = setUnitValue(type, toUnitName);
        return toUnit;
    }

    public double setBaseAmount(double amount){
        baseQty = amount;
        return baseQty;
    }

    public double convertValues(double baseUnit, double toUnit, double baseQty){
        double result = (baseUnit * baseQty) / toUnit;
        return result;
    }
}
