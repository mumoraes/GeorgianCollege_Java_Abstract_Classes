/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class to calculate the weekly salary for Hourly Employee. This class extends Employee
 */

public class HourlyEmployee extends Employee {
    
    private double hourlyWage, hoursWorked;
    
    // Constructor with no argument
    public HourlyEmployee()
    {
        
    }
    // Constructor with 5 argument
    public HourlyEmployee(String firstName, String lastName, int sin, double hourlyWage, double hoursWorked)
    {
        super(firstName, lastName, sin);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    
    //Getters
    public double getHourlyWage()
    {
        return hourlyWage;
    }
    public double getHoursWorked()
    {
        return hoursWorked;
    }
    
    //Setters
    public void setHourlyWage(double hourlyWage)
    {
        this.hourlyWage = hourlyWage;
    }
    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }
 
    
    @Override
    public double earnings()
    {
       double salary; 
       
       if(getHoursWorked() <=40)
       {
           salary = getHourlyWage() * getHoursWorked();
       }
       else
       {
           salary = 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
       }
       return salary;
    }
    
    @Override
    public String toString()
    {
        return (super.toString()
                +"\n"+"Hourly Wage: " + getHourlyWage()
                +"\n"+"Hours Worked: " + getHoursWorked()
                );                
    }
    
}
