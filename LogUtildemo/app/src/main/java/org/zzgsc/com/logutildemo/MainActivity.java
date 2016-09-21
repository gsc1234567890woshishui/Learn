package org.zzgsc.com.logutildemo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.orhanobut.logger.Logger;

import java.util.ArrayList;

import jp.wasabeef.richeditor.RichEditor;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> strings=new ArrayList<>();
        strings.add("d");
        strings.add("456");
        strings.add("d");
        strings.add("456"); strings.add("d");
        strings.add("456"); strings.add("d");
        strings.add("456");
        Logger.i("gsc","ABDCd");
        Logger.d(strings);
        RichEditor editor = (RichEditor) findViewById(R.id.c);
        editor.setBold();
    }
}
