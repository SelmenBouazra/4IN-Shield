package tn.mobile.a4inshield.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import tn.mobile.a4inshield.databinding.FragmentRapportBinding;
import tn.mobile.a4inshield.ui.home.adapter.DeviceUsesRapportAdapter;
import tn.mobile.a4inshield.ui.home.adapter.LastAlertAdapter;


public class RapportFragment extends Fragment {

    FragmentRapportBinding binding;
    DeviceUsesRapportAdapter deviceUsesRapportAdapter = new DeviceUsesRapportAdapter();
    LastAlertAdapter lastAlertAdapter = new LastAlertAdapter();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentRapportBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rapportRv.setAdapter(deviceUsesRapportAdapter);
        binding.lastAlertsRv.setAdapter(lastAlertAdapter);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}