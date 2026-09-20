package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cj extends be3<byte[]> {
    public byte[] a;
    public int b;

    public cj(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
        b(10);
    }

    @Override // defpackage.be3
    public final byte[] a() {
        return Arrays.copyOf(this.a, this.b);
    }

    @Override // defpackage.be3
    public final void b(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            int length = bArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    @Override // defpackage.be3
    public final int d() {
        return this.b;
    }
}
