package com.devst.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;   // <-- IMPORTANTE
import java.util.Objects;                  // <-- IMPORTANTE
import com.google.android.material.appbar.MaterialToolbar;

public class ConfigActivity extends AppCompatActivity {
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ajustes");
    }

    @Override public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}


