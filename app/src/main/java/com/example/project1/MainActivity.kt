package com.example.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import android.widget.Button
import android.widget.ImageView
import com.example.project1.ui.main.MainViewModel
import androidx.core.net.toUri
import coil.load
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation

class MainActivity : AppCompatActivity() {
    val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        // Load Dog images into ImageView using Coil
        viewModel.currentlyDisplayedDogPhoto.observe(this) {
            findViewById<ImageView>(R.id.imageView).load(
                it?.message?.toUri()?.buildUpon()?.scheme("https")?.build()
            )

            // Additional Coil Features
            {
                crossfade(true)
                crossfade(400)
                placeholder(R.drawable.ic_pets)
                error(R.drawable.ic_broken_image)
                transformations(RoundedCornersTransformation(60f))
            }
        }

        //Set a click listener on the Woof button to start network call
        findViewById<Button>(R.id.button).setOnClickListener { viewModel.getRandomDogPhoto() }
    }
}


