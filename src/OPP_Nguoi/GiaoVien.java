package OPP_Nguoi;

import java.util.Scanner;

public class GiaoVien extends Nguoi {
    private String maGiaoVien;

    public GiaoVien() {
    }

    public GiaoVien(String hovaten, String ngaysinh, String gioitinh, int cmnd, String magiaovien) {
        super(hovaten, ngaysinh, gioitinh, cmnd);
        this.maGiaoVien = magiaovien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String magiaovien) {
        this.maGiaoVien = magiaovien;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma giao vien: ");
        setMaGiaoVien(sc.nextLine());  
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(", maGiaoVien=" + getMaGiaoVien());
    }
    public void xepLoaiThiDua() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chon xep loai thi dua:");
        System.out.println("1-loai A, 2-loai B, 3-loai C");
        int chon = Integer.parseInt(sc.nextLine());
        switch (chon) {
            case 1 -> System.out.println("Thi dua loai A");
            case 2 -> System.out.println("Thi dua loai B");
            case 3 -> System.out.println("Thi dua loai C");
            default -> System.out.println("Khong hop le");
        }
    }
}
