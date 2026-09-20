package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.IqU;
import defpackage.da7;
import defpackage.oa3;
import defpackage.w05;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfep {

    @GuardedBy("lock")
    public static w05 a;
    public static final Object b = new Object();

    @GuardedBy("lock")
    public static IqU zzb;

    public static w05 zza(Context context) {
        w05 w05Var;
        zzb(context, false);
        synchronized (b) {
            w05Var = a;
        }
        return w05Var;
    }

    public static void zzb(Context context, boolean z) {
        synchronized (b) {
            if (zzb == null) {
                zzb = new da7(context);
            }
            w05 w05Var = a;
            if (w05Var == null || ((w05Var.m() && !a.n()) || (z && a.m()))) {
                IqU iqU = zzb;
                oa3.i(iqU, "the appSetIdClient shouldn't be null");
                a = iqU.a();
            }
        }
    }
}
