package com.google.android.gms.internal.ads;

import defpackage.oc7;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzwy {
    public static final zzwu g = zzwu.zza;
    public static final zzwv h = zzwv.zza;
    public int d;
    public int e;
    public int f;
    public final oc7[] b = new oc7[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public zzwy(int i) {
    }

    public final float zza(float f) {
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f2 = this.e * 0.5f;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            oc7 oc7Var = (oc7) arrayList.get(i3);
            i2 += oc7Var.b;
            if (i2 >= f2) {
                return oc7Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((oc7) arrayList.get(arrayList.size() - 1)).c;
    }

    public final void zzb(int i, float f) {
        oc7 oc7Var;
        int i2 = this.c;
        ArrayList arrayList = this.a;
        if (i2 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i3 = this.f;
        oc7[] oc7VarArr = this.b;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.f = i4;
            oc7Var = oc7VarArr[i4];
        } else {
            oc7Var = new oc7(0);
        }
        int i5 = this.d;
        this.d = i5 + 1;
        oc7Var.a = i5;
        oc7Var.b = i;
        oc7Var.c = f;
        arrayList.add(oc7Var);
        this.e += i;
        while (true) {
            int i6 = this.e;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            oc7 oc7Var2 = (oc7) arrayList.get(0);
            int i8 = oc7Var2.b;
            if (i8 <= i7) {
                this.e -= i8;
                arrayList.remove(0);
                int i9 = this.f;
                if (i9 < 5) {
                    this.f = i9 + 1;
                    oc7VarArr[i9] = oc7Var2;
                }
            } else {
                oc7Var2.b = i8 - i7;
                this.e -= i7;
            }
        }
    }

    public final void zzc() {
        this.a.clear();
        this.c = -1;
        this.d = 0;
        this.e = 0;
    }
}
