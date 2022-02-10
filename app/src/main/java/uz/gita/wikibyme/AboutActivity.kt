package uz.gita.wikibyme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import uz.gita.wikibyme.aboutActivityChildren.AboutFragmentPage
import uz.gita.wikibyme.aboutActivityChildren.SamplePageAdapter
import uz.gita.wikibyme.aboutActivityChildren.SampleTabListener
import uz.gita.wikibyme.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAboutBinding
    private var startPage = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        startPage = intent.getIntExtra(KEYITEM, -1)
        setupViewPager()
    }

    private fun setupViewPager() {

        binding.customTabLayout
            .addOnTabSelectedListener(SampleTabListener())

        findViewById<ViewPager>(R.id.viewPager)
            .apply {
                adapter = SamplePageAdapter(
                    supportFragmentManager,

                    listOf(
                        AboutFragmentPage.newInstance(1),
                        AboutFragmentPage.newInstance(2),
                        AboutFragmentPage.newInstance(3),
                        AboutFragmentPage.newInstance(4),
                        AboutFragmentPage.newInstance(5),
                        AboutFragmentPage.newInstance(6),
                        AboutFragmentPage.newInstance(7)
                    )
                )

                binding.customTabLayout.setupWithViewPager(this)
            }

        if (startPage != -1) {
            binding.viewPager.currentItem = startPage
            binding.customTabLayout.getTabAt(startPage)?.select()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}