package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.bi6;
import defpackage.dq6;
import defpackage.jl5;
import defpackage.vk6;
import defpackage.wk6;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementReceiver extends jl5 implements vk6 {
    public wk6 y;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.y == null) {
            this.y = new wk6(this);
        }
        wk6 wk6Var = this.y;
        wk6Var.getClass();
        bi6 bi6Var = dq6.p(context, null, null).i;
        dq6.h(bi6Var);
        if (intent == null) {
            bi6Var.i.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        bi6Var.n.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                bi6Var.i.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        bi6Var.n.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) wk6Var.a).getClass();
        SparseArray<PowerManager.WakeLock> sparseArray = jl5.w;
        synchronized (sparseArray) {
            int i = jl5.x;
            int i2 = i + 1;
            jl5.x = i2;
            if (i2 <= 0) {
                jl5.x = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
        }
    }
}
