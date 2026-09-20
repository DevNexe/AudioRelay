package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdzp extends zzbro {
    public final /* synthetic */ zzchf A;
    public final /* synthetic */ zzdzq B;
    public final /* synthetic */ Object w;
    public final /* synthetic */ String x;
    public final /* synthetic */ long y;
    public final /* synthetic */ zzfir z;

    public zzdzp(zzdzq zzdzqVar, Object obj, zzchf zzchfVar, String str, long j, zzfir zzfirVar) {
        this.B = zzdzqVar;
        this.w = obj;
        this.x = str;
        this.y = j;
        this.z = zzfirVar;
        this.A = zzchfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zze(String str) {
        synchronized (this.w) {
            this.B.b(this.x, (int) (com.google.android.gms.ads.internal.zzt.zzB().c() - this.y), str, false);
            this.B.l.zzb(this.x, "error");
            this.B.o.zzb(this.x, "error");
            zzfje zzfjeVar = this.B.p;
            zzfir zzfirVar = this.z;
            zzfirVar.zze(false);
            zzfjeVar.zzb(zzfirVar.zzj());
            this.A.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrp
    public final void zzf() {
        synchronized (this.w) {
            this.B.b(this.x, (int) (com.google.android.gms.ads.internal.zzt.zzB().c() - this.y), "", true);
            this.B.l.zzd(this.x);
            this.B.o.zzd(this.x);
            zzfje zzfjeVar = this.B.p;
            zzfir zzfirVar = this.z;
            zzfirVar.zze(true);
            zzfjeVar.zzb(zzfirVar.zzj());
            this.A.zzd(Boolean.TRUE);
        }
    }
}
