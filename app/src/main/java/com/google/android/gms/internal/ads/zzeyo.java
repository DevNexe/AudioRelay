package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyo implements zzddb, zzdex, zzfae, com.google.android.gms.ads.internal.overlay.zzo, zzdfj, zzddo, zzdkl {
    public final zzfeu w;
    public final AtomicReference x = new AtomicReference();
    public final AtomicReference y = new AtomicReference();
    public final AtomicReference z = new AtomicReference();
    public final AtomicReference A = new AtomicReference();
    public final AtomicReference B = new AtomicReference();
    public final AtomicReference C = new AtomicReference();
    public zzeyo D = null;

    public zzeyo(zzfeu zzfeuVar) {
        this.w = zzfeuVar;
    }

    public static zzeyo zzi(zzeyo zzeyoVar) {
        zzeyo zzeyoVar2 = new zzeyo(zzeyoVar.w);
        zzeyoVar2.D = zzeyoVar;
        return zzeyoVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zza(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.x;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzexz
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdi) obj).zzc(zzeVar);
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdi) obj).zzb(zzeVar.zza);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzb();
            return;
        }
        zzezv.zza(this.B, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzb();
            }
        });
        AtomicReference atomicReference = this.z;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyi
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdm) obj).zzf();
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyj
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdm) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzbC();
        } else {
            zzezv.zza(this.B, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeye
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzbC();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.internal.ads.zzfae
    public final void zzbL(zzfae zzfaeVar) {
        this.D = (zzeyo) zzfaeVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zze();
        } else {
            zzezv.zza(this.B, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyl
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zze();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzf(i);
        } else {
            zzezv.zza(this.B, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyd
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzg(zzsVar);
        } else {
            zzezv.zza(this.C, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyc
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzde) obj).zze(zzsVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzh() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzh();
        } else {
            zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyn
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((zzdex) obj).zzh();
                }
            });
        }
    }

    public final void zzj() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzj();
            return;
        }
        this.w.zza();
        zzezv.zza(this.y, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeya
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdj) obj).zze();
            }
        });
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyb
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((zzbdm) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzk(zzeVar);
        } else {
            zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyk
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((zzbdm) obj).zzd(zzeVar);
                }
            });
        }
    }

    public final void zzl(final zzbdf zzbdfVar) {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzl(zzbdfVar);
        } else {
            zzezv.zza(this.x, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeyg
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((zzbdi) obj).zzd(zzbdfVar);
                }
            });
        }
    }

    public final void zzn(zzdex zzdexVar) {
        this.A.set(zzdexVar);
    }

    public final void zzo(com.google.android.gms.ads.internal.overlay.zzo zzoVar) {
        this.B.set(zzoVar);
    }

    public final void zzp(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.C.set(zzdeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        zzeyo zzeyoVar = this.D;
        if (zzeyoVar != null) {
            zzeyoVar.zzq();
        } else {
            zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeym
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((zzbdm) obj).zzb();
                }
            });
        }
    }

    public final void zzr(zzbdi zzbdiVar) {
        this.x.set(zzbdiVar);
    }

    public final void zzs(zzbdm zzbdmVar) {
        this.z.set(zzbdmVar);
    }

    public final void zzt(zzbdj zzbdjVar) {
        this.y.set(zzbdjVar);
    }
}
