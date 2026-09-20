package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzarm implements Callable {
    public Method A;
    public final int B;
    public final int C;
    public final zzaqb w;
    public final String x;
    public final String y;
    public final zzamh z;

    public zzarm(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        this.w = zzaqbVar;
        this.x = str;
        this.y = str2;
        this.z = zzamhVar;
        this.B = i;
        this.C = i2;
    }

    public abstract void a();

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        zzk();
        return null;
    }

    public Void zzk() {
        int i;
        zzaqb zzaqbVar = this.w;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = zzaqbVar.zzj(this.x, this.y);
            this.A = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            a();
            zzaow zzaowVarZzd = zzaqbVar.zzd();
            if (zzaowVarZzd != null && (i = this.B) != Integer.MIN_VALUE) {
                zzaowVarZzd.zzc(this.C, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }
}
