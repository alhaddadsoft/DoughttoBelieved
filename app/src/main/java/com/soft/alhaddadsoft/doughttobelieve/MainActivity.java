package com.soft.alhaddadsoft.doughttobelieve;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
Button chap1, chap2 , chap3, chap4, chap5 , chap6 , chap7 , chap8 ;
    private Boolean exit = false;
    private InterstitialAd interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        interstitial = new InterstitialAd(this);
        interstitial.setAdUnitId("ca-app-pub-5452201963786571/3768432249");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest request = new AdRequest.Builder().build();
        mAdView.loadAd(request);

        AdRequest adRequest = new AdRequest.Builder().build();
        interstitial.loadAd(adRequest);
        interstitial.setAdListener(new AdListener() {
            public void onAdLoaded() {
                interstitial.show();
            }
        });

        chap1 = (Button)findViewById(R.id.button);
        chap1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chapterone.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });


        chap2 = (Button)findViewById(R.id.button2);
        chap2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chaptertwo.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap3 = (Button)findViewById(R.id.button3);
        chap3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chapterthree.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap4 = (Button)findViewById(R.id.button4);
        chap4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chapterfour.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap5= (Button)findViewById(R.id.button5);
        chap5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chapterfive.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap6 = (Button)findViewById(R.id.button6);
        chap6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chaptersix.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap7 = (Button)findViewById(R.id.button7);
        chap7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chapterseven.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });

        chap8 = (Button)findViewById(R.id.button8);
        chap8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, chaptereight.class);
                startActivity(i);
                AdRequest adRequest = new AdRequest.Builder().build();
                interstitial.loadAd(adRequest);
                interstitial.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        interstitial.show();
                    }
                });
            }
        });
    }
    @Override
    public void onBackPressed() {
        if (exit) {
            AdRequest adRequest = new AdRequest.Builder().build();
            interstitial.loadAd(adRequest);
            interstitial.setAdListener(new AdListener() {
                public void onAdLoaded() {
                    interstitial.show();
                }

                public void onAdClosed() {
                    // finish activity
                }

            });
            finish();
        } else {
            Toast.makeText(this, "اضغط مرة أخرى للخروج",
                    Toast.LENGTH_SHORT).show();
            exit = true;
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    exit = false;
                }
            }, 3 * 1000);

        }

    }
}
