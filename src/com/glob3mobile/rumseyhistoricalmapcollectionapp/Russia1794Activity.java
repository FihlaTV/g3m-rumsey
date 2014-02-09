

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.os.Bundle;
import android.widget.LinearLayout;


public class Russia1794Activity
         extends
            BaseActivity {

   /*
      <north>82.84790039</north>
      <south>31.58020020</south>
      <east>180.00000000</east>
      <west>-180.00000000</west>
   */

   final static Geodetic2D lower      = new Geodetic2D( //
                                               Angle.fromDegrees(31.58020020), //
                                               Angle.fromDegrees(-180.000000));
   final static Geodetic2D upper      = new Geodetic2D( //
                                               Angle.fromDegrees(82.84790039), //
                                               Angle.fromDegrees(180.00000000));


   public static Sector    _demSector = new Sector(lower, upper);


   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simply_g3m_layout);

      final G3MBuilder_Android builder = new G3MBuilder_Android(this);


      final LayerSet layerset = RumseyCollectionLayerBuilder.createLayerset();
      layerset.disableAllLayers();
      layerset.getLayerByTitle("Map Box Aerial").setEnable(true);
      layerset.getLayerByTitle("Russia1794").setEnable(true);

      builder.getPlanetRendererBuilder().setLayerSet(layerset);
      //  builder.setShownSector(_demSector);
      final G3MWidget_Android g3mWidget = builder.createWidget();

      final LinearLayout layout = (LinearLayout) findViewById(R.id.glob3);
      layout.addView(g3mWidget);
   }


}
