package com.example.gamecompanion

import androidx.fragment.app.Fragment
import java.util.*

interface FragmentNavigation {
    fun navigateFrag(fragment: Fragment, addToStack: Boolean)
}