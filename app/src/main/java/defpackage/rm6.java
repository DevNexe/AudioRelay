package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rm6 extends qm6 {
    public final char w;

    public rm6(char c) {
        this.w = c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int i = this.w;
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfrr
    public final boolean zzb(char c) {
        return c == this.w;
    }
}
