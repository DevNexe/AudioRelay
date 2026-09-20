package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbv extends zzflz implements zzdem, zzddb, zzdcy, zzddo, zzdfj, zzfae, zzdkl {
    public final zzfeu w;
    public final AtomicReference x = new AtomicReference();
    public final AtomicReference y = new AtomicReference();
    public final AtomicReference z = new AtomicReference();
    public final AtomicReference A = new AtomicReference();
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();

    public zzfbv(zzfeu zzfeuVar) {
        this.w = zzfeuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        final int i = zzeVar.zza;
        AtomicReference atomicReference = this.y;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbb
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccq) obj).zzf(zzeVar);
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbc
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccq) obj).zze(i);
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbd
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzg(i);
            }
        });
    }

    public final void zzb(zzflz zzflzVar) {
        this.x.set(zzflzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfae
    public final void zzbL(zzfae zzfaeVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbg
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzk();
            }
        });
    }

    public final void zzc(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.D.set(zzdeVar);
    }

    public final void zzd(zzccm zzccmVar) {
        this.z.set(zzccmVar);
    }

    public final void zze(zzccq zzccqVar) {
        this.y.set(zzccqVar);
    }

    @Deprecated
    public final void zzf(zzcbw zzcbwVar) {
        this.A.set(zzcbwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezv.zza(this.D, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfba
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(zzsVar);
            }
        });
    }

    @Deprecated
    public final void zzh(zzcbr zzcbrVar) {
        this.C.set(zzcbrVar);
    }

    public final void zzi(zzccr zzccrVar) {
        this.B.set(zzccrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        this.w.zza();
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbh
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zzg();
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbi
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        AtomicReference atomicReference = this.z;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbe
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zzi(zzeVar);
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbf
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zzh(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbq
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        zzezv.zza(this.y, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbn
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccq) obj).zzg();
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbo
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzi();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        AtomicReference atomicReference = this.z;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbj
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zzj();
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbl
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzj();
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbm
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zzf();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(final zzcbq zzcbqVar, final String str, final String str2) {
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbr
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                zzcbq zzcbqVar2 = zzcbqVar;
                ((zzccm) obj).zzk(new zzcda(zzcbqVar2.zzc(), zzcbqVar2.zzb()));
            }
        });
        zzezv.zza(this.B, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                zzcbq zzcbqVar2 = zzcbqVar;
                ((zzccr) obj).zze(new zzcda(zzcbqVar2.zzc(), zzcbqVar2.zzb()), str, str2);
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbt
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zze(zzcbqVar);
            }
        });
        zzezv.zza(this.C, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbr) obj).zze(zzcbqVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfaz
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzccm) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbk
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzcbw) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final void zzv() {
        zzezv.zza(this.x, new zzezu() { // from class: com.google.android.gms.internal.ads.zzfbp
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzflz) obj).zzv();
            }
        });
    }
}
