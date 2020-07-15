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
public class SalaryCalculatorLab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ================== Salaried Employee ======================
        System.out.print("============ Salaried Employee ==============");
                                                        //  firstName, lastName, sin, weeklySalary
        Salaried_Employee salariedEmp = new Salaried_Employee("Murilo","Moraes", 123456, 100);
        System.out.println(salariedEmp.toString()+ "\n"+ "Salary: " + salariedEmp.earnings());
        
        
// ================== Hourly Employee ======================
        System.out.print("============ Hourly Employee ==============");
        Hourly_Employee hourlyEmp = new Hourly_Employee("Steve", "Jobs", 12254);
        hourlyEmp.setHourlyWage(20); // how much he/she earns by hour
        hourlyEmp.setHoursWorked(40); // how many worked hours 
        System.out.println(hourlyEmp.toString());
        System.out.println("Hourly Wage: " + hourlyEmp.getHourlyWage());
        System.out.println("Hours Worked: " + hourlyEmp.getHoursWorked());
        System.out.println("Salary: " + hourlyEmp.earnings());
        
        
        /*
        Hourly_Employee test = new Hourly_Employee();
        test.setHourlyWage(20);
        test.setHourlyWage(36);
        Employee emp2 = new Hourly_Employee();
        System.out.println("> hourly employees are paid by the hour and receive overtime pay. Total: " + emp2.earnings());
        */
        
        
        // ================== Commissioned Employee ======================
        System.out.print("============ Commissioned Employee ==============");
        Commission_Employee commisEmp = new Commission_Employee("Lionel", "Messi", 44444);
        commisEmp.setGrossSales(4000);
        commisEmp.setCommissionRate(0.10);
        System.out.println(commisEmp.toString());
        System.out.println("Gross Sales: " + commisEmp.getGrossSales());
        System.out.println("Commission: " + commisEmp.getCommissionRate());
        System.out.println("Salary: " + commisEmp.earnings());
        
        
        // ================== Base + Commission Employee ======================
        System.out.print("============ Base + Commission Employee ==============");
        Base_Plus_Commission_Employee salaryPlusComm = new Base_Plus_Commission_Employee("Bill", "Gates", 77789);
        salaryPlusComm.setCommissionRate(0.10);
        salaryPlusComm.setGrossSales(4000);
        salaryPlusComm.setBaseSalary(2000*1.1);
        System.out.println(salaryPlusComm.toString());
        System.out.println("Base Salary: " + salaryPlusComm.getBaseSalary());
        System.out.println("Gross Sales: " + salaryPlusComm.getGrossSales());
        System.out.println("Commussion Rate: " + salaryPlusComm.getCommissionRate());
        System.out.println("Salary: " + salaryPlusComm.earnings());
        
        
    }
    
}
