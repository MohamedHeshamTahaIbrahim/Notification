package com.rytalo.notification;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;
public class MainActivity extends Activity {

    Button btnNotification1, btnNotification2, btnNotification3, btnNotification4, btnNotification5,
            btnNotification6, btnNotification7, btnNotification8, btnNotification9,btnNotification10;
    String img="http://admin.mangomolo.com/analytics/Recorder/97/2016-01-13/studioUGMQQ.mp426461.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNotification1 = (Button) findViewById(R.id.btnNotification1);
        btnNotification2 = (Button) findViewById(R.id.btnNotification2);
        btnNotification3 = (Button) findViewById(R.id.btnNotification3);
        btnNotification4 = (Button) findViewById(R.id.btnNotification4);
        btnNotification5 = (Button) findViewById(R.id.btnNotification5);
        btnNotification6 = (Button) findViewById(R.id.btnNotification6);
        btnNotification7 = (Button) findViewById(R.id.btnNotification7);
        btnNotification8 = (Button) findViewById(R.id.btnNotification8);
        btnNotification9 = (Button) findViewById(R.id.btnNotification9);
        btnNotification10 = (Button) findViewById(R.id.btnNotification10);

        btnNotification1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                NotificationGenerator.simpleNotification(getApplicationContext());
            }
        });
        btnNotification2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.openActivityNotification(getApplicationContext());
            }
        });
        btnNotification3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.twoIconNotification(getApplicationContext());
            }
        });
        btnNotification4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.bigPictureNotification(getApplicationContext());
            }
        });
        btnNotification5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.bigTextStyleNotification(getApplicationContext());
            }
        });
        btnNotification6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.chatStyleNotification(getApplicationContext());
            }
        });
        btnNotification7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.actionButtonNotification(getApplicationContext());
            }
        });
        btnNotification8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.customSimpleNotification(getApplicationContext());
            }
        });
        btnNotification9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.customBigNotification(getApplicationContext());
            }
        });
        btnNotification10.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                NotificationGenerator.customBigNotificationurl(getApplicationContext());
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
