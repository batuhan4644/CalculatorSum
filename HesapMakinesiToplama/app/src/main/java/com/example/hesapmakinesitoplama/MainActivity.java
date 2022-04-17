package com.example.hesapmakinesitoplama;

import static android.text.TextUtils.split;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.SumPathEffect;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.example.hesapmakinesitoplama.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding tasarim;
    private void TiklananSayi(int sayi)
    {
        tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText() + String.valueOf(sayi));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        tasarim = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(tasarim.getRoot());

        tasarim.textViewSonuc.setText("");

        tasarim.buttonSayi0.setOnClickListener(view -> {
            TiklananSayi(0);
        });
        tasarim.buttonSayi1.setOnClickListener(view -> {
            TiklananSayi(1);
        });
        tasarim.buttonSayi2.setOnClickListener(view -> {
            TiklananSayi(2);
        });
        tasarim.buttonSayi3.setOnClickListener(view -> {
            TiklananSayi(3);
        });
        tasarim.buttonSayi4.setOnClickListener(view -> {
            TiklananSayi(4);
        });
        tasarim.buttonSayi5.setOnClickListener(view -> {
            TiklananSayi(5);
        });
        tasarim.buttonSayi6.setOnClickListener(view -> {
            TiklananSayi(6);
        });
        tasarim.buttonSayi7.setOnClickListener(view -> {
            TiklananSayi(7);
        });
        tasarim.buttonSayi8.setOnClickListener(view -> {
            TiklananSayi(8);
        });
        tasarim.buttonSayi9.setOnClickListener(view -> {
            TiklananSayi(9);
        });
        tasarim.buttonEkle.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText(tasarim.textViewSonuc.getText()+"+");
        });
        tasarim.buttonEsittir.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText("Yapamadım");
        });
        tasarim.buttonTemizle.setOnClickListener(view -> {
            tasarim.textViewSonuc.setText("");
        });


    }




}