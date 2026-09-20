package defpackage;

import com.google.android.gms.internal.ads.zzfqm;

/* JADX INFO: loaded from: classes3.dex */
public final class em6 extends zzfqm {
    public final int a;
    public final String b;

    public /* synthetic */ em6(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqm) {
            zzfqm zzfqmVar = (zzfqm) obj;
            if (this.a == zzfqmVar.zza() && ((str = this.b) != null ? str.equals(zzfqmVar.zzb()) : zzfqmVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        String str = this.b;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.a + ", sessionToken=" + this.b + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.zzfqm
    public final String zzb() {
        return this.b;
    }
}
