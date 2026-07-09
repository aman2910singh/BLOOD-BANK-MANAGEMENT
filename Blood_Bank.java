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
        int choice=5;

        Scanner sc=new Scanner(System.in);
        Donor[] donors=new Donor[20];
        
        do{
            System.out.println("\n====BLOOD BANK MANAGEMENT SYSTEM====");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            switch (choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    break;
            }

        }while(choice!=5);
        
        
    }
}