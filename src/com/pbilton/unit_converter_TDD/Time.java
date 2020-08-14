package com.pbilton.unit_converter_TDD;

public class Time implements UnitFactor {

    private double ms = CreateInStandard(1.00);
    private double sec = CreateInStandard(1_000*CreateInStandard(ms));
    private double min = CreateInStandard(60*CreateInStandard(sec));
    private double hour = CreateInStandard(60*CreateInStandard(min));
    private double day = CreateInStandard(24*CreateInStandard(hour));
    private double week = CreateInStandard(7*CreateInStandard(day));
    private double month = CreateInStandard(4.345238*CreateInStandard(week));
    private double year = CreateInStandard(12*CreateInStandard(month));

    public String[] unitList;

    @Override
    public double CreateInStandard(double standard) {
        double value = standard;
        return value;
    }

    @Override
    public double getValueInStandard(String unitName) {
        switch (unitName.toLowerCase()) {
            case "ms":
                return ms;
            case "sec":
                return sec;
            case "min":
                return min;
            case "hr":
                return hour;
            case "day":
                return day;
            case "week":
                return week;
            case "month":
                return month;
            case "year":
                return year;
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
