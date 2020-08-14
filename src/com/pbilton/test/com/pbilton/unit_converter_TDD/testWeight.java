package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWeight {
    Length length = new Length();
    Weight weight = new Weight();
    Speed speed = new Speed();
    Time time = new Time();
    private int parentType = 2;
    inMemorySetValues inMemorySetValues = new inMemorySetValues(length, weight, speed, time, parentType);

    @Test
    public void testCreateInStandardMG(){
        double value = weight.getValueInStandard("mg");
        Assertions.assertEquals(0.001, value);
    }

    @Test
    public void testCreateInStandardGram(){
        double value = weight.getValueInStandard("g");
        Assertions.assertEquals(1.00, value);
    }

    @Test
    public void testCreateInStandardKG(){
        double value = weight.getValueInStandard("kg");
        Assertions.assertEquals(1_000, value);
    }

    @Test
    public void testCreateInStandardOZ(){
        double value = weight.getValueInStandard("oz");
        Assertions.assertEquals(28.349, value);
    }

    @Test
    public void testCreateInStandardTonUK(){
        double value = weight.getValueInStandard("ton uk");
        Assertions.assertEquals(1_016_046.91, value);
    }

    @Test
    public void testCreateInStandardTonUS(){
        double value = weight.getValueInStandard("ton us");
        Assertions.assertEquals(907_184.74, value);
    }

    @Test
    public void testCreateInStandardTonStone(){
        double value = weight.getValueInStandard("stone");
        Assertions.assertEquals(6_350.293, value);
    }

    @Test
    public void testSetBaseUnit(){
        double value = inMemorySetValues.setBaseValue("kg");
        Assertions.assertEquals(1000, value);
    }

    @Test
    public void testConvertValues_kg_stone_70(){
        double baseUnit = inMemorySetValues.setBaseValue("kg");
        double toUnit = inMemorySetValues.setToUnitValue("stone");
        double baseQty = inMemorySetValues.setBaseAmount(70);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(11.02311342169566,value);
    }

    @Test
    public void testConvertValues_stone_ounce_12(){
        double baseUnit = inMemorySetValues.setBaseValue("stone");
        double toUnit = inMemorySetValues.setToUnitValue("oz");
        double baseQty = inMemorySetValues.setBaseAmount(12);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(2688.049525556457,value);
    }

    @Test
    public void testConvertValues_kg_gram_1(){
        double baseUnit = inMemorySetValues.setBaseValue("kg");
        double toUnit = inMemorySetValues.setToUnitValue("g");
        double baseQty = inMemorySetValues.setBaseAmount(1);
        unitConversion unitConversion = new unitConversion(baseUnit, toUnit, baseQty);
        double value = unitConversion.convertValues();
        Assertions.assertEquals(1000,value);
    }
}
