package com.pbilton.unit_converter_TDD;

public class unitConversion {

    private double baseUnit;
    private double toUnit;
    private double baseQty;
    private double result;

    public unitConversion(double baseUnit, double toUnit, double baseQty) {
        this.baseUnit = baseUnit;
        this.toUnit = toUnit;
        this.baseQty = baseQty;
    }

    public double convertValues(){
        result = ((baseUnit*baseQty)/toUnit);
        return result;
    }
}
