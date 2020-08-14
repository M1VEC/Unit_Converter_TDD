package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTime {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    private int parentType = 4;
    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time, parentType);

    @Test
    public void testCreateInStandard_sec(){
        double value = time.getValueInStandard("sec");
        Assertions.assertEquals(1_000,value);
    }

    @Test
    public void testCreateInStandard_min(){
        double value = time.getValueInStandard("min");
        Assertions.assertEquals(60_000,value);
    }

    @Test
    public void testCreateInStandard_hour(){
        double value = time.getValueInStandard("hr");
        Assertions.assertEquals(3_600_000,value);
    }

    @Test
    public void testCreateInStandard_day(){
        double value = time.getValueInStandard("day");
        Assertions.assertEquals(86_400_000,value);
    }

    @Test
    public void testCreateInStandard_week(){
        double value = time.getValueInStandard("week");
        Assertions.assertEquals(604_800_000,value);
    }

    @Test
    public void testCreateInStandard_month(){
        double value = time.getValueInStandard("month");
        Assertions.assertEquals(2.6279999424E9D,value);
    }

    @Test
    public void testCreateInStandard_year(){
        double value = time.getValueInStandard("year");
        Assertions.assertEquals(3.1535999308800003E10D,value);
    }

    @Test
    public void testConvertValues_day_year_365(){
        double baseUnit = inMemorySetValues.setBaseValue("day");
        double toUnit = inMemorySetValues.setToUnitValue("year");
        double baseQty = inMemorySetValues.setBaseAmount(365);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(1.0000000219178087,value);
    }

    @Test
    public void testConvertValues_month_min_3(){
        double baseUnit = inMemorySetValues.setBaseValue("month");
        double toUnit = inMemorySetValues.setToUnitValue("min");
        double baseQty = inMemorySetValues.setBaseAmount(3);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(131399.99712,value);
    }
}
