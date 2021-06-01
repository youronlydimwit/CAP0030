package com.example.knowyourbatik

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Adapter
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title = "About Batik"
        val imageList =ArrayList<SlideModel>()
        imageList.add(SlideModel("https://cdn.shopify.com/s/files/1/1420/5886/files/Cover_11-01_1060x.png?v=1563482082",))
        imageList.add(SlideModel("https://cdn.shopify.com/s/files/1/1420/5886/files/Cover_11-01_1060x.png?v=1563482082"))

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlide)
        imageSlider.setImageList(imageList)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selecMode:Int){
        when(selecMode){
            R.id.find_Batik ->{
                val intent = Intent(this@MainActivity,FindBatik::class.java)
                startActivity(intent)
            }
            R.id.disclaim->{
                val intent = Intent(this@MainActivity,Disclaimer::class.java)
                startActivity(intent)
            }
        }

    }
}