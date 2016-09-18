package org.gsc.com.databindingdemo;

import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/9/18.
 */

public class MyHandle {
    public void onClickFriend(View view){
        Toast.makeText(view.getContext(),"Onclick",0).show();
    }
}
