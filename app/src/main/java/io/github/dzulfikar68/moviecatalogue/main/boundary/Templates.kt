package io.github.dzulfikar68.moviecatalogue.main.boundary

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

fun FragmentManager.openFragment(fragment: Fragment, layout: Int) {
    this.beginTransaction()
        .replace(layout, fragment)
        .commitAllowingStateLoss()
}

fun AppCompatActivity.setActionBar(title: String, back: Boolean){
    if (back) this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
    this.supportActionBar?.setDisplayShowHomeEnabled(true)
    this.supportActionBar?.title = title
}