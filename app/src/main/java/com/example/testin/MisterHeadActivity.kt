package com.example.testin

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge

class MisterHeadActivity : BaseActivity() {
    private lateinit var checkBoxes: Array<CheckBox>
    private lateinit var imageViews: Array<ImageView>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.gurunji_mister_head)


        // Initialize checkboxes and image views
        checkBoxes = arrayOf(
            findViewById(R.id.checkHair),
            findViewById(R.id.checkEyeBrowse),
            findViewById(R.id.checkEye),
            findViewById(R.id.checkMoustache),
            findViewById(R.id.checkBeard)
        )

        imageViews = arrayOf(
            findViewById(R.id.hair),
            findViewById(R.id.eyebrows),
            findViewById(R.id.eyes),
            findViewById(R.id.mustaches),
            findViewById(R.id.beards)
        )

        // Set onCheckedChangeListener for each checkbox
        for (i in checkBoxes.indices) {
            checkBoxes[i].setOnCheckedChangeListener { _, isChecked ->
                updateVisibility(i, isChecked)
            }
        }
    }

    private fun updateVisibility(index: Int, isChecked: Boolean) {
        imageViews[index].visibility = if (isChecked) {
            ImageView.VISIBLE // Show the image view if checked
        } else {
            ImageView.GONE // Hide the image view if unchecked
        }
    }
}