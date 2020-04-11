package kg.geektech.fragments_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;

    public class SecondActivity extends AppCompatActivity {
        String result;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentSecond secondFragment= (FragmentSecond) fragmentManager.findFragmentById(R.id.text_view_fragment);
            Intent intent = getIntent();
            result = intent.getStringExtra("result");
            secondFragment.textView.setText(result);


        }
    }
