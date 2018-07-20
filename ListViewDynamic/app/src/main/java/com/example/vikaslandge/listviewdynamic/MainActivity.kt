package com.example.vikaslandge.listviewdynamic

import android.content.pm.PackageManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v4.app.ActivityCompat
import android.widget.ArrayAdapter
 import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
 import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var status = ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)
        if (status == PackageManager.PERMISSION_GRANTED) {
            readFiles()
        } else {
            ActivityCompat.requestPermissions(this,
                    arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),
                    123)
        }

     }


    fun readFiles() {

        var path = "/storage/sdcard0/"
        var file = File(path)
        if (!file.exists()) {

            path = "/storage/emulated/0/"
            file = File(path)
        }
        Toast.makeText(this,path,Toast.LENGTH_LONG).show()

        var values = file.list()
        val  myadapter =ArrayAdapter<String>(this,android.R.layout.simple_list_item_single_choice,values)
        listview.adapter = myadapter

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (grantResults[0]==PackageManager.PERMISSION_GRANTED){
            readFiles()
        }else{
            Toast.makeText(this,"will not continue ",Toast.LENGTH_LONG).show()
        }
    }
}


