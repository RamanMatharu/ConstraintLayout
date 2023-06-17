package com.ramanmatharu.constraintlayoutpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramanmatharu.constraintlayoutpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //binding file name xml file + Binding = ActivityMainBinding
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}