package controller;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.rytalo.notification.R;

import Listener.ListenerSet;

/**
 * Created by محمد on 09/03/2016.
 */
public class CustomBigNotification {
    static String songName = "Now You're Gone";
    static String albumName = "Now Youre Gone - The Album";
    private static final int NOTIFICATION_ID_CUSTOM_BIG = 8;
    @SuppressLint("NewApi")
    public static void customBigNotification(Context context) {
        ListenerSet listenerSet=new ListenerSet();
        RemoteViews expandedView = new RemoteViews(context.getPackageName(), R.layout.big_notification);

        Notification notification = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Custom Big View").build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notification.bigContentView = expandedView;
        notification.bigContentView.setTextViewText(R.id.textSongName, songName);
        notification.bigContentView.setTextViewText(R.id.textAlbumName, albumName);
    listenerSet.setListeners(expandedView, context);


        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(NOTIFICATION_ID_CUSTOM_BIG, notification);
    }
}
