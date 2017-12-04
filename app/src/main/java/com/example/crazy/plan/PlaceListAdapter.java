package com.example.crazy.plan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.crazy.plan.model.Place;

import java.util.ArrayList;

/**
 * Created by Crazy on 2017/11/22.
 */

public class PlaceListAdapter extends BaseAdapter {

    private ArrayList<Place> mArrayListPlace;
    private Context mContext;

    public PlaceListAdapter(Context context, ArrayList<Place> arrayListPlace) {
        mContext = context;
        mArrayListPlace = arrayListPlace;
    }

    @Override
    public int getCount() {
        return mArrayListPlace == null ? 0 : mArrayListPlace.size();
    }

    @Override
    public Object getItem(int position) {
        return mArrayListPlace == null ? null : mArrayListPlace.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PlaceListAdapter.ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_place, null);
            viewHolder = new PlaceListAdapter.ViewHolder();
            viewHolder.tv_placeId = (TextView) convertView.findViewById(R.id.tv_placeId);
            viewHolder.tv_addr = (TextView) convertView.findViewById(R.id.tv_addr);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (PlaceListAdapter.ViewHolder) convertView.getTag();
        }

        viewHolder.tv_placeId.setText(mArrayListPlace.get(position).getPlaceId() + "");
        viewHolder.tv_addr.setText(mArrayListPlace.get(position).getAddr() + "");

        return convertView;
    }

    class ViewHolder {
        TextView tv_placeId;
        TextView tv_addr;
    }
}
