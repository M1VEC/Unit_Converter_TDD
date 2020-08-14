package com.pbilton.unit_converter_TDD;

public class inMemoryValues {
    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private double baseUnit;
    private double baseQty;
    private double toUnit;

    public inMemoryValues(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time =time;
    }

    private double setUnitValue( int parentType, String unitName){                      //used to get baseUnitValue and toUnitValue
        double value = 0;
        if (parentType == 1){
            value = length.getValueInStandard(unitName);
        }
        else if (parentType == 2){
            value = weight.getValueInStandard(unitName);
        }
        else if (parentType == 3) {
            value = speed.getValueInStandard(unitName);
        }
        else if (parentType == 4){
            value = time.getValueInStandard(unitName);
        }
        return value;
    }

    public double setBaseValue(int parentType, String baseUnitName){                    //sets the base unit value
        baseUnit = setUnitValue(parentType, baseUnitName);
        return baseUnit;
    }

    public double setToUnitValue(int parentType, String toUnitName){                    //sets the toUnit value
        toUnit = setUnitValue(parentType, toUnitName);
        return toUnit;
    }

    public double setBaseAmount(double amount){                                         //sets the qty of base amount
        baseQty = amount;
        return baseQty;
    }

    public double convertValues(double baseUnit, double toUnit, double baseQty){
        double result = ((baseUnit*baseQty)/toUnit);
        return result;
    }
}
