
import java.util.Date;

public abstract class Phong implements IPhong {

    private String maPhong;
    private String hangPhong;
    private Date ngayThue;
    private Date ngayTra;
    private double donGia;

    public Phong(String maPhong, String hangPhong, Date ngayThue, Date ngayTra, double donGia) {
        this.maPhong = maPhong;
        this.hangPhong = hangPhong;
        this.ngayThue = ngayThue;
        this.ngayTra = ngayTra;
        this.donGia = donGia;
    }

    public Phong() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getHangPhong() {
        return hangPhong;
    }

    public void setHangPhong(String hangPhong) {
        this.hangPhong = hangPhong;
    }

    public Date getNgayThue() {
        return ngayThue;
    }

    public void setNgayThue(Date ngayThue) {
        this.ngayThue = ngayThue;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ngayTra) {
        this.ngayTra = ngayTra;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    public double phanloai()
    {
        if(hangPhong.equals("A"))
                {
                 return 1200000;   
                }else if(hangPhong.equals("B"))
                {
                    return 1000000;
                }else if(hangPhong.equals("C"))
                {
                    return 750000;
                }
        return 0;
    }
    
    @Override
    public abstract double tinhTienThue();
    @Override
    public abstract void input();
    @Override
    public abstract void displayInfo();
}
