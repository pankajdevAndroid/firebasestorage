package com.pankaj.firebase.storage.utils;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.pankaj.firebase.storage.BuildConfig;
import com.pankaj.firebase.storage.R;


/**
 * Created by pankaj on 11/01/17.
 */

public class L {

    public static String TAG = "Fire Demo:-->";
    public static Dialog dialogOkAlert;



    /* Hide/Show General OK Alert Dialog */
    public static void generalOkAlert(final Context context, String message) {
        hideOkAlert();
        DialogInterface.OnClickListener diaOnClickListener = new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        dialogOkAlert = builder.setMessage(message)
                .setPositiveButton(context.getResources().getString(R.string.button_cap_ok), diaOnClickListener)
                .setTitle(context.getResources().getString(R.string.app_name))
                .show();
    }

    public static void hideOkAlert() {
        if (dialogOkAlert != null && dialogOkAlert.isShowing())
            dialogOkAlert.dismiss();
    }


}
