package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdci {
    public Context a;
    public zzfdn b;
    public Bundle c;
    public zzfdf d;

    public final zzdci zzc(Context context) {
        this.a = context;
        return this;
    }

    public final zzdci zzd(Bundle bundle) {
        this.c = bundle;
        return this;
    }

    public final zzdci zze(zzfdf zzfdfVar) {
        this.d = zzfdfVar;
        return this;
    }

    public final zzdci zzf(zzfdn zzfdnVar) {
        this.b = zzfdnVar;
        return this;
    }

    public final zzdck zzg() {
        return new zzdck(this);
    }
}
