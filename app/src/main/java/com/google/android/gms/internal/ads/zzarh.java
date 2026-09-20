package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarh extends zzarm {
    public static volatile Long D;
    public static final Object E = new Object();

    public zzarh(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "YKKxGLeU2zJMORJ3CXggTVER1rcusEu7lPKzdwQPcOhmeA2WpnQ11LfNiSgl6FV6", "MxHq/OY7GLM9L/Opnjlc3PuDp6q7R1CL8i73K0Ziu0Y=", zzamhVar, i, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        if (D == null) {
            synchronized (E) {
                if (D == null) {
                    D = (Long) this.A.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.z) {
            this.z.zzU(D.longValue());
        }
    }
}
