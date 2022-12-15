package com.example.recyclerviewlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MyAdapter
    private  var mDataModalClass = arrayListOf<DataModalClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("abc",55))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("gjog",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzhkjhaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("hgjhlh",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("hggkjh",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("kgghglk",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("abc",55))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("gjog",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzhkjhaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("hgjhlh",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("hggkjh",100))
        mDataModalClass.add(DataModalClass("Huzaif",100))
        mDataModalClass.add(DataModalClass("kgghglk",100))

        adapter= MyAdapter(this,mDataModalClass)
        binding.RcView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.RcView.adapter=adapter
    }
}