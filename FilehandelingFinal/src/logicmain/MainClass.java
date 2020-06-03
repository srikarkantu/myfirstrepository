package logicmain;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception {
	
		File fil = new File("test.txt");
		
        FileInputStream Fin = new FileInputStream(fil);
		
		InputStreamReader dis = new InputStreamReader(Fin);
		
		BufferedReader br = new BufferedReader(dis);
		
		String Line;
		
		String name;
		
		Integer choice;
		
		Scanner sc = new Scanner(System.in);
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("**************** Select Your Choice ***************");
		System.out.println("1) To Display the content of specific employee");
		System.out.println("2) To add the content of specific employee");
		System.out.println("3) To update the content of specific employee");
		
		
		choice =   Integer.parseInt(sc.nextLine());
		
		switch (choice) {
		
		case  1:
		{
			
			String check;
			
			System.out.println("enter the name to check ");
			
			check = sc.nextLine();
			
			while((Line = br.readLine()) !=null){
				String [] arr = new String[4];
				
				arr = Line.split(",");
				
				String na = arr[0];
				
				if(na.equals(check)) {
					
					System.out.println("name is "+arr[0]);
					System.out.println("empid is "+arr[1]);
					System.out.println("phno is "+arr[2]);
					System.out.println("lno is "+arr[3]);
					break;
				}
				else {
					System.out.println("above entry dosent exist in the file");
				}
			}
			break;
		}	
		case 2:
		{	
			System.out.println("enter the new detils to the file");
			
			String input = sc.nextLine();
			
//			FileOutputStream fio = new FileOutputStream(fil,true);
//			
//			OutputStreamWriter ots = new OutputStreamWriter(fio, "UTF-16");
			
			FileWriter fir = new FileWriter(fil,true);
			
			BufferedWriter bw = new BufferedWriter(fir);
			
			bw.newLine();
			
			bw.write(input);
			
			bw.close();
			break;
		}	
		case 3:
		{	

//			FileOutputStream fio1 = new FileOutputStream("updatedfile.txt");
//			
//			OutputStreamWriter ots1 = new OutputStreamWriter(fio1, "UTF-16");
//			
			
			FileWriter fir3 = new FileWriter("updateded.txt");
			
			BufferedWriter bw1 = new BufferedWriter(fir3);
			
			System.out.println("enter the name of the employee");
			
			name = sc.nextLine();
			
			while((Line = br.readLine()) !=null){
				
				String [] arr = new String[4];
				
				arr = Line.split(",");
				
				String na = arr[0];
			if(na.equals(name)) {
				
				System.out.println("******Select Any Option*******");
				System.out.println(" 1) To change the name");
				System.out.println(" 2) To change the empid");
				System.out.println(" 3) To change the phno");
				System.out.println(" 4) To change the landlineno");
				
				int choice1 = sc.nextInt();
				
				if(choice1 == 1) {
					System.out.println("enter the new name");
					String name1 = sc1.nextLine();
					arr[0]=name1;
					System.out.println("name has been updated");
				}
				else if(choice1 == 2) {
					System.out.println("enter the new empid");
					String emp1 = sc1.nextLine();
					arr[1]=emp1;
					System.out.println("empid has been updated");
				}
				else if(choice1 == 3) {
					System.out.println("enter the new phnumber");
					String num1 = sc1.nextLine();
					arr[2]=num1;
					System.out.println("phnumber has been updated");
				}
				else if(choice1 == 4) {
					System.out.println("enter the new name");
					String lnnum1 = sc1.nextLine();
					arr[3]=lnnum1;
					System.out.println("landline number has been updated");
				}
				
				StringBuilder lineup = new StringBuilder();
				
				for(String st : arr) {
					lineup.append(st).append(",");
				}
				
				Line = lineup.toString();
				bw1.write(Line);
				bw1.newLine();
		}
			else 
			{   
				
				bw1.write(Line);
				bw1.newLine();
				
			}
				}
			bw1.close();
			break;
			
		}
			
	}
	  System.out.println("Program execution completed");
	  br.close();
	  sc.close();
	}

}
