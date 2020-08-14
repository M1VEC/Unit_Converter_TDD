package com.pbilton.unit_converter_TDD;

public class Speed implements UnitFactor{
    //Base unit of measure for Speed is meters per second

    private double m_s = CreateInStandard(1.00);
    private double ft_s = CreateInStandard(0.3048*CreateInStandard(m_s));
    private double km_s = CreateInStandard(1_000*CreateInStandard(m_s));
    private double m_min = CreateInStandard(0.016_667*CreateInStandard(m_s));
    private double ft_min = CreateInStandard(0.016_667*CreateInStandard(ft_s));
    private double km_min = CreateInStandard(0.0166_667*CreateInStandard(km_s));
    private double km_h = CreateInStandard(0.0166_667*CreateInStandard(km_min));
    private double mph = CreateInStandard(1.609_344*CreateInStandard(km_h));
    private double knot = CreateInStandard(1.150_799*CreateInStandard(mph));
    private double mach = CreateInStandard(760.558_339*CreateInStandard(mph));

    public String[] unitList;

    public Speed() {
        this.unitList = new String[]{"m/s","ft/s","km/s","m/min","ft/min","km/min","km/h","mph","knot","mach"};
    }

    @Override
    public double CreateInStandard(double standard) {
        double value = standard;
        return value;
    }

    @Override
    public double getValueInStandard(String unitName) {
        switch (unitName.toLowerCase()) {
            case "m/s":
                return m_s;
            case "ft/s":
                return ft_s;
            case "km/s":
                return km_s;
            case "m/min":
                return m_min;
            case "ft/min":
                return ft_min;
            case "km/min":
                return km_min;
            case "km/h":
                return km_h;
            case "mph":
                return mph;
            case "knot":
                return knot;
            case "mach":
                return mach;
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
