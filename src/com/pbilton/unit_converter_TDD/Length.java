package com.pbilton.unit_converter_TDD;

public class Length implements UnitFactor {
        //Base unit of measure for Length is Centimeter

        private double Centimeter = CreateInStandard(1.00);
        private double Inch = CreateInStandard(2.54);
        private double Feet = CreateInStandard(12*CreateInStandard(Inch));
        private double Yard = CreateInStandard(3*CreateInStandard(Feet));
        private double Meter = CreateInStandard(100*CreateInStandard(Centimeter));
        private double KiloMeter = CreateInStandard(1000*CreateInStandard(Meter));
        private double Mile = CreateInStandard(1609.34*CreateInStandard(Meter));

        public String[] unitList;

        public Length() {
            this.unitList = new String[] {"Centimeter","Inch","Feet","Yard","Meter","Kilometer","Mile"};
        }

        @Override
        public double CreateInStandard(double centimeters){
            double value = centimeters;
            return value;
        }

        @Override
        public double getValueInStandard(String unitName){
            switch (unitName) {
                case "cm":
                    return Centimeter;
                case "inch":
                    return Inch;
                case "feet":
                    return Feet;
                case "yard":
                    return Yard;
                case "meter":
                    return Meter;
                case "kilometer":
                    return KiloMeter;
                case "mile":
                    return Mile;
                default:
                    System.out.println("Not a valid unit!");
            }
                return 1;
        }

    @Override
    public String[] getUnitList() {
        return this.unitList;
    }
}