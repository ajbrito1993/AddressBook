package com.example.fragmentrehash;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class ContactFragment extends Fragment {

    private Contact contact;
    private String contactString
    private TextView contactTextView;
    private TextView emailTextView;
    private TextView addressTextView;
    private EditText contactEditText;
    private EditText emailEditText;
    private EditText addressEditText;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        contact = new Contact();




    }
    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState){

        View view = layoutInflater.inflate(R.layout.fragment_contact, container,false);

        contactTextView = (TextView) view.findViewById(R.id.contactTextView);
        contactEditText = (EditText) view.findViewById(R.id.contactEditText);
        emailTextView = (TextView) view.findViewById(R.id.emailTextView);
        emailEditText = (EditText) view.findViewById(R.id.emailEditText);
        addressTextView = (TextView) view.findViewById(R.id.addressTextView);
        addressEditText = (EditText) view.findViewById(R.id.addressEditText);

        contactEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


        return view;

    }


}
