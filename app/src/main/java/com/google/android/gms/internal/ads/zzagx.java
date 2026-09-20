package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagx implements zzagz {
    public final String b;
    public String c;
    public zzaam d;
    public int f;
    public int g;
    public long h;
    public zzaf i;
    public int j;
    public final zzed a = new zzed(new byte[18]);
    public int e = 0;
    public long k = -9223372036854775807L;

    public zzagx(String str) {
        this.b = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:37:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        int i;
        byte b;
        boolean z;
        int i2;
        int i3;
        byte b2;
        int i4;
        byte b3;
        int i5;
        zzdd.zzb(this.d);
        while (zzedVar.zza() > 0) {
            int i6 = this.e;
            zzed zzedVar2 = this.a;
            if (i6 == 0) {
                while (zzedVar.zza() > 0) {
                    int i7 = this.g << 8;
                    this.g = i7;
                    int iZzk = i7 | zzedVar.zzk();
                    this.g = iZzk;
                    if (iZzk == 2147385345 || iZzk == -25230976 || iZzk == 536864768 || iZzk == -14745368) {
                        byte[] bArrZzH = zzedVar2.zzH();
                        int i8 = this.g;
                        bArrZzH[0] = (byte) ((i8 >> 24) & 255);
                        bArrZzH[1] = (byte) ((i8 >> 16) & 255);
                        bArrZzH[2] = (byte) ((i8 >> 8) & 255);
                        bArrZzH[3] = (byte) (i8 & 255);
                        this.f = 4;
                        this.g = 0;
                        this.e = 1;
                        break;
                    }
                }
            } else if (i6 != 1) {
                int iMin = Math.min(zzedVar.zza(), this.j - this.f);
                this.d.zzq(zzedVar, iMin);
                int i9 = this.f + iMin;
                this.f = i9;
                int i10 = this.j;
                if (i9 == i10) {
                    long j = this.k;
                    if (j != -9223372036854775807L) {
                        this.d.zzs(j, 1, i10, 0, null);
                        this.k += this.h;
                    }
                    this.e = 0;
                }
            } else {
                byte[] bArrZzH2 = zzedVar2.zzH();
                int iMin2 = Math.min(zzedVar.zza(), 18 - this.f);
                zzedVar.zzB(bArrZzH2, this.f, iMin2);
                int i11 = this.f + iMin2;
                this.f = i11;
                if (i11 == 18) {
                    byte[] bArrZzH3 = zzedVar2.zzH();
                    if (this.i == null) {
                        zzaf zzafVarZza = zzzc.zza(bArrZzH3, this.c, this.b, null);
                        this.i = zzafVarZza;
                        this.d.zzk(zzafVarZza);
                    }
                    byte b4 = bArrZzH3[0];
                    if (b4 != -2) {
                        if (b4 == -1) {
                            i5 = ((bArrZzH3[7] & 3) << 12) | ((bArrZzH3[6] & 255) << 4) | ((bArrZzH3[9] & 60) >> 2);
                        } else if (b4 != 31) {
                            i = ((bArrZzH3[5] & 3) << 12) | ((bArrZzH3[6] & 255) << 4);
                            b = bArrZzH3[7];
                        } else {
                            i5 = ((bArrZzH3[8] & 60) >> 2) | ((bArrZzH3[6] & 3) << 12) | ((bArrZzH3[7] & 255) << 4);
                        }
                        i2 = i5 + 1;
                        z = true;
                        if (z) {
                            i2 = (i2 * 16) / 14;
                        }
                        this.j = i2;
                        if (b4 != -2) {
                            if (b4 != -1) {
                                i3 = (bArrZzH3[4] & 7) << 4;
                                b3 = bArrZzH3[7];
                            } else if (b4 != 31) {
                                i3 = (bArrZzH3[4] & 1) << 6;
                                b2 = bArrZzH3[5];
                            } else {
                                i3 = (bArrZzH3[5] & 7) << 4;
                                b3 = bArrZzH3[6];
                            }
                            i4 = b3 & 60;
                            this.h = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.i.zzA));
                            zzedVar2.zzF(0);
                            this.d.zzq(zzedVar2, 18);
                            this.e = 2;
                        } else {
                            i3 = (bArrZzH3[5] & 1) << 6;
                            b2 = bArrZzH3[4];
                        }
                        i4 = b2 & 252;
                        this.h = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.i.zzA));
                        zzedVar2.zzF(0);
                        this.d.zzq(zzedVar2, 18);
                        this.e = 2;
                    } else {
                        i = ((bArrZzH3[4] & 3) << 12) | ((bArrZzH3[7] & 255) << 4);
                        b = bArrZzH3[6];
                    }
                    i2 = (i | ((b & 240) >> 4)) + 1;
                    z = false;
                    if (z) {
                        i2 = (i2 * 16) / 14;
                    }
                    this.j = i2;
                    if (b4 != -2) {
                        if (b4 != -1) {
                            i3 = (bArrZzH3[4] & 7) << 4;
                            b3 = bArrZzH3[7];
                        } else if (b4 != 31) {
                            i3 = (bArrZzH3[4] & 1) << 6;
                            b2 = bArrZzH3[5];
                        } else {
                            i3 = (bArrZzH3[5] & 7) << 4;
                            b3 = bArrZzH3[6];
                        }
                        i4 = b3 & 60;
                        this.h = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.i.zzA));
                        zzedVar2.zzF(0);
                        this.d.zzq(zzedVar2, 18);
                        this.e = 2;
                    } else {
                        i3 = (bArrZzH3[5] & 1) << 6;
                        b2 = bArrZzH3[4];
                    }
                    i4 = b2 & 252;
                    this.h = (int) ((((long) ((((i4 >> 2) | i3) + 1) * 32)) * 1000000) / ((long) this.i.zzA));
                    zzedVar2.zzF(0);
                    this.d.zzq(zzedVar2, 18);
                    this.e = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.c = zzailVar.zzb();
        this.d = zzziVar.zzv(zzailVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.k = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.k = -9223372036854775807L;
    }
}
