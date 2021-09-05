package com.example.retrofit2_lyold_video;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostViewHolder extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private TextView mtvEmail;
    private TextView mtvPost;
    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvName = itemView.findViewById(R.id.tvName);
        mtvEmail = itemView.findViewById(R.id.tvEmail);
        mtvPost = itemView.findViewById(R.id.tvBody);
    }
    public void setData(ResponseModel responseModel){
        mtvName.setText(responseModel.getName());
        mtvEmail.setText(responseModel.getEmail());
       // mtvPost.setText(responseModel.getBody());
    }

}
