package com.google.android.gms.internal.ads;

import defpackage.cz5;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarl {
    public final zzaqb a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public zzarl(zzaqb zzaqbVar, String str, String str2, Class... clsArr) {
        this.a = zzaqbVar;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        zzaqbVar.zzk().submit(new cz5(this, 2));
    }

    public final Method zza() {
        if (this.d != null) {
            return this.d;
        }
        try {
            if (this.f.await(2L, TimeUnit.SECONDS)) {
                return this.d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
