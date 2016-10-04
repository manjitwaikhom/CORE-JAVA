package com.variables;

class Student{
int studid;
String name;
long phone=9999;
double feepaid;
static double fullcoursefee=33000.0;
static String insname="Aptech";
void show(){
System.out.println(studid+"\t"+name+"\t"+phone+"\t"+feepaid+"\t"+fullcoursefee+"\t"+insname);
}
 static void display(){
System.out.println(fullcoursefee);
System.out.println(insname);
//System.out.println(studid);
}
}
/*****************************************************/
class Test{
public static void main(String args[]){
Student.display();
System.out.println(Student.fullcoursefee);
Student st=null;
System.out.println(st.insname);
Student mjt=new Student();
Student singh=new Student();
mjt.show();
singh.show();
mjt.studid=99;
singh.name="singh";
singh.phone=895144;
singh.feepaid=6000;
singh.name="singh";
singh.studid=102;
singh.phone=385245;
mjt.fullcoursefee=99000.0;
singh.fullcoursefee=15000.0;
System.out.println("****After modifying the values*****");
singh.show();
mjt.show();
new Student().studid=1234;
new Student().show();
//System.out.println(st.studid);
}

}

/*output:-
33000.0
Aptech
33000.0
Aptech
0       null    9999    0.0     33000.0 Aptech
0       null    9999    0.0     33000.0 Aptech
****After modifying the values*****
102     singh   385245  6000.0  15000.0 Aptech
99      null    9999    0.0     15000.0 Aptech
0       null    9999    0.0     15000.0 Aptech*/