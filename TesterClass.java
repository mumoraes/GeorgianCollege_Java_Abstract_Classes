/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculatorlab3;

/**
 * @author Murilo Moraes
 * Date: July 15, 2020
 * Purpose: Tester Class
 */

public class TesterClass {
        /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {

        System.out.print("=========== Salaried Employee =============");
        //instantiate the obj                      //  firstName, lastName, sin, weekly Salary
        SalariedEmployee saldEmp = new SalariedEmployee("Murilo","Moraes", 123456, 3000.00);
        System.out.println(saldEmp.toString());
        System.out.println("Weekly earnings: $" + saldEmp.earnings());
        
        System.out.print("============ Hourly Employee ==============");
                                                  //firstName, lastName, sin, hourly, Wage, hoursWorked
        HourlyEmployee hourlyEmp = new HourlyEmployee("Steve", "Jobs", 12254, 20.50, 39);
        System.out.println(hourlyEmp.toString());
        System.out.println("Weekly earnings: $" + hourlyEmp.earnings());

        System.out.print("========== Commissioned Employee ==========");
                                                          //firstName,lastName,sin,commissionRate,grossSales)
        CommissionEmployee commEmp = new CommissionEmployee("Lionel", "Messi", 44444, 0.10, 5000);
        System.out.println(commEmp.toString());
        System.out.println("Weekly earnings: $" + commEmp.earnings());
                
        System.out.print("======= Base + Commission Employee ========");
                                                                            //firstname,lastName,sin,commissionRate,grossSales,baseSalary    
        BasePlusCommissionEmployee salPlusComm = new BasePlusCommissionEmployee("Bill", "Gates", 77789, 0.10, 5000, 2000);
        System.out.println(salPlusComm.toString());
        System.out.println("Weekly earnings: $" + salPlusComm.earnings());
        
        
        /*For the current pay period, the company has decided to reward
        Salaried-commission employees by adding 10% to their base salaries. The company wants you
        to write an application that performs its payroll calculations polymorphically.*/            
        System.out.printf("\n========= Using Polymorphism to Increase =========");

        //Polymorphism concept
        Employee employee = salPlusComm;

        System.out.println(employee); 
        if (employee instanceof BasePlusCommissionEmployee)
        {
            // Doing downcast due to BasePlusCommissionEmployeeusing is a subclass of CommissionEmployee to be able to access the method of this subclass 
            BasePlusCommissionEmployee emp1 = (BasePlusCommissionEmployee) employee;           
            emp1.setBaseSalary(emp1.getBaseSalary() *1.1 ); //setting the increase by 10% to Base Plus Commission Employee
            System.out.println("The base salary after the increasing for the Base Plus Commission Employee : "+emp1.getBaseSalary());
            //print earnings() method inside BasePlusCommissionEmployee             
            System.out.println("Polymorphism earning: $"+employee.earnings()); 
        }
    } 
} 

