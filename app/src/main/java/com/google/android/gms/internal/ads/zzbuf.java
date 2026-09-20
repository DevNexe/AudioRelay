package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.fj6;
import defpackage.xApe;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbuf {
    public static final fj6 b = new fj6(5, 0);
    public static final xApe c = new xApe();
    public final zzbtr a;

    public zzbuf(Context context, zzcgt zzcgtVar, String str, @Nullable zzfje zzfjeVar) {
        this.a = new zzbtr(context, zzcgtVar, str, b, c, zzfjeVar);
    }

    public final zzbtv zza(String str, zzbty zzbtyVar, zzbtx zzbtxVar) {
        return new zzbuj(this.a, str, zzbtyVar, zzbtxVar);
    }

    public final zzbuo zzb() {
        return new zzbuo(this.a);
    }
}
