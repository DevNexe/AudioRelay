package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.mx2;
import defpackage.nn5;
import defpackage.on5;
import defpackage.s52;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {
    public static final String a = s52.e("ConstrntProxyUpdtRecvr");

    public class QnHx implements Runnable {
        public final /* synthetic */ Intent w;
        public final /* synthetic */ Context x;
        public final /* synthetic */ BroadcastReceiver.PendingResult y;

        public QnHx(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.w = intent;
            this.x = context;
            this.y = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.y;
            Context context = this.x;
            Intent intent = this.w;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                s52.c().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                mx2.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                mx2.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                mx2.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                mx2.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            ((on5) nn5.W0(context).z).a(new QnHx(intent, context, goAsync()));
        } else {
            s52.c().a(a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
