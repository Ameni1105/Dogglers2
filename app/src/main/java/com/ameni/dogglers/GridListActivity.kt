package com.ameni.dogglers

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ameni.dogglers.adapter.DogCardAdapter
import com.ameni.dogglers.const.Layout
import com.ameni.dogglers.databinding.ActivityGridListBinding

class GridListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGridListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gridRecyclerView.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )

        // Specify fixed size to improve performance
        binding.gridRecyclerView.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
