package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqq extends zzarm {
    public static volatile Long D;
    public static final Object E = new Object();

    public zzaqq(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "tUt0vz6lOby0Kor5zovCxCU8AEhO9JFrPQ+FoHildCv7G6/grOfOnSHI07/MbEco", "fLYJ/dhEHiKfuxbMUjXGagNO9QZ/DvGDpPbugCyxqbI=", zzamhVar, i, 44);
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
            this.z.zzn(D.longValue());
        }
    }
}
