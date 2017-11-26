package com.example.crazy.plan;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.crazy.plan.model.Student;

import java.util.ArrayList;

/**
 * Created by Crazy on 2017/4/27.
 */

public class ListAdapter extends BaseAdapter  {

    private ArrayList<Student> mStudents;
    private Context mContext;

    public ListAdapter(Context context, ArrayList<Student> students) {
        mContext = context;
        mStudents = students;
    }

    @Override
    public int getCount() {
        return mStudents == null ? 0 : mStudents.size();
    }

    @Override
    public Object getItem(int position) {
        return mStudents == null ? null : mStudents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.item_student, null);
            viewHolder = new ViewHolder();
            viewHolder.nameTv = (TextView) convertView.findViewById(R.id.tv_name);
            viewHolder.ageTv = (TextView) convertView.findViewById(R.id.tv_age);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.nameTv.setText(mStudents.get(position).getName());
        viewHolder.ageTv.setText(mStudents.get(position).getAge() + "");

        return convertView;
    }

    class ViewHolder {
        TextView nameTv;
        TextView ageTv;
    }
}
