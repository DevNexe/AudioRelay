package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p61 {
    public static final byte[] h = new byte[0];
    public final boolean a = true;
    public final q61 b;
    public final byte[] c;
    public final am0 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public static final class CQf extends p61 {
        public CQf(byte[] bArr) {
            super(q61.z, bArr, dp2.w, false, false, false);
        }

        public CQf() {
            this(p61.h);
        }

        public CQf(lt ltVar) {
            ek ekVar = new ek(null);
            try {
                ps0.t0(ekVar, ltVar.a);
                String str = ltVar.b;
                ac.o(ekVar, str, 0, str.length(), up.a);
                this(ac.h(ekVar.s()));
            } catch (Throwable th) {
                ekVar.close();
                throw th;
            }
        }
    }

    public static final class F1 {
        public static p61 a(q61 q61Var, byte[] bArr, boolean z, boolean z2, boolean z3) {
            int iOrdinal = q61Var.ordinal();
            if (iOrdinal == 0) {
                return new YKK(bArr, z, z2, z3);
            }
            if (iOrdinal == 1) {
                return new QnHx(bArr, z, z2, z3);
            }
            if (iOrdinal == 2) {
                return new CQf(bArr);
            }
            if (iOrdinal == 3) {
                return new LPt8Fixed(bArr);
            }
            if (iOrdinal == 4) {
                return new NUlFixed(bArr, dp2.w);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    public static final class LPt8Fixed extends p61 {
        public LPt8Fixed(byte[] bArr) {
            super(q61.A, bArr, dp2.w, false, false, false);
        }
    }

    public static final class NUlFixed extends p61 {
        public NUlFixed(byte[] bArr, am0 am0Var) {
            super(q61.B, bArr, am0Var, false, false, false);
        }
    }

    public static final class QnHx extends p61 {
        public QnHx(byte[] bArr, boolean z, boolean z2, boolean z3) {
            super(q61.y, bArr, dp2.w, z, z2, z3);
        }
    }

    public static final class YKK extends p61 {
        public YKK(byte[] bArr, boolean z, boolean z2, boolean z3) {
            super(q61.x, bArr, dp2.w, z, z2, z3);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public YKK(String str) {
            Charset charset = up.a;
            this(ur1.a(charset, charset) ? str.getBytes(charset) : sp.c(charset.newEncoder(), str, str.length()), false, false, false);
        }
    }

    public p61(q61 q61Var, byte[] bArr, am0 am0Var, boolean z, boolean z2, boolean z3) {
        this.b = q61Var;
        this.c = bArr;
        this.d = am0Var;
        this.e = z;
        this.f = z2;
        this.g = z3;
        ByteBuffer.wrap(bArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Frame ");
        sb.append(this.b);
        sb.append(" (fin=");
        sb.append(this.a);
        sb.append(", buffer len = ");
        return qc0.a(sb, this.c.length, ')');
    }
}
