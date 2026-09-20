package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzvt extends zzvw {
    public abstract Pair a(zzvs zzvsVar, int[][][] iArr, int[] iArr2);

    @Override // com.google.android.gms.internal.ads.zzvw
    public final zzvx zzn(zzjz[] zzjzVarArr, zzue zzueVar, zzsg zzsgVar, zzcn zzcnVar) {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpVarArr = new zzcp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzueVar.zzc;
            zzcpVarArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjzVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzueVar.zzc) {
            zzcp zzcpVarZzb = zzueVar.zzb(i5);
            int i6 = zzcpVarZzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzjz zzjzVar = zzjzVarArr[i7];
                int iMax = 0;
                for (int i10 = 0; i10 <= 0; i10++) {
                    iMax = Math.max(iMax, zzjzVar.zzO(zzcpVarZzb.zzb(i10)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (iMax > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = iMax;
                } else if (iMax == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = iMax;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                zzjz zzjzVar2 = zzjzVarArr[i8];
                int[] iArr5 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr5[i11] = zzjzVar2.zzO(zzcpVarZzb.zzb(i11));
                }
                iArr = iArr5;
            }
            int i12 = iArr2[i8];
            zzcpVarArr[i8][i12] = zzcpVarZzb;
            iArr3[i8][i12] = iArr;
            iArr2[i8] = i12 + 1;
            i5++;
            i3 = 2;
        }
        zzue[] zzueVarArr = new zzue[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i13 = 0;
        while (i13 < i3) {
            int i14 = iArr2[i13];
            zzueVarArr[i13] = new zzue((zzcp[]) zzel.zzae(zzcpVarArr[i13], i14));
            iArr3[i13] = (int[][]) zzel.zzae(iArr3[i13], i14);
            strArr[i13] = zzjzVarArr[i13].zzK();
            iArr6[i13] = zzjzVarArr[i13].zzb();
            i13++;
            i3 = 2;
        }
        zzvs zzvsVar = new zzvs(iArr6, zzueVarArr, iArr4, iArr3, new zzue((zzcp[]) zzel.zzae(zzcpVarArr[i3], iArr2[i3])));
        Pair pairA = a(zzvsVar, iArr3, iArr4);
        zzvu[] zzvuVarArr = (zzvu[]) pairA.second;
        List[] listArr = new List[zzvuVarArr.length];
        for (int i15 = 0; i15 < zzvuVarArr.length; i15++) {
            zzvu zzvuVar = zzvuVarArr[i15];
            listArr[i15] = zzvuVar != null ? zzfuv.zzp(zzvuVar) : zzfuv.zzo();
        }
        zzfus zzfusVar = new zzfus();
        for (int i16 = 0; i16 < 2; i16++) {
            zzue zzueVarZzd = zzvsVar.zzd(i16);
            List list = listArr[i16];
            for (int i17 = 0; i17 < zzueVarZzd.zzc; i17++) {
                zzcp zzcpVarZzb2 = zzueVarZzd.zzb(i17);
                boolean z4 = zzvsVar.zza(i16, i17, false) != 0;
                int i18 = zzcpVarZzb2.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i19 = 0; i19 <= 0; i19++) {
                    iArr7[i19] = zzvsVar.zzb(i16, i17, i19) & 7;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvu zzvuVar2 = (zzvu) list.get(i20);
                        if (zzvuVar2.zze().equals(zzcpVarZzb2) && zzvuVar2.zzb(i19) != -1) {
                            z = true;
                            break;
                        }
                        i20++;
                    }
                    zArr[i19] = z;
                }
                zzfusVar.zze(new zzcx(zzcpVarZzb2, z4, iArr7, zArr));
            }
        }
        zzue zzueVarZze = zzvsVar.zze();
        for (int i21 = 0; i21 < zzueVarZze.zzc; i21++) {
            zzcp zzcpVarZzb3 = zzueVarZze.zzb(i21);
            int i22 = zzcpVarZzb3.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfusVar.zze(new zzcx(zzcpVarZzb3, false, iArr8, new boolean[1]));
        }
        return new zzvx((zzka[]) pairA.first, (zzvq[]) pairA.second, new zzcy(zzfusVar.zzg()), zzvsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvw
    public final void zzo(Object obj) {
    }
}
