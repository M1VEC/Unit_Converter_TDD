package com.pbilton.unit_converter_TDD;

public class unitConversion {

    private double baseUnit;
    private double toUnit;
    private double baseQty;
    private double result;

    public unitConversion(inMemorySetValues inMemorySetValues) {
        this.baseQty = inMemorySetValues.getBaseQty();
        this.baseUnit = inMemorySetValues.getBaseUnit();
        this.toUnit = inMemorySetValues.getToUnit();
    }

    public double convertValues(){
        result = ((baseUnit*baseQty)/toUnit);
        return result;
    }
}
