package defpackage;

import com.google.android.gms.internal.ads.zzfpz;

/* JADX INFO: loaded from: classes3.dex */
public final class am6 extends zzfpz {
    public final String a;
    public final String b;

    public /* synthetic */ am6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfpz) {
            zzfpz zzfpzVar = (zzfpz) obj;
            String str = this.a;
            if (str != null ? str.equals(zzfpzVar.zzb()) : zzfpzVar.zzb() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(zzfpzVar.zza()) : zzfpzVar.zza() == null) {
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
        return "OverlayDisplayDismissRequest{sessionToken=" + this.a + ", appId=" + this.b + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final String zza() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final String zzb() {
        return this.a;
    }
}
