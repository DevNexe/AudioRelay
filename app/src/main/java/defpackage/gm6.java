package defpackage;

import com.google.android.gms.internal.ads.zzfqp;

/* JADX INFO: loaded from: classes3.dex */
public final class gm6 extends zzfqp {
    public final String a;
    public final String b;

    public /* synthetic */ gm6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfqp) {
            zzfqp zzfqpVar = (zzfqp) obj;
            String str = this.a;
            if (str != null ? str.equals(zzfqpVar.zzb()) : zzfqpVar.zzb() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zzfqpVar.zza()) : zzfqpVar.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.b;
        return (str2 != null ? str2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "OverlayDisplayUpdateRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final String zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfqp
    public final String zzb() {
        return this.a;
    }
}
