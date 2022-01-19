# iSpaceAndroid
 Kotlin App Dev.

Public repository
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/HappyNewYearCard/Screenshot%20(41).png)

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
 <ImageView
            android:id="@+id/image_view_dice_one"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_weight="1"
            android:contentDescription="@string/str_image_desc_one"
            android:padding="@dimen/padding_eight"
            android:src="@drawable/dice_empty"
            tools:src="@drawable/dice5" />
		


License
-------

    Copyright 2022 - 2023 Olorunfemi ELias Oyewole

    Licensed under the ispace fundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at