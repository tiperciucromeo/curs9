package com.romeotutorial.ex4;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {
    ImageView imagine1;
    ImageView imagine2;
    ImageView imagine3;
    ImageView imagine4;

    private RequestQueue mRequestQueue;

    private String url1 = "http://orig00.deviantart.net/41fb/f/2012/351/a/2/random_character_1_by_mnrart-d5odgq0.gif";
    private String url2 = " http://orig11.deviantart.net/cc75/f/2013/116/2/5/lorax_by_mnrart-d6324rj.gif";
    private String url3 = "http://orig10.deviantart.net/170e/f/2011/365/9/a/004_charmander___pokedex_by_mnrart-d4kst57.gif";
    private String url4 = "http://orig04.deviantart.net/b27c/f/2012/120/9/9/pikachu_by_mnrart-d4y20ti.gif";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imagine1 = (ImageView)findViewById(R.id.imageView1);
        imagine2 = (ImageView)findViewById(R.id.imageView2);
        imagine3 = (ImageView)findViewById(R.id.imageView3);
        imagine4 = (ImageView)findViewById(R.id.imageView4);

        mRequestQueue = Volley.newRequestQueue(this.getApplicationContext());
        ImageRequest imageRequest = new ImageRequest(url1, new Response.Listener<Bitmap>() {
            @Override
            public void onResponse(Bitmap bitmap) {
                imagine1.setImageBitmap(bitmap);

            }
        }, 0, 0, null, null, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("Eroare","Eroare");

            }
        });
        mRequestQueue.add(imageRequest);


    }
}
