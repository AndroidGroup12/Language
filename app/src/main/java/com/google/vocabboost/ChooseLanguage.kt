package com.google.vocabboost

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.vocabboost.databinding.LanguageSettingBinding

class ChooseLanguage : AppCompatActivity() {

    private lateinit var binding: LanguageSettingBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LanguageSettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("LanguagePref", Context.MODE_PRIVATE)

        if (sharedPreferences.contains("language")) {
            startMainActivity()
            return
        }

        // Set click listeners for the language buttons
        binding.language1.setOnClickListener {
            saveLanguage("Spanish")
            startMainActivity()
        }

        binding.language2.setOnClickListener {
            saveLanguage("German")
            startMainActivity()
        }
    }

    private fun saveLanguage(language: String) {
        sharedPreferences.edit().putString("language", language).apply()
    }

    private fun startMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}