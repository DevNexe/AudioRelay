package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagr implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzagq
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzagr()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final zzags a = new zzags(null);
    public final zzed b = new zzed(16384);
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) {
        zzed zzedVar = this.b;
        int iZza = zzzgVar.zza(zzedVar.zzH(), 0, 16384);
        if (iZza == -1) {
            return -1;
        }
        zzedVar.zzF(0);
        zzedVar.zzE(iZza);
        boolean z = this.c;
        zzags zzagsVar = this.a;
        if (!z) {
            zzagsVar.zzd(0L, 4);
            this.c = true;
        }
        zzagsVar.zza(zzedVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.a.zzb(zzziVar, new zzail(Integer.MIN_VALUE, 0, 1));
        zzziVar.zzB();
        zzziVar.zzL(new zzaah(-9223372036854775807L, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.c = false;
        this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        int i;
        zzed zzedVar = new zzed(10);
        int i2 = 0;
        while (true) {
            zzyv zzyvVar = (zzyv) zzzgVar;
            zzyvVar.zzm(zzedVar.zzH(), 0, 10, false);
            zzedVar.zzF(0);
            if (zzedVar.zzm() != 4801587) {
                break;
            }
            zzedVar.zzG(3);
            int iZzj = zzedVar.zzj();
            i2 += iZzj + 10;
            zzyvVar.zzl(iZzj, false);
        }
        zzzgVar.zzj();
        zzyv zzyvVar2 = (zzyv) zzzgVar;
        zzyvVar2.zzl(i2, false);
        int i3 = i2;
        while (true) {
            int i4 = 0;
            while (true) {
                int i5 = 7;
                zzyvVar2.zzm(zzedVar.zzH(), 0, 7, false);
                zzedVar.zzF(0);
                int iZzo = zzedVar.zzo();
                if (iZzo == 44096 || iZzo == 44097) {
                    i4++;
                    if (i4 >= 4) {
                        return true;
                    }
                    byte[] bArrZzH = zzedVar.zzH();
                    int[] iArr = zzyj.a;
                    if (bArrZzH.length < 7) {
                        i = -1;
                    } else {
                        int i6 = ((bArrZzH[2] & 255) << 8) | (bArrZzH[3] & 255);
                        if (i6 == 65535) {
                            i6 = ((bArrZzH[4] & 255) << 16) | ((bArrZzH[5] & 255) << 8) | (bArrZzH[6] & 255);
                        } else {
                            i5 = 4;
                        }
                        if (iZzo == 44097) {
                            i5 += 2;
                        }
                        i = i6 + i5;
                    }
                    if (i == -1) {
                        return false;
                    }
                    zzyvVar2.zzl(i - 7, false);
                }
            }
            zzzgVar.zzj();
            i3++;
            if (i3 - i2 >= 8192) {
                return false;
            }
            zzyvVar2.zzl(i3, false);
        }
    }
}
