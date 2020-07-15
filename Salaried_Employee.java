/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is a concrete class to calculate the weekly salary for Salaried Employee
 */

public class Salaried_Employee extends Employee
{
    //variable
    private double weeklySalary;
   // private Employee employee;
    
    public Salaried_Employee()
    {
        
    }
    
    public Salaried_Employee(double weeklySalary)
    {
        this.weeklySalary = weeklySalary;
    }

    public Salaried_Employee(String firstName, String lastName, int sin, double weeklySalary)
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
        this.weeklySalary=weeklySalary;
    }
         
    
    @Override
    public double earnings()
    {
        return getWeeklySalary();
    }
    
    
            /*
    public double earnings(double payment)
    {
       payment = this.weeklySalary(payment);
       return payment;
    }
            
    // method weeklySalary ( divided / 52)
    public double weeklySalary(double salary)
    {
        return salary;
    }
*/
}
