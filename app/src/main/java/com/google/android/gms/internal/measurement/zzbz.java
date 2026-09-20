package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbz extends zzce {
    public final AtomicReference w = new AtomicReference();
    public boolean x;

    public static final Object N0(Class cls, Bundle bundle) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final Bundle L0(long j) {
        Bundle bundle;
        synchronized (this.w) {
            if (!this.x) {
                try {
                    this.w.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.w.get();
        }
        return bundle;
    }

    public final String M0(long j) {
        return (String) N0(String.class, L0(j));
    }

    @Override // com.google.android.gms.internal.measurement.zzcf
    public final void zzd(Bundle bundle) {
        synchronized (this.w) {
            try {
                this.w.set(bundle);
                this.x = true;
                this.w.notify();
            } catch (Throwable th) {
                this.w.notify();
                throw th;
            }
        }
    }
}
