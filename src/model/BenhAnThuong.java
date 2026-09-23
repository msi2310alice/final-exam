package src;
public class BenhAnThuong extends BenhAn{
    private double phiNamVien;

    public BenhAnThuong(int soThuTu, String maBenhAn,
                    String maBenhNhan, String tenBenhNhan,
                    String ngayNhapVien, String ngayRaVien,
                    String lyDoNhapVien, double phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);

        this.phiNamVien = phiNamVien;
    }
    @Override 
    public String toString() {
        return soThuTu + "," + maBenhAn + "," 
                + maBenhNhan + ","  + tenBenhNhan + "," 
                + ngayNhapVien + ","  + ngayRaVien + "," 
                + lyDoNhapVien + ","  + phiNamVien;
    }
}
