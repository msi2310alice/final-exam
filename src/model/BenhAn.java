package src;

public abstract class BenhAn {
    protected int soThuTu;
    protected String maBenhAn;
    protected String maBenhNhan;
    protected String tenBenhNhan;
    protected String ngayNhapVien;
    protected String ngayRaVien;
    protected String lyDoNhapVien;

    public BenhAn(int soThuTu, String maBenhAn,
                    String maBenhNhan, String tenBenhNhan,
                    String ngayNhapVien, String ngayRaVien,
                    String lyDoNhapVien
    ) {
        this.soThuTu = soThuTu;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public int getSoThuTu() {
        return soThuTu;
    }
    public String getMaBenhAn() {
        return maBenhAn;
    }
    public String getMaBenhNhan() {
        return maBenhNhan;
    }
    public String getNgayNhapVien() {
        return ngayNhapVien;
    }
    public String getNgayRaVien() {
        return ngayRaVien;
    }
    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }
    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }
    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public abstract String toString();
}
