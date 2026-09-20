package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfga {
    public final zzfft a;
    public final zzfyx b;

    @GuardedBy("this")
    public boolean c = false;

    @GuardedBy("this")
    public boolean d = false;

    public zzfga(final zzfey zzfeyVar, final zzffs zzffsVar, final zzfft zzfftVar) {
        this.a = zzfftVar;
        this.b = zzfyo.zzg(zzfyo.zzn(zzffsVar.zza(zzfftVar), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzffy
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzfyx zzfyxVarZzi;
                zzfga zzfgaVar = this.zza;
                zzffs zzffsVar2 = zzffsVar;
                zzfey zzfeyVar2 = zzfeyVar;
                zzfft zzfftVar2 = zzfftVar;
                zzffh zzffhVar = (zzffh) obj;
                synchronized (zzfgaVar) {
                    zzfgaVar.d = true;
                    zzffsVar2.zzb(zzffhVar);
                    if (zzfgaVar.c) {
                        zzfyxVarZzi = zzfyo.zzi(new zzffr(zzffhVar, zzfftVar2));
                    } else {
                        zzfeyVar2.zzd(zzfftVar2.zza(), zzffhVar);
                        zzfyxVarZzi = zzfyo.zzi(null);
                    }
                }
                return zzfyxVarZzi;
            }
        }, zzfftVar.zzb()), Exception.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzffz
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzfga zzfgaVar = this.zza;
                Exception exc = (Exception) obj;
                synchronized (zzfgaVar) {
                    zzfgaVar.d = true;
                    throw exc;
                }
            }
        }, zzfftVar.zzb());
    }

    public final synchronized zzfyx zza(zzfft zzfftVar) {
        if (!this.d && !this.c) {
            if (this.a.zza() != null && zzfftVar.zza() != null && this.a.zza().equals(zzfftVar.zza())) {
                this.c = true;
                return this.b;
            }
            return null;
        }
        return null;
    }

    public final synchronized void zzd(zzfyk zzfykVar) {
        zzfyo.zzr(zzfyo.zzn(this.b, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzffx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzj();
            }
        }, this.a.zzb()), zzfykVar, this.a.zzb());
    }
}
