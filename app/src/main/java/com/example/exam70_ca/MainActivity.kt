package com.example.exam70_ca

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exam70_ca.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Đặt code xử lý sự kiện nút bấm ở đây

        binding.btnthem2108.setOnClickListener {
            val manv = EXAM70CALogic.chuanHoaMaNhanVien(binding.edtmanhanvien2108.text.toString())
            val sogio = EXAM70CALogic.docSoGio(binding.sogio2108.text.toString(), min = 1, max = 16)
            val tiencong = EXAM70CALogic.docTienCongGio(binding.edttiencong2108.text.toString(), min = 15000, max = 300000)

            if (manv == null || sogio == null || tiencong == null) {
                binding.ketqua2108.text = ""
                Toast.makeText(this, "Vui lòng nhập đúng và đủ dữ liệu!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val tongtien = EXAM70CALogic.tinhTienCa(sogio, tiencong)
            binding.ketqua2108.text = "Đã ghi ca: $manv\nTổng tiền công: $tongtien"
        }

        binding.btnxoa2108.setOnClickListener {
            binding.edtmanhanvien2108.text.clear()
            binding.edtsogio2108.text.clear()
            binding.edttiencong2108.text.clear()
            binding.ketqua2108.text = ""
            binding.edtmanhanvien2108.requestFocus()
            Toast.makeText(this, "Đã làm sạch form!", Toast.LENGTH_SHORT).show()
        }
    }
}

