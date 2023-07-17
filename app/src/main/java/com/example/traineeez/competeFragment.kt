package com.example.traineeez

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [competeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class competeFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_compete, container, false)

        val ivCompete: ImageButton = root.findViewById(R.id.ivCompete) as ImageButton
        ivCompete.setOnClickListener{
            Toast.makeText(activity,"Get ready for competition" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://codingcompetitions.withgoogle.com/")
            startActivity(intent)
        }


        val hackathon: ImageButton = root.findViewById(R.id.ivhackathon) as ImageButton
        hackathon.setOnClickListener{
            Toast.makeText(activity,"Welcome to hackthon" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://www.hackerearth.com/challenges/")
            startActivity(intent)


        }
        val explore: TextView = root.findViewById(R.id.explore) as TextView
        explore.setOnClickListener{
            Toast.makeText(activity,"Explore" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://www.hackerearth.com/getstarted-competitive-programming/")
            startActivity(intent)


        }


        return root
    }


}