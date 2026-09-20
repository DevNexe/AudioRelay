package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfli {
    public final zzfkq a;
    public final ArrayList b;

    public zzfli(zzfkq zzfkqVar, String str) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.a = zzfkqVar;
        arrayList.add(str);
    }

    public final zzfkq zza() {
        return this.a;
    }

    public final ArrayList zzb() {
        return this.b;
    }

    public final void zzc(String str) {
        this.b.add(str);
    }
}
