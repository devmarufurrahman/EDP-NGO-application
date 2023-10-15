package com.example.edpngo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.edpngo.adapter.NotificationListAdapter;
import com.example.edpngo.utils.NotificationListData;

import java.util.ArrayList;

public class Notification extends AppCompatActivity {

    NotificationListAdapter notificationListAdapter;
    ArrayList<NotificationListData> dataArrayList = new ArrayList<>();
    NotificationListData listData;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        listView = findViewById(R.id.listViewNotification);

        // toolbar
        Toolbar toolbar = findViewById(R.id.notificationToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Notifications");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        int[] imgList = {R.drawable.avatar_image, R.drawable.avatar_image, R.drawable.avatar_image} ;
        String[] title = {getString(R.string.esl_english),getString(R.string.home_health_aide),getString(R.string.computer_courses),} ;
        String[] desc = {getString(R.string.english_desc),getString(R.string.english_desc),getString(R.string.health_desc),} ;
        String[] time = {"2023-10-15 11:15, 2 days ago", "2023-10-15 11:15, 2 days ago", "2023-10-15 11:15, 2 days ago"} ;


        for(int i = 0; i<imgList.length; i++){
            listData = new NotificationListData(title[i], desc[i], time[i], imgList[i]);
            dataArrayList.add(listData);
        }

        notificationListAdapter = new NotificationListAdapter(Notification.this,dataArrayList);
        listView.setAdapter(notificationListAdapter);
        listView.setClickable(true);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}