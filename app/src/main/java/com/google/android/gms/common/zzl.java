package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
abstract class zzl extends zzj {
    public static final WeakReference z = new WeakReference(null);
    public WeakReference y;

    public zzl(byte[] bArr) {
        super(bArr);
        this.y = z;
    }

    @Override // com.google.android.gms.common.zzj
    public final byte[] M0() {
        byte[] bArrN0;
        synchronized (this) {
            bArrN0 = (byte[]) this.y.get();
            if (bArrN0 == null) {
                bArrN0 = N0();
                this.y = new WeakReference(bArrN0);
            }
        }
        return bArrN0;
    }

    public abstract byte[] N0();
}
