import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.activityeventkelasb.ClassNama;
import com.example.activityeventkelasb.Home_Activity;
import com.example.activityeventkelasb.R;

import java.util.ArrayList;
//Membuat class untuk mendeklarasikan tempat untuk meletakkan isi kedalam Listview
public class ViewHolder {
    //mendeklarasi variabel dengan jenis TextView
    TextView name;
    //Fungsi getCount () mengembalikan jumlah item yang akan ditampilkan dalam list
    @Override
    public int getCount() {
        //mengembalikan nilai berupa jumlah data dari array data
        return Home_Activity.classNamaArrayList.size();
    }
    //Fungsi ini digunakan untuk mendapatkan data item yang terkait
    @Override
    public object getItem(int i){
        return Home_Activity.classNamaArrayList.get(i);
    }
    @Override
    public View getView(int i, View view, ViewGroup) {
        final ViewHolder holder;

        if (view == null) {
            holder = new ViewHolder();

            view = inflater.inflate(R.layout.item_listview, null);

            holder.name = (TextView) view.findViewById(R.id.tvnama_item);
            view.setTag(holder);
        }else{
            view.setTag(Holder view.getTag();
        }
        holder.name.setText(Home_Activity.classNamaArrayList.get(i).getName());
            return view;
        }
    }
}
public class ListViewAdapter extends BaseAdapter {
    //Membuat konstruktor Listviewadapter
    public ListViewAdapter(Context context) {
        //Memberi nilai mContext dengan context
        mContext = context;
        //mengatur Layoutinflater dari context yang diberikan
        inflater = LayoutInflater.from(mContext);

        //Memberikan nilai arrayList dari class ClassNama
        this.arraylist = new ArrayList<ClassNama>();

        //menambahkan semua elemen ke arraylist
        this.arraylist.addAll(Home_Activity.classNamaArrayList);
    }
    //Deklarasi variabel dengan jenis data context
    Context mContext;
    //Deklarasi variabel dengan jenis data layout inflater
    LayoutInflater inflater;

    //Deklarasi variabel dengan jenis data arrayList
    private ArrayList<ClassNama> arraylist;

    //Membuat konstruktor Listviewadapter
    public ListViewAdapter(Context)
    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;

    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;


    }
}
