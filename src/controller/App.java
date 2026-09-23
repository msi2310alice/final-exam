package src.controller;

import java.util.List;
import java.util.Scanner;

import src.model.BenhAn;
import src.model.BenhAnThuong;
import src.model.BenhAnVip;
import src.service.BenhAnService;

public class App {
    private final Scanner scanner = new Scanner(System.in);
    private final BenhAnService benhAnService = new BenhAnService();
    public static void main(String[] args) {

        App app = new App();
        app.run();    

    }

    private void run() {
        int choice;

        do {
            System.out.println("MENU");
            System.out.println("1. Them moi");
            System.out.println("2. Xoa");
            System.out.println("3. Xem danh sach cac benh an");
            System.out.println("4. Thoat");
            System.out.println("Chon chuc nang: ");

            
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    themMoi();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    xemDanhSach();
                    break;
            
                default:
                    System.out.println("Lua chon cua ban khong hop le.");
                    
            }

        } while (choice != 4);

        scanner.close();
    }

    private void themMoi() {
        System.out.println("\n--- THEM MOI BENH AN ---");

        System.out.println("1. Benh an thuong");
        System.out.println("2. Benh an VIP");
        System.out.print("Chon loai benh an: ");

        int loai = Integer.parseInt(scanner.nextLine());

        int soThuTu = benhAnService.getNextSoThuTu();

        System.out.print("Ma benh an: ");
        String maBenhAn = scanner.nextLine();

        System.out.print("Ma benh nhan: ");
        String maBenhNhan = scanner.nextLine();

        System.out.print("Ten benh nhan: ");
        String tenBenhNhan = scanner.nextLine();

        System.out.print("Ngay nhap vien: ");
        String ngayNhapVien = scanner.nextLine();

        System.out.print("Ngay ra vien: ");
        String ngayRaVien = scanner.nextLine();

        System.out.print("Ly do nhap vien: ");
        String lyDoNhapVien = scanner.nextLine();

        if (loai == 1) {

            System.out.print("Phi nam vien: ");
            double phiNamVien = Double.parseDouble(scanner.nextLine());

            BenhAnThuong benhAn = new BenhAnThuong(
                    soThuTu,
                    maBenhAn,
                    maBenhNhan,
                    tenBenhNhan,
                    ngayNhapVien,
                    ngayRaVien,
                    lyDoNhapVien,
                    phiNamVien
            );

            benhAnService.add(benhAn);

        } else if (loai == 2) {

            System.out.print("Loai VIP: ");
            String loaiVIP = scanner.nextLine();

            System.out.print("Thoi han VIP: ");
            String thoiHanVIP = scanner.nextLine();

            BenhAnVip benhAn = new BenhAnVip(
                    soThuTu,
                    maBenhAn,
                    maBenhNhan,
                    tenBenhNhan,
                    ngayNhapVien,
                    ngayRaVien,
                    lyDoNhapVien,
                    loaiVIP,
                    thoiHanVIP
            );

            benhAnService.add(benhAn);

        } else {

            System.out.println("Loai benh an khong hop le.");
            return;
        }

        System.out.println("Them moi thanh cong.");

    }
    
    private void xoa() {

    }

    private void xemDanhSach() {
        List<BenhAn> danhSach = benhAnService.getAll();

        if (danhSach.isEmpty()) {

            System.out.println("Danh sach benh an rong.");
            return;
        }

        System.out.println("DANH SACH BENH AN");

        for (BenhAn benhAn : danhSach) {
            System.out.println(benhAn);
        }
    }
}
