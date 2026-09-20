package com.google.android.gms.internal.ads;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahl implements zzagz {
    public zzaam b;
    public boolean c;
    public int e;
    public int f;
    public final zzed a = new zzed(10);
    public long d = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        zzdd.zzb(this.b);
        if (this.c) {
            int iZza = zzedVar.zza();
            int i = this.f;
            if (i < 10) {
                int iMin = Math.min(iZza, 10 - i);
                byte[] bArrZzH = zzedVar.zzH();
                int iZzc = zzedVar.zzc();
                zzed zzedVar2 = this.a;
                System.arraycopy(bArrZzH, iZzc, zzedVar2.zzH(), this.f, iMin);
                if (this.f + iMin == 10) {
                    zzedVar2.zzF(0);
                    if (zzedVar2.zzk() != 73 || zzedVar2.zzk() != 68 || zzedVar2.zzk() != 51) {
                        Log.w("Id3Reader", "Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        zzedVar2.zzG(3);
                        this.e = zzedVar2.zzj() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iZza, this.e - this.f);
            this.b.zzq(zzedVar, iMin2);
            this.f += iMin2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 5);
        this.b = zzaamVarZzv;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzailVar.zzb());
        zzadVar.zzS("application/id3");
        zzaamVarZzv.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
        int i;
        zzdd.zzb(this.b);
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                this.b.zzs(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
