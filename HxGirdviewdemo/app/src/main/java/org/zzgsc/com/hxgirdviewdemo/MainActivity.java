package org.zzgsc.com.hxgirdviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import org.zzgsc.com.hxgirdviewdemo.UI.TwoWayGridView;

public class MainActivity extends AppCompatActivity {
private TwoWayGridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView= (TwoWayGridView) findViewById(R.id.gv);
        String[] datas={"A","D","C","R","L","M","N","O","P","Q","W","A","D","C","R","L","M","N","O","P","Q","W","A","D","C","R","L","M","N","O","P","Q","W"};
        gridView.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,datas));

    }
}
