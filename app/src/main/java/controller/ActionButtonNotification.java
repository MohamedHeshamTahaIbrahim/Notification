package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class ActionButtonNotification {
    private static final int NOTIFICATION_ID_ACTION_BUTTON = 6;
    public static void actionButtonNotification(Context context) {
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationCompat.BigTextStyle bigTextNotification = new NotificationCompat.BigTextStyle();
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setSmallIcon(R.drawable.ic_action_end_call);
        nc.setAutoCancel(true);
        nc.setContentTitle("Big Text Style Button");
        nc.setContentText("(900)022-3365");
        nc.addAction(R.drawable.ic_action_call, "Call back", null);
        nc.addAction(R.drawable.ic_action_chat, "Message", null);

        bigTextNotification.setBigContentTitle("New Big Text Title");
        bigTextNotification.bigText("Missed call from (900)022-3365");
        nc.setStyle(bigTextNotification);

        nm.notify(NOTIFICATION_ID_ACTION_BUTTON, nc.build());
    }
}
