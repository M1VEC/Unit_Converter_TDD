package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class unitTest {
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
    public void testGetValueInStandardYard(){
        double value = length.getValueInStandard("yard");
        Assertions.assertEquals(91.44,value);
    }

    @Test
    public void testGetValueInStandardMeter(){
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
        double base = inMemoryValues.getBaseUnitValue("inch");
        double toUnit = inMemoryValues.getToUnitValue("meter");
        double amount = inMemoryValues.getBaseAmount(150);
        double value = inMemoryValues.convertValues(base,toUnit,amount);
        Assertions.assertEquals(3.81,value);
    }
}
