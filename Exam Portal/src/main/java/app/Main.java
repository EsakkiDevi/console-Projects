package app;

import java.util.Scanner;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int qno=0;
		String q="what?";
		String op1="A",op2="B",op3="c",op4="r";
		
		int[] qn=new int[10];
		String qu[]=new String[10];
		String o1[]=new String[10];
		String o2[]=new String[10];
		String o3[]=new String[10];
		String o4[]=new String[10];
		
		int i=0,j=0,k=0,l=0,m=0,n=0;
		
		System.out.println("Online Exam Portal");
		System.out.println("1.Admin");
		System.out.println("2.Student");
		System.out.println("3.Exit");
		System.out.println("Choose the option");
		int option=s.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Enter Admin Login ID:");
			String adminlogin=s.nextLine();
			s.nextLine();
			System.out.println("Enter Admin Password:");
			String adminpassword=s.nextLine();
			System.out.println("\n\n");
			while(true)
			{
			System.out.println("1.Add Question");
			System.out.println("2.Delete Question");
			System.out.println("3.View All Questions");
			System.out.println("4.Exit");
			System.out.println("Enter the Option:");
			int op=s.nextInt();
			
			switch(op)
			{
			case 1:
				System.out.println("Enter the Question no:");
				 qno=s.nextInt();
				 qn[i++]=qno;
				 s.nextLine();
				 
				System.out.println("Enter the Question:");
				 q=s.nextLine();
				 qu[j++]=q;
				 s.nextLine();
				 
				System.out.println("Enter the Options:");
				System.out.print("(A)");
				 op1=s.nextLine();
				 o1[k++]=op1;
				 s.nextLine();
				 
				System.out.println("");
				System.out.print("(B)");
				 op2=s.nextLine();
				 o2[l++]=op2;
				 s.nextLine();
				 
				System.out.println("");
				System.out.print("(C)");
				 op3=s.nextLine();
				 o3[m++]=op3;
				 s.nextLine();
				 
				System.out.println("");
				System.out.print("(D)");
				 op4=s.nextLine();
				 o4[n++]=op4;
				 s.nextLine();
				 
				System.out.println("");
				System.out.println("Question Added");
				break;
			case 2:
				System.out.println("Enter the Question Number to delete:");
				qno=s.nextInt();
				
				qn[qno-1]=0;
				qu[qno-1]=null;
				o1[qno-1]=null;
				o2[qno-1]=null;
				o3[qno-1]=null;
				o4[qno-1]=null;
				
				
				System.out.println("Question number "+qno+" is deleted");
				break;
			case 3:
				for(int index=0;index<i+1;index++)
				{
				System.out.println(qn[index]+" )" +qu[index]+ "\n(A) " +o1[index]+" (B) "+o2[index]+" (C) "+o3[index]+" (D) "+o4[index]);
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Option....TryAgain");
				
				
				
				
			}
			}
		
		case 2:
			System.out.println("Online Exam Portal");
			System.out.println("1.Register");
			System.out.println("2.Login");
			System.out.println("3.Exit");
			System.out.println("Enter Your choice:");
			       int choice=s.nextInt();
			       switch(choice)
			       {
			       case 1:
			    	   System.out.println("Enter the Name");
			    	   String name=s.nextLine();
			    	   System.out.println("Enter your UserID");
			    	   String userId=s.nextLine();
			    	   System.out.println("Enter the Password");
			    	   String spassword=s.nextLine();
			    	   System.out.println("Successfully Registered");
			    	   break;
			       case 2:
			    	   System.out.println("Enter your UserId:");
			    	   userId=s.nextLine();
			    	   System.out.println("Enter your Password");
			    	   spassword=s.nextLine();
			    	   System.out.println("Successfully Logined");
			    	   break;
			       case 3:
			         System.exit(0);
			         
			       default:
			    	   System.out.println("Invaild Option Try Again...!");
			    	   break;
			       
			    	   
			       }
			       
		case 3:
			System.exit(0);
		default:
			System.out.println("Invalid Option....Try Again!");
		}
	}
}