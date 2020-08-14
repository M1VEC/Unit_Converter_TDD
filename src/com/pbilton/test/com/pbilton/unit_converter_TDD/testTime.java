package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testTime {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    inMemoryValues inMemoryValues = new inMemoryValues(length, weight, speed, time);

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
        double base = inMemoryValues.setBaseValue(4,"day");
        double toUnit = inMemoryValues.setToUnitValue(4,"year");
        double amount = inMemoryValues.setBaseAmount(365);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(1.0000000219178087,value);
    }

    @Test
    public void testConvertValues_month_min_3(){
        double base = inMemoryValues.setBaseValue(4,"month");
        double toUnit = inMemoryValues.setToUnitValue(4,"min");
        double amount = inMemoryValues.setBaseAmount(3);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(131399.99712,value);
    }
}
