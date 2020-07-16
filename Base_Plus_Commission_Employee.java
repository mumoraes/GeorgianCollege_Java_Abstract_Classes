/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 Date: July 15, 2020
 Purpose: This is a concrete class  to calculate the weekly salary for Base + Commission Employee. This class extends CommissionEmployee
 */
public class BasePlusCommissionEmployee extends CommissionEmployee
{ // represent the last employee type
        
    private double baseSalary;
    
    //Constructor with no argument
    public BasePlusCommissionEmployee()
    {
        
    }
    //Constructor with 6 arguments
    public BasePlusCommissionEmployee(String firstName, String lastName, int sin, double commissionRate, double grossSales, double baseSalary)
    {
        super(firstName, lastName, sin, commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
        
    //Getter
    public double getBaseSalary()
    {
        return baseSalary;
    }
    
    //Setters
    public void setBaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
    
        
    @Override
    public double earnings()
    {
        return (getCommissionRate() * getGrossSales()) + getBaseSalary();
    }
    
    @Override
    public String toString()
    {
        return (super.toString()
                +"\n"+"Base Salary: " + getBaseSalary()
                );
    }
}
