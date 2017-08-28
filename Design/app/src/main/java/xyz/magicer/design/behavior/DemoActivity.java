package xyz.magicer.design.behavior;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import xyz.magicer.design.R;

public class DemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
        TextView dependent = (TextView) findViewById(R.id.depentent);

        dependent.setOnClickListener(v -> {
            ViewCompat.offsetTopAndBottom(v, 10);
            ViewCompat.jumpDrawablesToCurrentState(dependent);
            dependent.jumpDrawablesToCurrentState();
        });
    }
}
