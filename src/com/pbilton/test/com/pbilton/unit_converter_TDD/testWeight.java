package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testWeight {
    Weight weight = new Weight();
    inMemoryValues inMemoryValues = new inMemoryValues(weight);

    @Test
    public void testCreateInStandardMG(){
        double value = weight.getValueInStandard("mg");
        Assertions.assertEquals(1_000,value);
    }

    @Test
    public void testCreateInStandardGram(){
        double value = weight.getValueInStandard("g");
        Assertions.assertEquals(1.00,value);
    }

    @Test
    public void testCreateInStandardKG(){
        double value = weight.getValueInStandard("kg");
        Assertions.assertEquals(0.001,value);
    }

    @Test
    public void testCreateInStandardOZ(){
        double value = weight.getValueInStandard("oz");
        Assertions.assertEquals(0.035_273_962,value);
    }

    @Test
    public void testCreateInStandardTonUK(){
        double value = weight.getValueInStandard("ton uk");
        Assertions.assertEquals(9.8420625E-7,value);
    }

    @Test
    public void testCreateInStandardTonUS(){
        double value = weight.getValueInStandard("ton us");
        Assertions.assertEquals(1.1023110000000001E-6,value);
    }

    @Test
    public void testCreateInStandardTonStone(){
        double value = weight.getValueInStandard("stone");
        Assertions.assertEquals(1.5747300000000002E-4,value);
    }
}
