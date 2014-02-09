

package com.glob3mobile.rumseyhistoricalmapcollectionapp;

import org.glob3.mobile.generated.LayerBuilder;
import org.glob3.mobile.generated.LayerSet;
import org.glob3.mobile.generated.MapBoxLayer;
import org.glob3.mobile.generated.TimeInterval;


public class RumseyCollectionLayerBuilder
         extends
            LayerBuilder {

   public RumseyCollectionLayerBuilder() {
   }


   public static LayerSet createLayerset() {

      final LayerSet layerSet = new LayerSet();

      final MapBoxLayer mboxAerialLayer = new MapBoxLayer("examples.map-m0t0lrpu", TimeInterval.fromDays(30), true, 2);
      mboxAerialLayer.setTitle("Map Box Aerial");
      layerSet.addLayer(mboxAerialLayer);


      final GeoGarageLayer Italy1800 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g2104028/",
               Italy1800Activity._demSector, false, 6, 16, 1);
      Italy1800.setTitle("Italy1800");
      layerSet.addLayer(Italy1800);

      final GeoGarageLayer ny1852 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g2620000/",
               NewYork1852Activity._demSector, false, 13, 20, 1);
      ny1852.setTitle("ny1852");
      layerSet.addLayer(ny1852);

      final GeoGarageLayer Washington1851 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/gct000745b/",
               WashingtonDC1851Activity._demSector, false, 13, 20, 1);
      Washington1851.setTitle("Washington1851");
      layerSet.addLayer(Washington1851);


      final GeoGarageLayer Spain1701 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g4764053/",
               Spain1701Activity._demSector, false, 6, 20, 1);
      Spain1701.setTitle("Spain1701");
      layerSet.addLayer(Spain1701);

      final GeoGarageLayer Argentina1867 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g0464004/",
               Argentina1867Activity._demSector, false, 6, 8, 1);
      Argentina1867.setTitle("Argentina1867");
      layerSet.addLayer(Argentina1867);

      final GeoGarageLayer Russia1794 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g2310051/",
               Russia1794Activity._demSector, false, 4, 12, 1);
      Russia1794.setTitle("Russia1794");
      layerSet.addLayer(Russia1794);

      final GeoGarageLayer Beijing1930 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g3ct001947/",
               Beijing1930Activity._demSector, false, 13, 16, 1);
      Beijing1930.setTitle("Beijing1930");
      layerSet.addLayer(Beijing1930);

      final GeoGarageLayer Colombia1840 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g5226010/",
               Colombia1840Activity._demSector, false, 5, 12, 1);
      Colombia1840.setTitle("Colombia1840");
      layerSet.addLayer(Colombia1840);

      final GeoGarageLayer NA1786 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g0411042/",
               NorthAmerica1786Activity._demSector, false, 5, 12, 1);
      NA1786.setTitle("NA1786");
      layerSet.addLayer(NA1786);

      final GeoGarageLayer Berlin1860 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g4807053/",
               Berlin1860Activity._demSector, false, 12, 16, 1);
      Berlin1860.setTitle("Berlin1860");
      layerSet.addLayer(Berlin1860);


      final GeoGarageLayer Congo1708 = new GeoGarageLayer("http://tiles8-proxy.geogarage.com/g4764092/",
               Congo1708Activity._demSector, false, 5, 12, 1);
      Congo1708.setTitle("Congo1708");
      layerSet.addLayer(Congo1708);


      return layerSet;

   }
}
