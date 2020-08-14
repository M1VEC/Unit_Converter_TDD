package com.pbilton.unit_converter_TDD;

import java.util.Scanner;

public class consoleInteraction implements Interaction{

    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private String baseUnit;
    private String [] parentUnitList = new String[] {"1 - Length" , "2 - Weight", "3 - Speed", "4 - Time"};
    private String [] availableUnits;
    static Scanner scanner = new Scanner(System.in);
    public consoleInteraction(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
    }

    public void printParentUnitList(String unitType){
        int i ;
        for (i=0; i < parentUnitList.length ; i++){
            System.out.println(parentUnitList[i]);
        }
        System.out.print("Select index for " + unitType + ": " );
    }

    public void printUnits(String[] availableUnits, String unitType){
        int i ;
        for (i=0; i < availableUnits.length ; i++){
            System.out.println(availableUnits[i]);
        }
        System.out.print("Select " + unitType + ": " );
    }

    public String[] getUnitList(int parentType){
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

    @Override
    public int setParentUnit() {
        printParentUnitList("parent");
        int parentType = scanner.nextInt();
        return parentType;
    }

    @Override
    public void setBaseUnitName(String[] availableUnits) {
        String unitType = "base unit name";
        printUnits(availableUnits, unitType);
        baseUnit = scanner.next();
    }

    @Override
    public String setBaseUnitQty() {
        return null;
    }

    @Override
    public String setToUnitName() {
        return null;
    }

    public String getBaseUnit() {
        return baseUnit;
    }
}
