package com.example.motionlayoutpractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class SimpleTextAdapter extends RecyclerView.Adapter {
    public void setStringArrayList(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    private ArrayList<String> stringArrayList;

    public SimpleTextAdapter(ArrayList<String> stringArrayList) {
        this.stringArrayList = stringArrayList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.base_simple_text_item, parent, false);
        TextViewHolder textViewHolder = new TextViewHolder(itemView);
        return textViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((TextViewHolder) holder).simpleText.setText(stringArrayList.get(position));
        ((TextViewHolder) holder).simpleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(litener != null){
                    litener.onClick(stringArrayList.get(position));
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return stringArrayList.size();
    }

    static class TextViewHolder extends RecyclerView.ViewHolder {
        TextView simpleText;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            simpleText = itemView.findViewById(R.id.simple_text);
        }
    }


    public void setLitener(TextClickLitener litener) {
        this.litener = litener;
    }

    private TextClickLitener litener;
    public interface TextClickLitener{
        void onClick(String text);
    }
}
