package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahm implements zzagz {
    public final String a;
    public final zzed b;
    public final zzec c;
    public zzaam d;
    public String e;
    public zzaf f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public zzahm(String str) {
        this.a = str;
        zzed zzedVar = new zzed(1024);
        this.b = zzedVar;
        byte[] bArrZzH = zzedVar.zzH();
        this.c = new zzec(bArrZzH, bArrZzH.length);
        this.k = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zza(zzed zzedVar) throws zzbu {
        int iZzc;
        int i;
        int iZzc2;
        boolean zZzl;
        zzdd.zzb(this.d);
        while (zzedVar.zza() > 0) {
            int i2 = this.g;
            if (i2 != 0) {
                if (i2 != 1) {
                    zzec zzecVar = this.c;
                    zzed zzedVar2 = this.b;
                    if (i2 != 2) {
                        int iMin = Math.min(zzedVar.zza(), this.i - this.h);
                        zzedVar.zzB(zzecVar.zza, this.h, iMin);
                        int i3 = this.h + iMin;
                        this.h = i3;
                        if (i3 == this.i) {
                            zzecVar.zzh(0);
                            if (zzecVar.zzl()) {
                                if (this.l) {
                                }
                                this.g = 0;
                            } else {
                                this.l = true;
                                int iZzc3 = zzecVar.zzc(1);
                                if (iZzc3 == 1) {
                                    iZzc2 = zzecVar.zzc(1);
                                    i = 1;
                                } else {
                                    i = iZzc3;
                                    iZzc2 = 0;
                                }
                                this.m = iZzc2;
                                if (iZzc2 != 0) {
                                    throw zzbu.zza(null, null);
                                }
                                if (i == 1) {
                                    zzecVar.zzc((zzecVar.zzc(2) + 1) * 8);
                                    i = 1;
                                }
                                if (!zzecVar.zzl()) {
                                    throw zzbu.zza(null, null);
                                }
                                this.n = zzecVar.zzc(6);
                                int iZzc4 = zzecVar.zzc(4);
                                int iZzc5 = zzecVar.zzc(3);
                                if (iZzc4 != 0 || iZzc5 != 0) {
                                    throw zzbu.zza(null, null);
                                }
                                if (i == 0) {
                                    int iZzb = zzecVar.zzb();
                                    int iZza = zzecVar.zza();
                                    zzyc zzycVarZzb = zzyd.zzb(zzecVar, true);
                                    this.u = zzycVarZzb.zzc;
                                    this.r = zzycVarZzb.zza;
                                    this.t = zzycVarZzb.zzb;
                                    int iZza2 = iZza - zzecVar.zza();
                                    zzecVar.zzh(iZzb);
                                    byte[] bArr = new byte[(iZza2 + 7) / 8];
                                    zzecVar.zzf(bArr, 0, iZza2);
                                    zzad zzadVar = new zzad();
                                    zzadVar.zzH(this.e);
                                    zzadVar.zzS("audio/mp4a-latm");
                                    zzadVar.zzx(this.u);
                                    zzadVar.zzw(this.t);
                                    zzadVar.zzT(this.r);
                                    zzadVar.zzI(Collections.singletonList(bArr));
                                    zzadVar.zzK(this.a);
                                    zzaf zzafVarZzY = zzadVar.zzY();
                                    if (!zzafVarZzY.equals(this.f)) {
                                        this.f = zzafVarZzY;
                                        this.s = 1024000000 / ((long) zzafVarZzY.zzA);
                                        this.d.zzk(zzafVarZzY);
                                    }
                                } else {
                                    int iZzc6 = zzecVar.zzc((zzecVar.zzc(2) + 1) * 8);
                                    int iZza3 = zzecVar.zza();
                                    zzyc zzycVarZzb2 = zzyd.zzb(zzecVar, true);
                                    this.u = zzycVarZzb2.zzc;
                                    this.r = zzycVarZzb2.zza;
                                    this.t = zzycVarZzb2.zzb;
                                    zzecVar.zzj(iZzc6 - (iZza3 - zzecVar.zza()));
                                }
                                int iZzc7 = zzecVar.zzc(3);
                                this.o = iZzc7;
                                if (iZzc7 == 0) {
                                    zzecVar.zzj(8);
                                } else if (iZzc7 == 1) {
                                    zzecVar.zzj(9);
                                } else if (iZzc7 == 3 || iZzc7 == 4 || iZzc7 == 5) {
                                    zzecVar.zzj(6);
                                } else {
                                    if (iZzc7 != 6 && iZzc7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    zzecVar.zzj(1);
                                }
                                boolean zZzl2 = zzecVar.zzl();
                                this.p = zZzl2;
                                this.q = 0L;
                                if (zZzl2) {
                                    if (i != 1) {
                                        do {
                                            zZzl = zzecVar.zzl();
                                            this.q = (this.q << 8) + ((long) zzecVar.zzc(8));
                                        } while (zZzl);
                                    } else {
                                        this.q = zzecVar.zzc((zzecVar.zzc(2) + 1) * 8);
                                    }
                                }
                                if (zzecVar.zzl()) {
                                    zzecVar.zzj(8);
                                }
                            }
                            if (this.m != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (this.n != 0) {
                                throw zzbu.zza(null, null);
                            }
                            if (this.o != 0) {
                                throw zzbu.zza(null, null);
                            }
                            int i4 = 0;
                            do {
                                iZzc = zzecVar.zzc(8);
                                i4 += iZzc;
                            } while (iZzc == 255);
                            int iZzb2 = zzecVar.zzb();
                            if ((iZzb2 & 7) == 0) {
                                zzedVar2.zzF(iZzb2 >> 3);
                            } else {
                                zzecVar.zzf(zzedVar2.zzH(), 0, i4 * 8);
                                zzedVar2.zzF(0);
                            }
                            this.d.zzq(zzedVar2, i4);
                            long j = this.k;
                            if (j != -9223372036854775807L) {
                                this.d.zzs(j, 1, i4, 0, null);
                                this.k += this.s;
                            }
                            if (this.p) {
                                zzecVar.zzj((int) this.q);
                            }
                            this.g = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iZzk = ((this.j & (-225)) << 8) | zzedVar.zzk();
                        this.i = iZzk;
                        if (iZzk > zzedVar2.zzH().length) {
                            zzedVar2.zzC(iZzk);
                            byte[] bArrZzH = zzedVar2.zzH();
                            zzecVar.zzg(bArrZzH, bArrZzH.length);
                        }
                        this.h = 0;
                        this.g = 3;
                    }
                } else {
                    int iZzk2 = zzedVar.zzk();
                    if ((iZzk2 & 224) == 224) {
                        this.j = iZzk2;
                        this.g = 2;
                    } else if (iZzk2 != 86) {
                        this.g = 0;
                    }
                }
            } else if (zzedVar.zzk() == 86) {
                this.g = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzagz
    public final void zzb(zzzi zzziVar, zzail zzailVar) {
        zzailVar.zzc();
        this.d = zzziVar.zzv(zzailVar.zza(), 1);
        this.e = zzailVar.zzb();
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
        this.g = 0;
        this.k = -9223372036854775807L;
        this.l = false;
    }
}
