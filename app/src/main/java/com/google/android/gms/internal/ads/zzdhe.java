package com.google.android.gms.internal.ads;

import defpackage.ce6;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhe extends zzflz implements zzdcy, com.google.android.gms.ads.internal.client.zza, zzasb, zzdfj, zzdds, zzdex, com.google.android.gms.ads.internal.overlay.zzo, zzddo, zzdkl {

    @Nullable
    public zzfbv A;
    public final zzdhc w = new zzdhc(this);

    @Nullable
    public zzeno x;

    @Nullable
    public zzens y;

    @Nullable
    public zzeyo z;

    public static void a(zzdkl zzdklVar, ce6 ce6Var) {
        if (zzdklVar != null) {
            ce6Var.zza(zzdklVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgs
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).onAdClicked();
            }
        });
        a(this.y, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgt
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzens) obj).onAdClicked();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgy
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgb
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzbC();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgr
            @Override // defpackage.ce6
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfy
            @Override // defpackage.ce6
            public final void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzasb
    public final void zzbu(final String str, final String str2) {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfv
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzbu(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfw
            @Override // defpackage.ce6
            public final void zza(Object obj) {
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfx
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzbv();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfu
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(final int i) {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgp
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzf(i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdfj
    public final void zzg(final com.google.android.gms.ads.internal.client.zzs zzsVar) {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgv
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzg(zzsVar);
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgw
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzg(zzsVar);
            }
        });
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgx
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzg(zzsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzh() {
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgh
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzh();
            }
        });
    }

    public final zzdhc zzi() {
        return this.w;
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgn
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzj();
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzj();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgc
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzk(zzeVar);
            }
        });
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgd
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzk(zzeVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgf
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzl();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgq
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzm();
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgu
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzm();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgz
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzo();
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdha
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzo();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(final zzcbq zzcbqVar, final String str, final String str2) {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdge
            @Override // defpackage.ce6
            public final void zza(Object obj) {
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzp(zzcbqVar, str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final void zzq() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgi
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeno) obj).zzq();
            }
        });
        a(this.y, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgj
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzens) obj).zzq();
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgk
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzq();
            }
        });
        a(this.z, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgl
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzeyo) obj).zzq();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
        a(this.x, new ce6() { // from class: com.google.android.gms.internal.ads.zzdfz
            @Override // defpackage.ce6
            public final void zza(Object obj) {
            }
        });
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdga
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzr();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzflz
    public final void zzv() {
        a(this.A, new ce6() { // from class: com.google.android.gms.internal.ads.zzdgm
            @Override // defpackage.ce6
            public final void zza(Object obj) {
                ((zzfbv) obj).zzv();
            }
        });
    }
}
