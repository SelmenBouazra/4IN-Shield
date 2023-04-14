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
import tn.mobile.a4inshield.databinding.FragmentSignUpBinding;

public class SignUpFragment extends Fragment {

    FragmentSignUpBinding binding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSignUpBinding.inflate(inflater);
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
        binding.signInBtn.setOnClickListener(view -> {
            NavController navController = Navigation.findNavController(requireActivity(), R.id.auth_nav_host_fragment);
            NavDirections action = SignUpFragmentDirections.actionSignUpFragmentToChooseUserTypeFragment();
            navController.navigate(action);
        });
    }
}