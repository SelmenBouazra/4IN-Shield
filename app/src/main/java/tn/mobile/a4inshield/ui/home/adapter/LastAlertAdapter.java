package tn.mobile.a4inshield.ui.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import tn.mobile.a4inshield.databinding.LastAlertRapportItemBinding;

public class LastAlertAdapter extends RecyclerView.Adapter<LastAlertAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LastAlertRapportItemBinding binding = LastAlertRapportItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.lastAlertLabel.setText("Toxic comment!");
        holder.binding.lastAlertValue.setText("Mama always said life was like a box of chocolates. You never know what…");
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        LastAlertRapportItemBinding binding;

        public MyViewHolder(LastAlertRapportItemBinding viewBinding) {
            super(viewBinding.getRoot());
            binding = viewBinding;
        }
    }
}