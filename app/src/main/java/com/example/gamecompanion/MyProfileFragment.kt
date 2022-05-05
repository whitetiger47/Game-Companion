package com.example.gamecompanion

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.gamecompanion.camera.Camera
import com.example.gamecompanion.chat.Chat

class MyProfileFragment : Fragment()  {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_my_profile, container, false)

        val myWallet = view.findViewById<TextView>(R.id.textView1)
        val camera = view.findViewById<TextView>(R.id.textView2)
        val setting = view.findViewById<TextView>(R.id.textView10)
        val contact = view.findViewById<TextView>(R.id.textView11)
        val vip = view.findViewById<TextView>(R.id.textView8)
        val chat = view.findViewById<TextView>(R.id.textView9)

        myWallet.setOnClickListener {
            var navMyWallet = activity as FragmentNavigation
            navMyWallet.navigateFrag(MyWalletFragment(),addToStack = true)
        }

        camera.setOnClickListener {
            Camera().run{
                startActivity(Intent(this, Camera::class.java))
            }
        }

        setting.setOnClickListener {
            var navSetting = activity as FragmentNavigation
            navSetting.navigateFrag(SettingFragment(),addToStack = true)
        }

        contact.setOnClickListener {
            var navContact = activity as FragmentNavigation
            navContact.navigateFrag(InfoFragment(),addToStack = true)
        }
        chat.setOnClickListener {
            Chat().run{
                startActivity(Intent(this, Chat::class.java))
            }
        }

        vip.setOnClickListener {
            var navVip = activity as FragmentNavigation
            navVip.navigateFrag(VipCenterFragment(),addToStack = true)
        }

        return view
    }
}