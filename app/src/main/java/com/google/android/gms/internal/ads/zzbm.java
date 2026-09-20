package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbm {
    public static final zzbm zza = new zzbm(new zzbk());
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbi
    };
    public final CharSequence zzc;
    public final CharSequence zzd;
    public final CharSequence zze;
    public final CharSequence zzf;
    public final CharSequence zzg;
    public final byte[] zzh;
    public final Integer zzi;
    public final Integer zzj;
    public final Integer zzk;

    @Deprecated
    public final Integer zzl;
    public final Integer zzm;
    public final Integer zzn;
    public final Integer zzo;
    public final Integer zzp;
    public final Integer zzq;
    public final Integer zzr;
    public final CharSequence zzs;
    public final CharSequence zzt;
    public final CharSequence zzu;
    public final CharSequence zzv;
    public final CharSequence zzw;

    public zzbm(zzbk zzbkVar) {
        this.zzc = zzbkVar.a;
        this.zzd = zzbkVar.b;
        this.zze = zzbkVar.c;
        this.zzf = zzbkVar.d;
        this.zzg = zzbkVar.e;
        this.zzh = zzbkVar.f;
        this.zzi = zzbkVar.g;
        this.zzj = zzbkVar.h;
        this.zzk = zzbkVar.i;
        Integer num = zzbkVar.j;
        this.zzl = num;
        this.zzm = num;
        this.zzn = zzbkVar.k;
        this.zzo = zzbkVar.l;
        this.zzp = zzbkVar.m;
        this.zzq = zzbkVar.n;
        this.zzr = zzbkVar.o;
        this.zzs = zzbkVar.p;
        this.zzt = zzbkVar.q;
        this.zzu = zzbkVar.r;
        this.zzv = zzbkVar.s;
        this.zzw = zzbkVar.t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbm.class == obj.getClass()) {
            zzbm zzbmVar = (zzbm) obj;
            if (zzel.zzT(this.zzc, zzbmVar.zzc) && zzel.zzT(this.zzd, zzbmVar.zzd) && zzel.zzT(this.zze, zzbmVar.zze) && zzel.zzT(this.zzf, zzbmVar.zzf) && zzel.zzT(null, null) && zzel.zzT(null, null) && zzel.zzT(this.zzg, zzbmVar.zzg) && zzel.zzT(null, null) && zzel.zzT(null, null) && Arrays.equals(this.zzh, zzbmVar.zzh) && zzel.zzT(this.zzi, zzbmVar.zzi) && zzel.zzT(null, null) && zzel.zzT(this.zzj, zzbmVar.zzj) && zzel.zzT(this.zzk, zzbmVar.zzk) && zzel.zzT(null, null) && zzel.zzT(null, null) && zzel.zzT(this.zzm, zzbmVar.zzm) && zzel.zzT(this.zzn, zzbmVar.zzn) && zzel.zzT(this.zzo, zzbmVar.zzo) && zzel.zzT(this.zzp, zzbmVar.zzp) && zzel.zzT(this.zzq, zzbmVar.zzq) && zzel.zzT(this.zzr, zzbmVar.zzr) && zzel.zzT(this.zzs, zzbmVar.zzs) && zzel.zzT(this.zzt, zzbmVar.zzt) && zzel.zzT(this.zzu, zzbmVar.zzu) && zzel.zzT(null, null) && zzel.zzT(null, null) && zzel.zzT(this.zzv, zzbmVar.zzv) && zzel.zzT(null, null) && zzel.zzT(this.zzw, zzbmVar.zzw)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzc, this.zzd, this.zze, this.zzf, null, null, this.zzg, null, null, Integer.valueOf(Arrays.hashCode(this.zzh)), this.zzi, null, this.zzj, this.zzk, null, null, this.zzm, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, null, null, this.zzv, null, this.zzw});
    }

    public final zzbk zza() {
        return new zzbk(this);
    }
}
