package go.i7.com.recyclerviewcard.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import go.i7.com.recyclerviewcard.R;
import go.i7.com.recyclerviewcard.adapter.RecyclerViewAdapter;
import go.i7.com.recyclerviewcard.model.Record;


public class RecyclerViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        List<Record> records = new ArrayList<Record>();
        populateRecords(records);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(records);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.ItemAnimator itemAnimator = new DefaultItemAnimator();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(itemAnimator);
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
