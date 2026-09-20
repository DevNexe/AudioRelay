package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ut1 extends B8C {
    public final LPt9Fixed w;
    public final lb4 x;

    public ut1(LPt9Fixed lPt9, ws1 ws1Var) {
        this.w = lPt9;
        this.x = ws1Var.b;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final int C() {
        LPt9Fixed lPt9 = this.w;
        String strL = lPt9.l();
        try {
            vc5 vc5VarT = AY.T(strL);
            if (vc5VarT != null) {
                return vc5VarT.w;
            }
            hv4.n(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'UInt' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final long V() {
        LPt9Fixed lPt9 = this.w;
        String strL = lPt9.l();
        try {
            xc5 xc5VarU = AY.U(strL);
            if (xc5VarU != null) {
                return xc5VarU.w;
            }
            hv4.n(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'ULong' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.g40
    public final lb4 a() {
        return this.x;
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final byte j0() {
        tc5 tc5Var;
        LPt9Fixed lPt9 = this.w;
        String strL = lPt9.l();
        try {
            vc5 vc5VarT = AY.T(strL);
            if (vc5VarT != null) {
                int i = vc5VarT.w;
                tc5Var = ac.l(i, 255) > 0 ? null : new tc5((byte) i);
            }
            if (tc5Var != null) {
                return tc5Var.w;
            }
            hv4.n(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'UByte' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.B8C, defpackage.pf0
    public final short l0() {
        ed5 ed5Var;
        LPt9Fixed lPt9 = this.w;
        String strL = lPt9.l();
        try {
            vc5 vc5VarT = AY.T(strL);
            if (vc5VarT != null) {
                int i = vc5VarT.w;
                ed5Var = ac.l(i, 65535) > 0 ? null : new ed5((short) i);
            }
            if (ed5Var != null) {
                return ed5Var.w;
            }
            hv4.n(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            LPt9Fixed.o(lPt9, "Failed to parse type 'UShort' for input '" + strL + '\'', 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.g40
    public final int p(pa4 pa4Var) {
        throw new IllegalStateException("unsupported".toString());
    }
}
