package tn.mobile.a4inshield.ui.auth;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import tn.mobile.a4inshield.R;
import tn.mobile.a4inshield.databinding.FragmentAuthenticationBinding;

public class AuthenticationFragment extends Fragment {

    FragmentAuthenticationBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentAuthenticationBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initClick();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void initClick(){
        binding.emailMethode.container.setOnClickListener(view -> {
        NavController navController = Navigation.findNavController(requireActivity(), R.id.auth_nav_host_fragment);
            NavDirections action = AuthenticationFragmentDirections.actionAuthenticationFragmentToSignInFragment();
            navController.navigate(action);
        });

        binding.signUp.setOnClickListener(view -> {
        NavController navController = Navigation.findNavController(requireActivity(), R.id.auth_nav_host_fragment);
            NavDirections action = AuthenticationFragmentDirections.actionAuthenticationFragmentToSignUpFragment();
            navController.navigate(action);
        });

    }
}