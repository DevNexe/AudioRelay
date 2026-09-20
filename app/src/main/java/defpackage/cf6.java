package defpackage;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.internal.ads.zzbol;
import com.google.android.gms.internal.ads.zzbon;
import com.google.android.gms.internal.ads.zzdtg;

/* JADX INFO: loaded from: classes3.dex */
public final class cf6 implements zza, zzbol, zzo, zzbon, zzz {
    public zzz A;
    public zza w;
    public zzbol x;
    public zzo y;
    public zzbon z;

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        zza zzaVar = this.w;
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
        zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzb();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        zzo zzoVar = this.y;
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
        zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzbK();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzbr();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        zzo zzoVar = this.y;
        if (zzoVar != null) {
            zzoVar.zzf(i);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzz
    public final synchronized void zzg() {
        zzz zzzVar = this.A;
        if (zzzVar != null) {
            ((zzdtg) zzzVar).zza.zzb();
        }
    }
}
