package OPP_Nguoi;

import java.util.Scanner;

public class SinhVien extends Nguoi {

    private String maSinhVien;

    public SinhVien() {
    }

    public SinhVien(String hovaten, String ngaysinh, String gioitinh, int cmnd, String masinhvien) {
        super(hovaten, ngaysinh, gioitinh, cmnd);
        this.maSinhVien = masinhvien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String masinhvien) {
        this.maSinhVien = masinhvien;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        setMaSinhVien(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", maSinhVien=" + getMaSinhVien());
    }

    public void danhGiaRenLuyen() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Danh gia ren luyen:");
        System.out.println("Chon 1-gioi, 2-kha, 3-trung binh, 4-yeu");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1 ->
                System.out.println("Xep loai gioi");
            case 2 ->
                System.out.println("Xep loai kha");
            case 3 ->
                System.out.println("Xep loai trung binh");
            case 4 ->
                System.out.println("Xep loai yeu");
            default ->
                System.out.println("Khong hop le");
        }
    }
}
