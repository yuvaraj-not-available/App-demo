package com.example.contacts

import androidx.fragment.app.Fragment

interface NavigationHost {
    fun navigateTo(fragment: Fragment,addToBackStack:Boolean)
}