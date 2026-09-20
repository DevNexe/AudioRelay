package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarf extends zzarm {
    public zzarf(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "G1zSQHxSHVPUwoFnXHh/RUDU4HrWkkXkBz0C0L8MT/vMOwG2Z70Zze/sd76ItTPz", "Q7CPoNnCWDIIOccltii1S+O+2a/ZVRW78C0n4S9Y84k=", zzamhVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        synchronized (this.z) {
            zzapw zzapwVar = new zzapw((String) this.A.invoke(null, new Object[0]));
            this.z.zzo(zzapwVar.zza.longValue());
            this.z.zzp(zzapwVar.zzb.longValue());
        }
    }
}
