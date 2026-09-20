package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.zzgq;
import defpackage.bi6;
import defpackage.dq6;
import defpackage.f17;
import defpackage.h17;
import defpackage.jl5;
import defpackage.r27;
import defpackage.tb7;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements f17 {
    public h17 w;

    @Override // defpackage.f17
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = jl5.w;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = jl5.w;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // defpackage.f17
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final h17 c() {
        if (this.w == null) {
            this.w = new h17(this);
        }
        return this.w;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        h17 h17VarC = c();
        if (intent == null) {
            h17VarC.c().f.b("onBind called with null intent");
        } else {
            h17VarC.getClass();
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new zzgq(r27.K(h17VarC.a));
            }
            h17VarC.c().i.c(action, "onBind received unknown action");
        }
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        bi6 bi6Var = dq6.p(c().a, null, null).i;
        dq6.h(bi6Var);
        bi6Var.n.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        bi6 bi6Var = dq6.p(c().a, null, null).i;
        dq6.h(bi6Var);
        bi6Var.n.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        c().a(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final h17 h17VarC = c();
        final bi6 bi6Var = dq6.p(h17VarC.a, null, null).i;
        dq6.h(bi6Var);
        if (intent == null) {
            bi6Var.i.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        bi6Var.n.d(Integer.valueOf(i2), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: c17
            @Override // java.lang.Runnable
            public final void run() {
                h17 h17Var = h17VarC;
                f17 f17Var = (f17) h17Var.a;
                int i3 = i2;
                if (f17Var.zzc(i3)) {
                    bi6Var.n.c(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    h17Var.c().n.b("Completed wakeful intent.");
                    f17Var.a(intent);
                }
            }
        };
        r27 r27VarK = r27.K(h17VarC.a);
        r27VarK.zzaz().m(new tb7(r27VarK, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        c().b(intent);
        return true;
    }

    @Override // defpackage.f17
    public final boolean zzc(int i) {
        return stopSelfResult(i);
    }
}
