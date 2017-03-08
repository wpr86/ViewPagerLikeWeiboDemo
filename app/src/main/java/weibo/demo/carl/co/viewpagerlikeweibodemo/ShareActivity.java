package weibo.demo.carl.co.viewpagerlikeweibodemo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Host-0 on 2017/3/8.
 */

public class ShareActivity extends AppCompatActivity {

    private ImageView mImageView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        initView();
    }

    private void initView(){
        mImageView = (ImageView)findViewById(R.id.share_cross_image);
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ShareActivity.this.finish();
            }
        });
    }
}
