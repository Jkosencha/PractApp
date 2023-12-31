package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class ImageButtonActivity : AppCompatActivity() {

    lateinit var number1:EditText
    lateinit var number2:EditText
    lateinit var image:ImageButton
    lateinit var difference:Button
    lateinit var product:Button
    lateinit var division:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_button)


        number1=findViewById(R.id.num1)
        number2=findViewById(R.id.num2)
        image=findViewById(R.id.imgbtn)
        difference=findViewById(R.id.subtract)
        product=findViewById(R.id.multiply)
        division=findViewById(R.id.divide)

        image.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }

            else{
                val  num1=Integer.parseInt(number1.text.toString())
                val  num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "Sum of the two numbers is " +(num1+num2), Toast.LENGTH_LONG).show()
            }
        }

        difference.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }

            else{
                val  num1=Integer.parseInt(number1.text.toString())
                val  num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "Difference of the two numbers is " +(num1-num2), Toast.LENGTH_LONG).show()
            }
        }

        product.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }

            else{
                val  num1=Integer.parseInt(number1.text.toString())
                val  num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "product of the two numbers is " +(num1*num2), Toast.LENGTH_LONG).show()
            }
        }

        division.setOnClickListener {
            if (number1.text.toString().isEmpty() || number2.text.toString().isEmpty()){
                Toast.makeText(applicationContext, "Enter both numbers!", Toast.LENGTH_LONG).show()
            }

            else{
                val  num1=Integer.parseInt(number1.text.toString())
                val  num2=Integer.parseInt(number2.text.toString())

                Toast.makeText(applicationContext, "Division of the two numbers is " +(num1/num2), Toast.LENGTH_LONG).show()
            }
        }

    }
}