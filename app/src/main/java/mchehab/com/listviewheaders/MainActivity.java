package mchehab.com.listviewheaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        for(int i=0;i<30;i++){
            list.add("String # " + i);
        }
        ListView listView = findViewById(R.id.listView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout
                .simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
        listView.addHeaderView(getLayoutInflater().inflate(R.layout.listview_header, null));
        listView.addFooterView(getLayoutInflater().inflate(R.layout.listview_footer, null));
    }
}