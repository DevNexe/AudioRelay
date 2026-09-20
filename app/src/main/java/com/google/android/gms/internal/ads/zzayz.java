package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzayz extends zzazd {
    public final SparseArray b = new SparseArray();
    public final SparseBooleanArray c = new SparseBooleanArray();

    public abstract zzayt[] a(zzasy[] zzasyVarArr, zzayp[] zzaypVarArr, int[][][] iArr);

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzaze zzc(zzasy[] zzasyVarArr, zzayp zzaypVar) {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzayo[][] zzayoVarArr = new zzayo[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaypVar.zzb;
            zzayoVarArr[i] = new zzayo[i2];
            iArr3[i] = new int[i2][];
        }
        int[] iArr4 = new int[2];
        for (int i3 = 0; i3 < 2; i3++) {
            zzasyVarArr[i3].zze();
            iArr4[i3] = 4;
        }
        for (int i4 = 0; i4 < zzaypVar.zzb; i4++) {
            zzayo zzayoVarZzb = zzaypVar.zzb(i4);
            int i5 = 0;
            int i6 = 2;
            int i7 = 0;
            while (true) {
                if (i5 >= 2) {
                    i5 = i6;
                    break;
                }
                zzasy zzasyVar = zzasyVarArr[i5];
                int i8 = 0;
                while (true) {
                    int i9 = zzayoVarZzb.zza;
                    if (i8 <= 0) {
                        int iZzG = zzasyVar.zzG(zzayoVarZzb.zzb(i8)) & 3;
                        if (iZzG > i7) {
                            if (iZzG == 3) {
                                break;
                            }
                            i7 = iZzG;
                            i6 = i5;
                        }
                        i8++;
                    }
                }
                i5++;
            }
            if (i5 == 2) {
                int i10 = zzayoVarZzb.zza;
                iArr = new int[1];
            } else {
                zzasy zzasyVar2 = zzasyVarArr[i5];
                int i11 = zzayoVarZzb.zza;
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzasyVar2.zzG(zzayoVarZzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i5];
            zzayoVarArr[i5][i13] = zzayoVarZzb;
            iArr3[i5][i13] = iArr;
            iArr2[i5] = i13 + 1;
        }
        zzayp[] zzaypVarArr = new zzayp[2];
        int[] iArr6 = new int[2];
        for (int i14 = 0; i14 < 2; i14++) {
            int i15 = iArr2[i14];
            zzaypVarArr[i14] = new zzayp((zzayo[]) Arrays.copyOf(zzayoVarArr[i14], i15));
            iArr3[i14] = (int[][]) Arrays.copyOf(iArr3[i14], i15);
            iArr6[i14] = zzasyVarArr[i14].zzc();
        }
        new zzayp((zzayo[]) Arrays.copyOf(zzayoVarArr[2], iArr2[2]));
        zzayt[] zzaytVarArrA = a(zzasyVarArr, zzaypVarArr, iArr3);
        for (int i16 = 0; i16 < 2; i16++) {
            if (this.c.get(i16)) {
                zzaytVarArrA[i16] = null;
            } else {
                zzayp zzaypVar2 = zzaypVarArr[i16];
                Map map = (Map) this.b.get(i16);
                if ((map == null ? null : (zzayy) map.get(zzaypVar2)) != null) {
                    throw null;
                }
            }
        }
        zzayx zzayxVar = new zzayx();
        zzasz[] zzaszVarArr = new zzasz[2];
        for (int i17 = 0; i17 < 2; i17++) {
            zzaszVarArr[i17] = zzaytVarArrA[i17] != null ? zzasz.zza : null;
        }
        return new zzaze(zzaypVar, new zzazb(zzaytVarArrA, null), zzayxVar, zzaszVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final void zzd(Object obj) {
    }

    public final void zze(int i, boolean z) {
        SparseBooleanArray sparseBooleanArray = this.c;
        if (sparseBooleanArray.get(i) == z) {
            return;
        }
        sparseBooleanArray.put(i, z);
        zzazc zzazcVar = this.a;
        if (zzazcVar != null) {
            zzazcVar.zzh();
        }
    }
}
