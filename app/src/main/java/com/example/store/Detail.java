package com.example.store;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Detail extends AppCompatActivity {
    ListView list;
    static ArrayList<Cofe> arrayListCoffe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        list= findViewById(R.id.listdetail);
        arrayListCoffe= new ArrayList<>();
        arrayListCoffe.add(new Cofe("Coffe best of all",getString(R.string.info),R.drawable.cofe2));
        arrayListCoffe.add(new Cofe("PPPPPPPPPP","ppppppppppppppppppppppppp",12));
        arrayListCoffe.add(new Cofe("PPPPPPPPPP","ppppppppppppppppppppppppp",12));
        ArrayAdapter<Cofe> adapter=new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListCoffe);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("cofeId",0);
                        startActivity(intent);
                }

            }
        });

    }
}