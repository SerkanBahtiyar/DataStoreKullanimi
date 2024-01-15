package com.example.datastorekullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datastorekullanimi.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val appPref = AppPref(this)

        CoroutineScope(Dispatchers.Main).launch {
            //appPref.sil()

            var sayac = appPref.oku()

            appPref.kayit(++sayac)

            binding.textViewSonuc.text = "Açılış Sayısı : $sayac"
        }
    }
}