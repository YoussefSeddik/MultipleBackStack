package com.baianat.multiplebackstack

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

object Utils {
    fun FragmentManager.replaceFragment(
        fragment: Fragment,
        container: Int,
        isSaved: Boolean
    ) {
        beginTransaction().apply {
            setReorderingAllowed(true)
            replace(container, fragment,fragment::class.java.name)
            if (isSaved) {
                addToBackStack(fragment::class.java.name)
            }
        }.commit()
    }
}