package com.google.android.gms.internal.ads;

import defpackage.xx5;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzakr {
    public static final xx5 d = new xx5();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;

    public zzakr(int i) {
    }

    public final synchronized void a() {
        while (this.c > 4096) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }

    public final synchronized void zza(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.b, bArr, d);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.b.add(iBinarySearch, bArr);
                this.c += length;
                a();
            }
        }
    }

    public final synchronized byte[] zzb(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.c -= length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }
}
