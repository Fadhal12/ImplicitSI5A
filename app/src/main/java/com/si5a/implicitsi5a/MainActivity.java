package com.si5a.implicitsi5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etUrl, etlokasi, etText;
    Button btnbukaWebsite, btnbukalokasi, btnbagikanTeks;
    String Url, Lokasi, Nama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUrl = findViewById(R.id.et_url);
        etlokasi = findViewById(R.id.et_lokasi);
        etText = findViewById(R.id.et_teks);
        btnbukaWebsite = findViewById(R.id.btn_buka_website);
        btnbukalokasi = findViewById(R.id.btn_buka_lokasi);
        btnbagikanTeks = findViewById(R.id.btn_buka_bagikan_teks);

        btnbukaWebsite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String urlWebsite = etUrl.getText().toString();
                Uri uriUrlWebsite = Uri.parse(urlWebsite);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                startActivity(intentWebsite);
                try {
                    startActivity(intentWebsite);
                } catch (Exception e){
                    etUrl.setError("Url Tidak Sesuai");
                }
            }
        });
    }
}