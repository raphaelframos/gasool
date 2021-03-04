package com.powellapps.gasool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.SeekBar
import android.widget.TextView

class LixoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lixo)

        val seekBar : SeekBar = findViewById(R.id.seek_bar)
        val textView : TextView = findViewById(R.id.text_view_result_seek)
        val ratingBar : RatingBar = findViewById(R.id.ratingBar)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, value: Int, b: Boolean) {
                if(value <= 20){
                    ratingBar.progress = 2
                }else if(value in 21..40){
                    ratingBar.progress = 4
                }else{
                    ratingBar.progress = 10
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }
        })
    }
}