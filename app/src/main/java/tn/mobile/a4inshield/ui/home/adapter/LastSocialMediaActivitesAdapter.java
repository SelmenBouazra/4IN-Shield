package tn.mobile.a4inshield.ui.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import tn.mobile.a4inshield.databinding.LastSocialMediaActivitesItemBinding;

public class LastSocialMediaActivitesAdapter extends RecyclerView.Adapter<LastSocialMediaActivitesAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LastSocialMediaActivitesItemBinding binding = LastSocialMediaActivitesItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 2;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        LastSocialMediaActivitesItemBinding binding;

        public MyViewHolder(LastSocialMediaActivitesItemBinding viewBinding) {
            super(viewBinding.getRoot());
            binding = viewBinding;
        }
    }
}