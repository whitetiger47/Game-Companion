package com.example.gamecompanion.persistence

import com.example.gamecompanion.models.PaymentModel

object PaymentsPersistence {
    val payments = ArrayList<PaymentModel>()

    init {
        //initializeNotesPersistence();
    }

//    private fun initializeNotesPersistence() {
//        for (i in 1..10) {
//            val noteTitle = "Note $i"
//            val noteBody = "I am note $i"
//            val note = NoteModel(noteTitle, noteBody)
//            notes.add(note)
//        }
//        println(notes.size)
//    }
}