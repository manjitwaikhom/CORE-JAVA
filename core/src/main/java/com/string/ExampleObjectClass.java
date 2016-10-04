package com.string;


/*------------------ EXAMPLE USING object class-----------------------*/
class Customer{
int cid;
String cname;
String email;
long phone;
Customer(){}
Customer(int cid,String cname,String email,long phone)
{
this.cid=cid;
this.cname=cname;
this.email=email;
this.phone=phone;
}
void show(){
System.out.println(cid+"\t"+cname+"\t"+email+"\t"+phone);
}
public int hashCode(){
//you write your algorithm
System.out.print("inside hashCode()..........");
return 69;
}
public boolean equals(Object o){
Customer c=(Customer) o;
if(this.cid==c.cid && this.cname.equals(c.cname)){
return true;
}
return false;
}

public String toString(){
return " "+cid+"\t"+cname+"\t"+email+"\t"+phone;
}
}
/*----------------------------------------------------------------------*/
class ExampleObjectClass{
public static void main(String as[]){
Customer c1=new Customer(101,"manjit","manjit@waikhom.com",9999);
Customer c2=new Customer(101,"manjit","manjit@waikhom.com",9999);
Customer c3=new Customer(102,"manjit","manjit@waikhom.com",9999);
c1.show();
System.out.println(c1.getClass());
System.out.println(c1.hashCode());
System.out.println(c1.toString());
System.out.println("\n");
System.out.println(c1);           //toString() will be automatically invoked
System.out.println(c2);          //toString() will be automatically invoked
System.out.println(c3);         //toString() will be automatically invoked
System.out.println("\n");
System.out.println(c1==c2);       //compares address only
System.out.println(c1.equals(c2));
System.out.println(c1==c3);     //compares address only
System.out.println(c1.equals(c3));
}
}


