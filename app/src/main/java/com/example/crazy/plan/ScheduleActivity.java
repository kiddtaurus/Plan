package com.example.crazy.plan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.crazy.plan.model.Student;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

//    ListView listView;
//    String [] titles={"标题1","标题2","标题3","标题4"};
//    String [] texts={"文本内容A","文本内容B","文本内容C","文本内容D"};
//    int [] resIds={R.drawable.icon,R.drawable.icon,R.drawable.icon,R.drawable.icon};

    ListView mListView;
    ListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);


        mListView = (ListView) findViewById(R.id.lv_contents);

        // 假数据
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge(i);
            student.setName("Student" + i);
            student.setSex("M");

            students.add(student);
        }

        mAdapter = new ListAdapter(this, students);
        mListView.setAdapter(mAdapter);
    }

//    public class ListViewAdapter extends BaseAdapter{
//        View [] itemViews;
//
//        public ListViewAdapter(String [] itemTitles, String [] itemTexts,
//                               int [] itemImageRes){
//            itemViews = new View[itemTitles.length];
//
//            for (int i=0; i<itemViews.length; ++i){
//                itemViews[i] = makeItemView(itemTitles[i], itemTexts[i],
//                        itemImageRes[i]);
//            }
//        }
//
//        public int getCount()	{
//            return itemViews.length;
//        }
//
//        public View getItem(int position)	{
//            return itemViews[position];
//        }
//
//        public long getItemId(int position) {
//            return position;
//        }
//
//        private View makeItemView(String strTitle, String strText, int resId) {
//            LayoutInflater inflater = (LayoutInflater)ScheduleActivity.this
//                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//            // 使用View的对象itemView与R.layout.item关联
//            View itemView = inflater.inflate(R.layout.listview_item, null);
//
//            // 通过findViewById()方法实例R.layout.item内各组件
//            TextView title = (TextView)itemView.findViewById(R.id.itemTitle);
//            title.setText(strTitle);
//            TextView text = (TextView)itemView.findViewById(R.id.itemText);
//            text.setText(strText);
//            ImageView image = (ImageView)itemView.findViewById(R.id.itemImage);
//            image.setImageResource(resId);
//
//            return itemView;
//        }
//
//        public View getView(int position, View convertView, ViewGroup parent) {
//            if (convertView == null)
//                return itemViews[position];
//            return convertView;
//        }
//    }
}
