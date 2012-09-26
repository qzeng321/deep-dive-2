package az.top.bar.notification2;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.app.Notification.Builder;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    String ns = Context.NOTIFICATION_SERVICE;
    NotificationManager mNotificationManager = (NotificationManager) getSystemService(ns);
    
    int icon = R.drawable.notification_icon;
    CharSequence tickerText = "Hello";
    long when = System.currentTimeMillis();

Notification notification = new Notification(icon, tickerText, when);

Context context = getApplicationContext();
CharSequence contentTitle = "My notification";
CharSequence contentText = "Hello World!";
Intent notificationIntent = new Intent(this, MyClass.class);
PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent, 0);

notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);

private static final int HELLO_ID = 1;

nm.notify(Hello_ID, notification);
}

