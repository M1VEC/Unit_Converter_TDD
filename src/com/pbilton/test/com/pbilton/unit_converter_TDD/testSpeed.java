package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSpeed {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    inMemoryValues inMemoryValues = new inMemoryValues(length, weight, speed);

    @Test
    public void testCreateInStandardft_s(){
        double value = speed.getValueInStandard("ft per sec");
        Assertions.assertEquals(0.3048,value);
    }

    @Test
    public void testCreateInStandardkm_min(){
        double value = speed.getValueInStandard("km per min");
        Assertions.assertEquals(16.666_7,value);
    }


    @Test
    public void testCreateInStandard_mph(){
        double value = speed.getValueInStandard("mph");
        Assertions.assertEquals(0.44704178816178813,value);
    }

    @Test
    public void testCreateInStandard_mach(){
        double value = speed.getValueInStandard("mach");
        Assertions.assertEquals(340.00135986791946,value);
    }

    @Test
    public void testConvertValues_mph_ft_min_60(){
        double base = inMemoryValues.setBaseValue(3,"mph");
        double toUnit = inMemoryValues.setToUnitValue(3,"ft per min");
        double amount = inMemoryValues.setBaseAmount(60);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(5_279.915521710685,value);
    }

    @Test
    public void testConvertValues_ft_s_knot_160(){
        double base = inMemoryValues.setBaseValue(3,"ft per sec");
        double toUnit = inMemoryValues.setToUnitValue(3,"knot");
        double amount = inMemoryValues.setBaseAmount(160);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(94.79541842544339,value);
    }

    @Test
    public void testConvertValues_mach_ft_min_5(){
        double base = inMemoryValues.setBaseValue(3,"mach");
        double toUnit = inMemoryValues.setToUnitValue(3,"ft per min");
        double amount = inMemoryValues.setBaseAmount(12);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(803_136.7_558_505_194,value);
    }
}
