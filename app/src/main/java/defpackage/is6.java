package defpackage;

import java.math.BigInteger;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/* JADX INFO: loaded from: classes3.dex */
@ThreadSafe
public final class is6 {
    public static final byte[] d = new byte[0];
    public final hs6 a;
    public final BigInteger b;

    @GuardedBy("this")
    public BigInteger c = BigInteger.ZERO;

    public is6(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, hs6 hs6Var) {
        this.b = bigInteger;
        this.a = hs6Var;
    }
}
