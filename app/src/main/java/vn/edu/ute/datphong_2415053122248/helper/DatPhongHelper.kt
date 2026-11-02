package vn.edu.ute.datphong_2415053122248.helper
import vn.edu.ute.datphong_2415053122248.data.DuLieuMau
import vn.edu.ute.datphong_2415053122248.model.LoaiPhong
object DatPhongHelper {
    fun timLoaiPhong(ma: String): LoaiPhong? {
        val maKiemTra = ma.trim()
        return DuLieuMau.dsLoaiPhong.find { it.ma == maKiemTra }
    }

    fun hopLeSoKhach(loai: LoaiPhong,soDem: Int, soKhach: Int): Boolean {
    return soKhach in 1..(loai.sucChua + 2)
    }
    fun tinhTienPhong(loai: LoaiPhong, soKhach: Int, soDem: Int): Long {
        if(soDem < 1 || !hopLeSoKhach(loai,soDem,soKhach)) return 0L
        var tienPhong = loai.giaMotDem * soDem
        if (soDem>=5)
        {
            tienPhong=(tienPhong*9)/10
        }
        val khachVuot =if (soKhach > loai.sucChua) soKhach - loai.sucChua else 0
        val phuThu = khachVuot * 150000* soDem
        return tienPhong + phuThu
    }
}

