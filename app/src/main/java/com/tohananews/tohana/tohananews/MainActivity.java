package com.tohananews.tohana.tohananews;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.tohananews.tohana.tohananews.adapaters.TohanaNewsAdapter;
import com.tohananews.tohana.tohananews.models.TohanaNewsModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView title, date;
    private RecyclerView recyclerView;
    private TohanaNewsAdapter adapter;
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        title = findViewById(R.id.title);
        date = findViewById(R.id.date);

        title.setShadowLayer(30, 0, 0, Color.BLACK);
        date.setShadowLayer(30, 0, 0, Color.BLACK);

        String data = "[{\n" +
                "  \"id\" : 1,\n" +
                "  \"title\": \"hello man\",\n" +
                "  \"content\" : \"good contanet\",\n" +
                "  \"date\" : \"hello man date\",\n" +
                "  \"author\" : \"Manu Single\",\n" +
                "  \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 2,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 3,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },{\n" +
                "  \"id\" : 4,\n" +
                "  \"title\": \"hello man\",\n" +
                "  \"content\" : \"good contanet\",\n" +
                "  \"date\" : \"hello man date\",\n" +
                "  \"author\" : \"Manu Single\",\n" +
                "  \"category\" : \"top\"\n" +
                "},\n" +
                "\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"id\" : 4,\n" +
                "    \"title\": \"hello man\",\n" +
                "    \"content\" : \"good contanet\",\n" +
                "    \"date\" : \"hello man date\",\n" +
                "    \"author\" : \"Manu Single\",\n" +
                "    \"category\" : \"top\"\n" +
                "  }\n" +
                "]";

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<TohanaNewsModel>>(){}.getType();
        List<TohanaNewsModel>  json =  gson.fromJson(data, type);





       Log.i(TAG, ""+json);

        adapter = new TohanaNewsAdapter(this,json);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

        adapter.notifyDataSetChanged();


    }
}
