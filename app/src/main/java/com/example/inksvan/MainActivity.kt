package com.example.inksvan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.inksvan.UI.ModelImage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        val weatherList = ArrayList<ModelImage>()


        for (element in 1..2 )
        weatherList.add(
            ModelImage(
                R.drawable.ic_clouds,
                R.drawable.ic_clouds,
                R.drawable.ic_clouds
                )
        )
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = MyAdapter(weatherList.toList())

    }
}