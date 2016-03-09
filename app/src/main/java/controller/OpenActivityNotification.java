package controller;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.MainActivity;
import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class OpenActivityNotification {
    private static final int NOTIFICATION_ID_OPEN_ACTIVITY = 9;
    public static void openActivityNotification(Context context){

        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        // Creates an Intent for the Activity
        Intent notifyIntent = new Intent(context, MainActivity.class);
        // Sets the Activity to start in a new, empty task
        notifyIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        // Creates the PendingIntent
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
        nc.setContentIntent(pendingIntent);

        nc.setSmallIcon(R.drawable.ic_action_call);
        nc.setAutoCancel(true);
        nc.setContentTitle("Click to open Activity");
        nc.setContentText("Click please");

        nm.notify(NOTIFICATION_ID_OPEN_ACTIVITY, nc.build());
    }
}
