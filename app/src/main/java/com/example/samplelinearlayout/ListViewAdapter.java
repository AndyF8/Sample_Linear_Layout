package com.example.samplelinearlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListViewAdapter extends BaseAdapter{

    //Deklarasi variabel dengan jenis data context
    Context mContext;

    //Deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arraylist
    private ArrayList<ClassNama> arraylist;


    public  ListViewAdapter(Context context) {

        //Memberi nilai mContext dengan context
        mContext =  context;

        //Mengatur layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //memberikan nilai array list dari class ClassNama
        this.arraylist = new ArrayList<ClassNama>();

        //Menambahkan semua elemen ke arraylist
        this.arraylist.addAll(Home_Activity.classNamaArrayList);



    }
    public  class  ViewHolder{
        TextView name;

    }
    @Override
    public int getCount() {
        return Home_Activity.classNamaArrayList.size();

    }

    @Override
    public Object getItem(int i) {
        return Home_Activity.classNamaArrayList.get(i);

    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //deklarasi variabel dengan jenis data viewholder
        final ViewHolder holder;

        //membuat kondisi apakah view null atau tidak
        if (view == null) {

            //membuat objek view holder
            holder = new ViewHolder();

            //mengatur layout untuk menampilkan item
            view = inflater.inflate(R.layout.ltem_listview, null);

            //set id untuk textview
            holder.name = (TextView) view.findViewById(R.id.tvnamaitem);

            //menyimpan data dalam Tampilan tanpa enggunakan struktur data lain
            view.setTag(holder);
        }else{
            //mengatur holder untuk mengembalikan nilai dari view tag
            holder =(ViewHolder) view.getTag();
        }
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());

        return view;

    }
}
