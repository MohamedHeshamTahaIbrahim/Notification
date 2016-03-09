package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class SimpleNotification {
    private static final int NOTIFICATION_ID_SIMPLE = 1;
    public static void simpleNotification(Context context ){
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationManager nm = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setSmallIcon(R.drawable.ic_action_call);
        nc.setAutoCancel(true);
        nc.setContentTitle("Simple Notification");
        nc.setContentText("Showing notification content");
        nc.setTicker("Ticker 1");
        nc.setNumber(2);

        nm.notify(NOTIFICATION_ID_SIMPLE, nc.build());
    }
}
