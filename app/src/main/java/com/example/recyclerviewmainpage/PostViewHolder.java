package com.example.recyclerviewmainpage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import de.hdodenhof.circleimageview.CircleImageView;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private ImageView postImage;
    private CircleImageView filialLogo;

    private TextView filialName;
    private TextView categoryName;
    private TextView transactonsAmount;
    private TextView period;
    private TextView cashbackAmount;

    private String templateForPeriod;

    public PostViewHolder(@NonNull View itemView) {
        super(itemView);
        postImage = itemView.findViewById(R.id.post_image);
        filialLogo = itemView.findViewById(R.id.filial_logo);
        filialName = itemView.findViewById(R.id.filial_name);
        categoryName = itemView.findViewById(R.id.category_name);
        transactonsAmount = itemView.findViewById(R.id.transactions_amount);
        period = itemView.findViewById(R.id.period);
        cashbackAmount = itemView.findViewById(R.id.cashback_amount);

        templateForPeriod = itemView.getResources().getString(R.string.period);
    }

    public void bind(PostModel postModel) {

        filialName.setText(postModel.getFilialName());
        categoryName.setText(postModel.getCashbackAmount());
        transactonsAmount.setText(postModel.getTransactionsAmount());
        String periodStr = String.format(templateForPeriod, postModel.getPeriod());
        period.setText(periodStr);
        cashbackAmount.setText(postModel.getCashbackAmount());
    }
}