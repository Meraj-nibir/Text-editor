package com.example.texteditor;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextTextMultiLine);

    }

//    public void buttonBold(View view){
//        Spannable spannableString = new SpannableStringBuilder(editText.getText());
//        spannableString.setSpan(new StyleSpan(Typeface.BOLD),editText.getSelectionStart(),
//                editText.getSelectionEnd(),
//                0);
//        editText.setText(spannableString);
//    }

    public void buttonItalic(View view){
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new StyleSpan(Typeface.ITALIC),editText.getSelectionStart(),
                editText.getSelectionEnd(),
                0);
        editText.setText(spannableString);
    }

    public void buttonUnderLine(View view){
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        spannableString.setSpan(new UnderlineSpan(),editText.getSelectionStart(),
                editText.getSelectionEnd(),
                0);
        editText.setText(spannableString);
    }

    public void buttonNoFormat(View view){
        String stringText = editText.getText().toString();
        editText.setText(stringText);
    }

    public void buttonAlignLeft(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_START);
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }

    public void buttonAlignCentre(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }

    public void buttonAlignRight(View view){
        editText.setTextAlignment(View.TEXT_ALIGNMENT_TEXT_END);
        Spannable spannableString = new SpannableStringBuilder(editText.getText());
        editText.setText(spannableString);
    }
}