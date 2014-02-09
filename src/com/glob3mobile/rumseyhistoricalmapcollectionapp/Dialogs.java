

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


public class Dialogs {


   public static void showNetworkError(final Context context) {
      final AlertDialog.Builder builder = new AlertDialog.Builder(context);
      builder.setTitle("Network Message").setMessage(context.getString(R.string.networkError)).setCancelable(false).setNegativeButton(
               "Continue", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(final DialogInterface dialog,
                                      final int id) {
                     dialog.cancel();
                     System.exit(0);
                  }
               });
      final AlertDialog alert = builder.create();
      alert.show();
   }


   protected static String getStringFromResources(final Context context,
                                                  final int i) {
      return context.getResources().getString(i);
   }

}
