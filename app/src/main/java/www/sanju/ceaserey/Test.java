package www.sanju.ceaserey;

import android.text.TextUtils;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {


//
//    private void decryptText() {
//
//        String answer = "";
//        String encyptText = "";
//        ArrayList<String > shifted = new ArrayList<>();
//
//
//        int shift = loadShift();
//
//        shifted = createShiftAlphabet(shift);
//
//        encyptText = cipher.getText().toString();
//
//        myOutput.setText(answer);
//
//        printKey(shifted);
//
//
//
//
//    }
//
//    private void encrpytText() {
//
//        String answer ="";
//        String mymessage = "";
//
//        ArrayList<String > shifted = new ArrayList<>();
//        int shift = loadShift();
//
//        shifted = createShiftAlphabet(shift);
//
//        mymessage = message.getText().toString();
//
//        myOutput.setText(answer);
//
//        printKey(shifted);
//
//
//    }
//
//
//    private ArrayList<String> createShiftAlphabet(int shift){
//
//        int temp = shift;
//
//        // make copy of alphabet
//
//        ArrayList<String> shiftAlphabet = new ArrayList<>(Arrays.asList(ALPHABETARRAY));
//
//        // create shift alphabet
//
//        while (temp>0){
//            String s = shiftAlphabet.remove(0);
//            shiftAlphabet.add(s);
//            --temp;
//        }
//
//        return shiftAlphabet;
//
//    }
//
//
//    private  void printKey (ArrayList<String> shiftedList){
//
//        String shiftedString = "";
//
//
//        for (int i=0; i<shiftedList.size(); ++i){
//            shiftedString += shiftedList.get(i);
//
//
//            myOutput.setText(ALPHABETSTRING+ "\n" + shiftedString);
//
//
//        }
//    }
//
//
//
//    private int loadShift(){
//        int shift = 0;
//
//        if (TextUtils.isEmpty(key.getText().toString())){
//
//            Toast.makeText(this, "Enter Key!", Toast.LENGTH_SHORT).show();
//        } else {
//
//            shift = Integer.parseInt(key.getText().toString());
//
//        }
//
//        if (shift>25|| shift<0){
//            Toast.makeText(this, "Illegal Number, Please enter number below 25", Toast.LENGTH_SHORT).show();
//
//            shift = 0;
//        }
//
//
//
//        return shift;
//
//    }



}
