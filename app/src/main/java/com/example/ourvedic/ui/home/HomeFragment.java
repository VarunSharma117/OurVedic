package com.example.ourvedic.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.ourvedic.ListAdapter;
import com.example.ourvedic.R;
import com.example.ourvedic.item;

import java.util.ArrayList;

public class HomeFragment extends Fragment {


    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        ArrayList<item> items = new ArrayList<>();
        items.add(new item(101, "Agarbatti", "Incense stick",R.drawable.h101));
        items.add(new item(102, "Ghee", "Ghee",R.drawable.h102));
        items.add(new item(103, "Kumkuma", "Kumkuma",R.drawable.h103));
        items.add(new item(104, "phool", "Flowers",R.drawable.h104));
        items.add(new item(105, "Rudraksha", "Rudraksha",R.drawable.h105));
        items.add(new item(106, "chandan", "Sandalwood",R.drawable.h106));
        items.add(new item(107, "Sindoor", "Vermilion red",R.drawable.h107));
        items.add(new item(108, "Tulasi", "Tulasi",R.drawable.h108));
        items.add(new item(109, "haldee", "Turmeric",R.drawable.h109));
        items.add(new item(110, "Vibhuti", "Vibhuti",R.drawable.h110));
        items.add(new item(111, "Panchagavya", "Panchagavya ",R.drawable.h111));
        items.add(new item(112, "Dhaga", "Red Thread",R.drawable.h112));
        items.add(new item(113, "cheenee", "Sugar",R.drawable.h113));
        items.add(new item(114, "Prasad", "Prasad",R.drawable.h114));




        ListAdapter itemsAdapter = new ListAdapter(getActivity(), items);

        ListView listView = root.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return root;
    }
}