package com.immutable;
public class Immutable{

public static void main(String[] args) {

Address add = new Address(101, "HMT Main Road", "Bangalore", 560054);
Student stud = new Student(99, "Srinivas", 65799999, add);
System.out.println(stud);
System.out.println("-- Modifying the add ref in Main --");
//stud.studAdd.aid = 7458;
add.aid = 14523;
add.street = "Madiwala";
System.out.println(stud);
System.out.println(stud.getSid());
System.out.println(add);
Address ref = stud.getStudAddress();
ref.aid = 11111;
System.out.println(stud);

}

}


final class Student {

private final int sid;
private final String name;
private final long phone;
private final Address studAdd;

public Student(int sid, String name, long phone, Address studAdd) {

this.sid = sid;
this.name = name;
this.phone = phone;
this.studAdd = new Address(studAdd.aid, studAdd.street, studAdd.city, studAdd.pin);

}

public String toString() {

return "Stud Info\t:"+sid+"\t"+name+"\t"+phone+"\nAdd Info\t:"+studAdd;

}

public int getSid() {

return this.sid;

}

public Address getStudAddress() {

return (Address) studAdd.clone();

}

}

class Address {

int aid;
String street;
String city;
int pin;

public Address(int aid, String street, String city, int pin) {

this.aid = aid;
this.street = street;
this.city = city;
this.pin = pin;

}

public Object clone() {

return new Address(this.aid, this.street, this.city, this.pin);

}

public String toString() {

return aid+"\t"+street+"\t"+city+"\t"+pin;

}

}