package com.finepointmobile.digitalturbinexml;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by danielmalone on 7/22/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Ads mAds;
    Context mContext;

    public MainAdapter(Ads ads, Context context) {
        mAds = ads;
        mContext = context;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText(mAds.getAds().get(position).getProductName());
        Picasso.with(mContext).load(mAds.getAds().get(position).getProductThumbnail()).into(holder.mImage);
    }

    @Override
    public int getItemCount() {
        return mAds.getAds().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTitle;
        public ImageView mImage;

        public ViewHolder(View itemView) {
            super(itemView);

            mTitle = (TextView) itemView.findViewById(R.id.title);
            mImage = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
