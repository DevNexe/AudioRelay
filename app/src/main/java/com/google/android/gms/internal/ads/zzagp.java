package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagp implements zzagz {
    public final zzec a;
    public final zzed b;
    public final String c;
    public String d;
    public zzaam e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public zzaf j;
    public int k;
    public long l;

    public zzagp() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        zzdd.zzb(this.e);
        while (zzedVar.zza() > 0) {
            int i = this.f;
            zzed zzedVar2 = this.b;
            if (i == 0) {
                while (zzedVar.zza() > 0) {
                    if (this.h) {
                        int iZzk = zzedVar.zzk();
                        if (iZzk == 119) {
                            this.h = false;
                            this.f = 1;
                            zzedVar2.zzH()[0] = 11;
                            zzedVar2.zzH()[1] = 119;
                            this.g = 2;
                            break;
                        }
                        this.h = iZzk == 11;
                    } else {
                        this.h = zzedVar.zzk() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = Math.min(zzedVar.zza(), this.k - this.g);
                this.e.zzq(zzedVar, iMin);
                int i2 = this.g + iMin;
                this.g = i2;
                int i3 = this.k;
                if (i2 == i3) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.e.zzs(j, 1, i3, 0, null);
                        this.l += this.i;
                    }
                    this.f = 0;
                }
            } else {
                byte[] bArrZzH = zzedVar2.zzH();
                int iMin2 = Math.min(zzedVar.zza(), 128 - this.g);
                zzedVar.zzB(bArrZzH, this.g, iMin2);
                int i4 = this.g + iMin2;
                this.g = i4;
                if (i4 == 128) {
                    zzec zzecVar = this.a;
                    zzecVar.zzh(0);
                    zzyf zzyfVarZze = zzyg.zze(zzecVar);
                    zzaf zzafVar = this.j;
                    if (zzafVar == null || zzyfVarZze.zzc != zzafVar.zzz || zzyfVarZze.zzb != zzafVar.zzA || !zzel.zzT(zzyfVarZze.zza, zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.d);
                        zzadVar.zzS(zzyfVarZze.zza);
                        zzadVar.zzw(zzyfVarZze.zzc);
                        zzadVar.zzT(zzyfVarZze.zzb);
                        zzadVar.zzK(this.c);
                        zzaf zzafVarZzY = zzadVar.zzY();
                        this.j = zzafVarZzY;
                        this.e.zzk(zzafVarZzY);
                    }
                    this.k = zzyfVarZze.zzd;
                    this.i = (((long) zzyfVarZze.zze) * 1000000) / ((long) this.j.zzA);
                    zzedVar2.zzF(0);
                    this.e.zzq(zzedVar2, 128);
                    this.f = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.d = zzailVar.zzb();
        this.e = zzziVar.zzv(zzailVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.l = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
    }

    public zzagp(String str) {
        zzec zzecVar = new zzec(new byte[128], 128);
        this.a = zzecVar;
        this.b = new zzed(zzecVar.zza);
        this.f = 0;
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
