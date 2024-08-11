package day4;
import java.util.Scanner;
public class CustomerDemo {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String name,city;
			int id;
			
			System.out.println("enter customer id:");
			id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter customer city:");
			city=sc.nextLine();
			
		System.out.println("enter customer name:");
			name=sc.nextLine();
			
			System.out.println("");
			Customer c1=new Customer();
			c1.setCustomercity(city);
			c1.setCustomerId(id);
			c1.setCustomername(name);
			System.out.println(c1);
			
			System.out.println("enter customer id:");
			id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter customer city:");
			city=sc.nextLine();
			Customer c2=new Customer(name,id,city);
			c2.setCustomercity(city);
			c2.setCustomerId(id);
			c2.setCustomername(name); 
			System.out.println(c2);
			sc.close();
		}
			}
					
				

