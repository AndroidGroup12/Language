package com.google.vocabboost

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.vocabboost.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("LanguagePref", Context.MODE_PRIVATE)
        val language = sharedPreferences.getString("language", "Spanish")
        loadContentForLanguage(language.toString())
    }
    private fun loadContentForLanguage(language: String) {
        // Load the appropriate content based on the selected language
        if (language == "Spanish") {
            // Load Spanish words
        } else if (language == "German") {
            // Load German words
        }

        val fragmentManager: FragmentManager = supportFragmentManager

        // define your fragments here
        val categoriesFragment: Fragment = Categories()
        val flashcardFragment: Fragment = Flashcard()
        val wordsFragment: Fragment = Words()

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // handle navigation selection
        bottomNavigationView.setOnItemSelectedListener { item ->
            lateinit var fragment: Fragment
            when (item.itemId) {
                R.id.action_categories -> fragment = categoriesFragment
                R.id.action_words -> fragment = wordsFragment
                R.id.action_study -> fragment = flashcardFragment
            }
            replaceFragment(fragment)
            true
        }
        bottomNavigationView.selectedItemId = R.id.action_categories
    }
    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)

        fragmentTransaction.commit()
    }
}