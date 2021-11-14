package jp.techacademy.yoshihisa.wada.aisatsuapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val timePickerDialog = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                    Log.d("UI_PARTS", "$hour:$minute")

                    //textView.setText(Integer.toString(hour))
                    if (hour >= 2  && hour <= 9) {
                        textView.setText("おはようございます");
                    } else if(hour >= 10 && hour <= 17) {
                        textView.setText("こんにちわ");
                    } else if (hour >= 18 && hour <= 23) {
                        textView.setText("こんばんは");
                    } else if (hour >= 0 && hour <= 1) {
                        textView.setText("こんばんは");
                    }
                },
                13, 0, true)
            timePickerDialog.show()
        }
    }
}