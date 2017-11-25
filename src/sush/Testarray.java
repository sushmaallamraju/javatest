package sush;

import org.testng.annotations.Test;

class Testarray{  
 //public static void main(String args[]){  
  
	@Test
	public void aMethod(){
int a[]=new int[5];//declaration and instantiation 
String s[] = new String[5];
s[0]="Sushma";
s[1]="Kumar";
s[2]="Rahul";
s[3]="Harish";
s[4]="Sushma";
a[0]=10;//initialization  
a[1]=20;  
a[2]=70;  
a[3]=40;  
a[4]=50;  
  int k=0;
//printing array  
for(int i=0;i<a.length;i++)//length is the property of array  
System.out.println(a[i]);  
for(k=0;k<s.length;k++)
	System.out.println((s[k]));
  
}} 