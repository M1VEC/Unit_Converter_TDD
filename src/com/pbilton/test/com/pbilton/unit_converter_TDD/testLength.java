package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testLength {
    Length length = new Length();
    inMemoryValues inMemoryValues = new inMemoryValues(length);

    @Test
    public void testCreateInStandardCM(){
        double value = length.getValueInStandard("cm");
        Assertions.assertEquals(1.00,value);
    }

    @Test
    public void testGetValueInStandardInch(){
    double value = length.getValueInStandard("inch");
    Assertions.assertEquals(2.54,value);
    }

    @Test
    public void testGetValueInStandardFeet(){
        double value = length.getValueInStandard("feet");
        Assertions.assertEquals(30.48,value);
    }

    @Test
    public void testGetValueInStandardYard() {
        double value = length.getValueInStandard("yard");
        Assertions.assertEquals(91.44,value);
    }

    @Test
    public void testGetValueInStandardMeter() {
        double value = length.getValueInStandard("meter");
        Assertions.assertEquals(100,value);
    }

    @Test
    public void testGetValueInStandardKiloMeter(){
        double value = length.getValueInStandard("kilometer");
        Assertions.assertEquals(100_000,value);
    }

    @Test
    public void testGetValueInStandardMile(){
        double value = length.getValueInStandard("mile");
        Assertions.assertEquals(160_934.0,value);
    }

    @Test
    public void testConvertValues_Inch_Meter_150(){
        double base = inMemoryValues.setBaseUnitValue("inch");
        double toUnit = inMemoryValues.setToUnitValue("meter");
        double amount = inMemoryValues.setBaseAmount(150);
        double value = inMemoryValues.convertValues(base,toUnit,amount);
        Assertions.assertEquals(3.81,value);
    }

    @Test
    public void testConvertValues_Mile_Yard_10(){
        double base = inMemoryValues.setBaseUnitValue("mile");
        double toUnit = inMemoryValues.setToUnitValue("yard");
        double amount = inMemoryValues.setBaseAmount(10);
        double value = inMemoryValues.convertValues(base,toUnit,amount);
        value = Math.round(value*100)/100;
        Assertions.assertEquals(17_599,value);
    }

    @Test
    public void testConvertValues_Mile_KM_1_5(){
        double base = inMemoryValues.setBaseUnitValue("mile");
        double toUnit = inMemoryValues.setToUnitValue("kilometer");
        double amount = inMemoryValues.setBaseAmount(1.5);
        double value = inMemoryValues.convertValues(base,toUnit,amount);
        Assertions.assertEquals(2.41401,value);
    }
}
