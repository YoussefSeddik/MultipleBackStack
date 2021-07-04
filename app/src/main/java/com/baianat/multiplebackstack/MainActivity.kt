package com.baianat.multiplebackstack

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.baianat.multiplebackstack.Utils.replaceFragment
import com.baianat.multiplebackstack.home_stack.HomeStackFragmentOne
import com.baianat.multiplebackstack.left_stack.LeftStackFragmentOne
import com.baianat.multiplebackstack.stack_two.RightStackFragmentOne

class MainActivity : AppCompatActivity() {
    private var rightStackFragmentOne = RightStackFragmentOne()
    private var leftStackFragmentOneLeftStackFragmentOne()
    private var homeStackFragmentOne: HomeStackFragmentOne()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        homeStackFragmentOne = HomeStackFragmentOne()
        supportFragmentManager.replaceFragment(
            homeStackFragmentOne!!,
            container = R.id.mainContainer,
            false
        )
        findViewById<Button>(R.id.homeStackButton).setOnClickListener {
            supportFragmentManager.saveBackStack(LeftStackFragmentOne::class.java.name)
            supportFragmentManager.saveBackStack(RightStackFragmentOne::class.java.name)
            supportFragmentManager.restoreBackStack(HomeStackFragmentOne::class.java.name)

            if (supportFragmentManager.findFragmentById(R.id.mainContainer) == null)
                supportFragmentManager.replaceFragment(
                    HomeStackFragmentOne(),
                    container = R.id.mainContainer,
                    true
                )
        }
        findViewById<Button>(R.id.leftStackButton).setOnClickListener {
            supportFragmentManager.saveBackStack(RightStackFragmentOne::class.java.name)
            supportFragmentManager.saveBackStack(HomeStackFragmentOne::class.java.name)
            supportFragmentManager.restoreBackStack(LeftStackFragmentOne::class.java.name)

            if (supportFragmentManager.findFragmentById(R.id.mainContainer) == null)
                supportFragmentManager.replaceFragment(
                    LeftStackFragmentOne(),
                    container = R.id.mainContainer,
                    true
                )
        }
        findViewById<Button>(R.id.rigthStackButton).setOnClickListener {
            supportFragmentManager.saveBackStack(LeftStackFragmentOne::class.java.name)
            supportFragmentManager.saveBackStack(HomeStackFragmentOne::class.java.name)
            supportFragmentManager.restoreBackStack(RightStackFragmentOne::class.java.name)

            if (supportFragmentManager.findFragmentById(R.id.mainContainer) == null)
                supportFragmentManager.replaceFragment(
                    RightStackFragmentOne(),
                    container = R.id.mainContainer,
                    true
                )

        }

    }
}