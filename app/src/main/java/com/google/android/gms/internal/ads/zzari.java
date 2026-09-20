package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzari extends zzarm {
    public zzari(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "/a8iouG/Y9ItWmHyK+NdI47yR9GXTao7DXYLnnbCwVxe2vjd2Eu6bHNA7uqUktHm", "2ehMwY4NjAVCxKNUUqdAHAq3dStVMVXOFsI0kFp0ZW0=", zzamhVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        this.z.zzae(3);
        boolean zBooleanValue = ((Boolean) this.A.invoke(null, this.w.zzb())).booleanValue();
        synchronized (this.z) {
            try {
                if (zBooleanValue) {
                    this.z.zzae(2);
                } else {
                    this.z.zzae(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
