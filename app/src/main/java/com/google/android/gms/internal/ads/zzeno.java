package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.util.Pair;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeno implements zzdft, zzdem, zzddb, zzdds, com.google.android.gms.ads.internal.client.zza, zzdcy, zzdfj, zzasb, zzddo, zzdkl {
    public final zzfhz E;
    public final AtomicReference w = new AtomicReference();
    public final AtomicReference x = new AtomicReference();
    public final AtomicReference y = new AtomicReference();
    public final AtomicReference z = new AtomicReference();
    public final AtomicReference A = new AtomicReference();
    public final AtomicBoolean B = new AtomicBoolean(true);
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final AtomicBoolean D = new AtomicBoolean(false);
    public final ArrayBlockingQueue F = new ArrayBlockingQueue(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhw)).intValue());

    public zzeno(zzfhz zzfhzVar) {
        this.E = zzfhzVar;
    }

    @TargetApi(5)
    public final void a() {
        if (this.C.get() && this.D.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.F;
            for (final Pair pair : arrayBlockingQueue) {
                zzezv.zza(this.x, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenf
                    @Override // com.google.android.gms.internal.ads.zzezu
                    public final void zza(Object obj) {
                        Pair pair2 = pair;
                        ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            arrayBlockingQueue.clear();
            this.B.set(false);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
            return;
        }
        zzezv.zza(this.w, zzeng.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        AtomicReference atomicReference = this.w;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzeni
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzf(zzeVar);
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenj
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zze(zzeVar.zza);
            }
        });
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenk
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzb(zzeVar);
            }
        });
        this.B.set(false);
        this.F.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        this.B.set(true);
        this.D.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    @TargetApi(5)
    public final synchronized void zzbu(final String str, final String str2) {
        if (!this.B.get()) {
            zzezv.zza(this.x, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenb
                @Override // com.google.android.gms.internal.ads.zzezu
                public final void zza(Object obj) {
                    ((com.google.android.gms.ads.internal.client.zzbz) obj).zzc(str, str2);
                }
            });
            return;
        }
        if (!this.F.offer(new Pair(str, str2))) {
            zzcgn.zze("The queue for app events is full, dropping the new event.");
            zzfhz zzfhzVar = this.E;
            if (zzfhzVar != null) {
                zzfhy zzfhyVarZzb = zzfhy.zzb("dae_action");
                zzfhyVarZzb.zza("dae_name", str);
                zzfhyVarZzb.zza("dae_data", str2);
                zzfhzVar.zzb(zzfhyVarZzb);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbf zzc() {
        return (com.google.android.gms.ads.internal.client.zzbf) this.w.get();
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbz zzd() {
        return (com.google.android.gms.ads.internal.client.zzbz) this.x.get();
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        this.w.set(zzbfVar);
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.z.set(zzbiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        zzezv.zza(this.y, new zzezu() { // from class: com.google.android.gms.internal.ads.zzend
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzde) obj).zze(zzsVar);
            }
        });
    }

    public final void zzh(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        this.y.set(zzdeVar);
    }

    public final void zzi(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        this.x.set(zzbzVar);
        this.C.set(true);
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzd();
            }
        });
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzemx
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenc
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzd(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzemw
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzg();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzene
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzh();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final synchronized void zzn() {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenl
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzi();
            }
        });
        zzezv.zza(this.z, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenm
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbi) obj).zzc();
            }
        });
        this.D.set(true);
        a();
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        zzezv.zza(this.w, new zzezu() { // from class: com.google.android.gms.internal.ads.zzemy
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzbf) obj).zzj();
            }
        });
        AtomicReference atomicReference = this.A;
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzemz
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzf();
            }
        });
        zzezv.zza(atomicReference, new zzezu() { // from class: com.google.android.gms.internal.ads.zzena
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziq)).booleanValue()) {
            zzezv.zza(this.w, zzeng.zza);
        }
        zzezv.zza(this.A, new zzezu() { // from class: com.google.android.gms.internal.ads.zzenh
            @Override // com.google.android.gms.internal.ads.zzezu
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.client.zzcg) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.A.set(zzcgVar);
    }
}
