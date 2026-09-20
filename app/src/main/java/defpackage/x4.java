package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x4 implements ou2 {
    public boolean w;
    public c24 x;

    @if0(c = "androidx.compose.foundation.lazy.AwaitFirstLayoutModifier", f = "LazyListState.kt", l = {417}, m = "waitForFirstLayout")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public z80 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return x4.this.a(this);
        }
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.ou2
    public final void G(iy1 iy1Var) {
        if (this.w) {
            return;
        }
        this.w = true;
        c24 c24Var = this.x;
        if (c24Var != null) {
            c24Var.x(sd5.a);
        }
        this.x = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        z80 z80Var2;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.C = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object obj = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(obj);
            if (!this.w) {
                c24 c24Var = this.x;
                qnHx.getClass();
                qnHx.z = c24Var;
                qnHx.C = 1;
                c24 c24Var2 = new c24(ps0.L(qnHx));
                this.x = c24Var2;
                if (c24Var2.a() == va0Var) {
                    return va0Var;
                }
                z80Var2 = c24Var;
            }
            return sd5.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z80Var2 = qnHx.z;
        C0239D.H(obj);
        if (z80Var2 != null) {
            z80Var2.x(sd5.a);
        }
        return sd5.a;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
