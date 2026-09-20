package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pw2 implements Appendable, Closeable {
    public int A;
    public int B;
    public int C;
    public int D;
    public final nq2<oq> w;
    public oq x;
    public oq y;
    public ByteBuffer z;

    public pw2(nq2<oq> nq2Var) {
        this.w = nq2Var;
        ByteBuffer byteBuffer = oc2.a;
        this.z = oc2.a;
    }

    public final void b() {
        oq oqVar = this.y;
        if (oqVar != null) {
            this.A = oqVar.c;
        }
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public pw2 append(char c) {
        int i = this.A;
        int i2 = 4;
        boolean z = false;
        if (this.B - i >= 3) {
            ByteBuffer byteBuffer = this.z;
            if (c >= 0 && c < 128) {
                byteBuffer.put(i, (byte) c);
                i2 = 1;
            } else {
                if (128 <= c && c < 2048) {
                    byteBuffer.put(i, (byte) (((c >> 6) & 31) | 192));
                    byteBuffer.put(i + 1, (byte) ((c & '?') | 128));
                    i2 = 2;
                } else {
                    if (2048 <= c && c < 0) {
                        byteBuffer.put(i, (byte) (((c >> '\f') & 15) | 224));
                        byteBuffer.put(i + 1, (byte) (((c >> 6) & 63) | 128));
                        byteBuffer.put(i + 2, (byte) ((c & '?') | 128));
                        i2 = 3;
                    } else {
                        if (0 <= c && c < 0) {
                            z = true;
                        }
                        if (!z) {
                            ps0.N(c);
                            throw null;
                        }
                        byteBuffer.put(i, (byte) (((c >> 18) & 7) | 240));
                        byteBuffer.put(i + 1, (byte) (((c >> '\f') & 63) | 128));
                        byteBuffer.put(i + 2, (byte) (((c >> 6) & 63) | 128));
                        byteBuffer.put(i + 3, (byte) ((c & '?') | 128));
                    }
                }
            }
            this.A = i + i2;
            return this;
        }
        oq oqVarM = m(3);
        try {
            ByteBuffer byteBuffer2 = oqVarM.a;
            int i3 = oqVarM.c;
            if (c >= 0 && c < 128) {
                byteBuffer2.put(i3, (byte) c);
                i2 = 1;
            } else {
                if (128 <= c && c < 2048) {
                    byteBuffer2.put(i3, (byte) (((c >> 6) & 31) | 192));
                    byteBuffer2.put(i3 + 1, (byte) ((c & '?') | 128));
                    i2 = 2;
                } else {
                    if (2048 <= c && c < 0) {
                        byteBuffer2.put(i3, (byte) (((c >> '\f') & 15) | 224));
                        byteBuffer2.put(i3 + 1, (byte) (((c >> 6) & 63) | 128));
                        byteBuffer2.put(i3 + 2, (byte) ((c & '?') | 128));
                        i2 = 3;
                    } else {
                        if (!(0 <= c && c < 0)) {
                            ps0.N(c);
                            throw null;
                        }
                        byteBuffer2.put(i3, (byte) (((c >> 18) & 7) | 240));
                        byteBuffer2.put(i3 + 1, (byte) (((c >> '\f') & 63) | 128));
                        byteBuffer2.put(i3 + 2, (byte) (((c >> 6) & 63) | 128));
                        byteBuffer2.put(i3 + 3, (byte) ((c & '?') | 128));
                    }
                }
            }
            oqVarM.a(i2);
            if (!(i2 >= 0)) {
                throw new IllegalStateException("The returned value shouldn't be negative".toString());
            }
            b();
            return this;
        } catch (Throwable th) {
            b();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            nq2<oq> nq2Var = this.w;
            oq oqVarN = n();
            if (oqVarN != null) {
                oq oqVarG = oqVarN;
                do {
                    try {
                        i();
                        oqVarG = oqVarG.g();
                    } catch (Throwable th) {
                        while (oqVarN != null) {
                            oq oqVarF = oqVarN.f();
                            oqVarN.i(nq2Var);
                            oqVarN = oqVarF;
                        }
                        throw th;
                    }
                } while (oqVarG != null);
                while (oqVarN != null) {
                    oq oqVarF2 = oqVarN.f();
                    oqVarN.i(nq2Var);
                    oqVarN = oqVarF2;
                }
            }
            h();
        } catch (Throwable th2) {
            h();
            throw th2;
        }
    }

    @Override // java.lang.Appendable
    public pw2 e(int i, int i2, CharSequence charSequence) {
        if (charSequence == null) {
            return e(i, i2, "null");
        }
        ac.o(this, charSequence, i, i2, up.a);
        return this;
    }

    @Override // java.lang.Appendable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public pw2 append(CharSequence charSequence) {
        if (charSequence == null) {
            e(0, 4, "null");
        } else {
            e(0, charSequence.length(), charSequence);
        }
        return this;
    }

    public final void g(oq oqVar, oq oqVar2, int i) throws EOFException {
        oq oqVar3 = this.y;
        if (oqVar3 == null) {
            this.x = oqVar;
            this.D = 0;
        } else {
            oqVar3.k(oqVar);
            int i2 = this.A;
            oqVar3.b(i2);
            this.D = (i2 - this.C) + this.D;
        }
        this.y = oqVar2;
        this.D += i;
        this.z = oqVar2.a;
        this.A = oqVar2.c;
        this.C = oqVar2.b;
        this.B = oqVar2.e;
    }

    public abstract void h();

    public abstract void i();

    public final int j() {
        return (this.A - this.C) + this.D;
    }

    public final oq m(int i) {
        oq oqVar;
        int i2 = this.B;
        int i3 = this.A;
        if (i2 - i3 >= i && (oqVar = this.y) != null) {
            oqVar.b(i3);
            return oqVar;
        }
        oq oqVarB = this.w.B();
        oqVarB.e();
        if (!(oqVarB.g() == null)) {
            throw new IllegalStateException("It should be a single buffer chunk.".toString());
        }
        g(oqVarB, oqVarB, 0);
        return oqVarB;
    }

    public final oq n() {
        oq oqVar = this.x;
        if (oqVar == null) {
            return null;
        }
        oq oqVar2 = this.y;
        if (oqVar2 != null) {
            oqVar2.b(this.A);
        }
        this.x = null;
        this.y = null;
        this.A = 0;
        this.B = 0;
        this.C = 0;
        this.D = 0;
        this.z = oc2.a;
        return oqVar;
    }

    public pw2() {
        this(oq.k);
    }
}
