package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mm2 {
    public h81<? extends ua0> a = new QnHx();
    public ua0 b;
    public lm2 c;

    @if0(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {217}, m = "dispatchPostFling-RZ2iAVY")
    public static final class CQf extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return mm2.this.a(0L, 0L, this);
        }
    }

    @if0(c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", f = "NestedScrollModifier.kt", l = {202}, m = "dispatchPreFling-QWom1Mo")
    public static final class F1 extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public F1(z80<? super F1> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return mm2.this.c(0L, this);
        }
    }

    public static final class QnHx extends cx1 implements h81<ua0> {
        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final ua0 invoke() {
            return mm2.this.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, long j2, z80<? super mh5> z80Var) throws Throwable {
        CQf cQf;
        long j3;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.B = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        CQf cQf2 = cQf;
        Object objA = cQf2.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf2.B;
        if (i2 == 0) {
            C0239D.H(objA);
            lm2 lm2Var = this.c;
            if (lm2Var != null) {
                cQf2.B = 1;
                objA = lm2Var.a(j, j2, cQf2);
                if (objA == va0Var) {
                    return va0Var;
                }
            } else {
                int i3 = mh5.c;
                j3 = mh5.b;
            }
            return new mh5(j3);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0239D.H(objA);
        j3 = ((mh5) objA).a;
        return new mh5(j3);
    }

    public final long b(int i, long j, long j2) {
        lm2 lm2Var = this.c;
        if (lm2Var != null) {
            return lm2Var.d(i, j, j2);
        }
        int i2 = kt2.e;
        return kt2.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, z80<? super mh5> z80Var) throws Throwable {
        F1 f1;
        long j2;
        if (z80Var instanceof F1) {
            f1 = (F1) z80Var;
            int i = f1.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                f1.B = i - Integer.MIN_VALUE;
            } else {
                f1 = new F1(z80Var);
            }
        } else {
            f1 = new F1(z80Var);
        }
        Object objE = f1.z;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = f1.B;
        if (i2 == 0) {
            C0239D.H(objE);
            lm2 lm2Var = this.c;
            if (lm2Var != null) {
                f1.B = 1;
                objE = lm2Var.e(j, f1);
                if (objE == va0Var) {
                    return va0Var;
                }
            } else {
                int i3 = mh5.c;
                j2 = mh5.b;
            }
            return new mh5(j2);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C0239D.H(objE);
        j2 = ((mh5) objE).a;
        return new mh5(j2);
    }

    public final ua0 d() {
        ua0 ua0VarInvoke = this.a.invoke();
        if (ua0VarInvoke != null) {
            return ua0VarInvoke;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
