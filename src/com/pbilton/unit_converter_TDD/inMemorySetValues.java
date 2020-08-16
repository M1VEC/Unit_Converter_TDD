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
    private String baseUnitName;
    private String toUnitName;

    public inMemorySetValues(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time ) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time =time;
    }

    public inMemorySetValues(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time, values_result values_result ) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time =time;
        this.parentType = values_result.getParentType();
        this.baseQty = values_result.getBaseUnitQty();
        this.baseUnitName = values_result.getBaseUnitName();
        this.toUnitName = values_result.getToUnitName();
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

    public void setParentType(int setParentType){                       //sets the parent unit index
        this.parentType = setParentType;
    }

    public double setBaseValue(String baseUnitName){                    //sets the base unit value with parameter
        baseUnit = setUnitValue(baseUnitName);
        return baseUnit;
    }

    public double setBaseValue(){                                       //sets the base unit value
        baseUnit = setUnitValue(baseUnitName);
        return baseUnit;
    }

    public double setToUnitValue(String toUnitName){                    //sets the toUnit value with parameter
        toUnit = setUnitValue(toUnitName);
        return toUnit;
    }

    public double setToUnitValue(){                                     //sets the toUnit value
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
