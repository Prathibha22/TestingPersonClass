package com.zipcodewilmington.person;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private Date dob;
    private String address;
    private String ssn;
    private String driverseId;
    private boolean isAlive;

    public Person() {
        this.name="";
        this.age=Integer.MAX_VALUE;
        this.dob=null;
        this.address="";
        this.ssn="";
        this.driverseId="";
        this.isAlive=false;

    }

    public Person(int age) {
        this.age=age;
    }

    public Person(String name) {
        this.name=name;
    }

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age=age;
    }
    public  void setDob(Date date){ this.dob=date; }
    public void setSsn(String ssn){ this.ssn=ssn; }
    public void setDriverseId(String driverseId){ this.driverseId=driverseId;}
    public void setAddress(String address){ this.address=address;}
    public void setIsAlive(boolean isAlive){  this.isAlive=isAlive;}

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public  Date getDob(){return this.dob;}
    public String getSsn(){return this.ssn;}
    public String getDriverseId(){return this.driverseId;}
    public String getAddress(){return this.address;}
    public boolean getIsAlive(){return  this.isAlive;}
}
