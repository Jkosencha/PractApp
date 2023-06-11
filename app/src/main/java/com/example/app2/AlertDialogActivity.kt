package com.example.app2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.NonCancellable.cancel

class AlertDialogActivity : AppCompatActivity() {

    lateinit var btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)

        btn=findViewById(R.id.btnclose)

        btn.setOnClickListener {
            var box=AlertDialog.Builder(this)

            box.setMessage("Do you want to close this application?")
            box.setNegativeButton("PROCEED", DialogInterface.OnClickListener { dialog, id -> finish()  })
            box.setPositiveButton("CANCEL", DialogInterface.OnClickListener { dialog, id -> cancel() })

            var alert=box.create()
            alert.setTitle("App2")
            alert.show()
        }

    }
}