package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWeight {
    Length length = new Length();
    Weight weight = new Weight();
    inMemoryValues inMemoryValues = new inMemoryValues(length, weight);

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
        double value = inMemoryValues.setBaseValue(2,"kg");
        Assertions.assertEquals(1000, value);
    }

    @Test
    public void testConvertValues_kg_stone_70(){
        double base = inMemoryValues.setBaseValue(2,"kg");
        double toUnit = inMemoryValues.setToUnitValue(2,"stone");
        double amount = inMemoryValues.setBaseAmount(70);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(11.02311342169566,value);
    }

    @Test
    public void testConvertValues_stone_ounce_12(){
        double base = inMemoryValues.setBaseValue(2,"stone");
        double toUnit = inMemoryValues.setToUnitValue(2,"oz");
        double amount = inMemoryValues.setBaseAmount(12);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(2688.049525556457,value);
    }

    @Test
    public void testConvertValues_kg_gram_1(){
        double base = inMemoryValues.setBaseValue(2,"kg");
        double toUnit = inMemoryValues.setToUnitValue(2,"g");
        double amount = inMemoryValues.setBaseAmount(1);
        double value = inMemoryValues.convertValues(base, toUnit, amount);
        Assertions.assertEquals(1000,value);
    }
}
