package com.example.dicegame

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button

class InitialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initial)

        val newGameBtn = findViewById<Button>(R.id.newGame)
        newGameBtn.setOnClickListener {
            val contactIntent = Intent(this, MainActivity::class.java)
            startActivity(contactIntent)
        }

        val builder = AlertDialog.Builder(this)
        builder.setMessage("Ganeswaran Santheep (w18671049)\n\nI confirm that I understand what plagiarism is and have read and\n" +
                "understood the section on Assessment Offences in the Essential\n" +
                "Information for Students. The work that I have submitted is\n" +
                "entirely my own. Any work from other authors is duly referenced\n" +
                "and acknowledged.")
            .setPositiveButton("OK") { dialog, which ->
                // do something when "OK" button is clicked
            }

        val aboutBtn = findViewById<Button>(R.id.about)
        aboutBtn.setOnClickListener {
            val dialog = builder.create()
            dialog.show()
        }


    }
}