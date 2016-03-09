package controller;

import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;

import com.rytalo.notification.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by محمد on 09/03/2016.
 */
public class BigPictureNotificationURL {
    private static final int NOTIFICATION_ID_BIG_PI= 10;
  public static  Bitmap bitmap = getBitmapFromURL("http://admin.mangomolo.com/analytics/Recorder/97/2016-01-13/studioUGMQQ.mp426461.jpg");
    public static void bigPictureNotification(Context context) {
        NotificationCompat.Builder nc = new NotificationCompat.Builder(context);
        NotificationCompat.BigPictureStyle bigPictureNotification = new NotificationCompat.BigPictureStyle();
        NotificationManager nm = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        nc.setLargeIcon(bitmap);
        nc.setAutoCancel(true);
        nc.setContentTitle("Big Picture Style");
        nc.setContentText("Big Picture Style Content");
        nc.addAction(R.drawable.ic_action_share, "Share", null);

        bigPictureNotification.bigPicture(BitmapFactory.decodeResource(context.getResources(), R.drawable.big_img));
        bigPictureNotification.setBigContentTitle("New Big Picture Title");
        nc.setStyle(bigPictureNotification);

        nm.notify(NOTIFICATION_ID_BIG_PI, nc.build());
    }
    public static Bitmap getBitmapFromURL(String strURL) {
        try {
            URL url = new URL(strURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
