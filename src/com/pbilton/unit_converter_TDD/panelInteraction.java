package com.pbilton.unit_converter_TDD;

import javax.swing.*;

public class panelInteraction implements Interaction {

    private UnitFactor length;
    private UnitFactor weight;
    private UnitFactor speed;
    private UnitFactor time;
    private String baseUnitName;
    private String toUnitName;
    private double baseQty;
    private int parentType;

    private String [] parentUnitList = new String[] {"1 - Length" , "2 - Weight", "3 - Speed", "4 - Time"};
    private String [] availableUnits = new String[0];

    public panelInteraction(UnitFactor length, UnitFactor weight, UnitFactor speed, UnitFactor time) {
        this.length = length;
        this.weight = weight;
        this.speed = speed;
        this.time = time;
    }

    @Override
    public void setParentUnit() {
        String type = JOptionPane.showInputDialog(parentUnitList,"Enter index of parent unit");
        parentType = Integer.parseInt(type);
    }

    @Override
    public void setBaseUnitName() {
        UnitList();
        String base = JOptionPane.showInputDialog(availableUnits,"Enter base unit name");
        baseUnitName = base;
        System.out.println(baseUnitName);
    }

    @Override
    public void setBaseUnitQty() {
        String qty = JOptionPane.showInputDialog("Enter quantity of " + baseUnitName);
        baseQty = Double.parseDouble(qty);
        System.out.println(baseQty);
    }

    @Override
    public void setToUnitName() {
        UnitList();
        String to = JOptionPane.showInputDialog(availableUnits,"Enter unit to convert to");
        toUnitName = to;
        System.out.println(toUnitName);
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

    public void printConversion(double result){
        System.out.println(result);
         JOptionPane.showMessageDialog(null, getBaseQty() + " " + baseUnitName + " equals " + result + " " + toUnitName);
    }
}
