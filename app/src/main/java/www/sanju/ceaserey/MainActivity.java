package www.sanju.ceaserey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import javax.crypto.Cipher;

public class MainActivity extends AppCompatActivity {

    private Button encrpyt, decrypt;
    private EditText message, cipher, key;
    private TextView myOutput;


    private static final String[] ALPHABETARRAY = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r"
            , "s", "t", "u", "v", "w", "x", "y", "z"};

    private static final String ALPHABETSTRING = "abcdefghijklmnopqrstuvwxyz";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        encrpyt = (Button) findViewById(R.id.button7);
        decrypt = (Button) findViewById(R.id.button8);
        myOutput = (TextView) findViewById(R.id.textView7);

        message = (EditText) findViewById(R.id.messageED);
        cipher = (EditText) findViewById(R.id.cipherED);
        key = (EditText) findViewById(R.id.keyED);


        encrpyt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                encryptt(message.getText().toString(), Integer.parseInt(key.getText().toString()));
            }
        });

        decrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // decryptt(cipher.getText().toString(), Integer.parseInt(key.getText().toString()));
                decryptt(encryptt(myOutput.getText().toString(), Integer.parseInt(key.getText().toString())), Integer.parseInt(key.getText().toString()));
            }
        });


    }



    public String encryptt(String message, int shiftKey)
    {
        message = message.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < message.length(); i++)
        {
            int charPosition = ALPHABETSTRING.indexOf(message.charAt(i));
            int keyVal = (shiftKey + charPosition) % 26;
            char replaceVal = ALPHABETSTRING.charAt(keyVal);
            cipherText += replaceVal;

            myOutput.setText(cipherText);
            cipher.setText(cipherText);

        }
        return cipherText;
    }


    public  String decryptt(String cipherText, int shiftKey)
    {
        cipherText = cipherText.toLowerCase();
        String plainText = "";
        for (int i = 0; i < cipherText.length(); i++)
        {
            int charPosition = ALPHABETSTRING.indexOf(cipherText.charAt(i));
            int keyVal = (charPosition - shiftKey) % 26;
            if (keyVal < 0)
            {
                keyVal = ALPHABETSTRING.length() + keyVal;
            }
            char replaceVal = ALPHABETSTRING.charAt(keyVal);
            plainText += replaceVal;
        }
        return plainText;
    }
}
