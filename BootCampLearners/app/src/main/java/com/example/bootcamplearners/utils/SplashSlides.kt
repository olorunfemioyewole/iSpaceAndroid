package com.example.bootcamplearners.utils

import com.example.bootcamplearners.splash.SplashAdapter
import com.example.bootcamplearners.splash.SplashSlide

object SplashSlides {
    val introSliderAdapter = SplashAdapter(
        listOf(
            SplashSlide(
                "Google StartUp",
                "Learn android development with Google ."
            ),
            SplashSlide(
                "Build project at The end of your learning",
                "Be selected to sit for the Examination."
            ),
            SplashSlide(
                "Pass the exam",
                "Build projects to be in demand in the job industry."
            )
        )
    )
}