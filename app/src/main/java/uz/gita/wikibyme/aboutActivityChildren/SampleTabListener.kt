package uz.gita.wikibyme.aboutActivityChildren

import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.google.android.material.tabs.TabLayout
import uz.gita.wikibyme.R

class SampleTabListener : TabLayout.OnTabSelectedListener {

    private fun updateTabs(tabLayout: TabLayout) {

        for (i in 0 until tabLayout.tabCount) {

            tabLayout.getTabAt(i)?.let { tab ->

                if (tab.customView == null) {
                    val tabView = LayoutInflater.from(tabLayout.context)
                        .inflate(R.layout.item_tab, tabLayout, false)
                    tab.customView = tabView
                }

                tab.customView?.apply {
                    when (i) {
                        0 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.rm1)
                            this.findViewById<TextView>(R.id.text_tab).text = "RM"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        1 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.j1)
                            this.findViewById<TextView>(R.id.text_tab).text = "Jin"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        2 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.sg1)
                            this.findViewById<TextView>(R.id.text_tab).text = "Suga"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        3 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.j_h1)
                            this.findViewById<TextView>(R.id.text_tab).text = "J-Hope"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        4 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.jm1)
                            this.findViewById<TextView>(R.id.text_tab).text = "Jimin"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        5 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.v1)
                            this.findViewById<TextView>(R.id.text_tab).text = "V"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                        6 -> {
                            this.findViewById<ImageView>(R.id.image_tab)
                                .setImageResource(R.drawable.jk1)
                            this.findViewById<TextView>(R.id.text_tab).text = "JK"
                            this.findViewById<TextView>(R.id.text_tab).visibility = View.GONE
                            setSelected(this, i, tabLayout)
                        }
                    }
                }
            }
        }
    }


    override fun onTabReselected(p0: TabLayout.Tab): Unit {
        val tabLayout = p0.parent
        if (tabLayout != null)
            updateTabs(tabLayout)
    }

    override fun onTabUnselected(p0: TabLayout.Tab) {
    }

    override fun onTabSelected(p0: TabLayout.Tab): Unit {
        val tabLayout = p0.parent
        if (tabLayout != null)
            updateTabs(tabLayout)
    }

    private fun setSelected(this1: View, i: Int, tabLayout: TabLayout) {

        when {

            i < tabLayout.selectedTabPosition -> {

                this1.findViewById<LinearLayout>(R.id.ll).background = ContextCompat.getDrawable(
                    tabLayout.context,
                    R.drawable.item_custom
                )
            }

            i == tabLayout.selectedTabPosition -> {
                this1.findViewById<LinearLayout>(R.id.ll).background = ContextCompat.getDrawable(
                    tabLayout.context,
                    R.drawable.item_custom
                )
                this1.findViewById<TextView>(R.id.text_tab).visibility = View.VISIBLE
            }

            else -> {
                this1.findViewById<LinearLayout>(R.id.ll).background = ContextCompat.getDrawable(
                    tabLayout.context,
                    R.drawable.item_custom
                )
            }
        }
    }
}
