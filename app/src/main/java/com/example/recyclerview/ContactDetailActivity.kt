package com.example.recyclerview

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.recyclerview.databinding.ActivityContactDetailBinding


class ContactDetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityContactDetailBinding.inflate(layoutInflater) }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val contact = intent.getParcelableExtra("contact", Contact::class.java)

        binding.tvName.text = contact?.name
        binding.tvNumber.text = contact?.number

    }
}