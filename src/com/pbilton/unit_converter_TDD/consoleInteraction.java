package com.pbilton.unit_converter_TDD;

import java.util.Scanner;

public class consoleInteraction implements Interaction{

    static Scanner scanner = new Scanner(System.in);

    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private String baseUnitName;
    private String toUnitName;
    private double baseQty;
    private int parentType;
    private String unitType;

    private String [] parentUnitList = new String[] {"1 - Length" , "2 - Weight", "3 - Speed", "4 - Time"};
    private String [] availableUnits = new String[0];

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
    public void setBaseUnitName() {
        unitType = "base unit name";
        printUnits();
        baseUnitName = scanner.next();
        System.out.println();
    }

    @Override
    public void setBaseUnitQty() {
        System.out.print("Enter quantity of " + baseUnitName + ":");
        baseQty = scanner.nextDouble();
        System.out.println();
    }

    @Override
    public void setToUnitName() {
        unitType = "unit name to convert to: ";
        printUnits();
        toUnitName = scanner.next();
        System.out.println();
    }

    public void setUnitList(){
        UnitList();
    }

    private void printParentUnitList(String unitType){
        int i ;
        for (i=0; i < parentUnitList.length ; i++){
            System.out.println(parentUnitList[i]);
        }
        System.out.print("Select index for " + unitType + ": " );
    }

    private void UnitList(){
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
    }

    private void printUnits(){
        int i ;
        for (i=0; i < availableUnits.length ; i++){
            System.out.println(availableUnits[i]);
        }
        System.out.print("Select " + unitType + ": " );
    }

    @Override
    public String getBaseUnitName() {
        return baseUnitName;
    }

    @Override
    public String getToUnitName() {
        return toUnitName;
    }

    @Override
    public double getBaseQty() {
        return baseQty;
    }

    @Override
    public int getParentType() {
        return parentType;
    }

    public void printConversion(double result){
       System.out.println(baseQty + " " + baseUnitName + " equals " + result + " " + toUnitName);
    }
}
