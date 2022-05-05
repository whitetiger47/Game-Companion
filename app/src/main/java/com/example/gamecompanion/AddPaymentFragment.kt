package com.example.gamecompanion

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.gamecompanion.R
import com.example.gamecompanion.models.PaymentModel
import com.example.gamecompanion.persistence.PaymentsPersistence
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_add_payment.*
import java.util.*
import kotlin.concurrent.schedule

class AddPaymentFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_payment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button =view.findViewById<Button>(R.id.button)
        val paymentTypeInputField = view.findViewById<TextView>(R.id.paymentTypeInputField)
        val cardNumberInputField = view.findViewById<TextView>(R.id.cardNumberInputField)
        val cardOwnerNameInputField = view.findViewById<TextView>(R.id.cardOwnerNameInputField)
        val cardExpireDateInputField = view.findViewById<TextView>(R.id.cardExpireDateInputField)
        val cardCVVInputField = view.findViewById<TextView>(R.id.cardCVVInputField)

        button.setOnClickListener {
            // when title is empty
            if (!paymentTypeInputField.text.toString().isEmpty() && !cardNumberInputField.text.toString().isEmpty() &&
                !cardOwnerNameInputField.text.toString().isEmpty() && !cardExpireDateInputField.text.toString().isEmpty() &&
                !cardCVVInputField.text.toString().isEmpty()) {
                var snackbar = Snackbar.make(
                    constraintLayoutCreateNoteFragment,
                    "Payment Information saved successfully.",
                    Snackbar.LENGTH_INDEFINITE
                )

                savePayment(paymentTypeInputField, cardNumberInputField)
                var navMyWallet = activity as FragmentNavigation
                navMyWallet.navigateFrag(MyWalletFragment(),addToStack = true)

                // display the message
                snackbar.show()

                // close the snackbar after 1000 ms
                Timer().schedule(1000) {
                    snackbar.dismiss()
                }
            }
            // when title and body are entered
            else {
                var snackbar = Snackbar.make(
                    constraintLayoutCreateNoteFragment,
                    "Payment Information Missing",
                    Snackbar.LENGTH_INDEFINITE
                )

                snackbar.setAction("CONTINUE") {
                    snackbar.dismiss()
                }
                snackbar.show()

            }
        }
    }

    private fun savePayment(paymentTypeInputField: TextView, cardNumberInputField: TextView) {
        val paymentType: String = paymentTypeInputField.text.toString()
        val cardNumber: String = cardNumberInputField.text.toString()
        val payment = PaymentModel(paymentType, cardNumber)

        PaymentsPersistence.payments.add(payment)
    }
}