package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = Toast.makeText(applicationContext,"ห้าม username กับ password เหมือนกัน.",Toast.LENGTH_LONG)
        val text2 = Toast.makeText(applicationContext,"รหัสผ่านไม่ตรงกัน.",Toast.LENGTH_LONG)
        val text3 = Toast.makeText(applicationContext,"กรอกให้ครบทุกช่อง.",Toast.LENGTH_LONG)
        val text4 = Toast.makeText(applicationContext,"สมัครเสร็จสิ้น.",Toast.LENGTH_LONG)

        buttonok.setOnClickListener(){
            if (this.idname.text.toString() == "" || this.idpass.text.toString() == "" || this.idcon.text.toString() == ""){
                text3.show()
        }
            else{
            if (this.idname.text.toString() == this.idpass.text.toString() || this.idname.text.toString() == this.idcon.text.toString()||
            this.idname.text.toString() == this.idpass.text.toString() && this.idname.text.toString() == this.idcon.text.toString()){
            text1.show()
        }
            else
                if (this.idpass.text.toString() == this.idcon.text.toString()){
            text4.show()
        }
        else{
            text2.show()
        }
        }
        }

        buttonclear.setOnClickListener(){
            idname.setText(null)
            idpass.setText(null)
            idcon.setText(null)
        }
    }
}