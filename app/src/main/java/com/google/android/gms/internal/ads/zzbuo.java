package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuo {
    public final zzbtr a;
    public zzfyx b;

    public zzbuo(zzbtr zzbtrVar) {
        this.a = zzbtrVar;
    }

    public final void a() {
        if (this.b == null) {
            final zzchf zzchfVar = new zzchf();
            this.b = zzchfVar;
            this.a.zzb(null).zzi(new zzchj() { // from class: com.google.android.gms.internal.ads.zzbum
                @Override // com.google.android.gms.internal.ads.zzchj
                public final void zza(Object obj) {
                    zzchfVar.zzd((zzbts) obj);
                }
            }, new zzchh() { // from class: com.google.android.gms.internal.ads.zzbun
                @Override // com.google.android.gms.internal.ads.zzchh
                /* JADX INFO: renamed from: zza */
                public final void mo43zza() {
                    zzchfVar.zze(new zzbtu("Cannot get Javascript Engine"));
                }
            });
        }
    }

    public final zzbur zza(String str, zzbty zzbtyVar, zzbtx zzbtxVar) {
        a();
        return new zzbur(this.b, zzbtyVar, zzbtxVar);
    }

    public final void zzb(final String str, final zzbpq zzbpqVar) {
        a();
        this.b = zzfyo.zzn(this.b, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzbuk
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzbts zzbtsVar = (zzbts) obj;
                zzbtsVar.zzq(str, zzbpqVar);
                return zzfyo.zzi(zzbtsVar);
            }
        }, zzcha.zzf);
    }

    public final void zzc(final String str, final zzbpq zzbpqVar) {
        this.b = zzfyo.zzm(this.b, new zzfru() { // from class: com.google.android.gms.internal.ads.zzbul
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzbts zzbtsVar = (zzbts) obj;
                zzbtsVar.zzr(str, zzbpqVar);
                return zzbtsVar;
            }
        }, zzcha.zzf);
    }
}
