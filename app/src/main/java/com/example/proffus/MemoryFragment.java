package com.example.proffus;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MemoryFragment extends Fragment {



    public MemoryFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_memory, container, false);
        RecyclerView postRecyclerView = view.findViewById(R.id.recyclerView);
        postRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        List<PostItem> postItems = new ArrayList<>();
        postItems.add(new PostItem(R.drawable.image1));
        postItems.add(new PostItem(R.drawable.image2));
        postItems.add(new PostItem(R.drawable.image3));
        postItems.add(new PostItem(R.drawable.image4));
        postItems.add(new PostItem(R.drawable.image5));
        postItems.add(new PostItem(R.drawable.image6));
        postItems.add(new PostItem(R.drawable.image7));
        postItems.add(new PostItem(R.drawable.image8));
        postItems.add(new PostItem(R.drawable.image9));
        postItems.add(new PostItem(R.drawable.image10));

        postRecyclerView.setAdapter(new PostAdapter(postItems));

        return view;
    }

}