package org.zzgsc.com.flexboxlayoutdemo;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

/**
 * Created by Administrator on 2016/9/20.
 */
public class IndexPage extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] datas={"换行","一行","反转","主轴向下","主轴对其"};
        getListView().setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android.R.id.text1,datas));
        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        startActivity(new Intent(IndexPage.this,MainActivity.class));
                        break;
                    case 1:
                        startActivity(new Intent(IndexPage.this,Second.class));
                        break;
                    case 2:
                        startActivity(new Intent(IndexPage.this,Third.class));
                        break;
                    case 3:
                        startActivity(new Intent(IndexPage.this,Fourth.class));
                       break;
                    case 4:
                        startActivity(new Intent(IndexPage.this,Five.class));
                        break;

                }
            }
        });
    }
}
