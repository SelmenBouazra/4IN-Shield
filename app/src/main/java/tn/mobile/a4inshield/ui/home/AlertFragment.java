package tn.mobile.a4inshield.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tn.mobile.a4inshield.databinding.FragmentAlertBinding;
import tn.mobile.a4inshield.ui.home.adapter.LastAlertAdapter;


public class AlertFragment extends Fragment {
    FragmentAlertBinding binding;
    LastAlertAdapter lastAlertAdapter = new LastAlertAdapter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAlertBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.lastAlertsRv.setAdapter(lastAlertAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}