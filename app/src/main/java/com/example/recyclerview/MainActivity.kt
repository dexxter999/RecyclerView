package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val contactList = arrayListOf(
            Contact("Gela", "+995 555-342-567"),
            Contact("Jimsheri", "+995 555-999-999"),
            Contact("Ongeri", "+995 568-445-445"),
            Contact("Kaxi", "+995 592-672-776"),
            Contact("Jubiko", "+995 544-322-398"),
            Contact("Jemali", "+995 599-712-456"),
            Contact("Mishiko", "+995 574 245-568"),
            Contact("Toma", "+995 568-805-606"),
            Contact("Jumberi", "+995 555-555-555"),
            Contact("Iveri", "+995 544-356-252"),
            Contact("Vazha", "+995 564-334-455"),
            Contact("Xlodvigi", "+995 514-098-000"),
            Contact("Arman", "+995 577-444-070"),
            Contact("Kotiko", "+995 544-666-666"),
            Contact("Nodari", "+995 555-890-781"),
            Contact("Noshre", "+995 579-345-288"),
            Contact("Omari", "+995 551-005-713"),
            Contact("Jotia", "+995 593-032-374")
        )
        val adapter = ContactsAdapter(contactList) { contact ->
            val intent = Intent(this, ContactDetailActivity::class.java)
            intent.putExtra("contact", contact)
            startActivity(intent)
        }
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = adapter
    }
}