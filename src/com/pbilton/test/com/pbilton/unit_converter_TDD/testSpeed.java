package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testSpeed {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    private int parentType = 3;
    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time, parentType);

    @Test
    public void testCreateInStandard_ft_s(){
        double value = speed.getValueInStandard("ft/s");
        Assertions.assertEquals(0.3048,value);
    }

    @Test
    public void testCreateInStandard_km_min(){
        double value = speed.getValueInStandard("km/min");
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
        double baseUnit = inMemorySetValues.setBaseValue("mph");
        double toUnit = inMemorySetValues.setToUnitValue("ft/min");
        double baseQty = inMemorySetValues.setBaseAmount(60);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(5_279.915521710685,value);
    }

    @Test
    public void testConvertValues_ft_s_knot_160(){
        double baseUnit = inMemorySetValues.setBaseValue("ft/s");
        double toUnit = inMemorySetValues.setToUnitValue("knot");
        double baseQty = inMemorySetValues.setBaseAmount(160);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(94.79541842544339,value);
    }

    @Test
    public void testConvertValues_mach_ft_min_5(){
        double baseUnit = inMemorySetValues.setBaseValue("mach");
        double toUnit = inMemorySetValues.setToUnitValue("ft/min");
        double baseQty = inMemorySetValues.setBaseAmount(12);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(803_136.7_558_505_194,value);
    }
}
