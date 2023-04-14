package tn.mobile.a4inshield.ui.home;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayoutMediator;

import tn.mobile.a4inshield.R;
import tn.mobile.a4inshield.databinding.FragmentDashboardBinding;
import tn.mobile.a4inshield.ui.home.adapter.ViewPagerAdapter;

public class DashboardFragment extends Fragment {
    FragmentDashboardBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentDashboardBinding.inflate(inflater);
        return binding.getRoot();
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPagerAdapter pagerAdapter = new ViewPagerAdapter(getChildFragmentManager(), getLifecycle());

        binding.viewPager.setAdapter(pagerAdapter);



        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> tab.setText(DashBoardDateFilter.values()[position].name())
        ).attach();

        binding.tabLayout.setBackground(new ColorDrawable(Color.TRANSPARENT));
        binding.tabLayout.setTabTextColors(Color.LTGRAY, Color.BLUE);

       // binding.tabLayout.setTabTextColors(Color.LTGRAY, Color.argb(0,63,119,182));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}

enum DashBoardDateFilter{
    Month,
    Week,
    Day
}