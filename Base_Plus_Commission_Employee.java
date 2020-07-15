/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class  to calculate the weekly salary for Base + Commission Employee
 */
public class Base_Plus_Commission_Employee extends Commission_Employee
{ // represent the last employee type
        
    private double baseSalary;
    
    public Base_Plus_Commission_Employee()
    {
        
    }
    public Base_Plus_Commission_Employee(double commissionRate, double grossSales, double baseSalary)
    {
        super(commissionRate, grossSales);
        this.baseSalary = baseSalary;
    }
    
    public Base_Plus_Commission_Employee(String firstName, String lastName, int sin)
    {
        super(firstName, lastName, sin);
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
    
}
