package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagu implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzagt
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzagu(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final zzagv a;
    public final zzed b;
    public final zzed c;
    public final zzec d;
    public zzzi e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;

    public zzagu() {
        this(0);
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) {
        zzdd.zzb(this.e);
        zzed zzedVar = this.b;
        int iZza = zzzgVar.zza(zzedVar.zzH(), 0, 2048);
        if (!this.i) {
            this.e.zzL(new zzaah(-9223372036854775807L, 0L));
            this.i = true;
        }
        if (iZza == -1) {
            return -1;
        }
        zzedVar.zzF(0);
        zzedVar.zzE(iZza);
        boolean z = this.h;
        zzagv zzagvVar = this.a;
        if (!z) {
            zzagvVar.zzd(this.f, 4);
            this.h = true;
        }
        zzagvVar.zza(zzedVar);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.e = zzziVar;
        this.a.zzb(zzziVar, new zzail(Integer.MIN_VALUE, 0, 1));
        zzziVar.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        this.h = false;
        this.a.zze();
        this.f = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        zzed zzedVar;
        int i = 0;
        while (true) {
            zzedVar = this.c;
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
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            zzyvVar2.zzm(zzedVar.zzH(), 0, 2, false);
            zzedVar.zzF(0);
            if (zzagv.zzf(zzedVar.zzo())) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                zzyvVar2.zzm(zzedVar.zzH(), 0, 4, false);
                zzec zzecVar = this.d;
                zzecVar.zzh(14);
                int iZzc = zzecVar.zzc(13);
                if (iZzc <= 6) {
                    i2++;
                    zzzgVar.zzj();
                    zzyvVar2.zzl(i2, false);
                } else {
                    zzyvVar2.zzl(iZzc - 6, false);
                    i4 += iZzc;
                }
            } else {
                i2++;
                zzzgVar.zzj();
                zzyvVar2.zzl(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    public zzagu(int i) {
        this.a = new zzagv(true, null);
        this.b = new zzed(2048);
        this.g = -1L;
        zzed zzedVar = new zzed(10);
        this.c = zzedVar;
        byte[] bArrZzH = zzedVar.zzH();
        this.d = new zzec(bArrZzH, bArrZzH.length);
    }
}
