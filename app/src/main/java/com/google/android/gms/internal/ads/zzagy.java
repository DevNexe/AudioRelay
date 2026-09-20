package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagy implements zzagz {
    public final List a;
    public final zzaam[] b;
    public boolean c;
    public int d;
    public int e;
    public long f = -9223372036854775807L;

    public zzagy(List list) {
        this.a = list;
        this.b = new zzaam[list.size()];
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        boolean z;
        boolean z2;
        if (this.c) {
            if (this.d == 2) {
                if (zzedVar.zza() == 0) {
                    z2 = false;
                } else {
                    if (zzedVar.zzk() != 32) {
                        this.c = false;
                    }
                    this.d--;
                    z2 = this.c;
                }
                if (!z2) {
                    return;
                }
            }
            if (this.d == 1) {
                if (zzedVar.zza() == 0) {
                    z = false;
                } else {
                    if (zzedVar.zzk() != 0) {
                        this.c = false;
                    }
                    this.d--;
                    z = this.c;
                }
                if (!z) {
                    return;
                }
            }
            int iZzc = zzedVar.zzc();
            int iZza = zzedVar.zza();
            for (zzaam zzaamVar : this.b) {
                zzedVar.zzF(iZzc);
                zzaamVar.zzq(zzedVar, iZza);
            }
            this.e += iZza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        int i = 0;
        while (true) {
            zzaam[] zzaamVarArr = this.b;
            if (i >= zzaamVarArr.length) {
                return;
            }
            zzaii zzaiiVar = (zzaii) this.a.get(i);
            zzailVar.zzc();
            zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 3);
            zzad zzadVar = new zzad();
            zzadVar.zzH(zzailVar.zzb());
            zzadVar.zzS("application/dvbsubs");
            zzadVar.zzI(Collections.singletonList(zzaiiVar.zzb));
            zzadVar.zzK(zzaiiVar.zza);
            zzaamVarZzv.zzk(zzadVar.zzY());
            zzaamVarArr[i] = zzaamVarZzv;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
        if (this.c) {
            if (this.f != -9223372036854775807L) {
                for (zzaam zzaamVar : this.b) {
                    zzaamVar.zzs(this.f, 1, this.e, 0, null);
                }
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
            this.f = j;
        }
        this.e = 0;
        this.d = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.c = false;
        this.f = -9223372036854775807L;
    }
}
