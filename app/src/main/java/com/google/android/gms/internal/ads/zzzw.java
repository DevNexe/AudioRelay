package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzw {
    public final zzed a = new zzed(10);

    public final zzbq zza(zzzg zzzgVar, zzacx zzacxVar) {
        zzed zzedVar = this.a;
        zzbq zzbqVarZza = null;
        int i = 0;
        while (true) {
            try {
                ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, 10, false);
                zzedVar.zzF(0);
                if (zzedVar.zzm() != 4801587) {
                    break;
                }
                zzedVar.zzG(3);
                int iZzj = zzedVar.zzj();
                int i2 = iZzj + 10;
                if (zzbqVarZza == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(zzedVar.zzH(), 0, bArr, 0, 10);
                    ((zzyv) zzzgVar).zzm(bArr, 10, iZzj, false);
                    zzbqVarZza = zzacz.zza(bArr, i2, zzacxVar, new zzaca());
                } else {
                    ((zzyv) zzzgVar).zzl(iZzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzzgVar.zzj();
        ((zzyv) zzzgVar).zzl(i, false);
        return zzbqVarZza;
    }
}
