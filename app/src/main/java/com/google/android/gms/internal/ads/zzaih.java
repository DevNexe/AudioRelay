package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import defpackage.ss3;
import defpackage.yw5;
import defpackage.zw5;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaih implements zzzf {
    public static final zzzm zza = new zzzm() { // from class: com.google.android.gms.internal.ads.zzaie
        @Override // com.google.android.gms.internal.ads.zzzm
        public final zzzf[] zza() {
            return new zzzf[]{new zzaih(0)};
        }

        @Override // com.google.android.gms.internal.ads.zzzm
        public final /* synthetic */ zzzf[] zzb(Uri uri, Map map) {
            return zzzl.zza(this, uri, map);
        }
    };
    public final List a;
    public final zzed b;
    public final SparseIntArray c;
    public final zzagw d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final zw5 h;
    public yw5 i;
    public zzzi j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;

    public zzaih() {
        this(0);
    }

    /* JADX WARN: Code duplicated, block: B:139:0x0268  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final int zza(zzzg zzzgVar, zzaaf zzaafVar) {
        long j;
        int i;
        long jZzd = zzzgVar.zzd();
        if (this.l) {
            long j2 = -9223372036854775807L;
            zw5 zw5Var = this.h;
            if (jZzd != -1 && !zw5Var.c) {
                int i2 = this.o;
                if (i2 <= 0) {
                    zw5Var.a(zzzgVar);
                    return 0;
                }
                boolean z = zw5Var.e;
                zzed zzedVar = zw5Var.b;
                if (z) {
                    if (zw5Var.g == -9223372036854775807L) {
                        zw5Var.a(zzzgVar);
                    } else if (zw5Var.d) {
                        long j3 = zw5Var.f;
                        if (j3 == -9223372036854775807L) {
                            zw5Var.a(zzzgVar);
                        } else {
                            zzej zzejVar = zw5Var.a;
                            long jZzb = zzejVar.zzb(zw5Var.g) - zzejVar.zzb(j3);
                            zw5Var.h = jZzb;
                            if (jZzb < 0) {
                                Log.w("TsDurationReader", "Invalid duration: " + jZzb + ". Using TIME_UNSET instead.");
                                zw5Var.h = -9223372036854775807L;
                            }
                            zw5Var.a(zzzgVar);
                        }
                    } else {
                        int iMin = (int) Math.min(112800L, zzzgVar.zzd());
                        if (zzzgVar.zzf() != 0) {
                            zzaafVar.zza = 0L;
                            i = 1;
                        } else {
                            zzedVar.zzC(iMin);
                            zzzgVar.zzj();
                            ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin, false);
                            int iZzd = zzedVar.zzd();
                            for (int iZzc = zzedVar.zzc(); iZzc < iZzd; iZzc++) {
                                if (zzedVar.zzH()[iZzc] == 71) {
                                    long jZzb2 = zzain.zzb(zzedVar, iZzc, i2);
                                    if (jZzb2 != -9223372036854775807L) {
                                        j2 = jZzb2;
                                        break;
                                    }
                                }
                            }
                            zw5Var.f = j2;
                            zw5Var.d = true;
                            i = 0;
                        }
                    }
                    return 0;
                }
                long jZzd2 = zzzgVar.zzd();
                int iMin2 = (int) Math.min(112800L, jZzd2);
                long j4 = jZzd2 - ((long) iMin2);
                if (zzzgVar.zzf() != j4) {
                    zzaafVar.zza = j4;
                    i = 1;
                } else {
                    zzedVar.zzC(iMin2);
                    zzzgVar.zzj();
                    ((zzyv) zzzgVar).zzm(zzedVar.zzH(), 0, iMin2, false);
                    int iZzc2 = zzedVar.zzc();
                    int iZzd2 = zzedVar.zzd();
                    for (int i3 = iZzd2 - 188; i3 >= iZzc2; i3--) {
                        byte[] bArrZzH = zzedVar.zzH();
                        int i4 = 0;
                        for (int i5 = -4; i5 <= 4; i5++) {
                            int i6 = (i5 * 188) + i3;
                            if (i6 >= iZzc2 && i6 < iZzd2 && bArrZzH[i6] == 71) {
                                i4++;
                                if (i4 == 5) {
                                    long jZzb3 = zzain.zzb(zzedVar, i3, i2);
                                    if (jZzb3 == -9223372036854775807L) {
                                        break;
                                    }
                                    j2 = jZzb3;
                                    break;
                                }
                            } else {
                                i4 = 0;
                            }
                        }
                    }
                    zw5Var.g = j2;
                    zw5Var.e = true;
                    i = 0;
                }
                return i;
            }
            if (this.m) {
                j = 0;
            } else {
                this.m = true;
                long j5 = zw5Var.h;
                if (j5 != -9223372036854775807L) {
                    yw5 yw5Var = new yw5(zw5Var.a, j5, jZzd, this.o);
                    this.i = yw5Var;
                    this.j.zzL(yw5Var.zzb());
                    j = 0;
                } else {
                    j = 0;
                    this.j.zzL(new zzaah(j5, 0L));
                }
            }
            if (this.n) {
                this.n = false;
                zzc(j, j);
                if (zzzgVar.zzf() != j) {
                    zzaafVar.zza = j;
                    return 1;
                }
            }
            yw5 yw5Var2 = this.i;
            if (yw5Var2 != null && yw5Var2.zze()) {
                return yw5Var2.zza(zzzgVar, zzaafVar);
            }
        }
        zzed zzedVar2 = this.b;
        byte[] bArrZzH2 = zzedVar2.zzH();
        if (9400 - zzedVar2.zzc() < 188) {
            int iZza = zzedVar2.zza();
            if (iZza > 0) {
                System.arraycopy(bArrZzH2, zzedVar2.zzc(), bArrZzH2, 0, iZza);
            }
            zzedVar2.zzD(bArrZzH2, iZza);
        }
        while (zzedVar2.zza() < 188) {
            int iZzd3 = zzedVar2.zzd();
            int iZza2 = zzzgVar.zza(bArrZzH2, iZzd3, 9400 - iZzd3);
            if (iZza2 == -1) {
                return -1;
            }
            zzedVar2.zzE(iZzd3 + iZza2);
        }
        int iZza3 = zzain.zza(zzedVar2.zzH(), zzedVar2.zzc(), zzedVar2.zzd());
        zzedVar2.zzF(iZza3);
        int i7 = iZza3 + 188;
        int iZzd4 = zzedVar2.zzd();
        if (i7 > iZzd4) {
            return 0;
        }
        int iZze = zzedVar2.zze();
        if ((8388608 & iZze) != 0) {
            zzedVar2.zzF(i7);
            return 0;
        }
        int i8 = (4194304 & iZze) != 0 ? 1 : 0;
        int i9 = (iZze >> 8) & 8191;
        int i10 = iZze & 32;
        zzaim zzaimVar = (iZze & 16) != 0 ? (zzaim) this.e.get(i9) : null;
        if (zzaimVar == null) {
            zzedVar2.zzF(i7);
            return 0;
        }
        int i11 = iZze & 15;
        SparseIntArray sparseIntArray = this.c;
        int i12 = sparseIntArray.get(i9, i11 - 1);
        sparseIntArray.put(i9, i11);
        if (i12 == i11) {
            zzedVar2.zzF(i7);
            return 0;
        }
        if (i11 != ((i12 + 1) & 15)) {
            zzaimVar.zzc();
        }
        if (i10 != 0) {
            int iZzk = zzedVar2.zzk();
            i8 |= (zzedVar2.zzk() & 64) != 0 ? 2 : 0;
            zzedVar2.zzG(iZzk - 1);
        }
        boolean z2 = this.l;
        if (z2 || !this.g.get(i9, false)) {
            zzedVar2.zzE(i7);
            zzaimVar.zza(zzedVar2, i8);
            zzedVar2.zzE(iZzd4);
            if (!z2) {
                if (this.l && jZzd != -1) {
                    this.n = true;
                }
            }
        } else if (this.l) {
            this.n = true;
        }
        zzedVar2.zzF(i7);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzb(zzzi zzziVar) {
        this.j = zzziVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // com.google.android.gms.internal.ads.zzzf
    public final void zzc(long j, long j2) {
        yw5 yw5Var;
        List list = this.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zzej zzejVar = (zzej) list.get(i2);
            if (zzejVar.zze() != -9223372036854775807L) {
                long jZzc = zzejVar.zzc();
                if (jZzc != -9223372036854775807L && jZzc != 0 && jZzc != j2) {
                    zzejVar.zzf(j2);
                }
            } else {
                zzejVar.zzf(j2);
            }
        }
        if (j2 != 0 && (yw5Var = this.i) != null) {
            yw5Var.zzd(j2);
        }
        this.b.zzC(0);
        this.c.clear();
        while (true) {
            SparseArray sparseArray = this.e;
            if (i >= sparseArray.size()) {
                return;
            }
            ((zzaim) sparseArray.valueAt(i)).zzc();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzf
    public final boolean zzd(zzzg zzzgVar) throws EOFException, InterruptedIOException {
        byte[] bArrZzH = this.b.zzH();
        zzyv zzyvVar = (zzyv) zzzgVar;
        zzyvVar.zzm(bArrZzH, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzyvVar.zzo(i, false);
                    return true;
                }
                if (bArrZzH[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public zzaih(int i) {
        this(1, 0, 112800);
    }

    public zzaih(int i, int i2, int i3) {
        zzej zzejVar = new zzej(0L);
        this.d = new zzagw(0);
        this.a = Collections.singletonList(zzejVar);
        this.b = new zzed(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.e = sparseArray;
        this.c = new SparseIntArray();
        this.h = new zw5();
        this.j = zzzi.zza;
        this.o = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.e.put(sparseArray2.keyAt(i4), (zzaim) sparseArray2.valueAt(i4));
        }
        this.e.put(0, new zzahz(new ss3(this)));
    }
}
