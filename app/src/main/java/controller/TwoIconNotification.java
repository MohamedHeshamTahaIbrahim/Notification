package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class TwoIconNotification {
    private static final int NOTIFICATION_ID_TWO_ICONS = 2;
    public static void twoIconNotification(Context context){
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setSmallIcon(R.drawable.ic_action_call);
        nc.setAutoCancel(true);
        nc.setContentTitle("Two Icon Notification");
        nc.setContentText("Showing two icon content");
        nc.setLargeIcon(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_action_person));
        nc.setTicker("Ticker 2");
        nc.setNumber(3);

        nm.notify(NOTIFICATION_ID_TWO_ICONS, nc.build());
    }
}
