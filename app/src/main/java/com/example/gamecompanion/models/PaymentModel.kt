package com.example.gamecompanion.models

data class PaymentModel(var paymentType: String, var cardNumber: String) {
    override fun toString(): String {
        if (paymentType.isNotBlank()) {
            return paymentType
        }
        return cardNumber
    }
}