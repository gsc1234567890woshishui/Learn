package org.gsc.com.databindingdemo;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.gsc.com.databindingdemo.databinding.TestBinding;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        //绑定布局文件
        TestBinding binding = DataBindingUtil.setContentView(this, R.layout.test);
        //初始化数据模型
        User user = new User("Guo", "SC");
        //绑定UI
        binding.setUser(user);
    }
}
