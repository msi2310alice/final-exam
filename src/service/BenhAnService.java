package src.service;

import java.util.ArrayList;
import java.util.List;

import src.exception.DuplicateMedicalRecordException;
import src.model.BenhAn;

public class BenhAnService {
    private final List<BenhAn> danhSachBenhAn = new ArrayList<>();

    public void add(BenhAn benhAn) {
        danhSachBenhAn.add(benhAn);
    }

    public List<BenhAn> getAll() {
        return new ArrayList<>(danhSachBenhAn);
    }

    public BenhAn findByMaBenhAn(String maBenhAn) {

        for (BenhAn benhAn : danhSachBenhAn) {

            if (benhAn.getMaBenhAn().equals(maBenhAn)) {
                return benhAn;
            }
        }

        return null;
    }
    public boolean remove(BenhAn benhAn) {
        return danhSachBenhAn.remove(benhAn);
    }

    public int getNextSoThuTu() {
        if(danhSachBenhAn.isEmpty()) {
            return 1;
        }
        return danhSachBenhAn.get(danhSachBenhAn.size()-1).getSoThuTu() + 1;
    }

    public void checkDuplicate(String maBenhAn) throws DuplicateMedicalRecordException {
        if(findByMaBenhAn(maBenhAn) != null) {
            throw new DuplicateMedicalRecordException("Benh an da ton tai");
        }
    }
} 
