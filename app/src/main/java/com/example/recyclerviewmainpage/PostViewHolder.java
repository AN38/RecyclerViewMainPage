package com.example.recyclerviewmainpage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import de.hdodenhof.circleimageview.CircleImageView;

import static java.lang.String.valueOf;

public class PostViewHolder extends RecyclerView.ViewHolder {

    private ImageView postImage;
    private CircleImageView filialLogo;

    private TextView filialName;
    private TextView categoryName;
    private TextView transactonsAmount;
    private TextView period;
    private TextView cashbackAmount;

    private String templateForPeriod;
    private String templateForCashback;
    private String templateForTransactions;

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
        templateForCashback = itemView.getResources().getString(R.string.cashback_amount);
        templateForTransactions = itemView.getResources().getString(R.string.transactions_amount);
    }

    public void bind(PostModel postModel) {

        String transactions = String.format(templateForTransactions,postModel.getTransactionsAmount());
        String periodStr = String.format(templateForPeriod, postModel.getPeriod());
        String cashbackStr = String.format(templateForCashback,postModel.getCashbackAmount());

        filialName.setText(postModel.getFilialName());
        categoryName.setText(postModel.getFilialName());
        transactonsAmount.setText(transactions);
        period.setText(periodStr);
        cashbackAmount.setText(cashbackStr);
        Glide.with(itemView).load(postModel.getImageUrl()).into(postImage);
        Glide.with(itemView).load(postModel.getLogoUrl()).into(filialLogo);
    }
}