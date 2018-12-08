package com.blue.app1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.*;

import java.net.Socket;

public class A1 extends Activity {
    Button ok;
   TextView tx;
   TextView pw;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
        tx = findViewById(R.id.ipField);
        pw = findViewById(R.id.passwordField);
        ok = findViewById(R.id.okButton);
        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip = (String) tx.getText().toString();
                String password = (String) pw.getText().toString();
               if (Code.cn(ip,password)){
                   tx.setText("ok");
               }else tx.setText("ne ok");
            }
        };
        ok.setOnClickListener(listener1);
    }
}
