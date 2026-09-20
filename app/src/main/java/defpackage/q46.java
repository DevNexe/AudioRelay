package defpackage;

import com.google.android.gms.internal.ads.zzbiw;
import com.google.android.gms.internal.ads.zzbld;

/* JADX INFO: loaded from: classes3.dex */
public final class q46 implements zzbld {
    public final /* synthetic */ zzbiw a;

    public q46(zzbiw zzbiwVar) {
        this.a = zzbiwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final Boolean zza(String str, boolean z) {
        zzbiw zzbiwVar = this.a;
        try {
            return Boolean.valueOf(zzbiwVar.e.getBoolean(str, z));
        } catch (ClassCastException unused) {
            return Boolean.valueOf(zzbiwVar.e.getString(str, String.valueOf(z)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final Double zzb(String str, double d) {
        zzbiw zzbiwVar = this.a;
        try {
            return Double.valueOf(zzbiwVar.e.getFloat(str, (float) d));
        } catch (ClassCastException unused) {
            return Double.valueOf(zzbiwVar.e.getString(str, String.valueOf(d)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final Long zzc(String str, long j) {
        zzbiw zzbiwVar = this.a;
        try {
            return Long.valueOf(zzbiwVar.e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf(zzbiwVar.e.getInt(str, (int) j));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbld
    public final String zzd(String str, String str2) {
        return this.a.e.getString(str, str2);
    }
}
