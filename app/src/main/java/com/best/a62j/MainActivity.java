package com.best.a62j;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.best.a62j.Adapter.BasicAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a();
    }
    void a() {
        context = this;
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));

        ArrayList<User> list = new ArrayList<>();
        list.add(new User("FIRST LIST", R.drawable.rasm1));
        list.add(new User("SECOND LIST", R.drawable.rasm2));
        list.add(new User("THIRD LIST", R.drawable.rasm3));
        list.add(new User("FOURTH LIST", R.drawable.rasm4));
        list.add(new User("FIFTH LIST", R.drawable.rasm5));
        list.add(new User("SIXTH LIST", R.drawable.rasm6));
        list.add(new User("SEVENTH LIST", R.drawable.rasm7));
        b(list);

    }
    void b(ArrayList<User> user){
        BasicAdapter adapter = new BasicAdapter(context,user);
        recyclerView.setAdapter(adapter);
    }

}