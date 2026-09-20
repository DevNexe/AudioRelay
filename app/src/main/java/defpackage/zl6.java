package defpackage;

import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfpz;

/* JADX INFO: loaded from: classes3.dex */
public final class zl6 extends zzfpy {
    public String a;
    public String b;

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final zzfpy zza(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final zzfpy zzb(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpy
    public final zzfpz zzc() {
        return new am6(this.a, this.b);
    }
}
