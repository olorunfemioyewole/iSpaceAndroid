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
 <ImageView
            android:id="@+id/diceOne"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:layout_gravity="bottom|center"
            android:src="@drawable/dice_1"
            app:srcCompat="@drawable/dice_1" />

        <ImageView
            android:id="@+id/diceTwo"
            android:layout_width="200dp"
            android:layout_height="200dp"
            android:layout_gravity="bottom|center"
            android:src="@drawable/empty_dice"
            app:srcCompat="@drawable/dice_1" />
		


License
-------

    Copyright 2022 - 2023 Olorunfemi ELias Oyewole

    Licensed under the ispace foundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at