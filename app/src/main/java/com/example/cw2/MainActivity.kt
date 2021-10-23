package com.example.cw2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.cw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //pozniej inicjalowane

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

    fun click(view: View) {
//        val str = binding.et1.text
//        binding.tv.text = str
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
        val intent = Intent(this, DrugieActivity::class.java)
        intent.putExtra("userInput1", binding.et1.text.toString())
        startActivity(intent)
    }
}