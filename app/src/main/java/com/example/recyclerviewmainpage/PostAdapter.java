package com.example.recyclerviewmainpage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostViewHolder> {

    private ArrayList<PostModel> postModelArrayList = new ArrayList<>();

    public PostAdapter(ArrayList<PostModel> postModels) {
        this.postModelArrayList.addAll(postModels);
        notifyDataSetChanged();
    }

    public void refreshPosts(ArrayList<PostModel> post) {
        this.postModelArrayList.clear();
        this.postModelArrayList.addAll(post);
        notifyDataSetChanged();
    }

    public void addPosts(ArrayList<PostModel> post) {
        this.postModelArrayList.addAll(post);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.vh_post,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.bind(postModelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return postModelArrayList.size();
    }
}
