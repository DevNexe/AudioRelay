package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzara extends zzarm {
    public zzara(zzaqb zzaqbVar, String str, String str2, zzamh zzamhVar, int i, int i2) {
        super(zzaqbVar, "dqHO3Wlmb7oighB5DEjImrvo4du4e9JtW0sm8RACV5Fa9z8v+l2/I/8OmoY2y3HK", "t8m4GxfDNdbzfvzmJ7ERdURqh0DgV49Pg4cGI5qmXbo=", zzamhVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final void a() {
        zzapi zzapiVar = new zzapi((String) this.A.invoke(null, this.w.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzci)).booleanValue())));
        synchronized (this.z) {
            this.z.zzi(zzapiVar.zza);
            this.z.zzB(zzapiVar.zzb);
        }
    }
}
