package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class dp extends be3<char[]> {
    public char[] a;
    public int b;

    public dp(char[] cArr) {
        this.a = cArr;
        this.b = cArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final char[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        char[] cArr = this.a;
        if (cArr.length < i) {
            int length = cArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(cArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}
