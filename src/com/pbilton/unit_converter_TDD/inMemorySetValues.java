package com.pbilton.unit_converter_TDD;

public class inMemorySetValues {
    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private double baseUnit;
    private double baseQty;
    private double toUnit;
    private int parentType;
    private double unitValue;

    public inMemorySetValues(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time =time;
    }

    private double setUnitValue(String unitName){                      //used to get baseUnitValue and toUnitValue
        if (parentType == 1){
            unitValue = length.getValueInStandard(unitName);
        }
        else if (parentType == 2){
            unitValue = weight.getValueInStandard(unitName);
        }
        else if (parentType == 3) {
            unitValue = speed.getValueInStandard(unitName);
        }
        else if (parentType == 4){
            unitValue = time.getValueInStandard(unitName);
        }
        return unitValue;
    }

    public void setParentType(int setParentType){
        this.parentType = setParentType;
    }

    public double setBaseValue(String baseUnitName){                    //sets the base unit value
        baseUnit = setUnitValue(baseUnitName);
        return baseUnit;
    }

    public double setToUnitValue(String toUnitName){                    //sets the toUnit value
        toUnit = setUnitValue(toUnitName);
        return toUnit;
    }

    public double setBaseAmount(double amount){                         //sets the qty of base amount
        baseQty = amount;
        return baseQty;
    }

    public double getBaseUnit() {
        return baseUnit;
    }

    public double getBaseQty() {
        return baseQty;
    }

    public double getToUnit() {
        return toUnit;
    }
}
