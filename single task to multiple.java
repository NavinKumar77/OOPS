1.	class TestMultitasking1 extends Thread{  
2.	 public void run(){  
3.	   System.out.println("task one");  
4.	 }  
5.	 public static void main(String args[]){  
6.	  TestMultitasking1 t1=new TestMultitasking1();  
7.	  TestMultitasking1 t2=new TestMultitasking1();  
8.	  TestMultitasking1 t3=new TestMultitasking1();  
9.	  
10.	  t1.start();  
11.	  t2.start();  
12.	  t3.start();  
13.	 }  
14.	}
