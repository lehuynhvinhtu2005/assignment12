
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        PhongList phongList = new PhongList();
        
        while(true){
            System.out.println("==OPTION=="
                    + "\n1. Add new room"
                    + "\n2. Delete room"
                    + "\n3. Update room"
                    + "\n4. Statistic room rank's quantity"
                    + "\n5. Total"
                    + "\n6. Exit"
                    + "\n==Your options: ");
            int choice = Integer.parseInt(keyboard.nextLine());
            switch(choice){
                case 1:
                    phongList.addRoom();
                    break;
                case 2:
                    System.out.println("Enter room Id you want to delete: ");
                    String id = keyboard.nextLine();
                    phongList.delete(id);
                    break;
                case 3:
                    System.out.println("Enter room Id you want to update: ");
                    String idc = keyboard.nextLine();
                    phongList.update(idc);
                    break;
                case 4:
                    phongList.thongke();
                    break;
                case 5:
                    System.out.println("Total rent: " + phongList.totalrent());
                    break;
                case 6:
                    System.out.println("Exiting...");
                    System.exit(6);
                    break;
            }
        }
    }
}
