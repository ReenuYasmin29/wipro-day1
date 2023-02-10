IS PRIME?

import java.io.*;

import  java.util.*;

class UserMainCode

{

 public int isPrime(int input1){

  int count=0;

 for(int i=2;i<=Math.sqrt(input1);i++)

{

 if(input1%i==0)

     count++;

}

if(count==0)

 return 2;

 else

return 1;

 }

}

FACTORIAL OF A NUMBER

import java.io.*;

import  java.util.*;

class UserMainCode

{

 public int nFactorial(int input1){

  int fact=1;

for(int i=1;i<=input1;i++)

 {

fact=fact*i;

 }

return fact;

 }

}

Nth FIBONACCI

import java.io.*;

import  java.util.*;

class UserMainCode

{

 public long nthFibonacci(int input1){

 if(input1==1)

 return 0;

if(input1==2)

 return 1;

 else

 return nthFibonacci(input1-1)+nthFibonacci(input1-2);

 }

}

Nth PRIME

import java.io.*;

import  java.util.*;

class UserMainCode

{

 public int NthPrime(int input1){

       int count=0,pcount=0,i;

  for(i=2;i<=100000;i++)

  {

   count=0;

   for(int j=2;j<=Math.sqrt(i);j++)

   {

    if(i%j==0)

     count++;

   }

   if(count==0)

    pcount++;

   if(pcount==input1)

    break;

  }

  return i; 

}

}

