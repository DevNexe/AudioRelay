package defpackage;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class li6 implements Runnable {
    public final String A;
    public final Map B;
    public final hi6 w;
    public final int x;
    public final Throwable y;
    public final byte[] z;

    public /* synthetic */ li6(String str, hi6 hi6Var, int i, IOException iOException, byte[] bArr, Map map) {
        oa3.h(hi6Var);
        this.w = hi6Var;
        this.x = i;
        this.y = iOException;
        this.z = bArr;
        this.A = str;
        this.B = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.w.b(this.A, this.x, this.y, this.z, this.B);
    }
}
