package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaql extends zzarm {
    public final Activity D;
    public final View E;

    public zzaql(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, View view, Activity activity) {
        super(zzaqbVar, "SCpciX5wB77gNVd3QxtagyOGzU5F2jwXT8/fqGicur4e//OvUztB6/kDTY8ZtC7H", "1Cs3HyJ4gdHs1TY1t1mRXKXwLGulk9WztHFAT7PZCzg=", zzamhVar, i, 62);
        this.E = view;
        this.D = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        if (this.E == null) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzce)).booleanValue();
        Object[] objArr = (Object[]) this.A.invoke(null, this.E, this.D, Boolean.valueOf(zBooleanValue));
        synchronized (this.z) {
            this.z.zzc(((Long) objArr[0]).longValue());
            this.z.zze(((Long) objArr[1]).longValue());
            if (zBooleanValue) {
                this.z.zzd((String) objArr[2]);
            }
        }
    }
}
