package com.example.homework41;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView basket_ball = findViewById(R.id.basket_ball);
        float startX = basket_ball.getX(); // Начальная x позиция мяча
        float endX = startX + 1000f; // Конечная x позиция мяча
        ObjectAnimator animator = ObjectAnimator.ofFloat(basket_ball, "x", startX, endX);
        animator.setDuration(500); // Продолжительность анимации в миллисекундах
        animator.setRepeatCount(ValueAnimator.INFINITE); // Повторять анимацию бесконечно
        animator.setRepeatMode(ValueAnimator.REVERSE); // Переворачивать анимацию при каждом повторе
        animator.start(); // Запустить анимацию
    }
}