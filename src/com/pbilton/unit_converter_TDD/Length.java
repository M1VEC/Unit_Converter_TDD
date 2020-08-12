package com.pbilton.unit_converter_TDD;

public class Length implements UnitFactor {
        //Standard unit of measure for Length is Centimeter

        private double Centimeter = CreateInStandard(1.00);
        private double Inch = CreateInStandard(2.54);
        private double Feet = CreateInStandard(12f*CreateInStandard(Inch));
        private double Yard = CreateInStandard(3*CreateInStandard(Feet));

        private double CreateInStandard(double centimeters){
            double value = centimeters;
            return value;
        }

        public double getValueInStandard(String BaseUnit){
            switch (BaseUnit){
                case "cm":  return Centimeter;
                case "inch": return Inch;
                case "feet": return Feet;
                case "yard": return Yard;
                default:
                    System.out.println(0);
            }
            return 0;
        }

}