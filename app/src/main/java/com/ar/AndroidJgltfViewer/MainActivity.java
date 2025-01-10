package com.ar.androidjgltfviewer;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        MyGlobals myglob = new MyGlobals();
        myglob.actv = this;

        // Create new Android GLSurfaceView
        setContentView(new MySurfaceView(this, myglob));

        Toast.makeText(getApplicationContext(),"Double tap to load next GLTF sample model, can take time!",Toast.LENGTH_LONG).show();

    }
}
