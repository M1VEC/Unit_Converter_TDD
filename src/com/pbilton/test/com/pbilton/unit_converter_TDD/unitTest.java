package com.pbilton.unit_converter_TDD;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class unitTest {
    Length length = new Length();

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
}
