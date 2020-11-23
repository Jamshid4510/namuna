package com.example.k1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a: Double = 1.0
        var b: Double = 1.0
        var c: Double = 1.0

        btn_qoshish.setOnClickListener {
            if(!et1.text.isNullOrEmpty() && et1.text.isDigitsOnly() && !et2.text.isNullOrEmpty() && et2.text.isDigitsOnly()){
                a = et1.text.toString().toDouble()
                b = et2.text.toString().toDouble()

                c = a + b

                var satr: String = c.toString()

                et3.setText(satr)

                tv_matn.setText("$a + $b = $c")
            }else{
                Toast.makeText(this, "Biron son kiritishingiz kerak", Toast.LENGTH_SHORT).show()
            }

        }

        var almash = 0

        btn_ayirish.setOnClickListener {
            if(!et1.text.isNullOrEmpty() && et1.text.isDigitsOnly() && !et2.text.isNullOrEmpty() && et2.text.isDigitsOnly()){
                a = et1.text.toString().toDouble()
                b = et2.text.toString().toDouble()

                if (almash % 2 == 0) {
                    c = a - b
                    tv_matn.setText("$a - $b = $c")
                }
                else{
                    c = b - a
                    tv_matn.setText("$b - $a = $c")
                }

                almash ++

                var satr: String = c.toString()

                et3.setText(satr)
            }else{
                Toast.makeText(this, "Biron son kiriting", Toast.LENGTH_SHORT).show()
            }
        }

        var almash2 = 0
        btn_bolish.setOnClickListener {
            if(!et1.text.isNullOrEmpty() && et1.text.isDigitsOnly() && !et2.text.isNullOrEmpty() && et2.text.isDigitsOnly()){
                a = et1.text.toString().toDouble()
                b = et2.text.toString().toDouble()

                if (almash2 % 2 == 0){
                    c = a / b
                    tv_matn.setText("$a : $b = $c")
                }

                else{
                    c = b / a
                    tv_matn.setText("$b : $a = $c")
                }

                almash2 ++

                var satr: String = c.toString()

                et3.setText(satr)
            }else{
                Toast.makeText(this, "Faqat son kiritishingiz kerak", Toast.LENGTH_SHORT).show()
            }
        }

        btn_kopaytirish.setOnClickListener {
            if(!et1.text.isNullOrEmpty() && et1.text.isDigitsOnly() && !et2.text.isNullOrEmpty() && et2.text.isDigitsOnly()){
                a = et1.text.toString().toDouble()
                b = et2.text.toString().toDouble()

                c = a * b

                var satr: String = c.toString()

                et3.setText(satr)
            }else{
                Toast.makeText(this, "Faqat son kiritishingiz kerak", Toast.LENGTH_SHORT).show()
            }
        }

    }


}