package tn.mobile.a4inshield.ui.home.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import tn.mobile.a4inshield.ui.home.RapportFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public void MyPagerAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
    }

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new RapportFragment();
            case 1:
                return new RapportFragment();
            case 2:
                return new RapportFragment();
            default:
                throw new IllegalArgumentException("Invalid position");
        }
    }
}