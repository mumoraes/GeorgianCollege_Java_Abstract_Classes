/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class to calculate the weekly salary for Salaried Employee. This class extends abstract class Employee
 */

public class SalariedEmployee extends Employee
{
    //variable
    private double weeklySalary;
   // private Employee employee;
    
    // Constructor with no argument
    public SalariedEmployee()
    {
        
    }
    // Constructor with four arguments
    public SalariedEmployee(String firstName, String lastName, int sin, double weeklySalary)
    {
        super(firstName, lastName, sin);
        this.weeklySalary = weeklySalary;
    }

    //Getter
    public double getWeeklySalary()
    {
        return weeklySalary;
    }
    
    //Setter
    public void setWeeklySalary(double weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }
         
    
    @Override
    public double earnings()
    {
        return weeklySalary = getWeeklySalary();
    }
    
    @Override
    public String toString()
    {
        return (super.toString()
                +"\n"+"Weekly Salary: $" + earnings()
                );                
    }
}
