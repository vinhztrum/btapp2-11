package vn.edu.ute.datphong_2415053122248.model

import java.io.Serializable

data class DonDatPhong (
    val hoTen: String,
    val sdt: String,
    val email: String,
    val maLoaiPhong: String,
    val ngayNhan: String,
    val soDem: Int,
    val soKhach: Int,
    val ghiChu: String =""

) : Serializable {
    fun tomTat():String{
        return "$hoTen - $sdt - $email - $maLoaiPhong - $ngayNhan - $soDem - $soKhach - $ghiChu"
    }
}