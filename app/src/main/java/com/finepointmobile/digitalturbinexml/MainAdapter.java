package com.finepointmobile.digitalturbinexml;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by danielmalone on 7/22/17.
 */

class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Ads mAds;

    public MainAdapter(Ads ads) {
        mAds = ads;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MainAdapter.ViewHolder holder, int position) {
        holder.mTitle.setText("asdf");
    }

    @Override
    public int getItemCount() {
        return mAds.getAds().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.title);
        }
    }
}
