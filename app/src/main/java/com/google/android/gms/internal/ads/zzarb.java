package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarb extends zzarm {
    public zzarb(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "Vzvp2EkF2pEbKPIdCn3PFXroHmxxEvOZYSjqA8kd9hBeO5S3wxnRIFg589Z0eHEB", "WecnIv7/+ap7EIcAgJwinTe6aq/WkhqHwfnV+h6mDgk=", zzamhVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        zzamh zzamhVar = this.z;
        try {
            int i = 1;
            if (true == ((Boolean) this.A.invoke(null, this.w.zzb())).booleanValue()) {
                i = 2;
            }
            zzamhVar.zzad(i);
        } catch (InvocationTargetException unused) {
            zzamhVar.zzad(3);
        }
    }
}
