package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import defpackage.k51;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj extends Exception {
    public final int w;

    public zzj(int i, String str) {
        super(str);
        this.w = i;
    }

    public final k51 a() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", getMessage());
        } else {
            Log.w("UserMessagingPlatform", getMessage(), getCause());
        }
        return new k51(this.w, getMessage());
    }

    public zzj(int i, String str, IOException iOException) {
        super(str, iOException);
        this.w = i;
    }
}
