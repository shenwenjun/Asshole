package sjun.me.asshole;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import me.sjun.assholelibrary.Asshole;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSecond(View v) {
        Asshole.show();
        //        Asshole.hide();
        //        Asshole.show();
        //        Asshole.hide();
        //        Asshole.show();
        //        Asshole.hide();
        //        Asshole.show();
        v.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        }, 2000);
    }

    public void onSecondCancelable(View v) {
        Asshole.showNewWindow();

        v.postDelayed(new Runnable() {
            @Override
            public void run() {
                Asshole.hide();
            }
        }, 3000);
    }

}
