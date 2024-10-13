
import java.util.ArrayList;
import java.util.Scanner;

public class PhongList {

    private ArrayList<Phong> phongList;

    public PhongList() {
        phongList = new ArrayList<>();
    }

    public void addRoom() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("1. Add Bed room"
                + "\n2. Add Meeting Room");
        int choice = Integer.parseInt(keyboard.nextLine());
        Phong room = null;

        switch (choice) {
            case 1:
                room = new PhongNgu();
                break;
            case 2:
                room = new PhongHop();
                break;
        }
        room.input();
        phongList.add(room);
    }

    public void delete(String id) {
        for (int i = 0; i < phongList.size(); i++) {
            if (phongList.get(i).equals(id)) {
                phongList.remove(i);
            }
        }
    }

    public void update(String id) {
        for (int i = 0; i < phongList.size(); i++) {
            if (phongList.get(i).equals(id)) {
                phongList.get(i).input();
            }
        }
    }

    public void thongke() {
        int sophongA = 0, sophongB = 0, sophongC = 0;
        for (int i = 0; i < phongList.size(); i++) {
        switch(phongList.get(i).getHangPhong()){
            case "A":
                sophongA++;
                break;
            case "B":
                sophongB++;
                break;
            case "C":
                sophongC++;
                break;
        }
        }
        System.out.println("Number of A room: " + sophongA);
        System.out.println("Number of B room: " + sophongB);
        System.out.println("Number of C room: " + sophongC);
    }
    public double totalrent(){
        double total = 0;
        for(Phong phong:phongList){
            total+=phong.tinhTienThue();
    }
        return total;
    }
}
