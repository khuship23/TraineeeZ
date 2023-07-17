package com.example.traineeez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.traineeez.databinding.ActivitySignUpBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class SignUp : AppCompatActivity() {

    lateinit var database: DatabaseReference
    private lateinit var binding: ActivitySignUpBinding
    private lateinit var user: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        user = FirebaseAuth.getInstance()







        val signUpButton = findViewById<Button>(R.id.btnSignUp)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etMail = findViewById<TextInputEditText>(R.id.etEmail)
        val userId = findViewById<TextInputEditText>(R.id.etUserName)
        val userPassword = findViewById<TextInputEditText>(R.id.etPassword)
        val toSignin = findViewById<TextView>( R.id.tvtosignin )


        signUpButton.setOnClickListener {
            val name = etName.text.toString()
            val mail = etMail.text.toString()
            val uniqueId = userId.text.toString()
            val password = userPassword.text.toString()


            val user = User(name,uniqueId,mail,password)
            database = FirebaseDatabase.getInstance().getReference("Users")
            database.child(uniqueId).setValue(user).addOnSuccessListener {

             etName.text?.clear()
             userId.text?.clear()
             etMail.text?.clear()
             userPassword.text?.clear()
                Toast.makeText(this,"User Registered" , Toast.LENGTH_SHORT).show()
                val intent = Intent(this,SignIN::class.java)
                startActivity(intent)
            }.addOnFailureListener{


                Toast.makeText(this,"Failed" , Toast.LENGTH_SHORT).show()

            }



        }

        signUpButton.setOnClickListener{
            Toast.makeText(this, "SIGNIN" , Toast.LENGTH_SHORT).show()
            val intent = Intent(this,SignIN::class.java)
            startActivity(intent)

        }




    }


}