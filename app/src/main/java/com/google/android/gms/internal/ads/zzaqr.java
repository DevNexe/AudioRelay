package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqr extends zzarm {
    public final long D;

    public zzaqr(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, long j, int i, int i2) {
        super(zzaqbVar, "xrMIVw+CZrXn1IekizTiUScI6wNAILuxj1b/rhxDE2pwil0Ht31LBwVl9aHUCekb", "3Va0stlf242U1Ue7o9TlJnm/36RIQrt1QqEOlEimTMw=", zzamhVar, i, 25);
        this.D = j;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        long jLongValue = ((Long) this.A.invoke(null, new Object[0])).longValue();
        synchronized (this.z) {
            this.z.zzs(jLongValue);
            long j = this.D;
            if (j != 0) {
                this.z.zzS(jLongValue - j);
                this.z.zzT(this.D);
            }
        }
    }
}
