package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbau {
    public final List zza;
    public final int zzb;

    public zzbau(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzbau zza(zzbag zzbagVar) throws zzasv {
        try {
            zzbagVar.zzw(21);
            int iZzg = zzbagVar.zzg() & 3;
            int iZzg2 = zzbagVar.zzg();
            int iZzc = zzbagVar.zzc();
            int i = 0;
            for (int i2 = 0; i2 < iZzg2; i2++) {
                zzbagVar.zzw(1);
                int iZzj = zzbagVar.zzj();
                for (int i3 = 0; i3 < iZzj; i3++) {
                    int iZzj2 = zzbagVar.zzj();
                    i += iZzj2 + 4;
                    zzbagVar.zzw(iZzj2);
                }
            }
            zzbagVar.zzv(iZzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < iZzg2; i5++) {
                zzbagVar.zzw(1);
                int iZzj3 = zzbagVar.zzj();
                for (int i6 = 0; i6 < iZzj3; i6++) {
                    int iZzj4 = zzbagVar.zzj();
                    System.arraycopy(zzbae.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzbagVar.zza, zzbagVar.zzc(), bArr, i7, iZzj4);
                    i4 = i7 + iZzj4;
                    zzbagVar.zzw(iZzj4);
                }
            }
            return new zzbau(i == 0 ? null : Collections.singletonList(bArr), iZzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzasv("Error parsing HEVC config", e);
        }
    }
}
