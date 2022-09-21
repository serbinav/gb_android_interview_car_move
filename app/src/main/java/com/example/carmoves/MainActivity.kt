package com.example.carmoves

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.carmoves.databinding.ActivityMainStartBinding

//  Напишите приложение, которое:
//  ● Отображает макет машины как в приложении Я.Гоу или СитиМобил;
//  ● По тапу на машину она едет по не прямой траектории из одного угла в другой.
//  Выбор архитектуры и библиотек остается за вами, но желательно использовать SOLID, Clean,
//  MVVM или MVP, MVI. Будет плюсом DI (Koin, Dagger, Toothpick). Наличие тестов будет плюсом.

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}