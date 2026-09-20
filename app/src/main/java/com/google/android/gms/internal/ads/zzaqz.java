package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqz extends zzarm {
    public static volatile String D;
    public static final Object E = new Object();

    public zzaqz(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "DPPujNohd+oH/T6ZUMbZzyhfnSIvMDgRP7rWCRWsFdFXxrCKVlDjhvyLuEdzf2o9", "/wkWLWdulpNS6Pk1iA7T64KnscjeHNN2RH4sHzd4WPM=", zzamhVar, i, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        this.z.zzA("E");
        if (D == null) {
            synchronized (E) {
                if (D == null) {
                    D = (String) this.A.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.z) {
            this.z.zzA(D);
        }
    }
}
