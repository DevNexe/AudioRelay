package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzago implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzagn
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzago()};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final zzagp a = new zzagp(null);
    public final zzed b = new zzed(2786);
    public boolean c;

    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) {
        zzed zzedVar = this.b;
        int iZza = zzzgVar.zza(zzedVar.zzH(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        zzedVar.zzF(0);
        zzedVar.zzE(iZza);
        boolean z = this.c;
        zzagp zzagpVar = this.a;
        if (!z) {
            zzagpVar.zzd(0L, 4);
            this.c = true;
        }
        zzagpVar.zza(zzedVar);
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
        zzed zzedVar = new zzed(10);
        int i = 0;
        while (true) {
            zzyv zzyvVar = (zzyv) zzzgVar;
            zzyvVar.zzm(zzedVar.zzH(), 0, 10, false);
            zzedVar.zzF(0);
            if (zzedVar.zzm() != 4801587) {
                break;
            }
            zzedVar.zzG(3);
            int iZzj = zzedVar.zzj();
            i += iZzj + 10;
            zzyvVar.zzl(iZzj, false);
        }
        zzzgVar.zzj();
        zzyv zzyvVar2 = (zzyv) zzzgVar;
        zzyvVar2.zzl(i, false);
        int i2 = i;
        while (true) {
            int i3 = 0;
            while (true) {
                zzyvVar2.zzm(zzedVar.zzH(), 0, 6, false);
                zzedVar.zzF(0);
                if (zzedVar.zzo() != 2935) {
                    break;
                }
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                int iZzb = zzyg.zzb(zzedVar.zzH());
                if (iZzb == -1) {
                    return false;
                }
                zzyvVar2.zzl(iZzb - 6, false);
            }
            zzzgVar.zzj();
            i2++;
            if (i2 - i >= 8192) {
                return false;
            }
            zzyvVar2.zzl(i2, false);
        }
    }
}
