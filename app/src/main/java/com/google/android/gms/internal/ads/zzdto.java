package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdto implements com.google.android.gms.ads.internal.client.zza, zzbol, com.google.android.gms.ads.internal.overlay.zzo, zzbon, com.google.android.gms.ads.internal.overlay.zzz, zzdkl {
    public com.google.android.gms.ads.internal.overlay.zzz A;
    public zzdkl B;
    public com.google.android.gms.ads.internal.client.zza w;
    public zzbol x;
    public com.google.android.gms.ads.internal.overlay.zzo y;
    public zzbon z;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.w;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbol
    public final synchronized void zza(String str, Bundle bundle) {
        zzbol zzbolVar = this.x;
        if (zzbolVar != null) {
            zzbolVar.zza(str, bundle);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzbC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbon
    public final synchronized void zzbD(String str, String str2) {
        zzbon zzbonVar = this.z;
        if (zzbonVar != null) {
            zzbonVar.zzbD(str, str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        com.google.android.gms.ads.internal.overlay.zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        com.google.android.gms.ads.internal.overlay.zzz zzzVar = this.A;
        if (zzzVar != null) {
            ((zzdtp) zzzVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdkl
    public final synchronized void zzq() {
        zzdkl zzdklVar = this.B;
        if (zzdklVar != null) {
            zzdklVar.zzq();
        }
    }
}
