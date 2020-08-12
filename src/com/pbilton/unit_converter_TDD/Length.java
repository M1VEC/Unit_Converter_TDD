package com.pbilton.unit_converter_TDD;

public class Length implements UnitFactor {
        //Standard unit of measure for Length is Centimeter

        private double Centimeter = CreateInStandard(1.00);
        private double Inch = CreateInStandard(2.54);
        private double Feet = CreateInStandard(12f*CreateInStandard(Inch));
        private double Yard = CreateInStandard(3*CreateInStandard(Feet));
        private double Meter = CreateInStandard(100*CreateInStandard(Centimeter));
        private double KiloMeter = CreateInStandard(1000*CreateInStandard(Meter));
        private double Mile = CreateInStandard(1609.34*CreateInStandard(Meter));

        @Override
        public double CreateInStandard(double centimeters){
            double value = centimeters;
            return value;
        }

        @Override
        public double getValueInStandard(String unitName){
            switch (unitName){
                case "cm":  return Centimeter;
                case "inch": return Inch;
                case "feet": return Feet;
                case "yard": return Yard;
                case "meter": return Meter;
                case "kilometer": return KiloMeter;
                case "mile": return Mile;
                default:
                    System.out.println(0);
            }
            return 0;
        }
}