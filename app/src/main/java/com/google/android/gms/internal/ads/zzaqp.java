package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqp extends zzarm {
    public zzaqp(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "6HNxGbhhczkgMwux7c1JnxuvU0wUTaRoejYXAQva8ckSWURuEsC3usSfONdhI0SW", "REWdnkKpTlNFb2GN/u4uBWWkAz1/VOT6KFxfIGHPouc=", zzamhVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        this.z.zzl(-1L);
        this.z.zzk(-1L);
        int[] iArr = (int[]) this.A.invoke(null, this.w.zzb());
        synchronized (this.z) {
            this.z.zzl(iArr[0]);
            this.z.zzk(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                this.z.zzj(i);
            }
        }
    }
}
