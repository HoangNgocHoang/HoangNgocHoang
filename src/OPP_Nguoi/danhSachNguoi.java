/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OPP_Nguoi;

import java.util.ArrayList;

public class danhSachNguoi {

    ArrayList<Nguoi> danhSachNguoi = new ArrayList<>();

    public void themDanhSach(Nguoi nguoi) {
        nguoi.nhap();
        danhSachNguoi.add(nguoi);
        System.out.println("Them thanh cong");
    }

    public void xuatDanhSach() {
        if (danhSachNguoi.isEmpty()) {
            System.out.println("Danh sach rong");
        } else {
            for (int i = 0; i < danhSachNguoi.size(); i++) {
                danhSachNguoi.get(i).xuat();
                System.out.println("------------------");
            }
        }
    }

    public Nguoi timCMNN(int cmnn) {
        for (Nguoi nguoi : danhSachNguoi) {
            if (nguoi.getCmnn() == cmnn) {
                return nguoi;
            }
        }
        return null;
    }
    public boolean xoaCmnn(int cmnn){
        Nguoi nguoi = timCMNN(cmnn);
        if (nguoi != null){
            danhSachNguoi.remove(nguoi);
            
        }
        return false;
    }
}
