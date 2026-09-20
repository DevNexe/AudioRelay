package com.google.android.gms.internal.ads;

import defpackage.yd5;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzfxh {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!yd5.b(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
