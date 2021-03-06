

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.os.Bundle;
import android.widget.LinearLayout;


public class Berlin1860Activity
         extends
            BaseActivity {

   /*
      <north>52.54063368</north>
      <south>52.47540236</south>
      <east>13.46885204</east>
      <west>13.32832575</west>
   */

   final static Geodetic2D lower      = new Geodetic2D( //
                                               Angle.fromDegrees(52.47540236), //
                                               Angle.fromDegrees(13.32832575));
   final static Geodetic2D upper      = new Geodetic2D( //
                                               Angle.fromDegrees(52.54063368), //
                                               Angle.fromDegrees(13.46885204));


   public static Sector    _demSector = new Sector(lower, upper);


   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simply_g3m_layout);

      final G3MBuilder_Android builder = new G3MBuilder_Android(this);


      final LayerSet layerset = RumseyCollectionLayerBuilder.createLayerset();
      layerset.disableAllLayers();
      layerset.getLayerByTitle("Map Box Aerial").setEnable(true);
      layerset.getLayerByTitle("Berlin1860").setEnable(true);

      builder.getPlanetRendererBuilder().setLayerSet(layerset);
      builder.setShownSector(_demSector);
      final G3MWidget_Android g3mWidget = builder.createWidget();

      final LinearLayout layout = (LinearLayout) findViewById(R.id.glob3);
      layout.addView(g3mWidget);
   }


}
