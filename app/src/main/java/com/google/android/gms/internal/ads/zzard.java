package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzard extends zzarm {
    public final boolean D;

    public zzard(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "+MexfEnBZA7q7iZMuUPE2bpWWq7dZXL2urW+z97dpchqWh4hWOgUnbCk4z+Hbza8", "LyfKIPN68aZRbmvxI0qKlkb7QqDxcBxbJuROIg+7WFc=", zzamhVar, i, 61);
        this.D = zzaqbVar.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        long jLongValue = ((Long) this.A.invoke(null, this.w.zzb(), Boolean.valueOf(this.D))).longValue();
        synchronized (this.z) {
            this.z.zzD(jLongValue);
        }
    }
}
