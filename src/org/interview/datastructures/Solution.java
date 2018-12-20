package org.interview.datastructures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Student {
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

public class Solution {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      List<Student> studentList = new ArrayList<Student>();
      
      while(totalEvents>0){
    	  String event = in.nextLine();
          String[] inputLine = event.split(" ");
          
          
          if(inputLine[0].equals("ENTER")){
              Iterator itr = studentList.iterator();
              Student newStudent = new Student(Integer.parseInt(inputLine[3]), inputLine[1],Double.parseDouble(inputLine[2]));
              if(studentList.isEmpty()){
            	  studentList.add(newStudent);
            	  System.out.println("student list updated with new entry : "+studentList);
            	  continue;
              }
              while(itr.hasNext()){
            	  Student curr = (Student) itr.next();
            	  int currIndex = studentList.indexOf(curr);
            	  if(curr.getCgpa() < newStudent.getCgpa()){
            		  studentList.add(currIndex, newStudent);
            		  System.out.println("student list updated with new entry : "+studentList);
            		  break;
            	  }else if(curr.getCgpa() == newStudent.getCgpa() && (curr.getFname().compareTo(newStudent.getFname()) >0 ) ){
            		  studentList.add(currIndex, newStudent);
            		  System.out.println("student list updated with new entry : "+studentList);
            		  break;
            	  }
            	  
              }
              
          }else if(inputLine[0].equals("SERVED")){
        	  System.out.println("Removing item:");
        	  Student remove = studentList.remove(0);
        	  System.out.println("follwing item removed: "+ remove.getCgpa()+" "+remove.getFname());
          }
           
         totalEvents--;
      }
    }
}
