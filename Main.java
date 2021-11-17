import java.util.*;
public class Main
{
    int c1=0,c2=0,c3=0,c4=0; // to store user count for each flight
    String name[][]=new String[4][10]; // to store user names
    String seatc[][]=new String[4][10]; // to get user seat input
    String seat[]={"A1","A2","A3","A4","A5","A6","A7","A8","A9","A10"}; // to display
    String sch[]={"Delhi-Bangalore Round-Trip","Mumbai-Hyderabad Round-Trip","Kolkata-Chennai Round-Trip","Goa-Pune Round-Trip"}; // to display
    long nu[][]=new long[4][10];
    Scanner sc=new Scanner(System.in);
    
    void booking()
    {
        Scanner sc=new Scanner(System.in);
        int i=0;
        String prev="";
        System.out.println("\nFlight Schedule");
        System.out.println("---------------");
        for(i=0;i<sch.length;i++)
        {
            System.out.println((i+1)+". "+sch[i]);
        }
        System.out.print("Select your Flight: ");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1)
        {
            if(c1>9)
            {
                System.out.println("Tickets Sold Out! Next Flight in 4 Hours");
            }
            else
            {
                System.out.print("\nEnter Name: ");
                name[0][c1]=sc.nextLine();
                System.out.print("Enter Number: ");
                nu[0][c1]=sc.nextLong();
                System.out.println("\nTicket Booked!");
                seatc[0][c1]=seat[c1];
                System.out.println("Your Seat Number Is "+seatc[0][c1]);
                c1++;
            }
        }
        else if(choice==2)
        {
            if(c2>9)
            {
                System.out.println("Tickets Sold Out! Next Flight in 4 Hours");
            }
            else
            {
                System.out.print("\nEnter Name: ");
                name[1][c2]=sc.nextLine();
                System.out.print("Enter Number: ");
                nu[1][c2]=sc.nextLong();
                System.out.println("\nTicket Booked!");
                seatc[1][c2]=seat[c2];
                System.out.println("Your Seat Number Is "+seatc[1][c2]);
                c2++;
            }
        }
        else if(choice==3)
        {
            if(c3>9)
            {
                System.out.println("Tickets Sold Out! Next Flight in 4 Hours");
            }
            else
            {
                System.out.print("\nEnter Name: ");
                name[2][c3]=sc.nextLine();
                System.out.print("Enter Number: ");
                nu[2][c3]=sc.nextLong();
                System.out.println("\nTicket Booked!");
                seatc[2][c3]=seat[c3];
                System.out.println("Your Seat Number Is "+seatc[2][c3]);
                c3++;
            }
        }
        else if(choice==4)
        {
            if(c4>9)
            {
                System.out.println("Tickets Sold Out! Next Flight in 4 Hours");
            }
            else
            {
                System.out.print("\nEnter Name: ");
                name[3][c4]=sc.nextLine();
                System.out.print("Enter Number: ");
                nu[3][c4]=sc.nextLong();
                System.out.println("\nTicket Booked!");
                seatc[3][c4]=seat[c4];
                System.out.println("Your Seat Number Is "+seatc[3][c4]);
                c4++;
            }
        }
        else
        {
            System.out.println("Wrong Choice");
        }
    }
    
    void display()
    {
        Scanner sc=new Scanner(System.in);
        long temp;
        int ii=0,jj=0;
        System.out.print("\nEnter Mobile Number: ");
        temp=sc.nextLong();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(temp==nu[i][j])
                {
                    disp(i,j);
                }
            }
        }
    }
    
    void disp(int ii,int jj){
        if(nu[ii][jj]!=0)
        {
            System.out.println("\nAirWings Ticket Details");
            System.out.println("----------------------------");
            System.out.println("Name: "+name[ii][jj]);
            System.out.println("Number: "+nu[ii][jj]);
            System.out.println("Trip: "+sch[ii]);
            System.out.println("Seat Number: "+seatc[ii][jj]);
        }
    }
    
    void edit(){
        String cna,changename;
        long cno,changeno;
        int ii=0,jj=0,c=0,choice;
        System.out.print("\n1. Modify Name\n2. Modify Number\nEnter Choice: ");
        choice=sc.nextInt();
        sc.nextLine();
        switch(choice)
        {
            case 1: System.out.print("\nEnter Name and Number as per Ticket: ");
                    cna=sc.nextLine();
                    cno=sc.nextLong();
                    sc.nextLine();
                    outer:
                    for(int i=0;i<4;i++)
                    {
                        for(int j=0;j<10;j++)
                        {
                            if(cna.equals(name[i][j]) && cno==nu[i][j])
                            {
                                c=1;
                                ii=i;
                                jj=j;
                                break outer;
                            }
                        }
                    }
                    if(c==1)
                    {
                        System.out.print("Enter Updated Name: ");
                        changename=sc.nextLine();
                        name[ii][jj]=changename;
                        System.out.println("Name Modified!");
                    }
                    else
                    {
                        System.out.println("No changes were made. Try again");
                    }
                    break;
                
            case 2: System.out.print("\nEnter Name and Number: ");
                    cna=sc.nextLine();
                    cno=sc.nextLong();
                    sc.nextLine();
                    outer:
                    for(int i=0;i<4;i++)
                    {
                        for(int j=0;j<10;j++)
                        {
                            if(cna.equals(name[i][j]) && cno==nu[i][j])
                            {
                                c=1;
                                ii=i;
                                jj=j;
                                break outer;
                            }
                        }
                    }
                    if(c==1)
                    {
                        System.out.print("Enter Updated Number: ");
                        changeno=sc.nextLong();
                        sc.nextLine();
                        nu[ii][jj]=changeno;
                        System.out.println("Number Modified!");
                    }
                    else
                    {
                        System.out.println("No changes were made. Try again.");
                    }
                    break;
                    
            default: System.out.println("Wrong Choice!");   
                     break;
        }
    }
    
    void cancel()
    {
        Scanner sc=new Scanner(System.in);
        String cna;
        long cno;
        System.out.print("\nEnter Number: ");
        cno=sc.nextLong();
        sc.nextLine();
        System.out.print("Enter Name as per Ticket to Cancel: ");
        cna=sc.nextLine();
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<10;j++)
            {
                if(cna.equals(name[i][j]) && cno==nu[i][j])
                {
                 for(int k=j;k<9;k++)
                    {
                        name[i][k]=name[i][k+1];
                        nu[i][k]=nu[i][k+1];
                        seatc[i][k]=seatc[i][k+1];
                    }
                    System.out.println("Ticket Cancelled!");
                    return;
                }
            }
        }
        System.out.println("Ticket Not Found!");
    }
    
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        Main obj=new Main();
        do{
        System.out.println("\nAirWings Private Airline Reservation");
        System.out.println("----------------------------");
        System.out.print("1. Booking\n2. View Ticket Details\n3. Modify Ticket Details\n4. Cancel Ticket\n5. Exit\nEnter your option: ");
        choice=sc.nextInt();
        switch(choice){
            case 1: obj.booking();
                    break;
                    
            case 2: obj.display();
                    break;
                   
            case 3: obj.edit();
                    break;
           
            case 4: obj.cancel();
                    break;
                    
            default: System.out.println("\nThank you for visiting AirWings Private Airlines");
        }
        }while(choice!=5);
    }
}
