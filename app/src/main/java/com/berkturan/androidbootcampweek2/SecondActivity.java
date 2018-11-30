package com.berkturan.androidbootcampweek2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Yeni bir intent objesi oluşturup SecondActivity içerisinde ki intent ile eşitliyoruz.
        Intent intent2 = getIntent();
        //Yeni bir kullanıcı objesi oluşturuyoruz
        User user = new User();
        //intentten verdiğimiz key i kullanarak çektiğimiz verileri kullanıcı objemizin içerisine ekliyoruz
        user.setUserName(intent2.getStringExtra("userName"));
        user.setFullName(intent2.getStringExtra("fullName"));
        user.setEmail(intent2.getStringExtra("email"));//
        user.setBirthYear(Integer.parseInt(intent2.getStringExtra("birthYear")));
        //Telefon numarasını kullanıcı sınıfı içerisinde int tipinde tuttuğumuz için veriyi string olarak çekip integer a çevirip kullanıcımıza ekliyoruz.
        String studentNumberString = intent2.getStringExtra("studentNumber");
        user.setStudentNumber(studentNumberString);
        //ListView objemizi önyüz ile bağlıyoruz
        listView = findViewById(R.id.listView);
        //ListView objemizin içerisine vermek için bir arrayAdapter oluşturuyoruz.
        ArrayAdapter<String> veriAdaptoru=new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, android.R.id.text1, user.stringArrayForListView());

        //ArrayAdapter objemizi listView in içerisine atıyoruz
        listView.setAdapter(veriAdaptoru);






    }
}
