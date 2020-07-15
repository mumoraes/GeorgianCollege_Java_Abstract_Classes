/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: This is super class to Employee infs
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
    
    // the PDF lab guidance ask for no get methods  *************************************
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
    // *************************************** double check if needs it  *************************************
       
    
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
    
   
    //abstract method //no implementations
    public abstract double earnings();
    
    @Override
    public String toString()
    {
        return (
                "\n"+"First Name: " + getFirstName()
                +"\n"+"Last Name: " + getLastName()
                +"\n"+"SIN :" + getSin()
                );
    }
}
