package com.example.cw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cw2.R
import android.widget.TextView
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cw2.databinding.ActivityDrugieBinding

class DrugieActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrugieBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrugieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //TODO LayoutManager
        binding.rv1.layoutManager = LinearLayoutManager(this)
        //TODO DividerItemDecorator (optional)
        binding.rv1.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        //TODO Adapter
        val list = arrayListOf<String>()
        list.add("Jac")
        list.add("Jad")
        list.add("Japos")
        binding.rv1.adapter = ListAdapter(list)

    }
}