package com.star.mywebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

//    WebView wb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        wb = findViewById(R.id.webView);
        WebView webview = new WebView(this);
        setContentView(webview);

        webview.loadUrl("http://192.168.58.9/Default.aspx");
    }
}
