package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class r9 extends xf<Boolean> {
    public static final String i = s52.e("BatteryChrgTracker");

    public r9(Context context, c15 c15Var) {
        super(context, c15Var);
    }

    @Override // defpackage.c70
    public final Object a() {
        int intExtra;
        Intent intentRegisterReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            s52.c().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.xf
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.xf
    public final void f(Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b = 0;
        s52.c().a(i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b = -1;
                }
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            b(Boolean.FALSE);
            return;
        }
        if (b == 1) {
            b(Boolean.FALSE);
        } else if (b == 2) {
            b(Boolean.TRUE);
        } else {
            if (b != 3) {
                return;
            }
            b(Boolean.TRUE);
        }
    }
}
