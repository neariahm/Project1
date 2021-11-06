package com.example.project1
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import android.widget.Button
import android.widget.ImageView
import com.example.project1.ui.main.MainViewModel
import androidx.core.net.toUri
import coil.load

class MainActivity : AppCompatActivity() {
    val viewModel : MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?)
    { super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        viewModel.currentlyDisplayedDogPhoto.observe(this,
            { findViewById<ImageView>(R.id.imageView).load(
                it?.message?.toUri()?.buildUpon()?.scheme("https")?.build()
            ) })
        findViewById<Button>(R.id.button).setOnClickListener { viewModel.getRandomDogPhoto() } } }


