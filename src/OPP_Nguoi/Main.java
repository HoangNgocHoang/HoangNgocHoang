package OPP_Nguoi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Khởi tạo đối tượng quản lý danh sách
        danhSachNguoi danhSachNguoi = new danhSachNguoi();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            // Hiển thị menu chức năng
            System.out.println("\n========= MENU =========");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Nhap thong tin (Sinh Vien / Giao Vien)");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Tim nguoi theo CMND");
            System.out.println("4. xoa nguoi theo CMND");
            System.out.print("Chon chuc nang: ");

            // đọc lựa chọn
            luaChon = Integer.parseInt(scanner.nextLine());

            switch (luaChon) {
                case 1 -> {
                    System.out.println("\nThem moi mot nguoi vao danh sach");
                    System.out.println("Nhap ai? 1-Sinh vien, 2-Giao vien");
                    int luaChonDoiTuong = Integer.parseInt(scanner.nextLine());

                    switch (luaChonDoiTuong) {
                        case 1 -> {
                            SinhVien sinhVien = new SinhVien();
                            danhSachNguoi.themDanhSach(sinhVien);
                        }
                        case 2 -> {
                            GiaoVien giaoVien = new GiaoVien();
                            danhSachNguoi.themDanhSach(giaoVien);
                        }
                        case 3 -> {
                            System.out.println("Nhap CMNN can tim :");
                            int timCMNN = Integer.parseInt(scanner.nextLine());
                            Nguoi nguoi = danhSachNguoi.timCMNN(timCMNN);
                            if (nguoi != null) {
                                System.out.println("tim thay :");
                            } else {
                                System.out.println("Khong tim thay ");

                            }
                        }
                        case 4 -> {
                            System.out.print("Nhap CMND can xoa: ");
                            int cmndDelete = Integer.parseInt(scanner.nextLine());
                            boolean removed = danhSachNguoi.xoaCmnn(cmndDelete);
                            if (removed) {
                                System.out.println("Da xoa thanh cong!");
                            } else {
                                System.out.println("Khong tim thay de xoa!");
                            }
                        }
                        default ->
                            System.out.println("Nhap sai lua chon!");
                    }
                }

                case 2 ->
                    danhSachNguoi.xuatDanhSach();

                case 0 ->
                    System.out.println("Thoat chuong trinh...");

                default ->
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChon != 0);
    }
}
