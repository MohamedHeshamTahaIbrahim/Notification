package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

/**
 * Created by محمد on 09/03/2016.
 */
public class BigPictureNotification {
    private static final int NOTIFICATION_ID_BIG_PIC = 3;
    public static void bigPictureNotification(Context context) {
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationCompat.BigPictureStyle bigPictureNotification = new NotificationCompat.BigPictureStyle();
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setSmallIcon(R.drawable.ic_launcher);
        nc.setAutoCancel(true);
        nc.setContentTitle("Big Picture Style");
        nc.setContentText("Big Picture Style Content");
        nc.addAction(R.drawable.ic_action_share, "Share", null);

        bigPictureNotification.bigPicture(BitmapFactory.decodeResource(context.getResources(), R.drawable.big_img));
        bigPictureNotification.setBigContentTitle("New Big Picture Title");
        nc.setStyle(bigPictureNotification);

        nm.notify(NOTIFICATION_ID_BIG_PIC, nc.build());
    }

}
