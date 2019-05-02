package com.example.haekalsyahefiransmp7c.puasasunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView Listpuasa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Listpuasa = findViewById(R.id.listpuasa);

        Listpuasa.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0){
                    Intent seninKamis = new Intent(MainActivity.this, Detail.class);
                    seninKamis.putExtra("posisi",position);
                    seninKamis.putExtra("link","http://www.almunawwar.net/manfaat-puasa-senin-kamis/");
                    startActivity(seninKamis);

                }else if (position == 1) {
                    Intent daud = new Intent(MainActivity.this,Detail.class);
                    daud.putExtra("posisi", position);
                    daud.putExtra("link", "https://muslim.or.id/17877-puasa-daud-sebaik-baiknya-puasa.html");
                    startActivity(daud);

                }else if (position == 2){
                    Intent arofah = new Intent(MainActivity.this,Detail.class);
                    arofah.putExtra("posisi",position);
                    arofah.putExtra("link","https://muslim.or.id/18509-keutamaan-puasa-arafah.html");
                    startActivity(arofah);

                }else if (position == 3){
                    Intent asySyuruq = new Intent(MainActivity.this,Detail.class);
                    asySyuruq.putExtra("posisi", position);
                    asySyuruq.putExtra("link","https://muslim.or.id/23090-keutamaan-puasa-asyura-dan-sejarahnya.html");
                    startActivity(asySyuruq);

                }else if (position == 4){
                    Intent syawal = new Intent(MainActivity.this,Detail.class);
                    syawal.putExtra("posisi", position);
                    syawal.putExtra("link", "https://muslim.or.id/17782-tata-cara-puasa-syawal.html");
                    startActivity(syawal);

                }else if (position == 5 ){
                    Intent ayyamulBidh = new Intent(MainActivity.this,Detail.class);
                    ayyamulBidh.putExtra("posisi", position);
                    ayyamulBidh.putExtra("link","https://muslim.or.id/17851-puasa-tiga-hari-setiap-bulan-dan-puasa-ayyamul-bidh.html");
                    startActivity(ayyamulBidh);

                }else if (position == 6){
                    Intent puasaSyakban = new Intent(MainActivity.this,Detail.class);
                    puasaSyakban.putExtra("posisi", position);
                    puasaSyakban.putExtra("link","https://muslim.or.id/15917-anjuran-puasa-syaban.html");
                    startActivity(puasaSyakban);
                }
            }
        });
    }
}
