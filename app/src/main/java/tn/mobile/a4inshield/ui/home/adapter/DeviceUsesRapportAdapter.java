package tn.mobile.a4inshield.ui.home.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import tn.mobile.a4inshield.databinding.DeviceUsesRapportItemBinding;

public class DeviceUsesRapportAdapter extends RecyclerView.Adapter<DeviceUsesRapportAdapter.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        DeviceUsesRapportItemBinding binding = DeviceUsesRapportItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.binding.deviceUsesRapportLabel.setText("Danger Level");
        holder.binding.deviceUsesRapportValue.setText("High ");
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        DeviceUsesRapportItemBinding binding;

        public MyViewHolder(DeviceUsesRapportItemBinding viewBinding) {
            super(viewBinding.getRoot());
            binding = viewBinding;
        }
    }
}