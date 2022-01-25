# iSpaceAndroid
 Kotlin App Dev.

Public repository
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/RecyclerViewEvening/Screenshot%20(55).png)

It uses a BitmapShader and *does not*:
* create a copy of the original bitmap
* use a clipPath (which is neither hardware accelerated nor anti-aliased)
* use setXfermode to clip the bitmap (which means drawing twice to the canvas)

Gradle
------

dependencies {
    ...
    implementation 'de.hdodenhof:circleimageview:3.1.0'
}


Usage
-----
xml
 <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="5dp">

        <ImageView
            android:id="@+id/imageview"
            android:layout_width="150dp"
            android:layout_height="140dp"
            android:layout_marginEnd="15dp"/>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <TextView
                android:id="@+id/textView"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginStart="10dp"
                android:layout_marginTop="30dp"
                android:text="Item" />

            <TextView
                android:id="@+id/description"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginStart="10dp"
                android:layout_marginTop="30dp"
                android:text="Description" />
        </LinearLayout>
		


License
-------

    Copyright 2022 - 2023 Olorunfemi ELias Oyewole

    Licensed under the ispace foundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at