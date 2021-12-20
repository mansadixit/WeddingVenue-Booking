import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class login{
    static int f1=0;
    public static void main(String args[]) throws IOException {
        Scanner obj=new Scanner(System.in);
        String User=new String("User");
        int ch;
        do{
            System.out.println("For:\n1.First time User\n2.Login\n3.Exit");
            ch=obj.nextInt();
            switch(ch){
                case 1: 
                {
                System.out.println("User name is 'User'" );
				FileOutputStream fout=new FileOutputStream("C:\\Users\\MANSA\\javafile\\user.txt");
				BufferedOutputStream bout=new BufferedOutputStream(fout);
				Scanner obj2=new Scanner(System.in);
				System.out.println("Enter the password: ");
				String s=obj2.nextLine();
				byte b[]=s.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				fout.close();
				System.out.println("Password successfully entered.");
				break;
			}
            case 2: 
            { 
				System.out.println("\nYou are a user.\n");
                Scanner obj5=new Scanner(System.in);
							System.out.println("Password: ");
							String obj1=new String(obj5.nextLine());
							BufferedReader m =new BufferedReader(new FileReader("C:\\Users\\MANSA\\javafile\\user.txt"));
							String Line= new String();
							try {
								while((Line=m.readLine())!=null)
								{
									if(obj1.equals(Line))
									{	
										f1=0;
										break;
									}
									else
										f1=1;	
									
								}
								
							} catch (IOException e) {
								e.printStackTrace();
							}
							if(f1==0)
								System.out.println("Password is correct.");
							else
								System.out.println("Password incorrect.");
							break;
			}
            case 3:
            System.exit(0);
            break;
            default:
            System.out.println("\nWrong choice");
            }
        }while(ch<=3);
    }
}
