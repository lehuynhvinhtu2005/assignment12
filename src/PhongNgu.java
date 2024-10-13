
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PhongNgu extends Phong {

    private int SoGiuong;

    public PhongNgu(int SoGiuong, String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        super(maPhong, hangPhong, ngayThue, ngayTra, donGia);
        this.SoGiuong = SoGiuong;
    }

    public PhongNgu() {
    }

    public int getSoGiuong() {
        return SoGiuong;
    }

    public void setSoGiuong(int SoGiuong) {
        this.SoGiuong = SoGiuong;
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
            setNgayTra(ckD);
        } catch (ParseException e) {
            System.out.println("Dinh dang khong hop le!!");
        }
        System.out.println("Enter bed number: ");
        int bed = keyboard.nextInt();
        setSoGiuong(bed);
    }


    public int tinhSoNgayThue() {
        if (getNgayThue().equals(getNgayTra())) {
            return 1;
        }
        long diff = getNgayThue().getTime() - getNgayTra().getTime();
        return (int) (diff / (1000 * 60 * 60 * 24) + 1);
    }

    @Override
    public double tinhTienThue() {
        return phanloai() * tinhSoNgayThue();
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
        System.out.println("Bed number: " + getSoGiuong());
       
    }
}
