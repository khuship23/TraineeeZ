package com.example.traineeez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name = intent.getStringExtra(SignIN.KEY2)
//        val nametext = findViewById<TextView>(R.id.tvHello)


// To hide the ActionBar
        supportActionBar?.hide()

        val buttonView = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        replaceWithFragment(homeFragment())

        buttonView.setOnItemSelectedListener {
            when(it.itemId){

                R.id.learn ->replaceWithFragment(learnFragment())
                R.id.home ->replaceWithFragment(homeFragment())
                R.id.mentors ->replaceWithFragment(mentorsFragment())
                R.id.compete ->replaceWithFragment(competeFragment())

                R.id.accouncement-> replaceWithFragment(AnnoucementFragment())

                else -> {

            }

        }
            true
        }


        }
    private fun replaceWithFragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.LOGOUT -> {
                showToast("Logging out")
                val intent = Intent(this,SignIN::class.java)
                startActivity(intent)

            }
            R.id.feedback-> {
                showToast("Feedback")

            }

        }
        return true
    }
    private fun showToast(msg: String){
        Toast.makeText(this,msg ,Toast.LENGTH_SHORT).show()
    }


//    private fun replaceWithFragmentWithData(fragment: profileFragment) {
//        val bundle = Bundle()
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frameLayout,fragment)
//        fragmentTransaction.commit()
//
//    }
//
//    private fun replaceWithFragment(fragment: Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frameLayout,fragment)
//        fragmentTransaction.commit()
//    }
//
}
