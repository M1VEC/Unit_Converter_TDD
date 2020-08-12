package com.pbilton.unit_converter_TDD;

public class Weight implements UnitFactor{
    //Base unit of measure for Weight is Gram

    private double Gram = CreateInStandard(1.00);
    private double Milligram = CreateInStandard(0.001*CreateInStandard(Gram));
    private double Kilogram = CreateInStandard(1000*CreateInStandard(Gram));
    private double Ounce = CreateInStandard(28.349*CreateInStandard(Gram));
    private double TonUK = CreateInStandard(1016.04691*CreateInStandard(Kilogram));
    private double TonUS = CreateInStandard(907.18474*CreateInStandard(Kilogram));
    private double Stone = CreateInStandard(6.350293*CreateInStandard(Kilogram));

    public String[] unitList;

    public Weight() {
        this.unitList = new String[]{"mg", "g", "kg", "onz", "ton UK", "ton US", "stone"};
    }

    @Override
    public double CreateInStandard(double standard) {
        double value = standard;
        return value;
    }

    @Override
    public double getValueInStandard(String unitName) {
        switch (unitName) {
            case "mg":
                return Milligram;
            case "g":
                return Gram;
            case "kg":
                return Kilogram;
            case "oz":
                return Ounce;
            case "ton uk":
                return TonUK;
            case "ton us":
                return TonUS;
            case "stone":
                return Stone;
            default:
                System.out.println("Not a valid unit!");
        }
        return 0;
    }

    @Override
    public String[] getUnitList() {
        return this.unitList;
    }
}

