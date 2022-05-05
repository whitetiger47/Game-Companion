package com.example.gamecompanion.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gamecompanion.models.PaymentModel
import com.example.gamecompanion.R

class MyWalletRecyclerViewAdapter() : RecyclerView.Adapter<MyWalletRecyclerViewAdapter.PaymentListItem>() {
    private var payments = emptyList<PaymentModel>()

    inner class PaymentListItem(paymentsListItemView: View?) : RecyclerView.ViewHolder(paymentsListItemView!!) {
        val paymentTypeTextView: TextView? = paymentsListItemView?.findViewById<TextView>(R.id.paymentTypeTextView)
        val cardNumberTextView: TextView? = paymentsListItemView?.findViewById<TextView>(R.id.cardNumberTextView)
        var paymentPosition = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentListItem {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val paymentListItemView: View = layoutInflater.inflate(R.layout.payment_item, parent, false)
        return PaymentListItem(paymentListItemView)
    }

    override fun onBindViewHolder(holder: PaymentListItem, position: Int) {
        val payment: PaymentModel = payments[position]
        holder.paymentTypeTextView?.text = payment.paymentType
        holder.cardNumberTextView?.text = payment.cardNumber
        holder.paymentPosition = position
    }

    override fun getItemCount(): Int {
        return payments.size
    }

    fun setPayments(payments: List<PaymentModel>) {
        this.payments = payments
        notifyDataSetChanged()
    }
}