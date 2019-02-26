package cubex.mahesh.br_feb9am19

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var iFilter = IntentFilter( )
        iFilter.addAction(Intent.ACTION_HEADSET_PLUG)
        iFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        iFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        iFilter.addAction(Intent.ACTION_SCREEN_OFF)
        iFilter.addAction(Intent.ACTION_SCREEN_ON)
        iFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        iFilter.addAction("download is completed")
        registerReceiver(MyReceiver(textView),iFilter)

        button.setOnClickListener {
                var i = Intent( )
                i.setAction("download is completed")
                sendBroadcast(i)
        }
    } // onCreate( )

}
