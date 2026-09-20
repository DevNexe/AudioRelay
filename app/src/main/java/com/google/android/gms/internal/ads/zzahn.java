package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahn implements zzagz {
    public final zzed a;
    public final zzzy b;
    public final String c;
    public zzaam d;
    public String e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public int k;
    public long l;

    public zzahn() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        zzdd.zzb(this.d);
        while (zzedVar.zza() > 0) {
            int i = this.f;
            zzed zzedVar2 = this.a;
            if (i == 0) {
                byte[] bArrZzH = zzedVar.zzH();
                int iZzc = zzedVar.zzc();
                int iZzd = zzedVar.zzd();
                while (true) {
                    if (iZzc >= iZzd) {
                        zzedVar.zzF(iZzd);
                        break;
                    }
                    byte b = bArrZzH[iZzc];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.i && (b & 224) == 224;
                    this.i = z;
                    if (z2) {
                        zzedVar.zzF(iZzc + 1);
                        this.i = false;
                        zzedVar2.zzH()[1] = bArrZzH[iZzc];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    iZzc++;
                }
            } else if (i != 1) {
                int iMin = Math.min(zzedVar.zza(), this.k - this.g);
                this.d.zzq(zzedVar, iMin);
                int i2 = this.g + iMin;
                this.g = i2;
                int i3 = this.k;
                if (i2 >= i3) {
                    long j = this.l;
                    if (j != -9223372036854775807L) {
                        this.d.zzs(j, 1, i3, 0, null);
                        this.l += this.j;
                    }
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                int iMin2 = Math.min(zzedVar.zza(), 4 - this.g);
                zzedVar.zzB(zzedVar2.zzH(), this.g, iMin2);
                int i4 = this.g + iMin2;
                this.g = i4;
                if (i4 >= 4) {
                    zzedVar2.zzF(0);
                    int iZze = zzedVar2.zze();
                    zzzy zzzyVar = this.b;
                    if (zzzyVar.zza(iZze)) {
                        this.k = zzzyVar.zzc;
                        if (!this.h) {
                            this.j = (((long) zzzyVar.zzg) * 1000000) / ((long) zzzyVar.zzd);
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(this.e);
                            zzadVar.zzS(zzzyVar.zzb);
                            zzadVar.zzL(4096);
                            zzadVar.zzw(zzzyVar.zze);
                            zzadVar.zzT(zzzyVar.zzd);
                            zzadVar.zzK(this.c);
                            this.d.zzk(zzadVar.zzY());
                            this.h = true;
                        }
                        zzedVar2.zzF(0);
                        this.d.zzq(zzedVar2, 4);
                        this.f = 2;
                    } else {
                        this.g = 0;
                        this.f = 1;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.e = zzailVar.zzb();
        this.d = zzziVar.zzv(zzailVar.zza(), 1);
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
        this.i = false;
        this.l = -9223372036854775807L;
    }

    public zzahn(String str) {
        this.f = 0;
        zzed zzedVar = new zzed(4);
        this.a = zzedVar;
        zzedVar.zzH()[0] = -1;
        this.b = new zzzy();
        this.l = -9223372036854775807L;
        this.c = str;
    }
}
