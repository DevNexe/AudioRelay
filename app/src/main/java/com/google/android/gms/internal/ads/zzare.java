package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzare extends zzarm {
    public final StackTraceElement[] D;

    public zzare(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzaqbVar, "mKZoVC4c2F/JqX9WIT6IUJ7O1rqDja2RmF+/au0SoJW0hEJbfdMFQna3+PNp9GA3", "5YZBRBaKVoc53PJNiLp/sxiQ4sgkDdqNOlYuo9Kj11A=", zzamhVar, i, 45);
        this.D = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        StackTraceElement[] stackTraceElementArr = this.D;
        if (stackTraceElementArr != null) {
            zzapt zzaptVar = new zzapt((String) this.A.invoke(null, stackTraceElementArr));
            synchronized (this.z) {
                this.z.zzE(zzaptVar.zza.longValue());
                if (zzaptVar.zzb.booleanValue()) {
                    this.z.zzab(true != zzaptVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.z.zzab(3);
                }
            }
        }
    }
}
