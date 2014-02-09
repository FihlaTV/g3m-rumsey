

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.os.Bundle;
import android.widget.LinearLayout;


public class Beijing1930Activity
         extends
            BaseActivity {

   /*
      <north>39.96746778</north>
      <south>39.85771179</south>
      <east>116.44441366</east>
      <west>116.34060144</west>
   */

   final static Geodetic2D lower      = new Geodetic2D( //
                                               Angle.fromDegrees(39.85771179), //
                                               Angle.fromDegrees(116.34060144));
   final static Geodetic2D upper      = new Geodetic2D( //
                                               Angle.fromDegrees(39.96746778), //
                                               Angle.fromDegrees(116.44441366));


   public static Sector    _demSector = new Sector(lower, upper);


   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simply_g3m_layout);

      final G3MBuilder_Android builder = new G3MBuilder_Android(this);


      final LayerSet layerset = RumseyCollectionLayerBuilder.createLayerset();
      layerset.disableAllLayers();
      layerset.getLayerByTitle("Map Box Aerial").setEnable(true);
      layerset.getLayerByTitle("Beijing1930").setEnable(true);

      builder.getPlanetRendererBuilder().setLayerSet(layerset);
      builder.setShownSector(_demSector);
      final G3MWidget_Android g3mWidget = builder.createWidget();

      final LinearLayout layout = (LinearLayout) findViewById(R.id.glob3);
      layout.addView(g3mWidget);
   }

}
