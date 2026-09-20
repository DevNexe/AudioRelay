package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class zzcxh {
    public final zzcza a;
    public final View b;
    public final zzfct c;
    public final zzcmn d;

    public zzcxh(View view, zzcmn zzcmnVar, zzcza zzczaVar, zzfct zzfctVar) {
        this.b = view;
        this.d = zzcmnVar;
        this.a = zzczaVar;
        this.c = zzfctVar;
    }

    public static final zzdke zzf(final Context context, final zzcgt zzcgtVar, final zzfcs zzfcsVar, final zzfdn zzfdnVar) {
        return new zzdke(new zzdem() { // from class: com.google.android.gms.internal.ads.zzcxf
            @Override // com.google.android.gms.internal.ads.zzdem
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzt().zzn(context, zzcgtVar.zza, zzfcsVar.zzD.toString(), zzfdnVar.zzf);
            }
        }, zzcha.zzf);
    }

    public static final Set zzg(zzcyr zzcyrVar) {
        return Collections.singleton(new zzdke(zzcyrVar, zzcha.zzf));
    }

    public static final zzdke zzh(zzcyp zzcypVar) {
        return new zzdke(zzcypVar, zzcha.zze);
    }

    public final View zza() {
        return this.b;
    }

    public final zzcmn zzb() {
        return this.d;
    }

    public final zzcza zzc() {
        return this.a;
    }

    public zzdek zzd(Set set) {
        return new zzdek(set);
    }

    public final zzfct zze() {
        return this.c;
    }
}
