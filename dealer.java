import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;
class getdata
{
	String name;
	int age;
	String e_mailid;
	
}

public class dealer {
	static int num;
		
	public static void main(String []args)
	{ 
		Customer x=new Customer();
		String filepath="C:\\Users\\MANSA\\javafile\\venuemenu.txt";
		Scanner get =new Scanner(System.in);
		System.out.println("<<<<<<<<<<<<<<<<<Welcome to our Venue Booking System>>>>>>>>>>>>>>>");
		x.bookingdetails();
		try{
			  FileWriter fstream = new FileWriter("C:\\Users\\MANSA\\javafile\\customerdetails.txt",true);
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write("name"+x.name+"age"+x.age+"e_mail"+x.e_mailid + new java.util.Date()+"\n");
			  out.close();
		  }catch (Exception e){
			 System.err.println("Error while writing in file: " +
		          e.getMessage());
		  }
		System.out.println("If you wish to see our booklet please enter 1");
		num=get.nextInt();
	
		if(num==1)
		{
			try {
			File out=new File(filepath);
			Scanner myReader = new Scanner(out);
			     while (myReader.hasNextLine()) 
			     {
			     String data = myReader.nextLine();
			     System.out.println(data);
			     }
			     myReader.close();
			    }catch(FileNotFoundException e){
				 System.out.println("An error has occurred.");
			      e.printStackTrace();
			    }
		 System.out.println("Enter the option you want to book from the above menu");
		 num=get.nextInt();
					
		}	
		else
		{
			System.out.println("Thanks for vistion or site we will add more locations in our recent updates");
		}
	}
			

}