package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v64 implements lm2 {
    public final /* synthetic */ boolean w;
    public final /* synthetic */ is4<z64> x;

    @if0(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {477}, m = "onPostFling-RZ2iAVY")
    public static final class QnHx extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public long z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return v64.this.a(0L, 0L, this);
        }
    }

    public v64(ri2 ri2Var, boolean z) {
        this.w = z;
        this.x = ri2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lm2
    public final Object a(long j, long j2, z80<? super mh5> z80Var) throws Throwable {
        QnHx qnHx;
        long jD;
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
        Object objB = qnHx.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.C;
        if (i2 == 0) {
            C0239D.H(objB);
            if (this.w) {
                z64 value = this.x.getValue();
                qnHx.z = j2;
                qnHx.C = 1;
                objB = value.b(j2, qnHx);
                if (objB == va0Var) {
                    return va0Var;
                }
            } else {
                int i3 = mh5.c;
                jD = mh5.b;
            }
            return new mh5(jD);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = qnHx.z;
        C0239D.H(objB);
        jD = mh5.d(j2, ((mh5) objB).a);
        return new mh5(jD);
    }

    @Override // defpackage.lm2
    public final long b(int i, long j) {
        return kt2.b;
    }

    @Override // defpackage.lm2
    public final long d(int i, long j, long j2) {
        if (!this.w) {
            return kt2.b;
        }
        z64 value = this.x.getValue();
        w64 w64Var = value.d;
        if (w64Var.a()) {
            return kt2.b;
        }
        float fD = value.d(j2);
        boolean z = value.b;
        if (z) {
            fD *= -1;
        }
        float fC = w64Var.c(fD);
        if (z) {
            fC *= -1;
        }
        return value.e(fC);
    }

    @Override // defpackage.lm2
    public final Object e(long j, z80 z80Var) {
        return new mh5(mh5.b);
    }
}
