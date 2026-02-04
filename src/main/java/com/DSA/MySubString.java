package com.DSA;
class MySubString  
{  
    public static void main(String args[])  
    {  
        String splitText = "Hello World Good Morning";  
        char[] charArray = splitText.toCharArray();  
        String temp = "";  
        String[] stringArray = new String[50];  
                  
        for(int i=0; i<charArray.length;){  
            if(charArray[i]!=' '){  
                temp += charArray[i];  
                i++;  
            }else{  
                temp= "";  
                i++;  
            }  
            if(charArray[i]==' '){  
                stringArray[i] = temp;  
                System.out.println(stringArray[i]);  
            }  
        }  
    }  
}  