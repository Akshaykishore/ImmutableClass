package com.company;

/*
Immutable Class:
1) Make the class Final so that no one can extend it.
2) Make all the fields inside class as private final so that no one can change the value (One note is there check in main class).
3) Have only getters no setters should be available since it would make the class Immutable in stale.
4) Make Constructor as public
 */
public final class Customer {
    private String name;
    private int age;
    private Address address;

    public Customer(String name, int age, Address address)  {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Shallow Copy
    public Address getAddress() {
        return address;
    }

    /* Deep Copy
    public Address getAddress() {
        return new Address(address.doorNo, address.address);
    }*/

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
