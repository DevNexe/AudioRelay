package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeap implements com.google.android.gms.ads.internal.overlay.zzo, zzcny {
    public boolean A;
    public boolean B;
    public long C;
    public com.google.android.gms.ads.internal.client.zzcy D;
    public boolean E;
    public final Context w;
    public final zzcgt x;
    public zzeai y;
    public zzcmn z;

    public zzeap(Context context, zzcgt zzcgtVar) {
        this.w = context;
        this.x = zzcgtVar;
    }

    public final synchronized boolean a(com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhz)).booleanValue()) {
            zzcgn.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzfem.zzd(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.y == null) {
            zzcgn.zzj("Ad inspector had an internal error.");
            try {
                zzcyVar.zze(zzfem.zzd(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.A && !this.B) {
            if (com.google.android.gms.ads.internal.zzt.zzB().b() >= this.C + ((long) ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhC)).intValue())) {
                return true;
            }
        }
        zzcgn.zzj("Ad inspector cannot be opened because it is already open.");
        try {
            zzcyVar.zze(zzfem.zzd(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcny
    public final synchronized void zza(boolean z) {
        if (z) {
            com.google.android.gms.ads.internal.util.zze.zza("Ad inspector loaded.");
            this.A = true;
            synchronized (this) {
                if (this.A && this.B) {
                    zzcha.zze.execute(new zzeao(this));
                }
            }
            return;
        }
        zzcgn.zzj("Ad inspector failed to load.");
        try {
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.D;
            if (zzcyVar != null) {
                zzcyVar.zze(zzfem.zzd(17, null, null));
            }
        } catch (RemoteException unused) {
        }
        this.E = true;
        this.z.destroy();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        this.B = true;
        synchronized (this) {
            if (this.A && this.B) {
                zzcha.zze.execute(new zzeao(this));
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(int i) {
        this.z.destroy();
        if (!this.E) {
            com.google.android.gms.ads.internal.util.zze.zza("Inspector closed.");
            com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.D;
            if (zzcyVar != null) {
                try {
                    zzcyVar.zze(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.B = false;
        this.A = false;
        this.C = 0L;
        this.E = false;
        this.D = null;
    }

    public final void zzg(zzeai zzeaiVar) {
        this.y = zzeaiVar;
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zzcy zzcyVar, zzbpr zzbprVar) {
        if (a(zzcyVar)) {
            try {
                com.google.android.gms.ads.internal.zzt.zzA();
                zzcmn zzcmnVarZza = zzcmz.zza(this.w, zzcoc.zza(), "", false, false, null, null, this.x, null, null, null, zzbel.zza(), null, null);
                this.z = zzcmnVarZza;
                zzcoa zzcoaVarZzP = zzcmnVarZza.zzP();
                if (zzcoaVarZzP == null) {
                    zzcgn.zzj("Failed to obtain a web view for the ad inspector");
                    try {
                        zzcyVar.zze(zzfem.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                this.D = zzcyVar;
                zzcoaVarZzP.zzL(null, null, null, null, null, false, null, null, null, null, null, null, null, null, zzbprVar, null, new zzbqh(this.w));
                zzcoaVarZzP.zzz(this);
                this.z.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhA));
                com.google.android.gms.ads.internal.zzt.zzj();
                com.google.android.gms.ads.internal.overlay.zzm.zza(this.w, new AdOverlayInfoParcel(this, this.z, 1, this.x), true);
                this.C = com.google.android.gms.ads.internal.zzt.zzB().b();
            } catch (zzcmy e) {
                zzcgn.zzk("Failed to obtain a web view for the ad inspector", e);
                try {
                    zzcyVar.zze(zzfem.zzd(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException unused2) {
                }
            }
        }
    }
}
