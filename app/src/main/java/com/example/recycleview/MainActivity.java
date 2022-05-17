package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<C_Agents> valo_list =new ArrayList<>();
    RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.rvID);
        valo_list.add (new C_Agents("Brimstone"," : Prepare for hellfire!",R.drawable.brimstoneprof,R.drawable.brimstone));
        valo_list.add(new C_Agents ("Sage"," : You will not kill my ALLIES !",R.drawable.sageprofile,R.drawable.sage));
        valo_list.add (new C_Agents("Sova"," : I am the hunter!",R.drawable.sovaprofile,R.drawable.sovawallpaper));
        valo_list.add (new C_Agents("Viper"," : Welcome to my world!",R.drawable.viperprof,R.drawable.viper));
        valo_list.add (new C_Agents("Cypher"," : I know EXACTLY where you are",R.drawable.cypherprof,R.drawable.cypher));
        valo_list.add (new C_Agents("Phoenix"," : Jokes over, you’re dead!",R.drawable.phoenixprofile,R.drawable.phoenix));
        valo_list.add (new C_Agents("Reyna", " : The hunt begins!",R.drawable.reynaprofile,R.drawable.reyna));
        valo_list.add (new C_Agents("Breach"," : Off your feet!",R.drawable.breachprof,R.drawable.breach));
        valo_list.add (new C_Agents("Killjoy"," : You should run!",R.drawable.killjoyprof,R.drawable.killjoy));
        valo_list.add (new C_Agents("Omen"," : Scatter!",R.drawable.omenprof,R.drawable.omen));
        valo_list.add (new C_Agents("Jett"," : Watch this!",R.drawable.jettprofile,R.drawable.jett));
        valo_list.add (new C_Agents("Raze"," : Here comes the party!",R.drawable.razeprofile,R.drawable.raze));
        valo_list.add (new C_Agents("Skye"," : You should run!",R.drawable.skyeprofile,R.drawable.skye));
        valo_list.add (new C_Agents("Yoru"," : I’ll handle this",R.drawable.yoruprofile,R.drawable.yoru));
        valo_list.add (new C_Agents("Astra"," : World divided",R.drawable.astraprof,R.drawable.astra));
        valo_list.add (new C_Agents("Kay/O"," : No one walks away",R.drawable.kayo,R.drawable.kayowallpaper));
        valo_list.add (new C_Agents("Chamber"," : You want to play? Let’s play",R.drawable.chamber,R.drawable.chamberwallpaper));
        valo_list.add (new C_Agents("Neon"," : Oy! I’m pissed!",R.drawable.neonprof,R.drawable.neon));

        CustomAdapter adapter = new CustomAdapter(MainActivity.this,valo_list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rv.setLayoutManager(layoutManager);
        rv.setHasFixedSize(true);
        rv.setAdapter(adapter);



    }
}