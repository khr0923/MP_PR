package com.example.mp_pr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.example.mp_pr.databinding.ActivityMainBinding

private const val TAG_ROADMAP = "roadmap_fragment"
private const val TAG_HOME = "home_fragment"
private const val TAG_MY_PAGE = "my_page_fragment"

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        setFragment(TAG_HOME, HomeFragment())
//
//        binding.navigationView.setOnItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.home -> setFragment(TAG_HOME, HomeFragment() )
//                R.id.roadmap -> setFragment(TAG_ROADMAP, RoadmapFragment())
//                R.id.myPage-> setFragment(TAG_MY_PAGE, MyPageFragment())
//            }
//            true
//        }

        replaceFragment(HomeFragment())

        binding.navigationView.setOnItemSelectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.home -> replaceFragment(HomeFragment())
                R.id.roadmap -> replaceFragment(RoadmapFragment())
                R.id.myPage -> replaceFragment(MyPageFragment())

            }
            true
        }
    }

    private fun replaceFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction()
            .apply {
                replace(R.id.mainFrameLayout,fragment)
                commit()
            }
    }

//    private fun setFragment(tag: String, fragment: Fragment) {
//        val manager: FragmentManager = supportFragmentManager
//        val fragTransaction = manager.beginTransaction()
//
//        if (manager.findFragmentByTag(tag) == null){
//            fragTransaction.add(R.id.mainFrameLayout, fragment, tag)
//        }
//
//        val roadmap = manager.findFragmentByTag(TAG_ROADMAP)
//        val home = manager.findFragmentByTag(TAG_HOME)
//        val myPage = manager.findFragmentByTag(TAG_MY_PAGE)
//
//        if (roadmap != null){
//            fragTransaction.hide(roadmap)
//        }
//
//        if (home != null){
//            fragTransaction.hide(home)
//        }
//
//        if (myPage != null) {
//            fragTransaction.hide(myPage)
//        }
//
//        if (tag == TAG_ROADMAP) {
//            if (roadmap!=null){
//                fragTransaction.show(roadmap)
//            }
//        }
//        else if (tag == TAG_HOME) {
//            if (home != null) {
//                fragTransaction.show(home)
//            }
//        }
//
//        else if (tag == TAG_MY_PAGE){
//            if (myPage != null){
//                fragTransaction.show(myPage)
//            }
//        }
//
//        fragTransaction.commitAllowingStateLoss()
//    }
}
