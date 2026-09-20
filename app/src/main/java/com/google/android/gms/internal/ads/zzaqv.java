package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqv extends zzarm {
    public static volatile Long D;
    public static final Object E = new Object();

    public zzaqv(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "vwafhzajmko+XbfuSejKABEanPVybMYr0Xs0X58XDfD46RrNvhHs28KurUcFj7Vb", "F5L8q737MMzYnugLKIPW4LyN3bjV9SheOjBtsYe5lqc=", zzamhVar, i, 22);
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
            this.z.zzx(D.longValue());
        }
    }
}
