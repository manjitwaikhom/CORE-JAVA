package com.singletondesignpattern;


	public class Fiveton implements Cloneable{
		
		static int count=1;
		
		private Fiveton(){}
		
		static Fiveton getInstance()throws Exception{
			if(count<=5){
				count++;
				return new Fiveton();
			}else{
				
				throw new Exception("Can not create more then 5 instance of this class"); 
		      }			
			}
		
		public Object clone()throws CloneNotSupportedException{
			
			if(count<=5){
				count++;
			return super.clone();
			}else{
				
				throw new CloneNotSupportedException("Exceeded more than five instances");
			}
			
		}
		
		}





