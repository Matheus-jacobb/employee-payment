


package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        List <Employee> list = new ArrayList<>();

        System.out.print("Entre com o numero de funcionarios: ");
        int n_funcionarios = sc.nextInt();

        for(int i = 0; i < n_funcionarios; i++){
            System.out.println("Employee #" + (i+1) + " data:");

            System.out.print("Outsourced (y/n)?");
            char yn = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hour = sc.nextInt();

            System.out.print("Value Per Hour: ");
            Double vhour = sc.nextDouble();

             if ( yn == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                //Employee emp = new OutsourcedEmployee (name, hour, vhour, additionalCharge);
                list.add(new OutsourcedEmployee (name, hour, vhour, additionalCharge));
                }
            else{
                //Employee emp = new Employee(name, hour, vhour);
                list.add(new Employee(name, hour, vhour));
                }
        }

        System.out.println("");
        System.out.println("PAYMENTS:");
        for(Employee emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        
    }
}
