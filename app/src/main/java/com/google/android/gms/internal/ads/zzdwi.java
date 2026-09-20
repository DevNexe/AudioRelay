package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwi implements zzdft, zzdem, zzddb, zzdds, com.google.android.gms.ads.internal.client.zza, zzdie {
    public final zzbel w;

    @GuardedBy("this")
    public boolean x = false;

    public zzdwi(zzbel zzbelVar, @Nullable zzfan zzfanVar) {
        this.w = zzbelVar;
        zzbelVar.zzc(2);
        if (zzfanVar != null) {
            zzbelVar.zzc(1101);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final synchronized void onAdClicked() {
        if (this.x) {
            this.w.zzc(8);
        } else {
            this.w.zzc(7);
            this.x = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = zzeVar.zza;
        zzbel zzbelVar = this.w;
        switch (i) {
            case 1:
                zzbelVar.zzc(101);
                break;
            case 2:
                zzbelVar.zzc(102);
                break;
            case 3:
                zzbelVar.zzc(5);
                break;
            case 4:
                zzbelVar.zzc(103);
                break;
            case 5:
                zzbelVar.zzc(104);
                break;
            case 6:
                zzbelVar.zzc(105);
                break;
            case 7:
                zzbelVar.zzc(106);
                break;
            default:
                zzbelVar.zzc(4);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(final zzfde zzfdeVar) {
        this.w.zzb(new zzbek() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                zzfde zzfdeVar2 = zzfdeVar;
                zzbew zzbewVar = (zzbew) zzbgaVar.zza().zzaz();
                zzbfo zzbfoVar = (zzbfo) zzbgaVar.zza().zzd().zzaz();
                zzbfoVar.zza(zzfdeVar2.zzb.zzb.zzb);
                zzbewVar.zzb(zzbfoVar);
                zzbgaVar.zze(zzbewVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzd() {
        this.w.zzc(1109);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zze(final zzbfg zzbfgVar) {
        zzbek zzbekVar = new zzbek() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                zzbgaVar.zzf(zzbfgVar);
            }
        };
        zzbel zzbelVar = this.w;
        zzbelVar.zzb(zzbekVar);
        zzbelVar.zzc(1103);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzf(final zzbfg zzbfgVar) {
        zzbek zzbekVar = new zzbek() { // from class: com.google.android.gms.internal.ads.zzdwg
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                zzbgaVar.zzf(zzbfgVar);
            }
        };
        zzbel zzbelVar = this.w;
        zzbelVar.zzb(zzbekVar);
        zzbelVar.zzc(1102);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzh(boolean z) {
        this.w.zzc(true != z ? 1108 : 1107);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzi(final zzbfg zzbfgVar) {
        zzbek zzbekVar = new zzbek() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzbek
            public final void zza(zzbga zzbgaVar) {
                zzbgaVar.zzf(zzbfgVar);
            }
        };
        zzbel zzbelVar = this.w;
        zzbelVar.zzb(zzbekVar);
        zzbelVar.zzc(1104);
    }

    @Override // com.google.android.gms.internal.ads.zzdie
    public final void zzk(boolean z) {
        this.w.zzc(true != z ? 1106 : 1105);
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzl() {
        this.w.zzc(6);
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final void zzn() {
        this.w.zzc(3);
    }
}
