package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgue extends zzguj {
    public final String a;

    public zzgue(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zzguj
    public final void zza(String str) {
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
