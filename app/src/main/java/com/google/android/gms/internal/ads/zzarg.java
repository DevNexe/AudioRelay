package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzarg extends zzarm {
    public final zzaqi D;
    public final long E;

    public zzarg(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2, zzaqi zzaqiVar) {
        super(zzaqbVar, "U3RL9mJLLQMse/MZqcg0oM/eA70gzw1xT+w0micdYsejvCU5HnK+5K0knH1wagPk", "3AJSAiPIa+BfzMb1UB6dOa0g/yKIYU+RvBwyuDyaJrc=", zzamhVar, i, 53);
        this.D = zzaqiVar;
        if (zzaqiVar != null) {
            this.E = zzaqiVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        if (this.D != null) {
            this.z.zzO(((Long) this.A.invoke(null, Long.valueOf(this.E))).longValue());
        }
    }
}
