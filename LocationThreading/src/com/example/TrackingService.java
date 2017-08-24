package com.example;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.*;
import android.util.Log;

/**
 * Created by IntelliJ IDEA.
 * User: Jim
 * Date: 1/22/13
 * Time: 12:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrackingService extends Service{
    final static String LOGTAG = "Location Monitoring";

    //Start tracking service
    public final static String ACTION_START_MONITORING = "com.pluralsight.START_MONITORING";
    //Stop tracking service
    public final static String ACTION_STOP_MONITORING = "com.pluralsight.STOP_MONITORING";
    private final static String HANDLER_THREAD_NAME = "MyLocationThread";

    LocationListener _listener;
    Looper _looper;
    android.os.Handler _handler;

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(LOGTAG, "Location Monitoring Service onStartCommand - " + LogHelper.threadId());

        String action = intent.getAction();
        Log.d(LOGTAG, "Location Service onStartCommand Action:" + action);

        if(action.equals(ACTION_START_MONITORING)) {
            doStartTracking();
        }
        else if(action.equals(ACTION_STOP_MONITORING)) {
            doStopTracking();
            stopSelf();
        }

        return START_STICKY;
    }

    private void doStartTracking() {

    }

    private void doStopTracking() {

    }

    public IBinder onBind(Intent intent) {
        return null;
    }

}
