package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzuk extends zzum {
    public final zzwe f;
    public final zzde g;

    public zzuk(zzcp zzcpVar, int[] iArr, zzwe zzweVar, zzfuv zzfuvVar, zzde zzdeVar) {
        super(zzcpVar, iArr, 0);
        this.f = zzweVar;
        zzfuv.zzm(zzfuvVar);
        this.g = zzdeVar;
    }

    public static void a(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            zzfus zzfusVar = (zzfus) arrayList.get(i2);
            if (zzfusVar != null) {
                zzfusVar.zze(new zzui(j, jArr[i2]));
            }
        }
    }
}
