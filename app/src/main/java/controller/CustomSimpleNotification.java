package controller;

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
public class CustomSimpleNotification {
    static String songName = "Now You're Gone";
    static String albumName = "Now Youre Gone - The Album";
    private static final int NOTIFICATION_ID_CUSTOM_SIMPLE = 7;
    public static void customSimpleNotification(Context context) {
        ListenerSet listenerSet=new ListenerSet();
        RemoteViews simpleView = new RemoteViews(context.getPackageName(), R.layout.custom_notification);

        Notification notification = new NotificationCompat.Builder(context)
                .setSmallIcon(R.drawable.ic_launcher)
                .setContentTitle("Custom Big View").build();
        notification.flags |= Notification.FLAG_AUTO_CANCEL;
        notification.contentView = simpleView;
        notification.contentView.setTextViewText(R.id.textSongName, songName);
        notification.contentView.setTextViewText(R.id.textAlbumName, albumName);
        listenerSet.setListeners(simpleView,context);


        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        nm.notify(NOTIFICATION_ID_CUSTOM_SIMPLE, notification);
    }
}
