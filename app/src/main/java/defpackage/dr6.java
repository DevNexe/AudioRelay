package defpackage;

import com.google.android.gms.internal.ads.zzglz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dr6 implements Comparable {
    public final byte[] w;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        dr6 dr6Var = (dr6) obj;
        byte[] bArr = this.w;
        int length = bArr.length;
        int length2 = dr6Var.w.length;
        if (length != length2) {
            return length - length2;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = dr6Var.w[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dr6) {
            return Arrays.equals(this.w, ((dr6) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.w);
    }

    public final String toString() {
        return zzglz.zza(this.w);
    }
}
