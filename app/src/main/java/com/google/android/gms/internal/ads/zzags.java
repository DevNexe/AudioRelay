package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzags implements zzagz {
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

    public zzags() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        zzdd.zzb(this.e);
        while (zzedVar.zza() > 0) {
            int i = this.f;
            zzed zzedVar2 = this.b;
            if (i == 0) {
                while (true) {
                    if (zzedVar.zza() > 0) {
                        if (this.h) {
                            int iZzk = zzedVar.zzk();
                            this.h = iZzk == 172;
                            if (iZzk != 64) {
                                if (iZzk == 65) {
                                    iZzk = 65;
                                }
                            }
                            this.f = 1;
                            zzedVar2.zzH()[0] = -84;
                            zzedVar2.zzH()[1] = iZzk == 65 ? (byte) 65 : (byte) 64;
                            this.g = 2;
                        } else {
                            this.h = zzedVar.zzk() == 172;
                        }
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
                int iMin2 = Math.min(zzedVar.zza(), 16 - this.g);
                zzedVar.zzB(bArrZzH, this.g, iMin2);
                int i4 = this.g + iMin2;
                this.g = i4;
                if (i4 == 16) {
                    zzec zzecVar = this.a;
                    zzecVar.zzh(0);
                    zzyi zzyiVarZza = zzyj.zza(zzecVar);
                    zzaf zzafVar = this.j;
                    if (zzafVar == null || zzafVar.zzz != 2 || zzyiVarZza.zza != zzafVar.zzA || !"audio/ac4".equals(zzafVar.zzm)) {
                        zzad zzadVar = new zzad();
                        zzadVar.zzH(this.d);
                        zzadVar.zzS("audio/ac4");
                        zzadVar.zzw(2);
                        zzadVar.zzT(zzyiVarZza.zza);
                        zzadVar.zzK(this.c);
                        zzaf zzafVarZzY = zzadVar.zzY();
                        this.j = zzafVarZzY;
                        this.e.zzk(zzafVarZzY);
                    }
                    this.k = zzyiVarZza.zzb;
                    this.i = (((long) zzyiVarZza.zzc) * 1000000) / ((long) this.j.zzA);
                    zzedVar2.zzF(0);
                    this.e.zzq(zzedVar2, 16);
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

    public zzags(String str) {
        zzec zzecVar = new zzec(new byte[16], 16);
        this.a = zzecVar;
        this.b = new zzed(zzecVar.zza);
        this.f = 0;
        this.g = 0;
        this.h = false;
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
