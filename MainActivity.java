package com.example.androidversionapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {


   String[] androidVersions = {
           "Android 1.0 - Alpha",
           "Android 1.1 - Beta",
           "Android 1.5 - Cupcake",
           "Android 1.6 - Donut",
           "Android 2.0 - Eclair",
           "Android 2.2 - Froyo",
           "Android 2.3 - Gingerbread",
           "Android 4.0 - Ice Cream Sandwich",
           "Android 4.1 - Jelly Bean",
           "Android 4.4 - KitKat",
           "Android 5.0 - Lollipop",
           "Android 6.0 - Marshmallow",
           "Android 7.0 - Nougat",
           "Android 8.0 - Oreo",
           "Android 9.0 - Pie",
           "Android 10",
           "Android 11"
           "Android 12"
   };


   String[] descriptions = {
           // not yet finished, yet able to run
           // descriptions
           "Android 1.0 was Google's first Android\n" +
                   "release. Web browser support, camera\n" +
                   "support, Gmail counts, Google maps, and a gie haps, YouTube application were among the basic capabilities.\n" +
                   "Although it does not have\n" +
                   "an official name like the other introduced\n" +
                   "variations, it is known informally as Apple\n" +
                   "Pie. In Android 1.0, the API level is set to 1\n" +
                   "It is no longer utilized in mobile devices It\n" +
                   "was published on September 23, 2008\n.",


           "Android 1.1 is a version of Android that was released on 9 February 2009, initially for the HTC Dream only. Its predecessor is Android 1.0, and it's successor is Android 1.5 Cupcake. The update resolved bugs, changed the API and added a number of other features.",


           "Android 1.5 Cupcake is a version of Android that was released on 27 April 2009, based on Linux kernel 2.6.27. Its predecessor was Android 1.1 and its successor was Android 1.6 Donut. The update included several new features and UI amendments. Google ended Market support for Android 1.5 cupcake on June 30, 2017.",


           "Donut, Android 1.6, was introduced in the fall of 2009. Donut fixed key important\n" +
                   "holes in Android's core, including the\n" +
                   "OS's ability to function on a wide range of\n" +
                   "screen sizes and resolutions, which was a crucial feature. in the vears ahead It also\n" +
                   "introduced support for CDMA networks\n" +
                   "like as Verizon, which will be crucial in Android's rapid growth.\n",


           "Android Eclair is a codename of the Android mobile operating system developed by Google, the fifth operating system for Android and the second major release of Android. Eclair spans the versions 2.0.x and 2.1. Unveiled on October 26, 2009, Android Eclair builds upon the significant changes made in Android 1.6 \"Android Donut\". The first phone with Android Eclair was the Motorola Droid. Google ceased Android Market support for Android Eclair on June 30, 2017.",


           "Android 2.2 (otherwise known as Froyo, short for Frozen Yogurt) is a version of Android that was released on May 20 2010. Its predecessor was Android 2.1 Eclair and its successor was Android 2.3 Gingerbread. Android 2.2's last release was on November 21 2011 as Android 2.2.3. Support for Android 2.2 ended on October 2 2014. Google also made the difficult decision to cease sign-in support with a Google account for Android Froyo to Android Gingerbread on September 27, 2021.",


           "The Android 2.3 platform introduces many new and exciting features for users and developers. This document provides a glimpse at some of the new features and technologies in Android 2.3.",


           "Android 4.0 was focused on simplifying and modernizing the overall Android experience around a new set of human interface guidelines. As part of these efforts, it introduced a new visual appearance codenamed \"Holo\",",


           "Smoother UI and Google Now.",


           "Smarter caller ID and better performance.",


           "Material Design introduced.",


           "App permissions control introduced.",


           "Multi-window support.",


           "Picture-in-picture mode.",


           "Adaptive battery and gestures.",


           "System-wide dark theme.",


           "Chat bubbles and screen recording.",


           "Material You design and privacy features."
   };


   int[] images = {
           R.drawable.alpha,
           R.drawable.beta,
           R.drawable.cupcake,
           R.drawable.donut,
           R.drawable.eclair,
           R.drawable.froyo,
           R.drawable.gingerbread,
           R.drawable.icecream,
           R.drawable.jellybean,
           R.drawable.kitkat,
           R.drawable.lollipop,
           R.drawable.marshmallow,
           R.drawable.nougat,
           R.drawable.oreo,
           R.drawable.pie,
           R.drawable.ten,
           R.drawable.eleven,
           R.drawable.twelve
   };


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


       ListView listView = findViewById(R.id.listView);
       ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
               android.R.layout.simple_list_item_1, androidVersions);
       listView.setAdapter(adapter);


       listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent = new Intent(MainActivity.this, DetailActivity.class);
               intent.putExtra("version_name", androidVersions[position]);
               intent.putExtra("version_description", descriptions[position]);
               intent.putExtra("image_res", images[position]);
               startActivity(intent);
           }
       });
   }
}
