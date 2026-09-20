package j$.time.chrono;

import j$.time.DateTimeException;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements p, Serializable {
    public static final B d;
    private static final B[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient j$.time.h b;
    private final transient String c;

    static {
        B b = new B(-1, j$.time.h.Y(1868, 1, 1), "Meiji");
        d = b;
        e = new B[]{b, new B(0, j$.time.h.Y(1912, 7, 30), "Taisho"), new B(1, j$.time.h.Y(1926, 12, 25), "Showa"), new B(2, j$.time.h.Y(1989, 1, 8), "Heisei"), new B(3, j$.time.h.Y(2019, 5, 1), "Reiwa")};
    }

    private B(int i, j$.time.h hVar, String str) {
        this.a = i;
        this.b = hVar;
        this.c = str;
    }

    static B i(j$.time.h hVar) {
        B b;
        if (hVar.U(A.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        B[] bArr = e;
        int length = bArr.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            b = bArr[length];
        } while (hVar.compareTo(b.b) < 0);
        return b;
    }

    static B m() {
        B[] bArr = e;
        return bArr[bArr.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static B s(int i) {
        if (i >= d.a) {
            int i2 = i + 2;
            B[] bArr = e;
            if (i2 <= bArr.length) {
                return bArr[i2 - 1];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    static long t() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.l().f();
        for (B b : e) {
            jF = Math.min(jF, ((b.b.V() ? 366 : 365) - b.b.R()) + 1);
            if (b.r() != null) {
                jF = Math.min(jF, b.r().b.R() - 1);
            }
        }
        return jF;
    }

    static long u() {
        int iT = (999999999 - m().b.T()) + 1;
        B[] bArr = e;
        int iT2 = bArr[0].b.T();
        for (int i = 1; i < bArr.length; i++) {
            B b = bArr[i];
            iT = Math.min(iT, (b.b.T() - iT2) + 1);
            iT2 = b.b.T();
        }
        return iT;
    }

    public static B[] v() {
        B[] bArr = e;
        return (B[]) Arrays.copyOf(bArr, bArr.length);
    }

    private Object writeReplace() {
        return new H((byte) 5, this);
    }

    final void B(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object G(j$.time.temporal.r rVar) {
        return AbstractC1450e.o(this, rVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return AbstractC1450e.k(this, qVar);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ long g(j$.time.temporal.q qVar) {
        return AbstractC1450e.i(this, qVar);
    }

    @Override // j$.time.chrono.p
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int j(j$.time.temporal.q qVar) {
        return AbstractC1450e.h(this, (j$.time.temporal.a) qVar);
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.u l(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return qVar == aVar ? y.d.r(aVar) : j$.time.temporal.p.d(this, qVar);
    }

    final j$.time.h n() {
        return this.b;
    }

    @Override // j$.time.temporal.m
    public final /* synthetic */ j$.time.temporal.k p(j$.time.temporal.k kVar) {
        return AbstractC1450e.c(this, kVar);
    }

    final B r() {
        if (this == m()) {
            return null;
        }
        return s(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }
}
