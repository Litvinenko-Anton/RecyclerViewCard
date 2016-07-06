package go.i7.com.recyclerviewcard.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import go.i7.com.recyclerviewcard.R;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        public void showRecycleView(View view) {
            Intent intent = new Intent(this, RecyclerViewActivity.class);
            startActivity(intent);
        }

        public void showCardView(View view) {
            Intent intent = new Intent(this, CardViewActivity.class);
            startActivity(intent);
        }

    }
