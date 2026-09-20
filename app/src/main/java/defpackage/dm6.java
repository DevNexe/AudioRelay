package defpackage;

import com.google.android.gms.internal.ads.zzfql;
import com.google.android.gms.internal.ads.zzfqm;

/* JADX INFO: loaded from: classes3.dex */
public final class dm6 extends zzfql {
    public int a;
    public String b;
    public byte c;

    @Override // com.google.android.gms.internal.ads.zzfql
    public final zzfql zza(String str) {
        this.b = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfql
    public final zzfql zzb(int i) {
        this.a = i;
        this.c = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfql
    public final zzfqm zzc() {
        if (this.c == 1) {
            return new em6(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
