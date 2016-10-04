package com.methods;

class Student{
int sid;
String email;
}
/************************/
class StudentService{
void addStudent(Student stud){
System.out.println("***addStudent(Student stud)***");
if(stud.sid<=0){
return;
}
else if(stud.email==null){
return;
}

System.out.println("Student info added\t:"+stud.sid+"\t"+stud.email);
}

boolean updateStudentInfo(int sid,String email){
System.out.println("**updateStudentInfo(int,String)**");
return true;
}

String getStudentName(int sid){
System.out.println("**getStudentName(int)***");
if(sid==99)
return "manjit";
else if(sid==77)
return "manjit";
else if(sid==88)
return "deepak";

return "singh";
}
void displayAllStudentInfo(){
System.out.println("***displayAllStudentInfo()***");
}
}
/***********************************************/
class Test{
public static void main(String args[]){
StudentService serv=new StudentService();
serv.displayAllStudentInfo();
//serv.displayAllStudentInfo(23);
String name=serv.getStudentName(99);
System.out.println(name);
System.out.println(serv.getStudentName(88));
serv.getStudentName('A');
//serv.getStudentName(12,23);
//serv.updateStudentInfo("mjt@aptech.com",123);
serv.updateStudentInfo(123,"singh");
serv.addStudent(new Student());
Student st=new Student();
st.sid=12;
serv.addStudent(st);
st.sid=23;
st.email="mjt@aptech.com";
serv.addStudent(st);
}

}

/* output:-
***displayAllStudentInfo()***
**getStudentName(int)***
manjit
**getStudentName(int)***
deepak
**getStudentName(int)***
**updateStudentInfo(int,String)**
***addStudent(Student stud)***
***addStudent(Student stud)***
***addStudent(Student stud)***
Student info added      :23     mjt@aptech.com*/
















