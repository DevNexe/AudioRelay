package defpackage;

import com.google.android.gms.internal.ads.zzfmh;

/* JADX INFO: loaded from: classes3.dex */
public final class ml6 extends zzfmh {
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ml6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfmh) {
            zzfmh zzfmhVar = (zzfmh) obj;
            if (this.a.equals(zzfmhVar.zzb()) && this.b == zzfmhVar.zzd() && this.c == zzfmhVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true == this.c ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(this.a);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(this.b);
        sb.append(", isGooglePlayServicesAvailable=");
        return Md5A.f(sb, this.c, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final String zzb() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final boolean zzc() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzfmh
    public final boolean zzd() {
        return this.b;
    }
}
