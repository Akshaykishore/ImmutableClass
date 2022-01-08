package com.company;

public class Main {

    public static void main(String[] args)  {

        // Even though we have the class as Immutable we could change the value of address object since it is shallow copied
	    Customer c = new Customer("Akshay", 25, new Address(5,"Kanakpura"));
        c.getAddress().doorNo = 20;
        System.out.println(c);

        // If we have the getter return the deep copy of the object then it wont throw any errir
        Customer d = new Customer("Akshay", 25, new Address(5,"Kanakpura"));
        d.getAddress().doorNo = 20;
        System.out.println(d);

        /*
        Output using shallow copy
        Customer{name='Akshay', age=25, address=Address{doorNo=20, address='Kanakpura'}}
        Customer{name='Akshay', age=25, address=Address{doorNo=20, address='Kanakpura'}}
        */

         /*
        Output using Deep copy
        Customer{name='Akshay', age=25, address=Address{doorNo=5, address='Kanakpura'}}
        Customer{name='Akshay', age=25, address=Address{doorNo=5, address='Kanakpura'}}
        */

    }
}
