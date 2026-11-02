package vn.edu.ute.datphong.helper

object KiemTraHelper {
    fun kiemTraHoTen(hoTen: String): Boolean {
        val regex = Regex("^[\\p{L}]+( [\\p{L}]+)+$")
        return regex.matches(hoTen)
    }

    fun kiemTraSdt(sdt: String): Boolean {
        val regex = Regex("^0[59][0-9]{8}$")
        return regex.matches(sdt)
    }

    fun kiemTraEmail(email: String): Boolean {
        val regex = Regex("^[a-zA-Z][a-zA-Z0-9._]{2,29}@gmail\\.com$")
        return regex.matches(email)
    }

    fun kiemTraNgay(ngay: String): Boolean {
        val regex = Regex("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(202[6-9])$")
        return regex.matches(ngay)
    }
}