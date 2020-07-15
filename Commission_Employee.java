/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class  to calculate the weekly salary for Commission Employee
 */
public class Commission_Employee extends Employee
{   
    private double commissionRate, grossSales;
    
    public Commission_Employee()
    {
        
    }
    public Commission_Employee(double commissionRate, double grossSales)
    {
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
    }
    
    public Commission_Employee(String firstName, String lastName, int sin)
    {
        super(firstName, lastName, sin);
    }
    
    //Getters
    public double getCommissionRate()
    {
        return commissionRate;
    }
    public double getGrossSales()
    {
        return grossSales;
    }
    
    //Setters
    public void setCommissionRate(double commissionRate)
    {
        this.commissionRate=commissionRate;
    }
    public void setGrossSales(double grossSales)
    {
        this.grossSales=grossSales;
    }
    
    
    @Override
    public double earnings()
    {
        return getCommissionRate() * getGrossSales();
    }
}
