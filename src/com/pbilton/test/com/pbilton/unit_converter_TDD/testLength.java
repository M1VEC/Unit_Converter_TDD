package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testLength {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time);
    private int parentType = 1;

    @Test
    public void testCreateInStandardCM(){
        double value = length.getValueInStandard("cm");
        Assertions.assertEquals(1.00, value);
    }

    @Test
    public void testGetValueInStandardInch(){
    double value = length.getValueInStandard("inch");
    Assertions.assertEquals(2.54, value);
    }

    @Test
    public void testGetValueInStandardFeet(){
        double value = length.getValueInStandard("ft");
        Assertions.assertEquals(30.48, value);
    }

    @Test
    public void testGetValueInStandardYard() {
        double value = length.getValueInStandard("yd");
        Assertions.assertEquals(91.44, value);
    }

    @Test
    public void testGetValueInStandardMeter() {
        double value = length.getValueInStandard("m");
        Assertions.assertEquals(100, value);
    }

    @Test
    public void testGetValueInStandardKiloMeter(){
        double value = length.getValueInStandard("km");
        Assertions.assertEquals(100_000, value);
    }

    @Test
    public void testGetValueInStandardMile(){
        double value = length.getValueInStandard("mi");
        Assertions.assertEquals(160_934.0, value);
    }

    @Test
    public void testConvertValues_Inch_Meter_150(){
        inMemorySetValues.setParentType(parentType);
        inMemorySetValues.setBaseValue("inch");
        inMemorySetValues.setToUnitValue("m");
        inMemorySetValues.setBaseAmount(150);
        unitConversion unitConversion = new unitConversion(inMemorySetValues);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(3.81,value);
    }

    @Test
    public void testConvertValues_Mile_Yard_10(){
        inMemorySetValues.setParentType(parentType);
        inMemorySetValues.setBaseValue("mi");
        inMemorySetValues.setToUnitValue("yd");
        inMemorySetValues.setBaseAmount(10);
        unitConversion unitConversion = new unitConversion(inMemorySetValues);
        double value = unitConversion.convertValues();
        value = Math.round(value*100)/100;
        Assertions.assertEquals(17_599,value);
    }

    @Test
    public void testConvertValues_Mile_KM_1_5(){
        inMemorySetValues.setParentType(parentType);
        inMemorySetValues.setBaseValue("mi");
        inMemorySetValues.setToUnitValue("km");
        inMemorySetValues.setBaseAmount(1.5);
        unitConversion unitConversion = new unitConversion(inMemorySetValues);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(2.41401,value);
    }
}
