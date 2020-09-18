package com.example.linkpreview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import io.github.ponnamkarthik.richlinkpreview.RichLinkView;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewSkype;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTelegram;
import io.github.ponnamkarthik.richlinkpreview.RichLinkViewTwitter;
import io.github.ponnamkarthik.richlinkpreview.ViewListener;

public class MainActivity extends AppCompatActivity {

    RichLinkView richLinkView;
    RichLinkViewTelegram richLinkView1;
    RichLinkViewSkype richLinkView2;
    RichLinkViewTwitter richLinkView3;

    Button goToList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        richLinkView = (RichLinkView) findViewById(R.id.richLinkView);
        richLinkView1 = (RichLinkViewTelegram) findViewById(R.id.richLinkView1);
        richLinkView2 = (RichLinkViewSkype) findViewById(R.id.richLinkView2);
        richLinkView3 = (RichLinkViewTwitter) findViewById(R.id.richLinkView3);

        goToList = (Button) findViewById(R.id.go_to_list);

        richLinkView.setLink("https://whatsapp.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView1.setLink("https://telegram.org", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });
        richLinkView2.setLink("https://sport.detik.com/sepakbola/liga-indonesia/d-5177724/timnas-indonesia-u-19-vs-qatar-garuda-muda-menang-2-1?tag_from=wp_beritautama&_ga=2.119783432.1869314400.1600359975-1431750285.1600359975", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {
                System.out.println("statusRv2 " + status);

            }

            @Override
            public void onError(Exception e) {

            }
        });


        richLinkView3.setLink("https://twitter.com", new ViewListener() {
            @Override
            public void onSuccess(boolean status) {

            }

            @Override
            public void onError(Exception e) {

            }
        });

        //custom clickListener
        richLinkView.setDefaultClickListener(false);



        goToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "wkwkwkwk" + richLinkView.getMetaData().getImageurl(), Toast.LENGTH_SHORT).show();

            }
        });


    }
}
