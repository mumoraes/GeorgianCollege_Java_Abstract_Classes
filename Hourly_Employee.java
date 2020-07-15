/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class to calculate the weekly salary for Hourly Employee
 */

public class Hourly_Employee extends Employee {
    
    private double hourlyWage, hoursWorked;
    private Employee employee;
    
    public Hourly_Employee()
    {
        
    }
    
    public Hourly_Employee(double hourlyWage, double hoursWorked, Employee employee)
    {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
        this.employee = employee;
    }
    
    public Hourly_Employee(String firstName, String lastName, int sin)
    {
        super(firstName, lastName, sin);
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
    public Employee getEmployee()
    {
        return employee;
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
    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }    
    
    //public double earnings(double hoursWorked, double hourlyWage)
    @Override
    public double earnings()
    {
       double salary; 
       
       if(hoursWorked <=40)
       {
           salary = getHourlyWage() * getHoursWorked();
       }
       else
       {
           salary = 40 * getHourlyWage() + (getHoursWorked() - 40) * getHourlyWage() * 1.5;
       }
       return salary;
    }
    
}
