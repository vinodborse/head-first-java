package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StringDemo {
	public static void main(String args[]) throws NumberFormatException, IOException {
        /*String str = "xxxabxx";
        String a = "xx";
        int b = 0;
        int c = 0;
        System.out.println("Length= "+str.length());
        while(b < str.length()-1){
        	System.out.println("SUB = "+str.substring(b,b+2));
            if(a.equals(str.substring(b,b+2))){
              c++;
            }
            b++;
        }
          System.out.println(c);*/
		
		/*String s = "HELLOWORLD";
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(s.split("")));
		ArrayList<String> all = new ArrayList<String>(Arrays.asList(s.split("")));
		int count = 0;
		for(String temp: al){
			ArrayList<Integer> ali = new ArrayList<Integer>();
			while(all.contains(temp)){
				ali.add(count);
				count = count+1;
				all.remove(temp);
			}
			if(!ali.isEmpty()){
				System.out.println(temp +"="+ali);
			}
		}*/
		
		/*int[] i = {3,4,5,6,7};
		
		for(int j = 0; j<i.length; j++){
			for(int k = 0; k<i.length; k++){
				if(i[j]+i[k] == 9){
					System.out.println(i[j]+"+"+i[k]);
				}
			}
		}*/
		
		//String s = "ABC@PQR@XYZ@123";
		/*ArrayList<String> sa = new ArrayList<String>(Arrays.asList(s.split("@")));
		for(String temp : sa){
			System.out.println(temp);
		}*/
		/*while(s.contains("@")){
			System.out.println(s.substring(0,s.indexOf("@")));
			s = s.substring(s.indexOf("@")+1);
		}
		System.out.println(s);*/
		
		/*BufferedReader br;
		String st;
		try {
			br = new BufferedReader(new FileReader("D:\\_Project\\a.txt"));
			while ((st = br.readLine()) != null){
			    System.out.println(st);
			  }
			br.close(); 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\_Project\\b.txt"));
			bw.write("1234567890");
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		/*
		 // First add 'mysql-connector.jar' in your project.
		  try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","root");
			
			Statement stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT * FROM user";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      while(rs.next()){
		    	  int userid = rs.getInt("userid");
		    	  String firstName = rs.getString("firstName");
		    	  String lastName = rs.getString("lastName");
		    	  String email = rs.getString("email");
		    	  int c_clount = rs.getMetaData().getColumnCount();
		    	  
		    	  System.out.println("Column count = "+c_clount);
		    	  System.out.println("----Column Details----");
		    	  System.out.println("userid    = "+userid);
		    	  System.out.println("firstName = "+firstName);
		    	  System.out.println("lastName  = "+lastName);
		    	  System.out.println("email     = "+email);
		      }
		      
		      rs.close();
		      stmt.close();
		      conn.close(); 
		      
		}catch(Exception e){
			System.out.println(e);
		}*/
		
			
		/*Scanner input = new Scanner(System.in);
	    System.out.println("Please input the number of Threads you want to create: ");
	    int n = input.nextInt();
	    System.out.println("You have selected " + n + " Threads");

	    for (int x=0; x<n; x++)
	    {
	        MyThread temp= new MyThread("Thread #" + x);
	        temp.start();
	        System.out.println("Started Thread:" + x);
	    }*/
		
		//========================================================================================
		 Scanner ob=new Scanner(System.in);
		 System.out.println("Enter the number to be checked.");
		 int n=ob.nextInt();
		 int sum=0,num=n;
		 while(num>9){
			 sum=num;
			 int s=0;
			 while(sum!=0){
				 s = s + (sum%10);
				 sum = sum/10;
			 }
			 num=s;
		 }
		 if(num==1){
			 System.out.println(n+" is a Magic Number.");
		 }else{
			 System.out.println(n+" is not a Magic Number.");
		 }
		//========================================================================================
    }
}

/*class MyThread extends Thread { 
  public MyThread (String s) { 
	    super(s); 
	  }
	  public void run(){};
	}*/
