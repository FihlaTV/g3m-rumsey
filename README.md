g3m-rumsey
==========

This app has been developed to show how to write a simple android application to show customized raster data sources.
#The app

This application has been developed using Glob3 Moble native SDK for Android:
 + [Glob3 Mobile](https://github.com/glob3mobile/g3m/) 
 + [Getting Started on Android](https://github.com/glob3mobile/g3m/wiki) 
 + [Demo Project](https://github.com/glob3mobile/g3m/tree/purgatory/Android/G3MAndroidDemo)
 + [Issue list](https://github.com/glob3mobile/g3m/issues)

The architechture is quite simple, there is a main applications that launch the different maps using buttons. The lifecycle is managed killing the activity when the back button is clicked.
We use as data source the tiles served by "The David Rumsey Map Collection", this tiles has been builded in mercator, and maps are georeferenced.

We are a using a customized layer extending the SDK's WMSTemplateLayer for reach to this tiles.

[GeoGarajeLayer.java](https://github.com/glob3mobile/g3m-rumsey/blob/master/src/com/glob3mobile/rumseyhistoricalmapcollectionapp/GeoGarageLayer.java)

We hope add new maps soon!
If you need further asistance, or know more about g3m please ask us on the [Issue list](https://github.com/glob3mobile/g3m/issues) or send a mail to [glob3 mobile](sales@glob3mobile.com)


#The David Rumsey Historical Map Collection

Starting in the early 1980s, and entering into his third career, Rumsey has collected nearly 150,000 maps of eighteenth – and nineteenth-century North and South America. The collection also features world maps which includes atlases, globes, school geographies, maritime charts, and a variety of other maps. The collection is available on his website for free viewing.

In February 2009, David Rumsey announced that the entire collection would be donated to Stanford University including 150,000 maps and their digital images, as well as the database used to track the images.

[Rumsey Collection](http://www.davidrumsey.com) 
