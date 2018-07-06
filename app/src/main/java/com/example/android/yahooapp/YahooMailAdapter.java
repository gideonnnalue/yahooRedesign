package com.example.android.yahooapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class YahooMailAdapter extends RecyclerView.Adapter<YahooMailAdapter.ViewHolder> {

    private List<YahooModel> mYahooModel;

    public YahooMailAdapter(List<YahooModel> yahooModel) {
        this.mYahooModel = yahooModel;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View yahooMails = inflater.inflate(R.layout.yahoo_layout, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(yahooMails);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        YahooModel yahooModel = mYahooModel.get(position);

        holder.conversationView.setText(yahooModel.getConversations());
        holder.siteView.setText(yahooModel.getSites());
        holder.timeView.setText(yahooModel.getTime());

    }

    @Override
    public int getItemCount() {
        return mYahooModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView conversationView;
        public TextView siteView;
        public TextView timeView;

        public ViewHolder(View itemView) {
            super(itemView);

            conversationView = (TextView) itemView.findViewById(R.id.conversations_view);
            siteView = (TextView) itemView.findViewById(R.id.site_view);
            timeView = (TextView) itemView.findViewById(R.id.time_view);
        }
    }
}
