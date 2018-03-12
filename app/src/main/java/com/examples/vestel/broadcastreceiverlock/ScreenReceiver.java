package com.examples.vestel.broadcastreceiverlock;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by vestel on 12.03.2018.
 */

public class ScreenReceiver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_SCREEN_OFF)){
            Log.e("Lock", "Offffffffffffffffffffffffffffff");

        }else if (intent.getAction().equals(Intent.ACTION_SCREEN_ON)){
            Log.e("Lock","ONNNNNNNNNNNN");

        }
    }
}
