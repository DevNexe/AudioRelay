package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaqx extends zzarm {
    public final zzapf D;
    public final long E;
    public final long F;

    public zzaqx(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, zzapf zzapfVar, long j, long j2) {
        super(zzaqbVar, "fJzM8V+ATbwMqso1FfvPLoBhYN4ojhn6bStsV+iGZGXUcAQ5UdVWi/JBwFYSjW+Z", "EqhZfeJdagDkdmNpQFhVQ7G0RKq67vK3QlT8DoNCRs8=", zzamhVar, i, 11);
        this.D = zzapfVar;
        this.E = j;
        this.F = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        zzapf zzapfVar = this.D;
        if (zzapfVar != null) {
            zzapd zzapdVar = new zzapd((String) this.A.invoke(null, zzapfVar.zzb(), Long.valueOf(this.E), Long.valueOf(this.F)));
            synchronized (this.z) {
                this.z.zzy(zzapdVar.zza.longValue());
                if (zzapdVar.zzb.longValue() >= 0) {
                    this.z.zzP(zzapdVar.zzb.longValue());
                }
                if (zzapdVar.zzc.longValue() >= 0) {
                    this.z.zzf(zzapdVar.zzc.longValue());
                }
            }
        }
    }
}
