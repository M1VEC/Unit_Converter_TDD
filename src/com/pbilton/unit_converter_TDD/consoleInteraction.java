package com.pbilton.unit_converter_TDD;

import java.util.Scanner;

public class consoleInteraction implements Interaction{

    static Scanner scanner = new Scanner(System.in);

    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private String baseUnit;
    private String toUnit;
    private double baseQty;
    private int parentType;


    private String [] parentUnitList = new String[] {"1 - Length" , "2 - Weight", "3 - Speed", "4 - Time"};
    private String [] availableUnits;

    public consoleInteraction(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
    }

    @Override
    public void setParentUnit() {
        printParentUnitList("parent");
        parentType = scanner.nextInt();
        System.out.println();
    }

    @Override
    public void setBaseUnitName(String[] availableUnits) {
        String unitType = "base unit name";
        printUnits(availableUnits, unitType);
        baseUnit = scanner.next();
        System.out.println();
    }

    @Override
    public void setBaseUnitQty() {
        System.out.println("Enter quantity of " + baseUnit + ":");
        baseQty = scanner.nextDouble();
        System.out.println();
    }

    @Override
    public void setToUnitName(String[] availableUnits) {
        String unitType = "unit name to convert to: ";
        printUnits(availableUnits, unitType);
        toUnit = scanner.next();
        System.out.println();
    }

    public void printParentUnitList(String unitType){
        int i ;
        for (i=0; i < parentUnitList.length ; i++){
            System.out.println(parentUnitList[i]);
        }
        System.out.print("Select index for " + unitType + ": " );
    }

    public String[] getUnitList(){
        String [] availableUnits = new String[0] ;
        if (parentType == 1){
            availableUnits = length.getUnitList();
        }
        else if (parentType == 2){
            availableUnits = weight.getUnitList();
        }
        else if (parentType == 3) {
            availableUnits = speed.getUnitList();
        }
        else if (parentType == 4){
            availableUnits = time.getUnitList();
        }
        return availableUnits;
    }

    public void printUnits(String[] availableUnits, String unitType){
        int i ;
        for (i=0; i < availableUnits.length ; i++){
            System.out.println(availableUnits[i]);
        }
        System.out.print("Select " + unitType + ": " );
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public String getToUnit() {
        return toUnit;
    }

    public double getBaseQty() {
        return baseQty;
    }
}
