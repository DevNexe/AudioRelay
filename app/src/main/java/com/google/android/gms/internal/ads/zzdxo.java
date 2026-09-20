package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzdxo {
    public final zzdxt a;
    public final Executor b;
    public final Map c;

    public zzdxo(zzdxt zzdxtVar, Executor executor) {
        this.a = zzdxtVar;
        this.c = zzdxtVar.zza();
        this.b = executor;
    }

    public final zzdxn zza() {
        zzdxn zzdxnVar = new zzdxn(this);
        zzdxnVar.a.putAll(this.c);
        return zzdxnVar;
    }
}
