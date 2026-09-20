package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.mc7;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwc {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzwd zzwdVar) {
        zzc(zzwdVar);
        this.a.add(new mc7(handler, zzwdVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        for (final mc7 mc7Var : this.a) {
            if (!mc7Var.c) {
                mc7Var.a.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzwa
                    @Override // java.lang.Runnable
                    public final void run() {
                        mc7 mc7Var2 = mc7Var;
                        mc7Var2.b.zzY(i, j, j2);
                    }
                });
            }
        }
    }

    public final void zzc(zzwd zzwdVar) {
        CopyOnWriteArrayList<mc7> copyOnWriteArrayList = this.a;
        for (mc7 mc7Var : copyOnWriteArrayList) {
            if (mc7Var.b == zzwdVar) {
                mc7Var.c = true;
                copyOnWriteArrayList.remove(mc7Var);
            }
        }
    }
}
