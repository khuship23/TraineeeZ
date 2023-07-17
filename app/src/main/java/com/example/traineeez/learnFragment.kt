package com.example.traineeez

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [learnFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class learnFragment : Fragment() {
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
        val root= inflater.inflate(R.layout.fragment_learn, container, false)

        val ivlearn: ImageButton = root.findViewById(R.
        id.ivlearn) as ImageButton
        ivlearn.setOnClickListener{
            Toast.makeText(activity,"Happy Learning" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://www.codechef.com/learn?itm_medium=navmenu&itm_campaign=learncp")
            startActivity(intent)
        }


        val Video: ImageButton = root.findViewById(R.
        id.ivmentorship) as ImageButton
        Video.setOnClickListener{
            Toast.makeText(activity,"Opening Video" , Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse( "https://www.youtube.com/watch?v=x60GHpQ8gJk&list=PLWPirh4EWFpFIElSxplDlEhRDZHkBD-0n&index=1")
            startActivity(intent)

        }

        val ivquizzes: ImageButton = root.findViewById(R.
        id.ivquizzes) as ImageButton
        ivquizzes.setOnClickListener{
            Toast.makeText(activity,"Be ready to win the quiz" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://docs.google.com/forms/d/e/1FAIpQLSeIRPPP_s7LxwZsBDKI1fUu-Hvbjv_n-uZkvs1WLs24eNqe3A/viewform")
            startActivity(intent)
        }





        return root
    }


}