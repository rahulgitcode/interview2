import java.util.*;

class Student implements Comparator<Student>{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public Student() {
	// TODO Auto-generated constructor stub
}
public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
@Override
public int compare(Student o1, Student o2) {
	if(o1.getCgpa() != o2.getCgpa()){
		if(o1.getCgpa() - o2.getCgpa() > 0){
			return -1;
		}else{
			return 1;
		}
	}else if(o1.getFname().compareTo(o2.getFname()) != 0){
		return o1.getFname().compareTo(o2.getFname());
	}else if(o1.getId() != o2.getId()){
		return o1.getId() - o2.getId();
	}
	return 0;
}
}

//Complete the code
public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
       
         Collections.sort(studentList, new Student());
      
         for(Student st: studentList){
         System.out.println(st.getFname()+" "+st.getCgpa()+" "+st.getId());
      }
   }
}
