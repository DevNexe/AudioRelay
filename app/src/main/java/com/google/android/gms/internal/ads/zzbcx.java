package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbcx implements Comparator {
    public zzbcx(zzbcy zzbcyVar) {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzbcm zzbcmVar = (zzbcm) obj;
        zzbcm zzbcmVar2 = (zzbcm) obj2;
        float f = zzbcmVar.b;
        float f2 = zzbcmVar2.b;
        if (f < f2) {
            return -1;
        }
        if (f <= f2) {
            float f3 = zzbcmVar.a;
            float f4 = zzbcmVar2.a;
            if (f3 < f4) {
                return -1;
            }
            if (f3 <= f4) {
                float f5 = (zzbcmVar.c - f3) * (zzbcmVar.d - f);
                float f6 = (zzbcmVar2.c - f4) * (zzbcmVar2.d - f2);
                if (f5 > f6) {
                    return -1;
                }
                if (f5 >= f6) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
