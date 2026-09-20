package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf {
    public final String[] a;
    public final double[] b;
    public final double[] c;
    public final int[] d;
    public int e;

    public zzbf(zzbd zzbdVar) {
        int size = zzbdVar.b.size();
        this.a = (String[]) zzbdVar.a.toArray(new String[size]);
        ArrayList arrayList = zzbdVar.b;
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.b = dArr;
        ArrayList arrayList2 = zzbdVar.c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i2 = 0; i2 < size3; i2++) {
            dArr2[i2] = ((Double) arrayList2.get(i2)).doubleValue();
        }
        this.c = dArr2;
        this.d = new int[size];
        this.e = 0;
    }

    public final List zza() {
        String[] strArr = this.a;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            double d = this.c[i];
            double d2 = this.b[i];
            int i2 = this.d[i];
            arrayList.add(new zzbc(str, d, d2, ((double) i2) / ((double) this.e), i2));
        }
        return arrayList;
    }

    public final void zzb(double d) {
        this.e++;
        int i = 0;
        while (true) {
            double[] dArr = this.c;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.b[i]) {
                int[] iArr = this.d;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            } else {
                i++;
            }
        }
    }
}
