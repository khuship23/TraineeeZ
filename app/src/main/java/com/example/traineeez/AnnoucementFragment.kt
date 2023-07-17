package com.example.traineeez

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [AnnoucementFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class AnnoucementFragment : Fragment() {
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
        val root= inflater.inflate(R.layout.fragment_annoucement, container, false)

        val logout: Button= root.findViewById(R.id.logout) as Button
        logout.setOnClickListener{
            Toast.makeText(activity,"Loging out" , Toast.LENGTH_SHORT).show()

           val intent = Intent(context, SignIN::class.java)
           startActivity(intent)


        }

        return root
    }


}
