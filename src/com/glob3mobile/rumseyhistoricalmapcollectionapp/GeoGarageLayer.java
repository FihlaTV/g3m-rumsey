/**
 * 
 */


package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.LayerTilesRenderParameters;
import org.glob3.mobile.generated.Sector;
import org.glob3.mobile.generated.Tile;
import org.glob3.mobile.generated.TimeInterval;
import org.glob3.mobile.generated.URLTemplateLayer;


/**
 * @author mdelacalle
 * 
 */
public class GeoGarageLayer
         extends
            URLTemplateLayer {


   private final String _urlLayer;


   public GeoGarageLayer(final String urlLayer,
                         final Sector layerSector,
                         final boolean isTransparent,
                         final int minLevel,
                         final int maxLevel,
                         final float transparency) {


      super(urlLayer, layerSector, isTransparent, TimeInterval.fromDays(30), true, null, new LayerTilesRenderParameters(
               Sector.fullSphere(), 1, 1, minLevel, maxLevel, LayerTilesRenderParameters.defaultTileTextureResolution(),
               LayerTilesRenderParameters.defaultTileMeshResolution(), true), transparency);
      _urlLayer = urlLayer;
   }


   @Override
   protected String getPath(final LayerTilesRenderParameters layerTilesRenderParameters,
                            final Tile tile,
                            final Sector sector) {

      final int numRows = (int) (layerTilesRenderParameters._topSectorSplitsByLatitude * Math.pow(2.0, tile._level));
      final int row = numRows - tile._row - 1;

      final String qsrt = getQrst(tile._column, row, tile._level);

      System.out.println(_urlLayer + getPath(qsrt));

      return _urlLayer + getPath(qsrt);

   }


   private static String getQrst(final int x,
                                 final int y,
                                 final int zoom) {
      final StringBuilder sb = new StringBuilder();
      sb.append("t");

      int inc = 1 << (zoom - 1);

      for (int i = zoom; i > 0; i--) {
         if ((x & inc) == 0) {
            if ((y & inc) == 0) {
               sb.append("q");
            }
            else {
               sb.append("t");
            }
         }
         else {
            if ((y & inc) == 0) {
               sb.append("r");
            }
            else {
               sb.append("s");
            }
         }

         inc = inc >> 1;
      }
      return sb.toString();
   }


   private static String getPath(final String qrstString) {
      final StringBuilder sb = new StringBuilder();

      final int strLength = qrstString.length();
      for (int i = 0; ((i + 1) * 6) <= strLength; i++) {
         final int beginIndex = i * 6;
         sb.append(qrstString.substring(beginIndex, beginIndex + 6));
         sb.append('/');
      }

      sb.append(qrstString);
      sb.append(".png");

      return sb.toString();
   }
}
