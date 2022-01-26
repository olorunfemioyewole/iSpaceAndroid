# iSpaceAndroid
 Kotlin App Dev.

Public repository
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/MultipleActivityApp/Screenshot%20(62).png)
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/MultipleActivityApp/Screenshot%20(60).png)
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/MultipleActivityApp/Screenshot%20(59).png)
![Video](https://github.com/KingElias-1/iSpaceAndroid/blob/main/MultipleActivityApp/multipleActivityApp.mp4)

It uses Intent to switch between different activities with quotes

Gradle
------

dependencies {
    implementation 'androidx.core:core-ktx:1.7.0'
    implementation 'androidx.appcompat:appcompat:1.4.1'
    implementation 'com.google.android.material:material:1.5.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
}


Usage
-----
xml
 <?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".activities.Quote1"

    android:padding="10dp"
    android:background="@color/black"
    android:gravity="center"
    android:orientation="vertical"
    android:weightSum="11">

    <LinearLayout
        android:layout_width="340dp"
        android:layout_height="wrap_content"
        android:layout_weight="1"
        android:orientation="horizontal">

        <ImageView
            android:id="@+id/home"
            android:layout_width="35dp"
            android:layout_height="35dp"
            app:srcCompat="@drawable/ic_baseline_home_24"
            android:layout_gravity="center_vertical"/>

        <TextView
            android:id="@+id/textView"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="1"
            android:textColor="@color/orange"
            android:textSize="15sp"
            android:fontFamily="@font/poppins_medium"
            android:layout_marginStart="30dp"
            android:layout_gravity="center_vertical"/>

    </LinearLayout>

    <LinearLayout
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:layout_weight="7"
        android:gravity="center"
        android:layout_marginTop="20dp">

        <TextView
            android:layout_width="340dp"
            android:layout_height="wrap_content"
            android:fontFamily="@font/poppins_medium"
            android:gravity="center"
            android:padding="10dp"
            android:text="@string/quote1"
            android:textColor="@color/orange"
            android:textSize="20sp" />

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="30dp"
            android:fontFamily="@font/poppins_medium"
            android:padding="2dp"
            android:text="@string/authq1"
            android:textColor="@color/orange"
            android:textSize="20sp"
            android:layout_marginTop="20dp"/>

    </LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center_horizontal"
        android:layout_marginTop="20dp"
        android:layout_weight="3">

        <Button
            android:id="@+id/prev1"
            android:layout_width="150dp"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:backgroundTint="@color/orange"
            android:fontFamily="@font/poppins_medium"
            android:text="@string/previous_quote"
            android:textColor="@color/white"
            android:textSize="16sp"
            android:textStyle="bold"/>

        <Button
            android:id="@+id/next1"
            android:layout_width="150dp"
            android:layout_height="wrap_content"
            android:layout_margin="10dp"
            android:backgroundTint="@color/orange"
            android:fontFamily="@font/poppins_medium"
            android:text="@string/next_quote"
            android:textColor="@color/white"
            android:textSize="16sp"
            android:textStyle="bold"/>
    </LinearLayout>

</LinearLayout>
		


License
-------

    Copyright 2022 - 2023 Olorunfemi ELias Oyewole

    Licensed under the ispace foundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
