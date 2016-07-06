package go.i7.com.recyclerviewcard.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

import go.i7.com.recyclerviewcard.R;
import go.i7.com.recyclerviewcard.model.Record;

import java.util.ArrayList;
import java.util.List;


public class CardViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardview);

        List<Record> records = new ArrayList<Record>();
        populateRecords(records);

        CardView cardView = (CardView)findViewById(R.id.cardView);
    }

    private void populateRecords(List<Record> records){
        for (int i = 0; i<50; i++){
            Record record = new Record();
            record.setName("Item №" + i);
            record.setType(Record.Type.values()[i%3]);
            records.add(record);
        }
    }

}
