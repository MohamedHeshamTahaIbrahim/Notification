package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class BigTextStyleNotification {
    private static final int NOTIFICATION_ID_BIG_TEXT = 4;
    public static void bigTextStyleNotification(Context context){
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationCompat.BigTextStyle bigTextNotification = new NotificationCompat.BigTextStyle();
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setSmallIcon(R.drawable.ic_launcher);
        nc.setAutoCancel(true);
        nc.setContentTitle("Big Text Style");
        nc.setContentText("Big Text Style Content");

        bigTextNotification.setBigContentTitle("New Big Text Title");
        bigTextNotification.bigText("Starting with Jelly Bean, Android supports optional actions that are displayed at the bottom of the notification. With actions, users can handle the most common tasks for a particular notification from within the notification shade without having to open the originating application. This speeds up interaction and, in conjunction with swipe-to-dismiss, helps users to streamline their notification triaging experience.");
        bigTextNotification.setSummaryText("By: http://developer.android.com/");
        nc.setStyle(bigTextNotification);

        nm.notify(NOTIFICATION_ID_BIG_TEXT, nc.build());
    }
}
