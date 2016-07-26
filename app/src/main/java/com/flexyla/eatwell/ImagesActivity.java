package com.flexyla.eatwell;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ImagesActivity extends AppCompatActivity {

    private static ImageView imgView;
    private static Button buttonsbm;

    private static Button button_web;

    private int current_image_index;
    int[] images = {R.mipmap.dj2, R.mipmap.dj3, R.mipmap.pj1, R.mipmap.dj4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.images_layout);
        buttonClick();
        OnClickButtonListerner();

    }

    public void OnClickButtonListerner(){
        button_web = (Button)findViewById(R.id.button2);
        button_web.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void  onClick(View v){
                        Intent intent = new Intent("com.example.rene.image.Web");
                        startActivity(intent);
                    }
                }
        );
    }

    public void buttonClick(){
        imgView = (ImageView)findViewById(R.id.imageView);
        buttonsbm = (Button)findViewById(R.id.button);
        buttonsbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        current_image_index++;
                        current_image_index = current_image_index % images.length;
                        imgView.setImageResource(images[current_image_index]);
                    }
                }
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
