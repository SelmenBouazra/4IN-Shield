package tn.mobile.a4inshield.ui.home;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;

import java.util.ArrayList;
import java.util.List;

import tn.mobile.a4inshield.R;
import tn.mobile.a4inshield.databinding.FragmentSocialMediaBinding;
import tn.mobile.a4inshield.ui.home.adapter.LastSocialMediaActivitesAdapter;


public class SocialMediaFragment extends Fragment {
    FragmentSocialMediaBinding binding;
    LastSocialMediaActivitesAdapter lastSocialMediaActivitesAdapter = new LastSocialMediaActivitesAdapter();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentSocialMediaBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.lastActivityRv.setAdapter(lastSocialMediaActivitesAdapter);

        initBarChart();
    }

    private void initBarChart (){
        ArrayList<Double> valueList = new ArrayList<Double>();
        ArrayList<BarEntry> entries = new ArrayList<>();
        String title = "";
        Description description = new Description();
        description.setText("");
        binding.barChart.setDescription(description);

        valueList.add(7.1);
        valueList.add(8.1);
        valueList.add(7.1);
        valueList.add(8.1);
        valueList.add(8.1);
        valueList.add(7.1);
        valueList.add(7.6);
        valueList.add(7.1);

        binding.barChart.getXAxis().setValueFormatter(new IndexAxisValueFormatter(new String[] {"14", "16", "18"}));


        for (int i = 0; i < valueList.size(); i++) {
            BarEntry barEntry = new BarEntry(i, valueList.get(i).floatValue());
            entries.add(barEntry);

        }
        BarDataSet barDataSet = new BarDataSet(entries, title);
        BarData data = new BarData(barDataSet);
        binding.barChart.setData(data);
        binding.barChart.invalidate();

        binding.barChart.getXAxis().setPosition(XAxis.XAxisPosition.BOTTOM);
        binding.barChart.animateY(400, Easing.EaseInOutSine);
        binding.barChart.setDrawMarkers(false);
        binding.barChart.getXAxis().setDrawAxisLine(false);
        binding.barChart.getAxisLeft().setDrawLabels(false);
        binding.barChart.getAxisRight().setDrawLabels(false);
        binding.barChart.getXAxis().setDrawGridLines(false);
        binding.barChart.getAxisLeft().setDrawGridLines(false);
        binding.barChart.getAxisRight().setDrawGridLines(false);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}