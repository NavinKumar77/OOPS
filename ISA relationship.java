1.	class Employee{  
2.	 float salary=80000;  
3.	}  
4.	class Programmer extends Employee{  
5.	 int bonus=20000;  
6.	 public static void main(String args[]){  
7.	   Programmer p=new Programmer();  
8.	   System.out.println("Programmer salary is:"+p.salary);  
9.	   System.out.println("Bonus of Programmer is:"+p.bonus);  
10.	}  
11.	}
