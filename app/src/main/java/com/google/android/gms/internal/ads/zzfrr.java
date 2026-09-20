package com.google.android.gms.internal.ads;

import defpackage.rm6;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzfrr implements zzfsg {
    public static zzfrr zzc(char c) {
        return new rm6(c);
    }

    @Override // com.google.android.gms.internal.ads.zzfsg
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c);
}
