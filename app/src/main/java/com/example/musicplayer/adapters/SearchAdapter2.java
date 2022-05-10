package com.example.musicplayer.adapters;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musicplayer.ui.search.Models.ExampleJson2KtPOJO;
import com.example.musicplayer.ui.search.Models.Tracks;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;


public class SearchAdapter2 extends SelectableAdapter<RecyclerView.ViewHolder> {

    public SearchAdapter2(Context context, Call<ExampleJson2KtPOJO> songs, String query) throws IOException {
        System.out.println("Start");
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}

