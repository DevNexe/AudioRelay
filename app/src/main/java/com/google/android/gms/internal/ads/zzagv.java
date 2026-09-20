package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.ads.AdRequest;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzagv implements zzagz {
    public static final byte[] v = {73, 68, 51};
    public final boolean a;
    public final String d;
    public String e;
    public zzaam f;
    public zzaam g;
    public boolean k;
    public boolean l;
    public int o;
    public boolean p;
    public int r;
    public zzaam t;
    public long u;
    public final zzec b = new zzec(new byte[7], 7);
    public final zzed c = new zzed(Arrays.copyOf(v, 10));
    public int h = 0;
    public int i = 0;
    public int j = 256;
    public int m = -1;
    public int n = -1;
    public long q = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public zzagv(boolean z, String str) {
        this.a = z;
        this.d = str;
    }

    public static boolean zzf(int i) {
        return (i & 65526) == 65520;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x028c  */
    /* JADX WARN: Code duplicated, block: B:122:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:126:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:134:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:160:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x0236  */
    /* JADX WARN: Code duplicated, block: B:84:0x0238  */
    /* JADX WARN: Code duplicated, block: B:86:0x023e  */
    /* JADX WARN: Code duplicated, block: B:88:0x024c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0257  */
    /* JADX WARN: Code duplicated, block: B:92:0x025c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0260  */
    /* JADX WARN: Code duplicated, block: B:99:0x0273  */
    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) {
        int i;
        int i2;
        int i3;
        boolean z;
        byte[] bArr;
        boolean z2;
        int iZzc;
        byte[] bArrZzH;
        int iZzd;
        int i4;
        byte b;
        int i5;
        int i6;
        int i7;
        byte b2;
        boolean z3;
        this.f.getClass();
        int i8 = zzel.zza;
        while (zzedVar.zza() > 0) {
            int i9 = this.h;
            int i10 = -1;
            int i11 = 4;
            zzed zzedVar2 = this.c;
            zzec zzecVar = this.b;
            if (i9 == 0) {
                byte[] bArrZzH2 = zzedVar.zzH();
                int iZzc2 = zzedVar.zzc();
                int iZzd2 = zzedVar.zzd();
                while (true) {
                    if (iZzc2 < iZzd2) {
                        int i12 = iZzc2 + 1;
                        int i13 = bArrZzH2[iZzc2] & 255;
                        if (this.j == 512 && zzf((((byte) i13) & 255) | 65280)) {
                            if (!this.l) {
                                int i14 = i12 - 2;
                                zzedVar.zzF(i14 + 1);
                                byte[] bArr2 = zzecVar.zza;
                                if (zzedVar.zza() < 1) {
                                    z = false;
                                } else {
                                    zzedVar.zzB(bArr2, 0, 1);
                                    z = true;
                                }
                                if (z) {
                                    zzecVar.zzh(i11);
                                    int iZzc3 = zzecVar.zzc(1);
                                    int i15 = this.m;
                                    if (i15 == i10 || iZzc3 == i15) {
                                        if (this.n != i10) {
                                            byte[] bArr3 = zzecVar.zza;
                                            if (zzedVar.zza() < 1) {
                                                z3 = false;
                                            } else {
                                                zzedVar.zzB(bArr3, 0, 1);
                                                z3 = true;
                                            }
                                            if (z3) {
                                                zzecVar.zzh(2);
                                                if (zzecVar.zzc(i11) == this.n) {
                                                    zzedVar.zzF(i14 + 2);
                                                    bArr = zzecVar.zza;
                                                    if (zzedVar.zza() < i11) {
                                                        z2 = false;
                                                    } else {
                                                        zzedVar.zzB(bArr, 0, i11);
                                                        z2 = true;
                                                    }
                                                    if (z2) {
                                                        zzecVar.zzh(14);
                                                        iZzc = zzecVar.zzc(13);
                                                        if (iZzc >= 7) {
                                                            bArrZzH = zzedVar.zzH();
                                                            iZzd = zzedVar.zzd();
                                                            i4 = i14 + iZzc;
                                                            if (i4 >= iZzd) {
                                                                b = bArrZzH[i4];
                                                                if (b == -1) {
                                                                    i7 = i4 + 1;
                                                                    if (i7 != iZzd) {
                                                                        b2 = bArrZzH[i7];
                                                                        if (zzf((b2 & 255) | 65280) || ((b2 & 8) >> 3) != iZzc3) {
                                                                        }
                                                                    }
                                                                } else if (b == 73 || ((i5 = i4 + 1) != iZzd && (bArrZzH[i5] != 68 || ((i6 = i4 + 2) != iZzd && bArrZzH[i6] != 51)))) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            bArr = zzecVar.zza;
                                            if (zzedVar.zza() < i11) {
                                                z2 = false;
                                            } else {
                                                zzedVar.zzB(bArr, 0, i11);
                                                z2 = true;
                                            }
                                            if (z2) {
                                                zzecVar.zzh(14);
                                                iZzc = zzecVar.zzc(13);
                                                if (iZzc >= 7) {
                                                    bArrZzH = zzedVar.zzH();
                                                    iZzd = zzedVar.zzd();
                                                    i4 = i14 + iZzc;
                                                    if (i4 >= iZzd) {
                                                        b = bArrZzH[i4];
                                                        if (b == -1) {
                                                            i7 = i4 + 1;
                                                            if (i7 != iZzd) {
                                                                b2 = bArrZzH[i7];
                                                                if (zzf((b2 & 255) | 65280)) {
                                                                }
                                                            }
                                                        } else if (b == 73) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.j;
                                i2 = i | i13;
                                if (i2 != 329) {
                                    i3 = 768;
                                } else if (i2 != 511) {
                                    if (i2 != 836) {
                                        i3 = 1024;
                                    } else if (i2 != 1075) {
                                        this.h = 2;
                                        this.i = 3;
                                        this.r = 0;
                                        zzedVar2.zzF(0);
                                        zzedVar.zzF(i12);
                                    } else if (i != 256) {
                                        this.j = 256;
                                        iZzc2 = i12 - 1;
                                    } else {
                                        iZzc2 = i12;
                                    }
                                    i10 = -1;
                                    i11 = 4;
                                } else {
                                    i3 = AdRequest.MAX_CONTENT_URL_LENGTH;
                                }
                                this.j = i3;
                                iZzc2 = i12;
                                i10 = -1;
                                i11 = 4;
                            }
                            this.o = (i13 & 8) >> 3;
                            this.k = 1 == ((i13 & 1) ^ 1);
                            if (this.l) {
                                this.h = 3;
                                this.i = 0;
                            } else {
                                this.h = 1;
                                this.i = 0;
                            }
                            zzedVar.zzF(i12);
                        } else {
                            i = this.j;
                            i2 = i | i13;
                            if (i2 != 329) {
                                i3 = 768;
                            } else if (i2 != 511) {
                                if (i2 != 836) {
                                    i3 = 1024;
                                } else if (i2 != 1075) {
                                    this.h = 2;
                                    this.i = 3;
                                    this.r = 0;
                                    zzedVar2.zzF(0);
                                    zzedVar.zzF(i12);
                                } else if (i != 256) {
                                    this.j = 256;
                                    iZzc2 = i12 - 1;
                                } else {
                                    iZzc2 = i12;
                                }
                                i10 = -1;
                                i11 = 4;
                            } else {
                                i3 = AdRequest.MAX_CONTENT_URL_LENGTH;
                            }
                            this.j = i3;
                            iZzc2 = i12;
                            i10 = -1;
                            i11 = 4;
                        }
                    } else {
                        zzedVar.zzF(iZzc2);
                    }
                }
            } else if (i9 != 1) {
                if (i9 == 2) {
                    byte[] bArrZzH3 = zzedVar2.zzH();
                    int iMin = Math.min(zzedVar.zza(), 10 - this.i);
                    zzedVar.zzB(bArrZzH3, this.i, iMin);
                    int i16 = this.i + iMin;
                    this.i = i16;
                    if (i16 == 10) {
                        this.g.zzq(zzedVar2, 10);
                        zzedVar2.zzF(6);
                        zzaam zzaamVar = this.g;
                        int iZzj = zzedVar2.zzj() + 10;
                        this.h = 4;
                        this.i = 10;
                        this.t = zzaamVar;
                        this.u = 0L;
                        this.r = iZzj;
                    }
                } else if (i9 != 3) {
                    int iMin2 = Math.min(zzedVar.zza(), this.r - this.i);
                    this.t.zzq(zzedVar, iMin2);
                    int i17 = this.i + iMin2;
                    this.i = i17;
                    int i18 = this.r;
                    if (i17 == i18) {
                        long j = this.s;
                        if (j != -9223372036854775807L) {
                            this.t.zzs(j, 1, i18, 0, null);
                            this.s += this.u;
                        }
                        this.h = 0;
                        this.i = 0;
                        this.j = 256;
                    }
                } else {
                    int i19 = true != this.k ? 5 : 7;
                    byte[] bArr4 = zzecVar.zza;
                    int iMin3 = Math.min(zzedVar.zza(), i19 - this.i);
                    zzedVar.zzB(bArr4, this.i, iMin3);
                    int i20 = this.i + iMin3;
                    this.i = i20;
                    if (i20 == i19) {
                        zzecVar.zzh(0);
                        if (this.p) {
                            zzecVar.zzj(10);
                        } else {
                            int iZzc4 = zzecVar.zzc(2) + 1;
                            if (iZzc4 != 2) {
                                Log.w("AdtsReader", "Detected audio object type: " + iZzc4 + ", but assuming AAC LC.");
                            }
                            zzecVar.zzj(5);
                            int iZzc5 = zzecVar.zzc(3);
                            int i21 = this.n;
                            byte[] bArr5 = {(byte) (((i21 >> 1) & 7) | 16), (byte) (((iZzc5 << 3) & 120) | ((i21 << 7) & 128))};
                            zzyc zzycVarZza = zzyd.zza(bArr5);
                            zzad zzadVar = new zzad();
                            zzadVar.zzH(this.e);
                            zzadVar.zzS("audio/mp4a-latm");
                            zzadVar.zzx(zzycVarZza.zzc);
                            zzadVar.zzw(zzycVarZza.zzb);
                            zzadVar.zzT(zzycVarZza.zza);
                            zzadVar.zzI(Collections.singletonList(bArr5));
                            zzadVar.zzK(this.d);
                            zzaf zzafVarZzY = zzadVar.zzY();
                            this.q = 1024000000 / ((long) zzafVarZzY.zzA);
                            this.f.zzk(zzafVarZzY);
                            this.p = true;
                        }
                        zzecVar.zzj(4);
                        int iZzc6 = zzecVar.zzc(13) - 7;
                        if (this.k) {
                            iZzc6 -= 2;
                        }
                        zzaam zzaamVar2 = this.f;
                        long j2 = this.q;
                        this.h = 4;
                        this.i = 0;
                        this.t = zzaamVar2;
                        this.u = j2;
                        this.r = iZzc6;
                    }
                }
            } else if (zzedVar.zza() != 0) {
                zzecVar.zza[0] = zzedVar.zzH()[zzedVar.zzc()];
                zzecVar.zzh(2);
                int iZzc7 = zzecVar.zzc(4);
                int i22 = this.n;
                if (i22 == -1 || iZzc7 == i22) {
                    if (!this.l) {
                        this.l = true;
                        this.m = this.o;
                        this.n = iZzc7;
                    }
                    this.h = 3;
                    this.i = 0;
                } else {
                    this.l = false;
                    this.h = 0;
                    this.i = 0;
                    this.j = 256;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.e = zzailVar.zzb();
        zzaam zzaamVarZzv = zzziVar.zzv(zzailVar.zza(), 1);
        this.f = zzaamVarZzv;
        this.t = zzaamVarZzv;
        if (!this.a) {
            this.g = new zzze();
            return;
        }
        zzailVar.zzc();
        zzaam zzaamVarZzv2 = zzziVar.zzv(zzailVar.zza(), 5);
        this.g = zzaamVarZzv2;
        zzad zzadVar = new zzad();
        zzadVar.zzH(zzailVar.zzb());
        zzadVar.zzS("application/id3");
        zzaamVarZzv2.zzk(zzadVar.zzY());
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.s = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zze() {
        this.s = -9223372036854775807L;
        this.l = false;
        this.h = 0;
        this.i = 0;
        this.j = 256;
    }
}
