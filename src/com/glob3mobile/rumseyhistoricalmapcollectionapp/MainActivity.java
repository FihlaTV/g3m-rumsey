

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity
         extends
            Activity {

   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      final ActionBar actionBar = getActionBar();
      actionBar.setTitle("");

      setContentView(R.layout.activity_main);

      final Button italy1800 = (Button) findViewById(R.id.italy1800);

      italy1800.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Italy1800Activity.class);
            startActivity(intent);
         }
      });


      final Button ny1852 = (Button) findViewById(R.id.ny1852);

      ny1852.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), NewYork1852Activity.class);
            startActivity(intent);
         }
      });


      final Button Washington1851 = (Button) findViewById(R.id.washington1851);

      Washington1851.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), WashingtonDC1851Activity.class);
            startActivity(intent);
         }
      });

      final Button Spain1701 = (Button) findViewById(R.id.spain1701);

      Spain1701.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Spain1701Activity.class);
            startActivity(intent);
         }
      });

      final Button Argentina1867 = (Button) findViewById(R.id.argentina1867);

      Argentina1867.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Argentina1867Activity.class);
            startActivity(intent);
         }
      });


      final Button Russia1794 = (Button) findViewById(R.id.russia1794);

      Russia1794.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Russia1794Activity.class);
            startActivity(intent);
         }
      });


      final Button Beijin1930 = (Button) findViewById(R.id.beijing1930);

      Beijin1930.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Beijing1930Activity.class);
            startActivity(intent);
         }
      });


      final Button Colombia1840 = (Button) findViewById(R.id.colombia1840);

      Colombia1840.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Colombia1840Activity.class);
            startActivity(intent);
         }
      });


      final Button NA1786 = (Button) findViewById(R.id.na1786);

      NA1786.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), NorthAmerica1786Activity.class);
            startActivity(intent);
         }
      });

      final Button Berlin1860 = (Button) findViewById(R.id.berlin1860);

      Berlin1860.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Berlin1860Activity.class);
            startActivity(intent);
         }
      });

      final Button Congo1708 = (Button) findViewById(R.id.congo1708);

      Congo1708.setOnClickListener(new OnClickListener() {
         @Override
         public void onClick(final View v) {
            final Intent intent = new Intent(getApplicationContext(), Congo1708Activity.class);
            startActivity(intent);
         }
      });


   }


   @Override
   public boolean onCreateOptionsMenu(final Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);


      final MenuItem settings = menu.findItem(R.id.action_about);
      settings.setOnMenuItemClickListener(new OnMenuItemClickListener() {

         @Override
         public boolean onMenuItemClick(final MenuItem item) {
            final Intent intent = new Intent(MainActivity.this, HelpActivity.class);
            startActivity(intent);
            return false;
         }
      });


      return true;
   }

}
