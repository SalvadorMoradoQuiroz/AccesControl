package com.polarindustries.accescontrol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.polarindustries.accescontrol.fragments.HombreFragment
import com.polarindustries.accescontrol.fragments.MujeresFragment

class EstadisticasAreaRecreativaActivity : AppCompatActivity() {
    private lateinit var viewPagerLocalVisit: ViewPager
    private lateinit var tabLayoutLocalVisit: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas_area_recreativa)
        title = "Estadísticas"
        viewPagerLocalVisit = findViewById(R.id.viewPagerLocalVisit)
        tabLayoutLocalVisit = findViewById(R.id.tabLayoutLocalVisit)

        tabLayoutLocalVisit.setupWithViewPager(viewPagerLocalVisit)
        setupViewPager(viewPagerLocalVisit)
    }

    private fun setupViewPager(viewpager: ViewPager) {
        var adapter: ViewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        // LoginFragment is the name of Fragment and the Login
        // is a title of tab
        adapter.addFragment(HombreFragment(), "Masculino")
        adapter.addFragment(MujeresFragment(), "Femenino")


        // setting adapter to view pager.
        viewpager.adapter = adapter
    }

    class ViewPagerAdapter : FragmentPagerAdapter {

        // objects of arraylist. One is of Fragment type and
        // another one is of String type.*/
        private final var fragmentList1: ArrayList<Fragment> = ArrayList()
        private final var fragmentTitleList1: ArrayList<String> = ArrayList()

        // this is a secondary constructor of ViewPagerAdapter class.
        public constructor(supportFragmentManager: FragmentManager)
                : super(supportFragmentManager)

        // returns which item is selected from arraylist of fragments.
        override fun getItem(position: Int): Fragment {
            return fragmentList1.get(position)
        }

        // returns which item is selected from arraylist of titles.
        override fun getPageTitle(position: Int): CharSequence {
            return fragmentTitleList1.get(position)
        }

        // returns the number of items present in arraylist.
        override fun getCount(): Int {
            return fragmentList1.size
        }

        // this function adds the fragment and title in 2 separate  arraylist.
        fun addFragment(fragment: Fragment, title: String) {
            fragmentList1.add(fragment)
            fragmentTitleList1.add(title)
        }
    }
}