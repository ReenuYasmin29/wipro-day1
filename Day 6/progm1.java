ADDITION USING STRINGS


import java.io.*;
import java.util.*;
class UserMainCode
{
public int addNumberString(String input1,String input2)
{
int carry=0;
  if(input1.length()<input2.length())
  {
    String temp="";
   temp=input1;
   input1=input2;
   input2=temp;
  }
  int len1=input1.length();
  int len2=input2.length();
  String str="";
  int j=len2-1;
  for(int i=0;i<len1;i++)
  {
   int a=Character.getNumericValue(input1.charAt(len1-1-i));
   int b=0;
   if(j>=0)
   {
    b=Character.getNumericValue(input2.charAt(j));
    j--;
   }
   int sum=a+b+carry;
   carry=sum/10;
   int init=sum%10;
   str=Integer.toString(init)+str;
   if(i==len1-1 && carry>0)
   {
              str=Integer.toString(carry)+str;
    }
  }
  return str;
 }
}

FIND STRING CODE

import java.io.*;
import java.util.*;
class UserMainCode{
public int findStringCode(String input1){
String str=input1.toUpperCase();    
String word[]=str.split(" ");    
String value2="";    
for(int i=0;i<word.length;i++)    {     
int sum=0;     
for(int j=0;j<word[i].length()/2;j++)     {      
int first=word[i].charAt(j);      
int last=word[i].charAt(word[i].length()-1-j);       
sum+=Math.abs(first-last);     
}    
 if(word[i].length()%2!=0)     
sum+=(word[i].charAt(word[i].length()/2)-64);          
String value=Integer.toString(sum);         
  value2+=value;   
 }   
 return Integer.parseInt(value2);
 }}

GET CODE THROUGH STRINGS

import java.io.*;
import java.util.*;
class UserMainCode{
public int getCodeThroughString(String input1){
String word[]=input1.split(" ");  
int sum=0;  
for(int i=0;i<word.length;i++)  
{          
sum+=word[i].length();  
}   
return (1 + (sum-1) %9); 
}
