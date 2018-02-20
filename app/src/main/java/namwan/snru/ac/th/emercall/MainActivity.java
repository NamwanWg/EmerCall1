package namwan.snru.ac.th.emercall;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import namwan.snru.ac.th.emercall.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Add Fragment
        if (savedInstanceState == null){

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragment, new MainFragment()).commit();

        }


    }   // Main Method

}   // Main Class
