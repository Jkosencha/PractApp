package com.example.app2

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import kotlinx.coroutines.NonCancellable
import kotlinx.coroutines.NonCancellable.cancel

class DashboardActivity : AppCompatActivity() {

    lateinit var home: CardView
    lateinit var chat: CardView
    lateinit var profile: CardView
    lateinit var settings: CardView
    lateinit var widgets: CardView
    lateinit var logout: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        home=findViewById(R.id.cardHome)
        chat=findViewById(R.id.cardchat)
        profile=findViewById(R.id.cardperson)
        settings=findViewById(R.id.cardsetting)
        widgets=findViewById(R.id.cardwidgets)
        logout=findViewById(R.id.cardlogout)

        home.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Home", Toast.LENGTH_LONG).show()
            val intent = Intent(this, AlertDialogActivity::class.java)
            startActivity(intent)
        }

        chat.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Chat", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ListViewActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Profile", Toast.LENGTH_LONG).show()
        }

        settings.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Settings", Toast.LENGTH_LONG).show()
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

        widgets.setOnClickListener {
            Toast.makeText(applicationContext, "You have clicked Widgets", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ScrollViewActivity::class.java)
            startActivity(intent)
        }

        logout.setOnClickListener {
            var box= AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setPositiveButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish() })
            box.setNegativeButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("App2")
            alert.show()
        }
    }
}