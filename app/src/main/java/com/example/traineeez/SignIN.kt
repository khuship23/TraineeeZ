package com.example.traineeez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignIN : AppCompatActivity() {
    lateinit var databaseReference: DatabaseReference

    companion object{
        const val KEY1 = " com.example.traineeez.SignIN.mail"
        const val KEY2 = " com.example.traineeez.SignIN.name"
        const val KEY3 = " com.example.traineeez.SignIN.id"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val signInButton = findViewById<Button>(R.id.btnSignin)
        val userName = findViewById<TextInputEditText>(R.id.UserNameEditText)
        val tosignup = findViewById<TextView>(R.id.tvtosignup)

        signInButton.setOnClickListener{
            val uniqueId = userName.text.toString()
            if(uniqueId.isNotEmpty()){
                readData(uniqueId)
            }else{
                Toast.makeText(this,"Enter UserName",Toast.LENGTH_SHORT).show()

            }

        }

        tosignup.setOnClickListener {
            Toast.makeText(this,"SignUp Page" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)


        }

    }

    private fun readData(uniqueId: String) {
        databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.child(uniqueId).get().addOnSuccessListener {
            if (it.exists()){
              val email =it.child("email").value
                val name =it.child("name").value
                val userId =it.child("uniqueId").value

                val intent =Intent(this,MainActivity::class.java)
                intent.putExtra(KEY1, email.toString())
                intent.putExtra(KEY2, name.toString())
                intent.putExtra(KEY3, userId.toString())

                startActivity(intent)


            }
            else{
                Toast.makeText(this,"User does not exist ",Toast.LENGTH_SHORT).show()
            }


        }.addOnFailureListener{
            Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()
        }

    }
}