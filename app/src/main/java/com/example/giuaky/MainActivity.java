package com.example.giuaky;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ListView;
import android.widget.TextView;

import com.example.adapter.SoAdapter;
import com.example.model.So;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    EditText edtA ,edtB;
    TextView txtKQ;
    Button BTNtinh;

     ListView lvKQ;
    ArrayList<So> dsKQ;
    SoAdapter soAdapter;
//    ListView listviewID;
//    ArrayList <so> dscacso;
//    adapter adapterview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add();
        addEvents();
    }

    private void addEvents() {
        // xóa từng item khi nhấn giữ lâu

        lvKQ.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                dsKQ.remove(position);
                soAdapter.notifyDataSetChanged();
            }
        });

        // nút này vừa tính phép chia + thêm vào listview giống như nút thêm trong danh bạ
        // mặc dù đề là ghi tạo lịch sử, thực chất ra là thêm nó vào listView

        BTNtinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float a = Integer.parseInt(edtA.getText().toString());
                float b = Integer.parseInt(edtB.getText().toString());
                float kq = a/b;
                txtKQ.setText((String.valueOf(a))+(String.valueOf("/"))+(String.valueOf(b))+(String.valueOf("="))+(String.valueOf(kq)));


                // Khúc đây là contructors có đối số
                So so = new So(
                        edtA.getText().toString(),
                        edtB.getText().toString(),
                        txtKQ.getText().toString()
                        );

                dsKQ.add(so);
                soAdapter.notifyDataSetChanged();
            }
        });
    }

    private void add(){
        edtA =(EditText)findViewById(R.id.edittextA);
        edtB =(EditText)findViewById(R.id.edittextB);
        txtKQ =(TextView)findViewById(R.id.txtKQ);
        BTNtinh= (Button)findViewById(R.id.BTNtinh);
//

        // 4 cái dưới đây là cái để kết nối bên Adapter
        lvKQ = (ListView) findViewById(R.id.listviewID);
        dsKQ = new ArrayList<>();
        soAdapter = new SoAdapter(MainActivity.this, R.layout.item,dsKQ);
        lvKQ.setAdapter(soAdapter);


    }

}
