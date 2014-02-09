

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;


public class Argentina1867Activity
         extends
            Activity {

   /*
      <north>-15.39184570</north>
      <south>-44.04418945</south>
      <east>-47.55432129</east>
      <west>-77.36297607</west>
   */

   final static Geodetic2D lower      = new Geodetic2D( //
                                               Angle.fromDegrees(-44.04418945), //
                                               Angle.fromDegrees(-77.36297607));
   final static Geodetic2D upper      = new Geodetic2D( //
                                               Angle.fromDegrees(-15.39184570), //
                                               Angle.fromDegrees(-47.55432129));


   public static Sector    _demSector = new Sector(lower, upper);


   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simply_g3m_layout);

      final G3MBuilder_Android builder = new G3MBuilder_Android(this);


      final LayerSet layerset = RumseyCollectionLayerBuilder.createLayerset();
      layerset.disableAllLayers();
      layerset.getLayerByTitle("Map Box Aerial").setEnable(true);
      layerset.getLayerByTitle("Argentina1867").setEnable(true);

      builder.getPlanetRendererBuilder().setLayerSet(layerset);
      builder.setShownSector(_demSector);
      final G3MWidget_Android g3mWidget = builder.createWidget();

      final LinearLayout layout = (LinearLayout) findViewById(R.id.glob3);
      layout.addView(g3mWidget);
   }


   @Override
   public boolean onCreateOptionsMenu(final Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }


   @Override
   public void onBackPressed() {
      System.exit(0);
   }


}
