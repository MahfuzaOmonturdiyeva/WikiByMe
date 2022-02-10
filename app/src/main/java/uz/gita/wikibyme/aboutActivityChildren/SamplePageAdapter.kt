package uz.gita.wikibyme.aboutActivityChildren

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


class SamplePageAdapter(
    fragmentManager: FragmentManager,
    private val list: List<Fragment>
) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(p0: Int): Fragment = list[p0]

    override fun getPageTitle(position: Int): CharSequence = (position + 1).toString()

    override fun getCount(): Int = list.count()

}