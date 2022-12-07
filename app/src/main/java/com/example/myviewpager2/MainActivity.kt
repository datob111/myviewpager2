package com.example.myviewpager2

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var table: TabLayout
    private lateinit var viewpager2: ViewPager2
    private lateinit var viewpagerFragmentAdapter: ViewpagerFragmentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        table = findViewById(R.id.tab_layout)
        viewpager2 = findViewById(R.id.viwepager2)
        viewpagerFragmentAdapter = ViewpagerFragmentAdapter(this)
        viewpager2.adapter = viewpagerFragmentAdapter
        TabLayoutMediator(table, viewpager2) { tab, position ->
            tab.text = when (position) {
                0 -> {
                    "paulo londra"
                }
                1 -> {
                    "bad bunny"
                }
                2 -> {
                    "maluma"
                }
                else -> {
                    throw Resources.NotFoundException("position not found")
                }
            }


        }.attach()
    }
}
