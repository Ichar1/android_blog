package com.example.charlo.blog;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ViewHolder extends RecyclerView.ViewHolder {

    View mView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);

        mView = itemView;
    }

    public void setDetails (Context ctx, String description, String price, String image){
        TextView txtdecsrpt = mView.findViewById(R.id.description);
        TextView txtprice = mView.findViewById(R.id.Price);
        ImageView imgView = mView.findViewById(R.id.Postimage_view);
        txtdecsrpt.setText(description);
        txtprice.setText(price);
        Picasso.get().load(image).into(imgView);

    }
}
