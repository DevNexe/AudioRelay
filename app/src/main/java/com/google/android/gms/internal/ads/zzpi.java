package com.google.android.gms.internal.ads;

import android.os.Handler;
import defpackage.a97;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpi {
    public final CopyOnWriteArrayList a;
    public final int zza;
    public final zzsg zzb;

    public zzpi() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public zzpi(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsg zzsgVar) {
        this.a = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsgVar;
    }

    public final zzpi zza(int i, zzsg zzsgVar) {
        return new zzpi(this.a, i, zzsgVar);
    }

    public final void zzb(Handler handler, zzpj zzpjVar) {
        zzpjVar.getClass();
        this.a.add(new a97(zzpjVar));
    }

    public final void zzc(zzpj zzpjVar) {
        CopyOnWriteArrayList<a97> copyOnWriteArrayList = this.a;
        for (a97 a97Var : copyOnWriteArrayList) {
            if (a97Var.a == zzpjVar) {
                copyOnWriteArrayList.remove(a97Var);
            }
        }
    }
}
