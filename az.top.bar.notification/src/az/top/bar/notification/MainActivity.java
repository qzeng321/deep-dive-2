package az.top.bar.notification;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    protected void showNotification() {
    // Get NotificationManager service.
    NotificationManager nm = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);

    // Get message details.
    String from = this.getString(R.string.app_name);
    String message = this.getString(R.string.message);
        
    // Create PendingIntent to launch activity if user selects notification.
    PendingIntent contentIntent = PendingIntent.getActivity(this, 0,
            new Intent(this, amiproud.class), 0);

    // Construct Notification.
    Notification notif = new Notification(R.drawable.icon, message,
            System.currentTimeMillis());

    // Set info for views that show in notification top panel.
    notif.setLatestEventInfo(this, from, message, contentIntent);

    // Buzz a bit
    // Make sure your Android Manifest has <uses-permission android:name="android.permission.VIBRATE" />
    notif.vibrate = new long[] { 200, 500, 100, 250};

    // Note that we use R.string.app_name as the ID for
    // the notification.  It could be any integer you want, but we use
    // the convention of using a resource id for a string related to
    // the notification.  It will always be a unique number within your
    // application.
    nm.notify(R.string.app_name, notif);
}
    
}
