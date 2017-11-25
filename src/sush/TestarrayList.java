package sush;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestarrayList {
	public static void main(String[] args) {  
	   /* List<Integer> list=new ArrayList<>();  
	    list.add(Integer.valueOf(10));//storing Integer object  
	    list.add(20);//Now compiler converts it into Integer.valueOf(20) which is object  
	    list.add(30);  
	    list.add(40); 
	    list.add(50); 
	    list.add(50); 
	    list.add(60);	
	    
	    System.out.println("Traversing List...");  
	    for(Integer i:list){  
	        System.out.println(i);  
	    }  */
	    ArrayList<String> list1=new ArrayList<String>();//Creating arraylist  
  	  list1.add("Ravi");//Adding object in arraylist  
  	  list1.add("Vijay");  
  	  list1.add("Ravi");  
  	  list1.add("Ajay");  
  	  //Traversing list through Iterator  
  	  Iterator itr=list1.iterator();  
  	  while(itr.hasNext()){  
  	   System.out.println(itr.next());  
  	  }  
  	 }  
  	 
}
	 
	 

