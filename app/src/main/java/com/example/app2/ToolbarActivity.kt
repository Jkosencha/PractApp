package com.example.app2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable

class ToolbarActivity : AppCompatActivity() {

    lateinit var home: TextView
    lateinit var logout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)


        home.setOnClickListener {
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> NonCancellable.cancel() })

            var alert=box.create()
            alert.setTitle("App2")
            alert.show()
        }


    }
}