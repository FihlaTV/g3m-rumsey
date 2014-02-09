

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;


public class BaseActivity
         extends
            Activity {


   @Override
   public boolean onCreateOptionsMenu(final Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);


      final MenuItem settings = menu.findItem(R.id.action_about);
      settings.setOnMenuItemClickListener(new OnMenuItemClickListener() {

         @Override
         public boolean onMenuItemClick(final MenuItem item) {
            final Intent intent = new Intent(BaseActivity.this, HelpActivity.class);
            startActivity(intent);
            return false;
         }
      });


      return true;
   }


   @Override
   public void onBackPressed() {
      System.exit(0);
   }

}
