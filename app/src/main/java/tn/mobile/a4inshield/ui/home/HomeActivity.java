package tn.mobile.a4inshield.ui.home;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import tn.mobile.a4inshield.R;
import tn.mobile.a4inshield.databinding.ActivityHomeBinding;


public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        NavController navController = Navigation.findNavController(this, R.id.home_nav_host_fragment);
        NavigationUI.setupWithNavController(binding.bottomNavBar, navController);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}