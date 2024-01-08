package hr.algebra.dogapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import hr.algebra.dogapp.framework.startActivity

class DogReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        context.startActivity<HostActivity>()
    }
}