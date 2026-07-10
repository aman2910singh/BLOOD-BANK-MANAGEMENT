import java.util.Scanner;

class Donor {
    int donorId;
    String name;
    String bloodGroup;
    int units;
     
    static int idCounter;

    public Donor(String name ,String bloodGroup,int units){
        this.name=name;
        this.bloodGroup=bloodGroup;
        this.units=units;
    }
}

public class Blood_Bank {

    
    public static void main(String[] args) {
        int choice;

        Scanner sc=new Scanner(System.in);
        Donor[] donors=new Donor[20];
        int donorCount=0;
        
        do{
            System.out.println("\n====BLOOD BANK MANAGEMENT SYSTEM====");
            System.out.println("1. Add Donor");
            System.out.println("2. View All Blood Stock");
            System.out.println("3. Search Blood Group");
            System.out.println("4. Issue Blood");
            System.out.println("5. Exist");
            System.out.print("Enter Your Choice:- ");
            choice= sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.println("\n===ADD DONOR===");
                    System.out.print("Enter Donor Name:-");
                    String name= sc.nextLine();
                    System.out.print("Enter Your Blood Group:-");
                    String bloodGroup=sc.nextLine();
                    System.out.print("Enter Units:-");
                    int units=sc.nextInt();
                    donors[donorCount++]= new Donor(name,bloodGroup,units);
                    System.out.println("Donor Added Successfully");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("\n ===BLOOD IN STOCK===");
                    for(int i=0;i<donorCount;i++){
                        Donor d=donors[i];
                        System.out.println("Donor Name:-" + d.name + "  Blood Group:-" + d.bloodGroup + "  Units:-" + d.units);
                    }
                    
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("\n===SEARCH BLOOD GROUP===");
                    System.out.print("Enter the Blood Group:-");
                    String searchBg=sc.nextLine();
                    boolean found=false;
                    for(int i=0;i<donorCount;i++){
                        Donor d=donors[i];
                        if(d.bloodGroup.equalsIgnoreCase(searchBg)){
                            System.out.println("Blood Group is Available");
                            System.out.println("Donor Name:-" + d.name + "  Blood Group:-" + d.bloodGroup + "  Units:-" + d.units);
                            found=true;
                        }

                    }
                    if(!found){
                        System.out.println("Blood is not availbale");
                    }
                    
                    break;
                case 4:
                    sc.nextLine();
                    System.out.println("\n===ISSUE BLOOD===");
                    System.out.print("Enter Blood Group:-");
                    String reqBg=sc.nextLine();
                    boolean found4=false;

                    for(int i=0;i<donorCount;i++){
                        Donor d=donors[i];
                        if(d.bloodGroup.equalsIgnoreCase(reqBg)){
                            System.out.println("Blood Group is Available");
                            System.out.println("Donor Name:-" + d.name + "  Blood Group:-" + d.bloodGroup + "  Units:-" + d.units);
                            System.out.print("Enter units:-");
                            int reqUnits=sc.nextInt();
                            if(reqUnits>d.units){
                                System.out.println("Units are Not Available");
                            }
                            else{
                                d.units-=reqUnits;
                                System.out.println("Blood is Issue Successfully");
                                found4=true;
                            }
                            break;
                        }

                    }
                    if(!found4){
                        System.out.println("Blood is not availbale");
                    }

                    
                    break;
                case 5:
                    sc.nextLine();
                    System.out.println("Thankyou ! Stay Safe");
                    
                    break;
                default:
                    System.out.println("Wrong Choice");
                    break;
            }

        }while(choice!=5);
        
        
    }
}