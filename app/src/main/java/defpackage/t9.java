package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class t9 extends xf<Boolean> {
    public static final String i = s52.e("BatteryNotLowTracker");

    public t9(Context context, c15 c15Var) {
        super(context, c15Var);
    }

    @Override // defpackage.c70
    public final Object a() {
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        s52.c().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // defpackage.xf
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.xf
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        s52.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            b(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            b(Boolean.FALSE);
        }
    }
}
