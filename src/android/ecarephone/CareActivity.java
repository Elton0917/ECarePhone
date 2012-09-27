package android.ecarephone;

import org.apache.cordova.*;
import android.os.Bundle;
import android.view.Menu;

public class CareActivity extends DroidGap {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_care);
        super.loadUrl("file:///android_asset/www/Index.htm");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_care, menu);
        return true;
    }
}
