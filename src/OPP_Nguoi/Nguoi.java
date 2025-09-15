package OPP_Nguoi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {

    private String hoVaTen;
    private Date ngaySinh;   // Đúng kiểu Date
    private String gioiTinh;
    private int cmnd;

    // Constructor không tham số
    public Nguoi() {
    }

    // Constructor có tham số (ngày sinh nhập dưới dạng String)
    public Nguoi(String hovaten, String ngaysinh, String gioitinh, int cmnd) {
        this.hoVaTen = hovaten;
        this.gioiTinh = gioitinh;
        this.cmnd = cmnd;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.ngaySinh = sdf.parse(ngaysinh);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày sinh!");
        }
    }

    // Getter - Setter
    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hovaten) {
        this.hoVaTen = hovaten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioitinh) {
        this.gioiTinh = gioitinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhap() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap thong tin");

            System.out.print("Ho va ten: ");
            setHoVaTen(scanner.nextLine());

            System.out.print("Ngay sinh(dd/MM/yyyy): ");
            String ngaySinhString = scanner.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            setNgaySinh(sdf.parse(ngaySinhString));  // Gán Date

            System.out.print("Gioi tinh: ");
            setGioiTinh(scanner.nextLine());

            System.out.print("CMND: ");
            setCmnd(Integer.parseInt(scanner.nextLine()));

        } catch (Exception e) {
            System.out.println("Loi nhap du lieu: " + e.getMessage());
        }
    }

    public void xuat() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("hoVaTen=" + getHoVaTen()
                + ", ngaySinh=" + sdf.format(getNgaySinh()) // format Date
                + ", gioiTinh=" + getGioiTinh()
                + ", cmnd=" + getCmnd());
    }

    int getCmnn() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
