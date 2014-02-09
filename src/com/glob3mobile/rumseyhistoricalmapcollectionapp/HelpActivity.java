/**
 * 
 */


package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;


/**
 * @author mdelacalle
 * 
 */
public class HelpActivity
         extends
            Activity {
   @Override
   protected void onCreate(final Bundle savedInstanceState) {

      super.onCreate(savedInstanceState);

      final ActionBar actionBar = getActionBar();
      actionBar.setTitle("");

      setContentView(R.layout.helplayout);


      final WebView helpWebView = (WebView) findViewById(R.id.helpWebView);
      final WebSettings webSettings = helpWebView.getSettings();
      webSettings.setJavaScriptEnabled(true);
      webSettings.setAllowFileAccessFromFileURLs(true);
      webSettings.setAllowUniversalAccessFromFileURLs(true);
      helpWebView.loadUrl("file:///android_asset/help.html");


   }
}
