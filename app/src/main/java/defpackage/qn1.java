package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qn1 implements Closeable {
    public int A;
    public long B;
    public boolean C;
    public final nq2<oq> w;
    public oq x;
    public ByteBuffer y;
    public int z;

    /* JADX WARN: Illegal instructions before constructor call */
    public qn1() {
        oq oqVar = oq.m;
        this(oqVar, ps0.d0(oqVar), oq.k);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x01be */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String s(defpackage.qn1 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qn1.s(qn1):java.lang.String");
    }

    public abstract void b();

    public final void c(int i) throws EOFException {
        int i2 = 0;
        if (!(i >= 0)) {
            throw new IllegalArgumentException(GM.a("Negative discard is not allowed: ", i).toString());
        }
        int i3 = i;
        while (i3 != 0) {
            oq oqVarN = n();
            if (oqVarN == null) {
                break;
            }
            int iMin = Math.min(oqVarN.c - oqVarN.b, i3);
            oqVarN.c(iMin);
            this.z += iMin;
            if (oqVarN.c - oqVarN.b == 0) {
                v(oqVarN);
            }
            i3 -= iMin;
            i2 += iMin;
        }
        if (i2 != i) {
            throw new EOFException(ex0.b("Unable to discard ", i, " bytes due to end of packet"));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws EOFException {
        oq oqVarM = m();
        oq oqVar = oq.m;
        if (oqVarM != oqVar) {
            y(oqVar);
            w(0L);
            while (oqVarM != null) {
                oq oqVarF = oqVarM.f();
                oqVarM.i(this.w);
                oqVarM = oqVarF;
            }
        }
        if (!this.C) {
            this.C = true;
        }
        b();
    }

    public final oq e() {
        if (this.C) {
            return null;
        }
        oq oqVarG = g();
        if (oqVarG == null) {
            this.C = true;
            return null;
        }
        oq oqVar = this.x;
        while (true) {
            oq oqVarG2 = oqVar.g();
            if (oqVarG2 == null) {
                break;
            }
            oqVar = oqVarG2;
        }
        if (oqVar == oq.m) {
            y(oqVarG);
            if (!(this.B == 0)) {
                throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
            }
            oq oqVarG3 = oqVarG.g();
            w(oqVarG3 != null ? ps0.d0(oqVarG3) : 0L);
        } else {
            oqVar.k(oqVarG);
            w(ps0.d0(oqVarG) + this.B);
        }
        return oqVarG;
    }

    public final oq f(oq oqVar) {
        oq oqVar2 = oq.m;
        while (oqVar != oqVar2) {
            oq oqVarF = oqVar.f();
            oqVar.i(this.w);
            if (oqVarF == null) {
                y(oqVar2);
                w(0L);
                oqVar = oqVar2;
            } else {
                if (oqVarF.c > oqVarF.b) {
                    y(oqVarF);
                    w(this.B - ((long) (oqVarF.c - oqVarF.b)));
                    return oqVarF;
                }
                oqVar = oqVarF;
            }
        }
        return e();
    }

    public oq g() {
        nq2<oq> nq2Var = this.w;
        oq oqVarB = nq2Var.B();
        try {
            oqVarB.e();
            h();
            boolean z = true;
            this.C = true;
            if (oqVarB.c <= oqVarB.b) {
                z = false;
            }
            if (z) {
                oqVarB.a(0);
                return oqVarB;
            }
            oqVarB.i(nq2Var);
            return null;
        } catch (Throwable th) {
            oqVarB.i(nq2Var);
            throw th;
        }
    }

    public abstract void h();

    public final void i(oq oqVar) {
        if (this.C && oqVar.g() == null) {
            this.z = oqVar.b;
            this.A = oqVar.c;
            w(0L);
            return;
        }
        int i = oqVar.c - oqVar.b;
        int iMin = Math.min(i, 8 - (oqVar.f - oqVar.e));
        nq2<oq> nq2Var = this.w;
        if (i > iMin) {
            oq oqVarB = nq2Var.B();
            oq oqVarB2 = nq2Var.B();
            oqVarB.e();
            oqVarB2.e();
            oqVarB.k(oqVarB2);
            oqVarB2.k(oqVar.f());
            XTd3.y(oqVarB, oqVar, i - iMin);
            XTd3.y(oqVarB2, oqVar, iMin);
            y(oqVarB);
            w(ps0.d0(oqVarB2));
        } else {
            oq oqVarB3 = nq2Var.B();
            oqVarB3.e();
            oqVarB3.k(oqVar.f());
            XTd3.y(oqVarB3, oqVar, i);
            y(oqVarB3);
        }
        oqVar.i(nq2Var);
    }

    public final boolean j() {
        return this.A - this.z == 0 && this.B == 0 && (this.C || e() == null);
    }

    public final oq m() throws EOFException {
        oq oqVar = this.x;
        int i = this.z;
        if (i < 0 || i > oqVar.c) {
            int i2 = oqVar.b;
            C0239D.p(i - i2, oqVar.c - i2);
            throw null;
        }
        if (oqVar.b != i) {
            oqVar.b = i;
        }
        return oqVar;
    }

    public final oq n() throws EOFException {
        oq oqVarM = m();
        return this.A - this.z >= 1 ? oqVarM : o(1, oqVarM);
    }

    public final oq o(int i, oq oqVar) {
        while (true) {
            int i2 = this.A - this.z;
            if (i2 >= i) {
                return oqVar;
            }
            oq oqVarG = oqVar.g();
            if (oqVarG == null && (oqVarG = e()) == null) {
                return null;
            }
            if (i2 == 0) {
                if (oqVar != oq.m) {
                    v(oqVar);
                }
                oqVar = oqVarG;
            } else {
                int iY = XTd3.y(oqVar, oqVarG, i - i2);
                this.A = oqVar.c;
                w(this.B - ((long) iY));
                int i3 = oqVarG.c;
                int i4 = oqVarG.b;
                if (i3 > i4) {
                    if (!(iY >= 0)) {
                        throw new IllegalArgumentException(GM.a("startGap shouldn't be negative: ", iY).toString());
                    }
                    if (i4 >= iY) {
                        oqVarG.d = iY;
                    } else {
                        if (i4 != i3) {
                            StringBuilder sbC = iZUl.c("Unable to reserve ", iY, " start gap: there are already ");
                            sbC.append(oqVarG.c - oqVarG.b);
                            sbC.append(" content bytes starting at offset ");
                            sbC.append(oqVarG.b);
                            throw new IllegalStateException(sbC.toString());
                        }
                        if (iY > oqVarG.e) {
                            int i5 = oqVarG.f;
                            if (iY > i5) {
                                throw new IllegalArgumentException(Md5A.e("Start gap ", iY, " is bigger than the capacity ", i5));
                            }
                            StringBuilder sbC2 = iZUl.c("Unable to reserve ", iY, " start gap: there are already ");
                            sbC2.append(i5 - oqVarG.e);
                            sbC2.append(" bytes reserved in the end");
                            throw new IllegalStateException(sbC2.toString());
                        }
                        oqVarG.c = iY;
                        oqVarG.b = iY;
                        oqVarG.d = iY;
                    }
                } else {
                    oqVar.k(null);
                    oqVar.k(oqVarG.f());
                    oqVarG.i(this.w);
                }
                if (oqVar.c - oqVar.b >= i) {
                    return oqVar;
                }
                if (i > 8) {
                    throw new IllegalStateException(ex0.b("minSize of ", i, " is too big (should be less than 8)"));
                }
            }
        }
    }

    public final void v(oq oqVar) {
        oq oqVarF = oqVar.f();
        if (oqVarF == null) {
            oqVarF = oq.m;
        }
        y(oqVarF);
        w(this.B - ((long) (oqVarF.c - oqVarF.b)));
        oqVar.i(this.w);
    }

    public final void w(long j) {
        if (j >= 0) {
            this.B = j;
        } else {
            throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j).toString());
        }
    }

    public final void y(oq oqVar) {
        this.x = oqVar;
        this.y = oqVar.a;
        this.z = oqVar.b;
        this.A = oqVar.c;
    }

    public qn1(oq oqVar, long j, nq2<oq> nq2Var) {
        this.w = nq2Var;
        this.x = oqVar;
        this.y = oqVar.a;
        int i = oqVar.b;
        this.z = i;
        int i2 = oqVar.c;
        this.A = i2;
        this.B = j - ((long) (i2 - i));
    }
}
