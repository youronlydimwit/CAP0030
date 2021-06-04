package com.example.knowyourbatik

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.core.app.ActivityCompat

class FindBatik : AppCompatActivity(), View.OnClickListener {

    lateinit var imageView: ImageView
    lateinit var button: Button
    lateinit var butt: Button
    private val pickImage = 100
    private var imageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_batik)
        title = "Find Your Batik"
        imageView = findViewById(R.id.image_detec)
        butt = findViewById(R.id.btn_determine)
        butt.setOnClickListener(this)
        button = findViewById(R.id.selec_foto)
        button.setOnClickListener(this)

    }
    private fun selectFromGalery(){
        val gallery = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
        startActivityForResult(gallery, pickImage)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == pickImage) {
            imageUri = data?.data
            imageView.setImageURI(imageUri)
        }
    }

    private fun toDetail() {
        val intent = Intent(this@FindBatik, DetailActivity::class.java)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        if (v != null){
            if (v.id == button.id){
                selectFromGalery()
            }
            if (v.id == butt.id)
                toDetail()
        }
    }

}