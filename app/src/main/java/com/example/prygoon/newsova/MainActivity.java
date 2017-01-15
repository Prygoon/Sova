package com.example.prygoon.newsova;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    Button button1;
    ImageView owlImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setText(R.string.show_owl);

        owlImage = (ImageView) findViewById(R.id.imageView3);
        owlImage.setVisibility(View.INVISIBLE);
        owlImage = (ImageView) findViewById(R.id.imageView2);
        owlImage.setVisibility(View.INVISIBLE);
        owlImage = (ImageView) findViewById(R.id.imageView1);
        owlImage.setVisibility(View.INVISIBLE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (owlImage.getVisibility() == View.INVISIBLE) {
                    owlImage.setVisibility(View.VISIBLE);
                    button1.setText(R.string.hide_owl);
                } else {
                    owlImage.setVisibility(View.INVISIBLE);
                    button1.setText(R.string.show_owl);
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_owl1) {
            owlImage.setVisibility(View.INVISIBLE);
            button1.setText(R.string.show_owl);
            owlImage = (ImageView) findViewById(R.id.imageView1);
        }

        if (id == R.id.action_owl2) {
            owlImage.setVisibility(View.INVISIBLE);
            button1.setText(R.string.show_owl);
            owlImage = (ImageView) findViewById(R.id.imageView2);
        }

        if (id == R.id.action_owl3) {
            owlImage.setVisibility(View.INVISIBLE);
            button1.setText(R.string.show_owl);
            owlImage = (ImageView) findViewById(R.id.imageView3);
        }

        return super.onOptionsItemSelected(item);
    }
}
