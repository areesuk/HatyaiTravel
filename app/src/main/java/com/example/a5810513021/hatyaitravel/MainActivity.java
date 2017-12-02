package com.example.a5810513021.hatyaitravel;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ListView listView;
    List<Place> placeList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Attractions");
        initInstances();




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    private void initInstances() {
        prepareData();
        listView = (ListView) findViewById(R.id.list_item);
        ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListner);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_allspots) {
            listView.setAdapter(null);
            prepareData();
            listView = (ListView) findViewById(R.id.list_item);
            ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(listViewClickListner);

        } else if (id == R.id.nav_Food) {
            listView.setAdapter(null);
            prepareData1();
            listView = (ListView) findViewById(R.id.list_item);
            ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(listViewClickListner);


        } else if (id == R.id.nav_hotel) {
            listView.setAdapter(null);
            prepareData2();
            listView = (ListView) findViewById(R.id.list_item);
            ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(listViewClickListner);
        } else if (id == R.id.nav_shop) {
            listView.setAdapter(null);
            prepareData3();
            listView = (ListView) findViewById(R.id.list_item);
            ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(listViewClickListner);
        } else if (id == R.id.nav_night) {
            listView.setAdapter(null);
            prepareData4();
            listView = (ListView) findViewById(R.id.list_item);
            ListAdapter adapter = new ListAdapter(MainActivity.this,placeList);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(listViewClickListner);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    private void prepareData() {
        placeList.clear();
        int resId[] = {R.drawable.devancuisine,R.drawable.homeless,R.drawable.cenfest,R.drawable.greenway,R.drawable.centara,R.drawable.buri,R.drawable.zound,R.drawable.gasoline,R.drawable.rockhill,R.drawable.eighteen,R.drawable.chokdeedimsum,R.drawable.aseannight};
        String name[] = {"De Van Cuisine","Homeless Bar and Grill","CentralFestivalHatyai","Greenway Night Market","CentaraHotel","Buri Sriphu Boutique Hotel","Zound & Zystem Hatyai","Gasoline","TR Rock Hill Hotel","Eighteen Nineteen","Chokdee DimSum","Asean Night Bazaar Hatyai"};
        String detail[] = {"ยุโรป, สเต๊กเฮาส์, เหมาะสำหรับผู้ทานมังสวิรัติ","อเมริกัน, บาร์, บาร์บีคิว, ผับ","ห้างสรรพสินค้า","ตลาดนัด","โรงแรม","โรงแรม","สถานบันเทิงยามค่ำคืน,ผับ","สถานบันเทิงยามค่ำคืน,ผับ","โรงแรม","ผับ ร้านอาหาร แหล่งบันเทิง","ร้านอาหารเช้า และเย็น","แหล่งช้อปปิ้งยามค่ำคืน"};
        String location[] = {"162/4 Prachatipat Road, Hat-Yai, Songkhla 90110, หาดใหญ่ 90110, ไทย","ถนนประชารมย์, หาดใหญ่ 90110, ไทย","1518, 1518/1, 1518/2 ถนนกาญจนวณิช อำเภอหาดใหญ่ ตำบลหาดใหญ่ สงขลา 90110","1406/3 Kanjanavanich Rd., Hat Yai 90110, Thailand","3 ถนนเสน่หานุสรณ์, หาดใหญ่ 90110, ไทย","310 ถนนศรีภูวนารถ, หาดใหญ่ 90110, ไทย","Soi Thumnoonvithi เทศบาลนครสงขลา","เติมรมย์เก่า เทศบาลนครหาดใหญ่ 90110","728 ซอยทวีรัตน์ (กาญจนวนิช-ทุ่งโดน) ตำบลคอหงส์ อำเภอหาดใหญ่ จังหวัดสงขลา,  90110 ","19 Klongrean2 Rd. เทศบาลนครหาดใหญ่ 90110","ซอย ละม้ายสงเคราะห์ 1 เทศบาลนครหาดใหญ่ 90110","ถนนโชติวิทยะกุล 4 เทศบาลนครหาดใหญ่ 90110"};
        String facebook[] = {"devancuisine","Homeless-Bar-Grill","CentralFestivalHatyai","Greenwaymarket","CentaraHotelHatYai","buri.sriphu","zoundhatyai","Gasolinehatyai","TR-Rock-Hill-Hotel","Eighteen-Nineteen/","โชคดีแต่เตี้ยม-บะกุ๊ดเต๋-หาดใหญ่","ตลาดนัดเปิดท้าย หาดใหญ่ Asean Night Bazaar Hatyai"};
        String telnum[] = {"074 351 438","074 351 438","074 801 555","074 232 418","074 232 418","074 247 111","097 345 8456","092 406 9288","074 260 777","063 119 1819","081 372 6181","091 710 6927"};
        String time[] = {"9:00 น.- 20:00 น.","11:30 น. - 00:00 น.","11:00 น. – 22:00 น.","16:00 น. – 22:00 น.","16:00 น. – 22:00 น.","All Time ","20.00 น. - 3.00 น.","20.00 น. - 3.00 น.","All Time","18:00น. - 1:00น.","06.00-11.30 น. และเวลา 17.00-21.00 น.","เปิดทุกวันพุธ – วันอาทิตย์ ตั้งแต่เวลา 17.00น. – 22.00 น."};

        int dataSize = resId.length;
        for (int i=0;i<dataSize;i++){
            Place place = new Place(resId[i],name[i],detail[i],location[i],facebook[i],telnum[i],time[i]);
            placeList.add(place);
        }
    }
    AdapterView.OnItemClickListener listViewClickListner = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Intent intent = new Intent(MainActivity.this,ShowDetailActivity.class);
            intent.putExtra("image",placeList.get(position).getResId());
            intent.putExtra("name",placeList.get(position).getName());
            intent.putExtra("detail",placeList.get(position).getDetail());
            intent.putExtra("location",placeList.get(position).getLocation());
            intent.putExtra("facebook",placeList.get(position).getFacebook());
            intent.putExtra("telnum",placeList.get(position).getTelnum());
            intent.putExtra("time",placeList.get(position).getTime());

            startActivity(intent);
        }
    };



    private void prepareData1() {
        placeList.clear();
        int resId[] = {R.drawable.devancuisine,R.drawable.homeless,R.drawable.chokdeedimsum};
        String name[] = {"De Van Cuisine","Homeless Bar and Grill","Chokdee DimSum"};
        String detail[] = {"ยุโรป, สเต๊กเฮาส์, เหมาะสำหรับผู้ทานมังสวิรัติ","อเมริกัน, บาร์, บาร์บีคิว, ผับ","ร้านอาหารเช้า และเย็น"};
        String location[] = {"162/4 Prachatipat Road, Hat-Yai, Songkhla 90110, หาดใหญ่ 90110, ไทย","ถนนประชารมย์, หาดใหญ่ 90110, ไทย","ซอย ละม้ายสงเคราะห์ 1 เทศบาลนครหาดใหญ่ 90110"};
        String facebook[] = {"devancuisine","Homeless-Bar-Grill","โชคดีแต่เตี้ยม-บะกุ๊ดเต๋-หาดใหญ่"};
        String telnum[] = {"074 351 438","074 351 438","081 372 6181"};
        String time[] = {"9:00 น.- 20:00 น.","11:30 น. - 00:00 น.","06.00-11.30 น. และเวลา 17.00-21.00 น."};

        int dataSize = resId.length;
        for (int i=0;i<dataSize;i++){
            Place place = new Place(resId[i],name[i],detail[i],location[i],facebook[i],telnum[i],time[i]);
            placeList.add(place);
        }
    }


    private void prepareData2() {
        placeList.clear();
        int resId[] = {R.drawable.centara,R.drawable.buri,R.drawable.rockhill};
        String name[] = {"CentaraHotel","Buri Sriphu Boutique Hotel","TR Rock Hill Hotel"};
        String detail[] = {"โรงแรม","โรงแรม","โรงแรม"};
        String location[] = {"3 ถนนเสน่หานุสรณ์, หาดใหญ่ 90110, ไทย","310 ถนนศรีภูวนารถ, หาดใหญ่ 90110, ไทย","728 ซอยทวีรัตน์ (กาญจนวนิช-ทุ่งโดน) ตำบลคอหงส์ อำเภอหาดใหญ่ จังหวัดสงขลา,  90110 "};
        String facebook[] = {"CentaraHotelHatYai","buri.sriphu","TR-Rock-Hill-Hotel"};
        String telnum[] = {"074 232 418","074 247 111","074 260 777"};
        String time[] = {"All Time","All Time","All Time"};

        int dataSize = resId.length;
        for (int i=0;i<dataSize;i++){
            Place place = new Place(resId[i],name[i],detail[i],location[i],facebook[i],telnum[i],time[i]);
            placeList.add(place);
        }
    }

    private void prepareData3() {
        placeList.clear();
        int resId[] = {R.drawable.cenfest,R.drawable.greenway,R.drawable.aseannight};
        String name[] = {"CentralFestivalHatyai","Greenway Night Market","Asean Night Bazaar Hatyai"};
        String detail[] = {"ห้างสรรพสินค้า","ตลาดนัด","แหล่งช้อปปิ้งยามค่ำคืน"};
        String location[] = {"1518, 1518/1, 1518/2 ถนนกาญจนวณิช อำเภอหาดใหญ่ ตำบลหาดใหญ่ สงขลา 90110","1406/3 Kanjanavanich Rd., Hat Yai 90110, Thailand","ถนนโชติวิทยะกุล 4 เทศบาลนครหาดใหญ่ 90110"};
        String facebook[] = {"CentralFestivalHatyai","Greenwaymarket","ตลาดนัดเปิดท้าย หาดใหญ่ Asean Night Bazaar Hatyai"};
        String telnum[] = {"074 801 555","074 232 418","091 710 6927"};
        String time[] = {"11:00 น. – 22:00 น.","16:00 น. – 22:00 น.","เปิดทุกวันพุธ – วันอาทิตย์ ตั้งแต่เวลา 17.00 – 22.00 น."};

        int dataSize = resId.length;
        for (int i=0;i<dataSize;i++){
            Place place = new Place(resId[i],name[i],detail[i],location[i],facebook[i],telnum[i],time[i]);
            placeList.add(place);
        }
    }


    private void prepareData4() {
        placeList.clear();
        int resId[] = {R.drawable.zound,R.drawable.gasoline,R.drawable.eighteen};
        String name[] = {"Zound & Zystem Hatyai","Gasoline","Eighteen Nineteen"};
        String detail[] = {"สถานบันเทิงยามค่ำคืน,ผับ","สถานบันเทิงยามค่ำคืน,ผับ","ผับ ร้านอาหาร แหล่งบันเทิง"};
        String location[] = {"Soi Thumnoonvithi เทศบาลนครสงขลา","เติมรมย์เก่า เทศบาลนครหาดใหญ่ 90110","19 Klongrean2 Rd. เทศบาลนครหาดใหญ่ 90110"};
        String facebook[] = {"zoundhatyai","Gasolinehatyai","Eighteen-Nineteen"};
        String telnum[] = {"097 345 8456","092 406 9288","063 119 1819"};
        String time[] = {"20.00 น. - 3.00 น.","20.00 น. - 3.00 น.","18:00น. - 1:00น."};

        int dataSize = resId.length;
        for (int i=0;i<dataSize;i++){
            Place place = new Place(resId[i],name[i],detail[i],location[i],facebook[i],telnum[i],time[i]);
            placeList.add(place);
        }
    }
}
