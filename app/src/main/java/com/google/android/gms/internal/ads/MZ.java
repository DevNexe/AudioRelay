package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public final class MZ {

    @CheckForNull
    public static final MZ c;

    @CheckForNull
    public static final MZ d;
    public final boolean a;

    @CheckForNull
    public final Throwable b;

    static {
        if (zzfxf.z) {
            d = null;
            c = null;
        } else {
            d = new MZ(null, false);
            c = new MZ(null, true);
        }
    }

    public MZ(@CheckForNull Throwable th, boolean z) {
        this.a = z;
        this.b = th;
    }
}
