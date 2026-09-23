package src.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Validate {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter
                    .ofPattern("dd/MM/uuuu")
                    .withResolverStyle(ResolverStyle.STRICT);


    public static boolean isValidMaBenhAn(String maBenhAn) {

        return maBenhAn.matches("^BA-\\d{3}$");
    }


    public static boolean isValidDate(String date) {

        try {

            LocalDate.parse(date, FORMATTER);
            return true;

        } catch (DateTimeParseException e) {

            return false;
        }
    }


    public static boolean isValidDateRange(
            String ngayNhapVien,
            String ngayRaVien) {

        LocalDate ngayNhap =
                LocalDate.parse(ngayNhapVien, FORMATTER);

        LocalDate ngayRa =
                LocalDate.parse(ngayRaVien, FORMATTER);

        return !ngayNhap.isAfter(ngayRa);
    }


    public static boolean isValidVip(String loaiVip) {

        return loaiVip.equals("VIP I")
                || loaiVip.equals("VIP II")
                || loaiVip.equals("VIP III");
    }
}