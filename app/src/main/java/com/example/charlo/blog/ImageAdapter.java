package com.example.charlo.blog;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private Context mContext;
    private List<Uploads> mUploads;



    public ImageAdapter(Context mContext, List<Uploads> mUploads) {
        this.mContext = mContext;
        this.mUploads = mUploads;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(mContext).inflate(R.layout.images_item,viewGroup,false);
        return new ImageViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int i) {

        Uploads mUploadCurrent = mUploads.get(i);
        imageViewHolder.txtdecription.setText(mUploadCurrent.getDescription());
        imageViewHolder.txtprice.setText(mUploadCurrent.getPrice());
        Picasso.get()
                .load(mUploadCurrent.getmImageUrl())
                .resize(3500, 2500)
                .centerCrop()
                .into(imageViewHolder.image_View);

    }

    @Override
    public int getItemCount() {
        return mUploads.size();
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {
        TextView txtdecription, txtprice;
        ImageView image_View;
        public ImageViewHolder( View itemView) {
            super(itemView);

            txtdecription = itemView.findViewById(R.id.txtView_description);
            txtprice = itemView.findViewById(R.id.txtView_price);
            image_View = itemView.findViewById(R.id.View_ImageView);

        }

    }

}
