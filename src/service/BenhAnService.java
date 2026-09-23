package src.service;

import java.util.ArrayList;
import java.util.List;

import src.model.BenhAn;

public class BenhAnService {
    private final List<BenhAn> danhSachBenhAn = new ArrayList<>();

    public void add(BenhAn benhAn) {
        danhSachBenhAn.add(benhAn);
    }

    public List<BenhAn> getAll() {
        return new ArrayList<>(danhSachBenhAn);
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
} 
