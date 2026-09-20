package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o_K extends yh3 {
    @Override // defpackage.yh3
    public final int a(int i) {
        return ((-i) >> 31) & (f().nextInt() >>> (32 - i));
    }

    @Override // defpackage.yh3
    public final byte[] b(byte[] bArr) {
        f().nextBytes(bArr);
        return bArr;
    }

    @Override // defpackage.yh3
    public final int d() {
        return f().nextInt();
    }

    public abstract Random f();
}
