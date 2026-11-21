package com.example.exam70_ca

object EXAM70CALogic {
        fun chuanHoaMaNhanVien(text: String, min: Int = 3 , max: Int = 10): String? {
            val trimmed = text.trim()
            return if (trimmed.length !in min..max) null else trimmed
        }

        fun docSoGio(str: String, min: Int = 1, max: Int = 16): Int? {
            return try {
                val num = str.trim().toInt()
                if (num in min..max) num else null
            } catch (e: Exception) {
                null
            }
        }
        fun docTienCongGio(str: String, min: Int = 15000, max: Int = 300000): Int? {
            return try {
                val num = str.trim().toInt()
                if (num in min..max) num else null
            } catch (e: Exception) {
                null
            }
        }

        fun tinhTienCa(soGio: Int, tienCongGio: Int): Int {
            var ketQua = soGio * tienCongGio
            return ketQua
        }
        fun dinhDangCa(maNv: String, soGio: Int, tienCongGio: Int, tienCa: Int): String {
            return "$maNv| $soGio x ${tienCongGio}d = ${tienCa}d"
        }
}
