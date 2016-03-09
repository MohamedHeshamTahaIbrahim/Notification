package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class ChatStyleNotification {
    private static final int NOTIFICATION_ID_CHAT = 5;
    public static void chatStyleNotification(Context context) {
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        String[] lines = new String[7];
        lines[0] = "David@ Hi Howard";
        lines[1] = "Howard@ Hi David";
        lines[2] = "David@ What is the agenda for the upcoming meeting?";
        lines[3] = "Howard@ I will send you a copy";
        lines[4] = "David@ Thank you";
        lines[5] = "Howard@ I will talk to you later";
        lines[6] = "David@ Bye for now";

        nc.setSmallIcon(R.drawable.ic_launcher);
        nc.setAutoCancel(true);
        nc.setContentTitle("Chat Text");
        nc.setContentText(lines[0]);
        nc.setNumber(7);

        for (int i = 0; i < lines.length; i++) {
            inboxStyle.addLine(lines[i]);
        }
        inboxStyle.setBigContentTitle("New Chat Title");
        inboxStyle.setSummaryText("7 messages from 2 conversations.");
        nc.setStyle(inboxStyle);

        nm.notify(NOTIFICATION_ID_CHAT, nc.build());
    }
}
