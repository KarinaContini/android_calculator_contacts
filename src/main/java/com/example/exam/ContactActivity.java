package com.example.exam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    ListView listView;
    Button btnAdd;

    EditText editText, editText2;


    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> phoneList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);


        listView = findViewById(R.id.listv);
        btnAdd = findViewById(R.id.btnAdd);
        editText = findViewById(R.id.name);
        editText2 = findViewById(R.id.phoneNumber);


        nameList.add("Karina Contini");
        nameList.add("Jasmin Contini");
        nameList.add("Talita Siviero");
        nameList.add("Livia Huh");

        phoneList.add("432-929-8847");
        phoneList.add("432-929-1234");
        phoneList.add("432-929-5678");
        phoneList.add("432-929-2222");

        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nameList.add(editText.getText().toString());
                phoneList.add(editText2.getText().toString());
                adapter.notifyDataSetChanged();
                //listView.setAdapter(adapter);
                Toast.makeText(getApplicationContext(),"Button clicked",Toast.LENGTH_LONG).show();
            }
        });



    }

    private class CustomAdapter extends ArrayAdapter<String> {

        public CustomAdapter() {
            super(ContactActivity.this, R.layout.list_items,nameList);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if(convertView ==null){
                convertView = getLayoutInflater().inflate(R.layout.list_items,parent,false);
            }
            TextView txtName = convertView.findViewById(R.id.txtName);
            TextView txtPhone = convertView.findViewById(R.id.txtPhone);

            txtName.setText(nameList.get(position));
            txtPhone.setText(phoneList.get(position));


            return convertView;
        }
    }
}