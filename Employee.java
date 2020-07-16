/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is the abstract superclass to Employee
 */
public abstract class Employee {
    
    private String firstName, lastName;
    private int sin;   // VERIFICAR A UNIDADE (TIPO)
    
    //Constructor with no argument
    public Employee()
    {
    }
    //Constructor with 3 arguments
    public Employee(String firstName, String lastName, int sin)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sin = sin;
    }
    
    // Getters
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getSin()
    {
        return sin;
    }
       
    
    //Setters
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }    
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setSin(int sin)
    {
        this.sin = sin;
    }      
   
    //abstract method no implementations
    public abstract double earnings();
    
    
    // representation for Employee
    @Override
    public String toString()
    {
        return (
                "\n"+"Name: " + getFirstName() + " " + getLastName()
                +"\n"+"SIN :" + getSin()
                );
    }
}
