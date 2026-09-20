package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 {
    public final y81<ua0, kt2, z80<? super sd5>, Object> a;
    public final y81<ua0, Float, z80<? super sd5>, Object> b;
    public final ri2<nn0> c;
    public final ci2 d;

    @if0(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {390, 393, 395}, m = "processDragStart")
    public static final class CQf extends b90 {
        public ua0 A;
        public an0.F1 B;
        public nn0 C;
        public /* synthetic */ Object D;
        public int F;
        public pn0 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.D = obj;
            this.F |= Integer.MIN_VALUE;
            return pn0.this.b(null, null, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {400, 403}, m = "processDragStop")
    public static final class F1 extends b90 {
        public ua0 A;
        public an0.LPt8Fixed B;
        public /* synthetic */ Object C;
        public int E;
        public pn0 z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return pn0.this.c(null, null, this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.DragLogic", f = "Draggable.kt", l = {408, 411}, m = "processDragCancel")
    public static final class QnHx extends b90 {
        public ua0 A;
        public /* synthetic */ Object B;
        public int D;
        public pn0 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.B = obj;
            this.D |= Integer.MIN_VALUE;
            return pn0.this.a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pn0(y81<? super ua0, ? super kt2, ? super z80<? super sd5>, ? extends Object> y81Var, y81<? super ua0, ? super Float, ? super z80<? super sd5>, ? extends Object> y81Var2, ri2<nn0> ri2Var, ci2 ci2Var) {
        this.a = y81Var;
        this.b = y81Var2;
        this.c = ri2Var;
        this.d = ci2Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ua0 ua0Var, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        pn0 pn0Var;
        Float f;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.D = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.B;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.D;
        if (i2 != 0) {
            if (i2 == 1) {
                ua0Var = qnHx.A;
                pn0Var = qnHx.z;
                C0239D.H(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nn0 value = this.c.getValue();
        if (value != null) {
            ci2 ci2Var = this.d;
            if (ci2Var != null) {
                mn0 mn0Var = new mn0(value);
                qnHx.z = this;
                qnHx.A = ua0Var;
                qnHx.D = 1;
                if (ci2Var.c(mn0Var, qnHx) == va0Var) {
                    return va0Var;
                }
            }
            pn0Var = this;
        } else {
            pn0Var = this;
        }
        f = new Float(0.0f);
        qnHx.z = null;
        qnHx.A = null;
        qnHx.D = 2;
        if (pn0Var.b.invoke(ua0Var, f, qnHx) == va0Var) {
            return va0Var;
        }
        return sd5.a;
        pn0Var.c.setValue(null);
        f = new Float(0.0f);
        qnHx.z = null;
        qnHx.A = null;
        qnHx.D = 2;
        if (pn0Var.b.invoke(ua0Var, f, qnHx) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ua0 ua0Var, an0.F1 f1, z80<? super sd5> z80Var) throws Throwable {
        CQf cQf;
        pn0 pn0Var;
        ci2 ci2Var;
        nn0 nn0Var;
        pn0 pn0Var2;
        ua0 ua0Var2;
        nn0 nn0Var2;
        kt2 kt2Var;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.F = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object obj = cQf.D;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.F;
        if (i2 != 0) {
            if (i2 == 1) {
                f1 = cQf.B;
                ua0Var = cQf.A;
                pn0Var = cQf.z;
                C0239D.H(obj);
            } else if (i2 == 2) {
                nn0Var2 = cQf.C;
                f1 = cQf.B;
                ua0Var2 = cQf.A;
                pn0Var2 = cQf.z;
                C0239D.H(obj);
                nn0Var = nn0Var2;
                ua0Var = ua0Var2;
                pn0Var = pn0Var2;
                pn0Var.c.setValue(nn0Var);
                kt2Var = new kt2(f1.a);
                cQf.z = null;
                cQf.A = null;
                cQf.B = null;
                cQf.C = null;
                cQf.F = 3;
                if (pn0Var.a.invoke(ua0Var, kt2Var, cQf) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nn0 value = this.c.getValue();
        if (value != null && (ci2Var = this.d) != null) {
            mn0 mn0Var = new mn0(value);
            cQf.z = this;
            cQf.A = ua0Var;
            cQf.B = f1;
            cQf.F = 1;
            if (ci2Var.c(mn0Var, cQf) == va0Var) {
                return va0Var;
            }
        }
        pn0Var = this;
        nn0Var = new nn0();
        ci2 ci2Var2 = pn0Var.d;
        if (ci2Var2 != null) {
            cQf.z = pn0Var;
            cQf.A = ua0Var;
            cQf.B = f1;
            cQf.C = nn0Var;
            cQf.F = 2;
            if (ci2Var2.c(nn0Var, cQf) == va0Var) {
                return va0Var;
            }
            pn0Var2 = pn0Var;
            ua0Var2 = ua0Var;
            nn0Var2 = nn0Var;
            nn0Var = nn0Var2;
            ua0Var = ua0Var2;
            pn0Var = pn0Var2;
        }
        pn0Var.c.setValue(nn0Var);
        kt2Var = new kt2(f1.a);
        cQf.z = null;
        cQf.A = null;
        cQf.B = null;
        cQf.C = null;
        cQf.F = 3;
        if (pn0Var.a.invoke(ua0Var, kt2Var, cQf) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(ua0 ua0Var, an0.LPt8Fixed lPt8, z80<? super sd5> z80Var) throws Throwable {
        F1 f1;
        pn0 pn0Var;
        Float f;
        if (z80Var instanceof F1) {
            f1 = (F1) z80Var;
            int i = f1.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1.E = i - Integer.MIN_VALUE;
            } else {
                f1 = new F1(z80Var);
            }
        } else {
            f1 = new F1(z80Var);
        }
        Object obj = f1.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = f1.E;
        if (i2 != 0) {
            if (i2 == 1) {
                an0.LPt8Fixed lPt9 = f1.B;
                ua0 ua0Var2 = f1.A;
                pn0Var = f1.z;
                C0239D.H(obj);
                lPt8 = lPt9;
                ua0Var = ua0Var2;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }
        C0239D.H(obj);
        nn0 value = this.c.getValue();
        if (value != null) {
            ci2 ci2Var = this.d;
            if (ci2Var != null) {
                on0 on0Var = new on0(value);
                f1.z = this;
                f1.A = ua0Var;
                f1.B = lPt8;
                f1.E = 1;
                if (ci2Var.c(on0Var, f1) == va0Var) {
                    return va0Var;
                }
            }
            pn0Var = this;
        } else {
            pn0Var = this;
        }
        f = new Float(lPt8.a);
        f1.z = null;
        f1.A = null;
        f1.B = null;
        f1.E = 2;
        if (pn0Var.b.invoke(ua0Var, f, f1) == va0Var) {
            return va0Var;
        }
        return sd5.a;
        pn0Var.c.setValue(null);
        f = new Float(lPt8.a);
        f1.z = null;
        f1.A = null;
        f1.B = null;
        f1.E = 2;
        if (pn0Var.b.invoke(ua0Var, f, f1) == va0Var) {
            return va0Var;
        }
        return sd5.a;
    }
}
