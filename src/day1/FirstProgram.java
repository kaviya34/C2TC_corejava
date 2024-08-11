package day1;

public class FirstProgram {
public static void main(String[] args) {
			//Program to demonstrate identifiers
			int $number = 20; 
			System.out.println("value of the numbervariable is : "+ $number);
			String studentName="Aniket"; 
			System.out.println("value is : "+studentName);
			
			//Program to demonstrate Data types
			int value1 = 9 / 2; 
			float value2 = 101 / 61;
			double value3 = 10d / 6d;
			float value4 = 5/2.5f; 
			System.out.println("value 1=" + value1);
			System.out.println("value 2=" + value2);
			System.out.println("value 3=" + value3);
			System.out.println("value 4=" + value4);
			
			int marker = 512;
			//assigning expression to variable
			double percentage = marker * 0.46f;
			System.out.println("percentage :" +percentage);
			
			//program to demonstrate char data type
			char ch = 'a';
			System.out.println(ch);
			char ch1 = 65;
			System.out.println(ch1);
			char var1 = '\u00A7';
			System.out.println(var1);
			char var2 = '\u20AC';
			System.out.println(var2);
			int a = 'A';
			System.out.println(a);
			
			//Program to demonstrate data types
			//byte takes 1 byte
			byte byteMax = 127;
			byte byteMin = -128;
			System.out.println("Min range of byte is" +byteMin+"Max range of byte is"+byteMax);
			//short - 2 bytes
			short shortMax = 32767;
			short shortMin = -32768;
			System.out.println("Minshort range of byte is" +shortMin+"Maxshort range of byte is"+shortMax);
			//int - 4bytes
			
			int maxInt = 2147483647;
			int minInt = -2147483648;
		
			System.out.println("Minint range of byte is"+minInt+"Maxint range of byte is"+maxInt);
			
			
			//long - 8bytes
					long maxLong = 9223372036854775807L;
					long minLong = -9223372036854775808L;
					System.out.println("Minlong range of byte is"+minLong+"Maxlong range of byte is"+maxLong);
					float f=3234.141243278345f;
					double d=3456.14124512345678902345678914f;
					System.out.println("float value is "+f+"double value is "+d);
					
			//boolean
				boolean flag=false;
				System.out.println("boolean value is "+flag);
			
				//Program to demonstrate type casting between primitive types
				
				byte b = 10;
				int i = b;
				System.out.println(i);
				
				float f1 = 22.14f;
				double d1 = f1;
				System.out.println(d);
				
				char ch2 = 'A';
				int i3 = ch2;
				System.out.println(i3);
				
				char var3 = '\u00A7';
				int i4 = var3;
				System.out.println(i4);
				
				// narrowing/explicit type casting
				
				double f2 = 10.52f;
				long l = (long) f2;
				System.out.println(l);
				
				long l1 = 923372036854775806l;
				int i2 = (int) l1;
				System.out.println(i2);
				
				float f3 = 34.56f;
				int i1 = (int) f3;
				System.out.println(i1);
				
				byte b1 = 90;
				char ch4 = (char) b1;
				System.out.println(ch4);
				
				//Program to demonstrate differentoperators
				
				int a1 = 10;
				int b2 = 20;
				int x = 10;
				System.out.println("a1 and b1 value before the operations: " + a1 + " " + b2);
				++a1;
				
				int c = ++a1 + b2 + a1--;
				System.out.println("c value after the operations: " + c);
				
				int d2 = c++ + a1 + b2--;
				System.out.println("d value after the operations: " +d2);
				System.out.println("a , b,c,d values afterthe operations: " + a1 + " " + b2 + " " + c + " " + d2);
				
				
				//Ternary operator demonstration
				
				x = (10 == x) ? 1 : 0;
				System.out.println(x);
				
				
				
				//Program to demonstrate break statement
				
				for (int j = 5; j < 10; j++) {
					if (j == 5)
					break;
					System.out.println(j);
				}
				
				//Program to demonstrate continue statemen
				for (int k = 5; k < 15; k++)
				{
				if (k%2 != 0)
				continue;
				System.out.print(k + " ");
				}
				
				//Program to guess a number in a given range
				int x1 = 5;
				if (x1 != 5)
				System.out.println("Value of x is not 5");
				
				
				//Program to demonstrate if..else statemen
				
				int age=11;
				if(age>=18)
				System.out.println(" You are eligible for Voting");
				else
				System.out.println("Sorry! You need to wait more");
				System.out.println("if else demonstration");
				
				
				int a3=10, b3=20, c3=5;
				System.out.println("The largest number is");
				if (a3 > b3) {
				if (a3 > c3)
				System.out.println(a3);
				else
				System.out.println(c3);
				}
				else {
				if (c3 > b3)
				System.out.println(c3);
				else
				System.out.println(b3);
				}
			
				
				//Program to demonstrate Switch case
				char M = 'l';
				switch (M)
				{
				case 'l' :
				case 'L' :
					
				System.out.println(M+" is a Letter");
				break;
				
				case 'd':
				case 'D' :
				System.out.println(M+" is a Digit");
				break;
				
				case 'w':
				case 'W' :
				System.out.println(M+" is White Space");
				break;
				
				case 's':
				case 'S':
				System.out.println(M+" is Special Symbol");
						
				default:
					System.out.println(M+" is other than letter, digit, space or special symbol ");
					break;
				}
					


				
		}
		
	}

