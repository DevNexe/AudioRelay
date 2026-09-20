package defpackage;

import com.google.android.gms.internal.ads.zzfqo;
import com.google.android.gms.internal.ads.zzfqp;

/* JADX INFO: loaded from: classes3.dex */
public final class fm6 extends zzfqo {
    public String a;
    public String b;

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqo zza(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqo zzb(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqo
    public final zzfqp zzc() {
        return new gm6(this.a, this.b);
    }
}
