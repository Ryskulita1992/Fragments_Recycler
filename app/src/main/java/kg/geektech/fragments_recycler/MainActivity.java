package kg.geektech.fragments_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements InputInterface {

    MainFragment mainFragment;
    FragmentInput fragmenInputt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        mainFragment = (MainFragment) fragmentManager.findFragmentById(R.id.recycler_fragment);
        fragmenInputt = (FragmentInput) fragmentManager.findFragmentById(R.id.input_fragment);
        fragmenInputt.listener = this;
    }

    @Override
    public void onInputNumber(int number) {
        mainFragment.fullList(number);
        Log.d("lala", "fullist");
    }



    public void onRecyclerClick (String ah) {
        String shareDetails;
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("result", ah);
        startActivity(intent);
        Log.d("ololo",  "intent");
    }
}
