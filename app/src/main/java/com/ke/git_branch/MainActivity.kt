package com.ke.git_branch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun showDialog() {

        AlertDialog.Builder(this)
            .setTitle("标题")
            .setMessage("文字")
            .show()
    }
}