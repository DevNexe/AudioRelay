package defpackage;

import com.google.android.gms.internal.ads.zzgab;

/* JADX INFO: loaded from: classes3.dex */
public final class er6 extends zzgab {
    public final String a;
    public final int b;

    public /* synthetic */ er6(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        int i = this.b - 2;
        if (i == 1) {
            str = "TINK";
        } else if (i == 2) {
            str = "LEGACY";
        } else if (i != 3) {
            str = i != 4 ? "UNKNOWN" : "CRUNCHY";
        } else {
            str = "RAW";
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
