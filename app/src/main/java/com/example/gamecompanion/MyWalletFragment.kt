package com.example.gamecompanion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gamecompanion.R
import com.example.gamecompanion.adapters.MyWalletRecyclerViewAdapter
import com.example.gamecompanion.persistence.PaymentsPersistence
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MyWalletFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_wallet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val myWalletRecyclerViewUI: RecyclerView = view.findViewById(R.id.myWalletRecyclerView)
        myWalletRecyclerViewUI.layoutManager = LinearLayoutManager(activity)
        val myWalletRecyclerViewAdapter: MyWalletRecyclerViewAdapter = MyWalletRecyclerViewAdapter()
        myWalletRecyclerViewUI.adapter = myWalletRecyclerViewAdapter
        myWalletRecyclerViewAdapter.setPayments(PaymentsPersistence.payments)

        val button : FloatingActionButton = view.findViewById(R.id.floating_action_button)

        button.setOnClickListener {
            var navAddPayment = activity as FragmentNavigation
            navAddPayment.navigateFrag(AddPaymentFragment(),addToStack = true)
        }

//        view.findViewById<FloatingActionButton>(R.id.floating_action_button).setOnClickListener {
//            findNavController().navigate(R.id.action_myWalletFragment_to_addPaymentFragment)
//        }
    }

}