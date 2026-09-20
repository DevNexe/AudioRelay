package com.google.android.gms.internal.ads;

import defpackage.tq2;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcbn extends zzcbp {
    public final String w;
    public final int x;

    public zzcbn(String str, int i) {
        this.w = str;
        this.x = i;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcbn)) {
            zzcbn zzcbnVar = (zzcbn) obj;
            if (tq2.a(this.w, zzcbnVar.w) && tq2.a(Integer.valueOf(this.x), Integer.valueOf(zzcbnVar.x))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final int zzb() {
        return this.x;
    }

    @Override // com.google.android.gms.internal.ads.zzcbq
    public final String zzc() {
        return this.w;
    }
}
