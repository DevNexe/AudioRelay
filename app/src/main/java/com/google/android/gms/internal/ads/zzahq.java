package com.google.android.gms.internal.ads;

import android.util.Log;
import defpackage.bj0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzahq implements zzaim {
    public final zzagz a;
    public final zzec b = new zzec(new byte[10], 10);
    public int c = 0;
    public int d;
    public zzej e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public boolean k;

    public zzahq(zzagz zzagzVar) {
        this.a = zzagzVar;
    }

    public final boolean a(zzed zzedVar, byte[] bArr, int i) {
        int iMin = Math.min(zzedVar.zza(), i - this.d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzedVar.zzG(iMin);
        } else {
            zzedVar.zzB(bArr, this.d, iMin);
        }
        int i2 = this.d + iMin;
        this.d = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zza(zzed zzedVar, int i) {
        int i2;
        int i3;
        boolean z;
        long jZzb;
        zzdd.zzb(this.e);
        int i4 = i & 1;
        int i5 = 0;
        int i6 = 1;
        zzagz zzagzVar = this.a;
        int i7 = -1;
        int i8 = 2;
        if (i4 != 0) {
            int i9 = this.c;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.j;
                    if (i10 != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + i10 + " more bytes");
                    }
                    zzagzVar.zzc();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.c = 1;
            this.d = 0;
        }
        int i11 = i;
        while (zzedVar.zza() > 0) {
            int i12 = this.c;
            if (i12 != 0) {
                zzec zzecVar = this.b;
                if (i12 != i6) {
                    if (i12 != i8) {
                        int iZza = zzedVar.zza();
                        int i13 = this.j;
                        int i14 = i13 == i7 ? 0 : iZza - i13;
                        if (i14 > 0) {
                            iZza -= i14;
                            zzedVar.zzE(zzedVar.zzc() + iZza);
                        }
                        zzagzVar.zza(zzedVar);
                        int i15 = this.j;
                        if (i15 != i7) {
                            int i16 = i15 - iZza;
                            this.j = i16;
                            if (i16 == 0) {
                                zzagzVar.zzc();
                                this.c = i6;
                                this.d = i5;
                            }
                        }
                    } else {
                        if (a(zzedVar, zzecVar.zza, Math.min(10, this.i)) && a(zzedVar, null, this.i)) {
                            zzecVar.zzh(i5);
                            if (this.f) {
                                zzecVar.zzj(4);
                                int iZzc = zzecVar.zzc(3);
                                zzecVar.zzj(i6);
                                int iZzc2 = zzecVar.zzc(15);
                                zzecVar.zzj(i6);
                                long jZzc = (((long) iZzc) << 30) | ((long) (iZzc2 << 15)) | ((long) zzecVar.zzc(15));
                                zzecVar.zzj(i6);
                                if (this.h || !this.g) {
                                    z = true;
                                } else {
                                    zzecVar.zzj(4);
                                    int iZzc3 = zzecVar.zzc(3);
                                    zzecVar.zzj(i6);
                                    int iZzc4 = zzecVar.zzc(15);
                                    zzecVar.zzj(i6);
                                    int iZzc5 = zzecVar.zzc(15);
                                    zzecVar.zzj(i6);
                                    this.e.zzb(((long) (iZzc4 << 15)) | (((long) iZzc3) << 30) | ((long) iZzc5));
                                    z = true;
                                    this.h = true;
                                }
                                jZzb = this.e.zzb(jZzc);
                            } else {
                                z = true;
                                jZzb = -9223372036854775807L;
                            }
                            i11 |= z != this.k ? 0 : 4;
                            zzagzVar.zzd(jZzb, i11);
                            this.c = 3;
                            this.d = 0;
                        }
                    }
                    i7 = -1;
                } else if (a(zzedVar, zzecVar.zza, 9)) {
                    zzecVar.zzh(i5);
                    int iZzc6 = zzecVar.zzc(24);
                    i6 = 1;
                    if (iZzc6 != 1) {
                        bj0.b("Unexpected start code prefix: ", iZzc6, "PesReader");
                        i2 = -1;
                        this.j = -1;
                        i3 = 0;
                    } else {
                        zzecVar.zzj(8);
                        int iZzc7 = zzecVar.zzc(16);
                        zzecVar.zzj(5);
                        this.k = zzecVar.zzl();
                        zzecVar.zzj(2);
                        this.f = zzecVar.zzl();
                        this.g = zzecVar.zzl();
                        zzecVar.zzj(6);
                        int iZzc8 = zzecVar.zzc(8);
                        this.i = iZzc8;
                        if (iZzc7 == 0) {
                            this.j = -1;
                        } else {
                            int i17 = (iZzc7 - 3) - iZzc8;
                            this.j = i17;
                            if (i17 < 0) {
                                bj0.b("Found negative packet payload size: ", i17, "PesReader");
                                i2 = -1;
                                this.j = -1;
                            }
                            i3 = 2;
                        }
                        i2 = -1;
                        i3 = 2;
                    }
                    this.c = i3;
                    this.d = 0;
                    i7 = i2;
                }
                i6 = 1;
                i7 = -1;
            } else {
                zzedVar.zzG(zzedVar.zza());
            }
            i5 = 0;
            i8 = 2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzb(zzej zzejVar, zzzi zzziVar, zzail zzailVar) {
        this.e = zzejVar;
        this.a.zzb(zzziVar, zzailVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    public final void zzc() {
        this.c = 0;
        this.d = 0;
        this.h = false;
        this.a.zze();
    }
}
