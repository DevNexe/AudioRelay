package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzayv extends zzayz {
    public final AtomicReference d;

    public zzayv() {
        this(null);
    }

    public static boolean b(int i, boolean z) {
        int i2 = i & 3;
        if (i2 != 3) {
            return z && i2 == 2;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzayz
    public final zzayt[] a(zzasy[] zzasyVarArr, zzayp[] zzaypVarArr, int[][][] iArr) {
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3 = 2;
        zzayt[] zzaytVarArr = new zzayt[2];
        zzayu zzayuVar = (zzayu) this.d.get();
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzasyVarArr[i4].zzc() == i3) {
                if (!z3) {
                    zzasy zzasyVar = zzasyVarArr[i4];
                    zzayp zzaypVar = zzaypVarArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = zzayuVar.zzd;
                    int i7 = 0;
                    zzayo zzayoVar = null;
                    int i8 = 0;
                    int i9 = 0;
                    int iZza = -1;
                    int i10 = -1;
                    while (i7 < zzaypVar.zzb) {
                        zzayo zzayoVarZzb = zzaypVar.zzb(i7);
                        int i11 = zzayoVarZzb.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        for (int i12 = 0; i12 <= 0; i12++) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                        int[] iArr4 = iArr3[i7];
                        int i13 = i10;
                        int i14 = 0;
                        while (i14 <= 0) {
                            zzayp zzaypVar2 = zzaypVar;
                            if (b(iArr4[i14], true)) {
                                zzass zzassVarZzb = zzayoVarZzb.zzb(i14);
                                if (arrayList2.contains(Integer.valueOf(i14))) {
                                    int i15 = zzassVarZzb.zzj;
                                    z = true;
                                    z2 = true;
                                } else {
                                    z = true;
                                    z2 = false;
                                }
                                arrayList = arrayList2;
                                int i16 = z != z2 ? 1 : 2;
                                iArr2 = iArr4;
                                boolean zB = b(iArr4[i14], false);
                                if (zB) {
                                    i16 += AdError.NETWORK_ERROR_CODE;
                                }
                                boolean z4 = i16 > i9;
                                if (i16 == i9) {
                                    if (zzassVarZzb.zza() != iZza) {
                                        int iZza2 = zzassVarZzb.zza();
                                        i = i16;
                                        i2 = iZza2 == -1 ? iZza != -1 ? -1 : 0 : iZza == -1 ? 1 : iZza2 - iZza;
                                    } else {
                                        i = i16;
                                        i2 = -1;
                                        int i17 = zzassVarZzb.zzb;
                                        if (i17 != -1) {
                                            i2 = i13 == -1 ? 1 : i17 - i13;
                                        } else if (i13 == -1) {
                                            i2 = 0;
                                        }
                                    }
                                    z4 = !(zB && z2) ? i2 >= 0 : i2 <= 0;
                                } else {
                                    i = i16;
                                }
                                if (z4) {
                                    i13 = zzassVarZzb.zzb;
                                    iZza = zzassVarZzb.zza();
                                    i8 = i14;
                                    zzayoVar = zzayoVarZzb;
                                    i9 = i;
                                }
                            } else {
                                zzayoVarZzb = zzayoVarZzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i14++;
                            zzaypVar = zzaypVar2;
                            zzayoVarZzb = zzayoVarZzb;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i7++;
                        i10 = i13;
                        i5 = 1;
                    }
                    zzayw zzaywVar = zzayoVar == null ? null : new zzayw(zzayoVar, i8, 0, null);
                    zzaytVarArr[i4] = zzaywVar;
                    z3 = zzaywVar != null;
                }
                int i18 = zzaypVarArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i19 = 0;
        boolean z5 = false;
        while (i19 < i3) {
            if (zzasyVarArr[i19].zzc() == 1 && !z5) {
                zzayp zzaypVar3 = zzaypVarArr[i19];
                int[][] iArr5 = iArr[i19];
                String str = zzayuVar.zza;
                int i20 = -1;
                int i21 = -1;
                int i22 = 0;
                int i23 = 0;
                while (i22 < zzaypVar3.zzb) {
                    zzayo zzayoVarZzb2 = zzaypVar3.zzb(i22);
                    int[] iArr6 = iArr5[i22];
                    int i24 = i23;
                    int i25 = i21;
                    int i26 = i20;
                    int i27 = 0;
                    while (true) {
                        int i28 = zzayoVarZzb2.zza;
                        if (i27 <= 0) {
                            if (b(iArr6[i27], true)) {
                                zzass zzassVarZzb2 = zzayoVarZzb2.zzb(i27);
                                int i29 = iArr6[i27];
                                int i30 = 1 != (zzassVarZzb2.zzx & 1) ? 1 : 2;
                                if (b(i29, false)) {
                                    i30 += AdError.NETWORK_ERROR_CODE;
                                }
                                if (i30 > i24) {
                                    i25 = i27;
                                    i26 = i22;
                                    i24 = i30;
                                }
                            }
                            i27++;
                        }
                    }
                    i22++;
                    i20 = i26;
                    i21 = i25;
                    i23 = i24;
                }
                zzayw zzaywVar2 = i20 == -1 ? null : new zzayw(zzaypVar3.zzb(i20), i21, 0, null);
                zzaytVarArr[i19] = zzaywVar2;
                z5 = zzaywVar2 != null;
            }
            i19++;
            i3 = 2;
        }
        return zzaytVarArr;
    }

    public zzayv(zzaza zzazaVar) {
        this.d = new AtomicReference(new zzayu());
    }
}
