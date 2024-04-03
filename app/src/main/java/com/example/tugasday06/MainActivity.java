package com.example.tugasday06;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rv1;
    private adapteritem adapteritem;
    private ArrayList<itemmodel>itemmodels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        rv1 = findViewById(R.id.rv1);
        adapteritem = new adapteritem(itemmodels);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        rv1.setLayoutManager(layoutManager);
        rv1.setAdapter(adapteritem);

        adapteritem.setOnItemClickListener(new adapteritem.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent click = new Intent(MainActivity.this,detailmain.class);
                itemmodel item = itemmodels.get(position);
                click.putExtra(detailmain.key_data,item);
                startActivity(click);
            }
        });

        }


    private void getData() {
        itemmodels = new ArrayList<>();
        itemmodels.add(new itemmodel("NB 520 v8", R.drawable.nb_520_v8,"New Balance", "mens shoes","Our men's 520v8 is made for the comfort seekers also looking for a great performance design.This shoe takes inspiration from high-end running shoes while ensuring that comfort and support are the priority. ","Rp. 1,199,000"));
        itemmodels.add(new itemmodel("NB 1080 fresh foam", R.drawable.nb_1080_fresh_foam_x_1080_v13,"New Balance", "mens shoes","If we only made one running shoe, that shoe would be the 1080. What makes the 1080 unique isn’t just that it’s the best running shoe we make, it’s also the most versatile. ","Rp. 2,729,000"));
        itemmodels.add(new itemmodel("NB 550 v3", R.drawable.nb_550_mens_sneakers_shoes,"New Balance", "mens shoes"," The return of a legend. Originally worn by pros, the new 550 pays tribute to the 1989 original with classic details reminiscent of the era - simple, clean and true to its legacy.","Rp. 2,099,000"));
        itemmodels.add(new itemmodel("NB fresh foam x trail", R.drawable.nb_fresh_foam_x_more_trail_v3,"New Balance", "mens shoes"," Whether you're hitting the trails for training or just to enjoy the scenery, you can keep your feet cool, comfortable, and cushioned in the New Balance Fresh Foam X Trail More v3.","Rp. 2,599,000"));
        itemmodels.add(new itemmodel("NB made in us teddy", R.drawable.nb_made_in_us_teddy_990v6,"New Balance", "mens shoes","  Proof that quality still exists, our Made in the USA 990v6 is the ultimate blend of performance and style. Made without compromise, the 990v6 is a staple of both morning runs and fashion runways.","Rp. 4,499,000"));
        itemmodels.add(new itemmodel("Adidas 4DWD 3", R.drawable.adidas___4dfwd_3_running_shoes,"Adidas", "mens shoes"," Embrace the rush of a run in these adidas 4DFWD 3 running shoes. Named for the futuristic cushioning they ride on, their 3D-printed midsole propels you forwards with every stride. these shoes turn city streets into an open track. ","Rp. 3,500,000"));
        itemmodels.add(new itemmodel("Adidas Samba OG", R.drawable.adidas__samba_og,"Adidas", "mens shoes","  Whether heading to the pitch or the streets, the adidas Samba OG shoes keep your style on point. Their iconic gum sole and suede accents have propelled the Samba into fashion fame. Smooth leather envelops the foot in retro comfort as the serrated 3-Stripes add a flash of contrast.","Rp. 2,200,000"));
        itemmodels.add(new itemmodel("Adidas Ultra Boost Light", R.drawable.adidas_ultraboostlight_shoes,"Adidas", "mens shoes","   Embrace the rush of a run in these adidas 4DFWD 3 running shoes. Named for the futuristic cushioning they ride on, their 3D-printed midsole propels you forwards with every stride. these shoes turn city streets into an open track.","Rp. 3,300,000"));
        itemmodels.add(new itemmodel("Adidas Adizero Adios Pro", R.drawable.adidas__adizero_adios_pro_3m,"Adidas", "mens shoes","  The Adizero Adios Pro 3 is the pinnacle of Adizero Racing products. It was built with and for athletes to achieve unbelievable feats. These adidas running shoes are made to optimize running efficiency. Our carbon-infused ENERGYRODS provide lightweight stiffness for a snappy, efficient stride.","Rp. 4,000,000"));
        itemmodels.add(new itemmodel("Adidas Adizero Takumi sen 10", R.drawable.adidas_adizero_takumi_sen_10,"Adidas", "mens shoes","  When milliseconds matter, these adidas running shoes are tuned for speed. Lightning-quick Lightstrike Pro cushioning keeps you light on your feet down to the finish line, while ENERGYRODS limit energy loss so you can maintain your pace.","Rp. 3,200,000"));
        itemmodels.add(new itemmodel("Nike Air Jordan 1 low", R.drawable.nike_airjordan1low,"Nike", "mens shoes"," Inspired by the original that debuted in 1985, the Air Jordan 1 Low offers a clean, classic look that's familiar yet always fresh. With an iconic design that pairs perfectly with any 'fit, these kicks ensure you'll always be on point. ","Rp. 1,729,000"));
        itemmodels.add(new itemmodel("Nike AirMax 1", R.drawable.nike_airmax1,"Nike", "mens shoes","  The Air Max 1 SE goes back to basics with a simple black and white design. It retains the same revolutionary cushioning that made it famous while adding a pop of colour to the tongue.","Rp. 2,379,000"));
        itemmodels.add(new itemmodel("Nike AirMax Furyosa", R.drawable.nike_airmaxfuryosa,"Nike", "mens shoes","  With a chunky look inspired by the fast-paced running shoes of the '90s, the Air Max Furyosa brings a powerful new voice to your wardrobe. The stacked Air units in the heel are offset, delivering a bold statement and extra cushioning.","Rp. 2,489,000"));
        itemmodels.add(new itemmodel("Nike AirMax Pulse", R.drawable.nike_airmaxpulse,"Nike", "mens shoes","  The Air Max Pulse pulls inspiration from the London music scene, bringing an underground touch to the iconic Air Max line. Its textile-wrapped midsole and vacuum-sealed accents keep 'em looking fresh and clean, while colours inspired by the London music scene give your look the edge.","Rp. 2,489,000"));
        itemmodels.add(new itemmodel("Nike AirMax 97", R.drawable.nike_airmax_97,"Nike", "mens shoes","  Featuring the original ripple design inspired by Japanese bullet trains, the Nike Air Max 97 lets you push your style full-speed ahead.","Rp. 2,389,000"));


    }
}