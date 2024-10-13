
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhongHop extends Phong {

    private int soGhe;

    public PhongHop(int soGhe, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, donGia);
        this.soGhe = soGhe;
    }

    public PhongHop() {
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

   
    public int tinhSoNgayThue() {
        if (getNgayThue().equals(getNgayTra())) {
            return 1;
        }
        long diff = getNgayThue().getTime() - getNgayTra().getTime();
        return (int) (diff / (1000 * 60 * 60 * 24)) + 1;
    }

    @Override
    public double tinhTienThue() {
        return phanloai() * tinhSoNgayThue();
    }

    @Override
    public void input() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter room ID: ");
        String id = keyboard.nextLine();
        setMaPhong(id);
        System.out.println("Enter room rank: ");
        String rank = keyboard.nextLine();
        setHangPhong(rank);
        System.out.println("Enter rent day: ");
        String rentDate = keyboard.nextLine();

        SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date rentD = fomatter.parse(rentDate);
            setNgayThue(rentD);
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le!!");
        }
        System.out.println("Enter check out day: ");
        String ckDate = keyboard.nextLine();

        SimpleDateFormat fomatterr = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date ckD = fomatterr.parse(ckDate);
            setNgayThue(ckD);
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le!!");
        }
        System.out.println("Enter chair number: ");
        int ghe = keyboard.nextInt();
        setSoGhe(ghe);
    }
    @Override
    public void displayInfo() {
        SimpleDateFormat fomatter = new SimpleDateFormat("dd/MM/yyyy");
        String rentDate = fomatter.format(getNgayThue());
        SimpleDateFormat fomatterr = new SimpleDateFormat("dd/MM/yyyy");
        String checkDate = fomatterr.format(getNgayTra());
        System.out.println("ID: " + getMaPhong());
        System.out.println("Rank: " + getHangPhong());
        System.out.println("Rent day: " + rentDate);
        System.out.println("Check out day: " + checkDate);
        System.out.println("Chair number: " + getSoGhe());

    }
}
