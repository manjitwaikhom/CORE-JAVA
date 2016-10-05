package com.exceptions;
/*---EXAMPLE USING USER DEFINED EXCEPTIONS---*/

class InvalidAccNoException extends Exception{
int accno;
InvalidAccNoException(){}
InvalidAccNoException(int accno){
this.accno=accno;
}
public String getMessage(){
String msg=null;
if(accno==0){
msg="Acc No not Available";
}
else{
msg="Acc No:"+accno+"is not available.";
}
return msg;
}
public String toString(){
return "InvalidAccNoException :"+getMessage();
}
}
/*-----------------------------------------------------------------------*/

class InsufficientFundsException extends RuntimeException{
int bal;
InsufficientFundsException(){}
InsufficientFundsException(int bal){
this.bal=bal;
}
public String getmessage(){
String msg=null;
if (bal==0){
msg="Sorry You do not have enough funds";
}
else{
msg="sorry you do not have amount:"+bal;
}
return msg;
}
public String toString(){
return "InsufficientFundsException :"+getMessage();
}
}
/*--------------------------------------------------------------------------*/
class Account{
int bal=5000;
int getBal(int accno){
try{
if(accno>100){
throw new InvalidAccNoException();
}
else{
return bal;
}
}catch(Exception e){
System.out.println(e);
System.out.println(e.getMessage());
return bal;
}
}
void withdraw(int accno,int amt){
try{
if(accno>100){
throw new InvalidAccNoException(accno);
}
else{
if(amt+1000>bal){
throw new InsufficientFundsException(amt);
}
else{
bal=bal-amt;
}
}
}catch(Exception e){
System.out.println(e);
System.out.println(e.getMessage());
}
}
}

/*----------------main()------------------*/
class UserDefinedExceptions{
public static void main(String as[]){
try{
int accno=Integer.parseInt(as[0]);
int amt=Integer.parseInt(as[1]);
Account acc=new Account();
System.out.println(acc.getBal(accno));
acc.withdraw(accno,amt);
System.out.println(acc.getBal(accno));
}
catch(Exception e){
System.out.println(e);
System.out.println(e.getMessage());
}
}
}