package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final zzbd zza(String str, double d, double d2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i = 0;
        while (true) {
            arrayList = this.a;
            int size = arrayList.size();
            arrayList2 = this.b;
            arrayList3 = this.c;
            if (i >= size) {
                break;
            }
            double dDoubleValue = ((Double) arrayList3.get(i)).doubleValue();
            double dDoubleValue2 = ((Double) arrayList2.get(i)).doubleValue();
            if (d < dDoubleValue || (dDoubleValue == d && d2 < dDoubleValue2)) {
                break;
            }
            i++;
        }
        arrayList.add(i, str);
        arrayList3.add(i, Double.valueOf(d));
        arrayList2.add(i, Double.valueOf(d2));
        return this;
    }

    public final zzbf zzb() {
        return new zzbf(this);
    }
}
