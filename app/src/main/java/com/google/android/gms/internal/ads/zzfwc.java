package com.google.android.gms.internal.ads;

import defpackage.GM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfwc {
    public static void a(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(GM.a("at index ", i2));
            }
        }
    }
}
