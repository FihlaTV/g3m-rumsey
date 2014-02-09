

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.Angle;
import org.glob3.mobile.generated.Geodetic2D;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.LayerTilesRenderParameters;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URLTemplateLayer;
import org.glob3.mobile.specific.G3MBuilder_Android;
import org.glob3.mobile.specific.G3MWidget_Android;

import android.os.Bundle;
import android.widget.LinearLayout;


public class Switzerland1837Activity
         extends
            BaseActivity {

   @Override
   protected void onCreate(final Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.simply_g3m_layout);


      final G3MBuilder_Android builder = new G3MBuilder_Android(this);

      /*
      <north>51.75114266466272</north>
      <south>45.29255819097144</south>
      <east>12.01983949603397</east>
      <west>5.56125502234270</west>*/
      final Geodetic2D lower = new Geodetic2D( //
               Angle.fromDegrees(45.29255819097144), //
               Angle.fromDegrees(5.56125502234270));
      final Geodetic2D upper = new Geodetic2D( //
               Angle.fromDegrees(51.75114266466272), //
               Angle.fromDegrees(12.01983949603397));

      final Sector demSector = new Sector(lower, upper);


      final LayerSet layerset = new LayerSet();
      final LayerTilesRenderParameters switzerland1835RenderParameter = new LayerTilesRenderParameters(demSector, 1, 1, 0, 3,
               LayerTilesRenderParameters.defaultTileTextureResolution(), LayerTilesRenderParameters.defaultTileMeshResolution(),
               true);

      final URLTemplateLayer swirzerland1835 = new URLTemplateLayer(
               "http://rumsey.s3.amazonaws.com/Switzerland_1835/{level}/{x}/{y2}.png", demSector, false,
               TimeInterval.fromDays(30), true, null, switzerland1835RenderParameter);


      layerset.addLayer(swirzerland1835);
      //   layerSet.addLayer(blueMarble);
      builder.getPlanetRendererBuilder().setLayerSet(layerset);

      builder.setShownSector(demSector);


      final G3MWidget_Android g3mWidget = builder.createWidget();

      final LinearLayout layout = (LinearLayout) findViewById(R.id.glob3);
      layout.addView(g3mWidget);
   }


}
