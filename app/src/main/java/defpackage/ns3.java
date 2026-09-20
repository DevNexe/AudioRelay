package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ns3 {
    public kt2 a;
    public final float b;
    public final boolean c;
    public Float d;
    public Float e;
    public kt2 f;
    public final OVbg<Float, JW> g = ps0.a(0.0f);
    public final OVbg<Float, JW> h = ps0.a(0.0f);
    public final OVbg<Float, JW> i = ps0.a(0.0f);
    public final yw j = new yw(null);
    public final kz2 k;
    public final kz2 l;

    @if0(c = "androidx.compose.material.ripple.RippleAnimation", f = "RippleAnimation.kt", l = {80, 82, 83}, m = "animate")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public ns3 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return ns3.this.a(this);
        }
    }

    public ns3(kt2 kt2Var, float f, boolean z) {
        this.a = kt2Var;
        this.b = f;
        this.c = z;
        Boolean bool = Boolean.FALSE;
        this.k = ps0.R(bool);
        this.l = ps0.R(bool);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        ns3 ns3Var;
        Object objR;
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
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 != 0) {
            if (i2 == 1) {
                ns3Var = qnHx.z;
                C0239D.H(obj);
            } else if (i2 == 2) {
                ns3Var = qnHx.z;
                C0239D.H(obj);
                qnHx.z = null;
                qnHx.C = 3;
                ns3Var.getClass();
                objR = fp1.R(new ps3(ns3Var, null), qnHx);
                if (objR != obj2) {
                    objR = sd5.a;
                }
                if (objR == obj2) {
                    return obj2;
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
        qnHx.z = this;
        qnHx.C = 1;
        Object objR2 = fp1.R(new os3(this, null), qnHx);
        if (objR2 != obj2) {
            objR2 = sd5.a;
        }
        if (objR2 == obj2) {
            return obj2;
        }
        ns3Var = this;
        ns3Var.k.setValue(Boolean.TRUE);
        qnHx.z = ns3Var;
        qnHx.C = 2;
        if (ns3Var.j.U(qnHx) == obj2) {
            return obj2;
        }
        qnHx.z = null;
        qnHx.C = 3;
        ns3Var.getClass();
        objR = fp1.R(new ps3(ns3Var, null), qnHx);
        if (objR != obj2) {
            objR = sd5.a;
        }
        if (objR == obj2) {
            return obj2;
        }
        return sd5.a;
    }
}
