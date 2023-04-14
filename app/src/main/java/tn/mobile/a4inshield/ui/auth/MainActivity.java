package tn.mobile.a4inshield.ui.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tn.mobile.a4inshield.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }

}