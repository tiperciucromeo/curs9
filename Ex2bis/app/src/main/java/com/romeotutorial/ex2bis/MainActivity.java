package com.romeotutorial.ex2bis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {
    ImageView imagine1;
    ImageView imagine2;
    ImageView imagine3;
    ImageView imagine4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagine1 = (ImageView)findViewById(R.id.imageView1);
        imagine2 = (ImageView)findViewById(R.id.imageView2);
        imagine3 = (ImageView)findViewById(R.id.imageView3);
        imagine4 = (ImageView)findViewById(R.id.imageView4);

        Glide.with(this).load("http://orig00.deviantart.net/41fb/f/2012/351/a/2/random_character_1_by_mnrart-d5odgq0.gif")
                .into(imagine1);
        Glide.with(this).load("http://orig11.deviantart.net/cc75/f/2013/116/2/5/lorax_by_mnrart-d6324rj.gif")
                .into(imagine2);
        Glide.with(this).load("http://orig10.deviantart.net/170e/f/2011/365/9/a/004_charmander___pokedex_by_mnrart-d4kst57.gif")
                .into(imagine3);
        Glide.with(this).load("http://orig04.deviantart.net/b27c/f/2012/120/9/9/pikachu_by_mnrart-d4y20ti.gif")
                .into(imagine4);
    }
}
