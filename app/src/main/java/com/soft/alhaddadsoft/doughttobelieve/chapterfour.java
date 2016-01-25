package com.soft.alhaddadsoft.doughttobelieve;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class chapterfour extends AppCompatActivity {
    TextView Text;
    StringBuilder sb;
    InputStream is;
    BufferedReader reader;
    String result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_chapterfour);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder().build();
        mAdView.loadAd(request);

        Typeface font = Typeface.createFromAsset(getAssets(), "arabic.ttf");

        try {
            result = "";
            sb = new StringBuilder(); // بناء سترنج متعدد اي يحتوي على قيم عديدة او سلسلة متغيرة
            is = this.getAssets().open("chap4.txt"); // الوصول الى الملف النصي
            reader = new BufferedReader(new InputStreamReader(is, "UTF8")); // قارئ بفرد وهو يستخدم عادة لقراءة الملفات الضخمة, وسوف يقرأ من الملف النصي
            if (is != null) { // اذا تم ايجاد الملف
                while ((result = reader.readLine()) != null) { // قم بقراءة البفرد المدخل سطر سطر اي بشكل سليم ووضعه داخل سترنج str
                    sb.append(result + "\n"); // السترنج الذي تم بنائه في البداية قم بإضافة داخله الـسترنج str الذي تخزن داخله الملف النصي
                }
            }
            Text = (TextView) findViewById(R.id.TextView1); // تعريف النص وربطه بالاي دي الخاص به .. النص الذي تريد وضعه داخله الملف النصي
            Text.setText(sb); // استخدم سلسلة السترنج التي تم بنائها وتخزين الملف النصي داخلها في محل النص المحدد
            Text.setTypeface(font);
            is.close(); // اغلاق الادخال

        } catch (IOException e) { // هنا توضع الاوامر اذا ظهر اي خطأ وغالباً ما تستخدم رسالة توست لتخبرك ما هو الخطأ
        }

        Button smallSize =(Button) findViewById(R.id.button9);
        Button mediumSize = (Button) findViewById(R.id.button10);
        Button largeSize = (Button) findViewById(R.id.button11);
        smallSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Text = (TextView) findViewById(R.id.TextView1); // تعريف النص وربطه بالاي دي الخاص به .. النص الذي تريد وضعه داخله الملف النصي
                Text.setText(sb);
                Text.setTextSize(15);

            }

    });
        mediumSize.setOnClickListener(new View.OnClickListener() {
                                          public void onClick(View view) {
                                              Text = (TextView) findViewById(R.id.TextView1); // تعريف النص وربطه بالاي دي الخاص به .. النص الذي تريد وضعه داخله الملف النصي
                                              Text.setText(sb);
                                              Text.setTextSize(18);
                                          }
                                      }
        );

        largeSize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Text = (TextView) findViewById(R.id.TextView1); // تعريف النص وربطه بالاي دي الخاص به .. النص الذي تريد وضعه داخله الملف النصي
                Text.setText(sb);
                Text.setTextSize(26);
            }
        });
}
    @Override
    public void onBackPressed() {

        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish(); // Call once you redirect to another activity


    }
}

