/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class  to calculate the weekly salary for Commission Employee. This class extends Employee
 */
public class CommissionEmployee extends Employee
{   
    private double commissionRate, grossSales;
    
    //Constructor with no argument
    public CommissionEmployee()
    {
        
    }
    //Constructor with 5 argument
    public CommissionEmployee(String firstName, String lastName, int sin, double commissionRate, double grossSales)
    {
        super(firstName, lastName, sin);
        this.commissionRate=commissionRate;
        this.grossSales=grossSales;
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
    
    @Override
    public String toString()
    {
        return (super.toString()
                +"\n"+"Commission Rate: " + getCommissionRate()
                +"\n"+"Gross Sales: " + getGrossSales()
                );
    }
}
