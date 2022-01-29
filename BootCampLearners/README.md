# iSpaceAndroid
 Kotlin App Dev.

Public repository
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/BootCampLearners/Screenshot%20(66).png)
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/BootCampLearners/Screenshot%20(64).png)
![Screenshot](https://github.com/KingElias-1/iSpaceAndroid/blob/main/BootCampLearners/Screenshot%20(65).png)

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

    implementation 'com.github.bumptech.glide:glide:4.12.0'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.12.0'
}


Usage
-----
xml
 <?xml version="1.0" encoding="utf-8"?>
<ScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    tools:context=".learnerProfile.LearnerProfile">


    <LinearLayout
        android:layout_width="match_parent"
        android:orientation="vertical"
        android:layout_height="wrap_content">

        <RelativeLayout
            android:layout_width="match_parent"
            android:id="@+id/img_bg"
            android:layout_height="500dp"
            android:background="@color/colorSecondary"
            android:padding="10dp">

            <androidx.cardview.widget.CardView
                android:layout_width="120dp"
                android:layout_marginTop="80dp"
                android:id="@+id/profile_image_root"
                android:layout_height="120dp"
                app:cardCornerRadius="250dp"
                android:layout_gravity="center">


                <ImageView
                    android:layout_width="120dp"
                    android:id="@+id/profileImg"
                    android:layout_height="120dp"
                    android:layout_centerVertical="true"
                    android:scaleType="centerCrop"
                    android:src="@drawable/ic_launcher_foreground"/>

            </androidx.cardview.widget.CardView>


            <TextView
                android:id="@+id/name_field"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerVertical="true"
                android:layout_marginStart="10dp"
                android:layout_toEndOf="@+id/profile_image_root"
                android:fontFamily="@font/bungeeregular"
                android:includeFontPadding="false"
                android:text="Mawuli Koffi"
                android:textColor="#fff"
                android:textSize="20sp" />

            <TextView
                android:id="@+id/email_field"
                android:textColor="#fff"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_below="@id/name_field"
                android:layout_marginStart="10dp"
                android:layout_toEndOf="@+id/profile_image_root"

                android:includeFontPadding="false"
                android:text="email@gmail.com"
                android:textSize="14sp" />
        </RelativeLayout>

        <LinearLayout
            android:layout_height="wrap_content"
            android:layout_marginTop="-100dp"
            android:layout_width="match_parent"
            android:padding="20dp">

            <com.google.android.material.card.MaterialCardView
                android:layout_height="125dp"
                android:layout_margin="10dp"
                android:layout_weight="1"
                android:layout_width="0dp"
                app:cardBackgroundColor="#fece2f"
                app:cardElevation="10dp">

                <RelativeLayout
                    android:layout_height="match_parent"
                    android:layout_width="match_parent"
                    android:padding="5dp">

                    <ImageView
                        android:layout_centerHorizontal="true"
                        android:layout_height="30dp"
                        android:layout_width="30dp"
                        android:src="@drawable/project" />

                    <TextView
                        android:fontFamily="@font/bungeecolor"
                        android:id="@+id/payment_label"
                        android:includeFontPadding="false"
                        android:layout_centerInParent="true"
                        android:layout_height="wrap_content"
                        android:layout_width="wrap_content"
                        android:text="123"
                        android:textSize="20sp" />

                    <TextView
                        android:id="@+id/payment_desc"
                        android:layout_width="wrap_content"
                        android:layout_height="wrap_content"
                        android:layout_below="@id/payment_label"
                        android:layout_centerHorizontal="true"
                        android:includeFontPadding="false"
                        android:text="Projects on Github"
                        android:textSize="20sp" />

                </RelativeLayout>



            </com.google.android.material.card.MaterialCardView>


        </LinearLayout>

        <LinearLayout
            android:layout_height="wrap_content"
            android:layout_width="match_parent"
            android:orientation="vertical"
            android:padding="20dp">
            <androidx.appcompat.widget.AppCompatTextView
                android:drawableStart="@drawable/username_small_icon"
                android:drawablePadding="15dp"
                android:textAlignment="center"
                android:paddingTop="10dp"
                android:id="@+id/phone_number"
                android:text="Phone number"
                android:textSize="16sp"
                android:textColor="@color/black"
                android:layout_height="wrap_content"
                android:layout_width="match_parent" />

            <androidx.appcompat.widget.AppCompatTextView
                android:drawableStart="@drawable/gender_small_icon"
                android:drawablePadding="15dp"
                android:id="@+id/gender_field"
                android:textAlignment="center"
                android:paddingTop="10dp"
                android:text="Gender"
                android:textSize="16sp"
                android:textColor="@color/black"
                android:layout_height="wrap_content"
                android:layout_width="match_parent" />

            <androidx.appcompat.widget.AppCompatTextView
                android:drawableStart="@drawable/profession_small_icon"
                android:drawablePadding="15dp"
                android:textAlignment="center"
                android:id="@+id/profession_field"
                android:paddingTop="10dp"
                android:text="Profession"
                android:textSize="16sp"
                android:textColor="@color/black"
                android:layout_height="wrap_content"
                android:layout_width="match_parent" />



            <androidx.cardview.widget.CardView
                android:layout_width="match_parent"
                android:layout_marginTop="80dp"
                android:id="@+id/profile_image_root1"
                android:layout_height="400dp"
                app:cardCornerRadius="250dp"
                android:layout_gravity="center">


                <ImageView
                    android:layout_width="match_parent"
                    android:id="@+id/profileImagTwo"
                    android:layout_height="400dp"
                    android:layout_centerVertical="true"
                    android:scaleType="centerCrop"
                    android:src="@drawable/ic_launcher_foreground"/>

            </androidx.cardview.widget.CardView>

        </LinearLayout>

        <Button
            android:background="#fece2f"
            android:fontFamily="@font/bungeeregular"
            android:layout_height="wrap_content"
            android:layout_marginTop="30dp"
            android:layout_marginBottom="60dp"
            android:layout_width="match_parent"
            android:text="UPDATE" />

    </LinearLayout>

</ScrollView>
		


License
-------

    Copyright 2022 - 2023 Olorunfemi ELias Oyewole

    Licensed under the ispace foundation, Version 3.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
