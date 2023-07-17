package com.example.traineeez

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [homeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class homeFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        val ivlearn: ImageButton = root.findViewById(R.
        id.ivlearn) as ImageButton
        ivlearn.setOnClickListener{
            Toast.makeText(activity,"Opening Resume template" , Toast.LENGTH_SHORT).show()

           val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse( "https://zety.com/resume-templates")
            startActivity(intent)
            }


        val mentorship: ImageButton = root.findViewById(R.
        id.ivmentorship) as ImageButton
        mentorship.setOnClickListener{
            Toast.makeText(activity,"Mentorship" , Toast.LENGTH_SHORT).show()
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse( "https://www.codementor.io/experts")
            startActivity(intent)



        }

        val ivvideo: ImageButton = root.findViewById(R.
        id.ivvideo) as ImageButton
        ivvideo.setOnClickListener{
            Toast.makeText(activity,"Opening videos" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse( "https://www.youtube.com/watch?v=x60GHpQ8gJk&list=PLWPirh4EWFpFIElSxplDlEhRDZHkBD-0n&index=1")
            startActivity(intent)
        }

        val ivjob: ImageButton = root.findViewById(R.
        id.ivjobs) as ImageButton
        ivjob.setOnClickListener{
            Toast.makeText(activity,"Jobs Searching" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse( "https://www.youtube.com/playlist?list=PLWPirh4EWFpFIElSxplDlEhRDZHkBD-0n")
            startActivity(intent)
        }

        val clgpic: ImageView = root.findViewById(R.
        id.clgpic) as ImageView
        clgpic.setOnClickListener{
            Toast.makeText(activity,"Opening College Website" , Toast.LENGTH_SHORT).show()

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data=Uri.parse( "https://moderncoe.edu.in/")
            startActivity(intent)
        }
        return root
        }





    }




