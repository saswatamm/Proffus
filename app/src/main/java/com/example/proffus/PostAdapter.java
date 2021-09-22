package com.example.proffus;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder>{
    private List<PostItem> postItem;
    public PostAdapter(List<PostItem> postItem) {
        this.postItem = postItem;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PostViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.post_item_container,parent,false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        holder.setPostImageView(postItem.get(position));
    }

    @Override
    public int getItemCount() {
        return postItem.size();
    }


    class PostViewHolder extends RecyclerView.ViewHolder {

        RoundedImageView postImageView;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);
            postImageView = itemView.findViewById(R.id.imagePost);

        }
        void setPostImageView(PostItem postItem)
        {
            postImageView.setImageResource(postItem.getImage());
        }
    }
}
