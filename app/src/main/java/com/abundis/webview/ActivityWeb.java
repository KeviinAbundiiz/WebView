package com.abundis.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityWeb extends AppCompatActivity {

    WebView wv_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wv_1 = (WebView)findViewById(R.id.wv_1);

        String URL = getIntent().getStringExtra("sitioWeb");
        wv_1.setWebViewClient(new WebViewClient());
        wv_1.loadUrl("http://"+ URL);
    }



    //Método del boton cerrar
    public void Cerrar (View view){
        finish();
    }
}
