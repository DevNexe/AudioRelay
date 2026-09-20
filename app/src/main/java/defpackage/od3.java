package defpackage;

import androidx.compose.foundation.gestures.GestureCancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class od3 implements nd3, ij0 {
    public final /* synthetic */ ij0 w;
    public boolean x;
    public boolean y;
    public final kotlinx.coroutines.sync.QnHx z = new kotlinx.coroutines.sync.QnHx(false);

    @if0(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {327}, m = "tryAwaitRelease")
    public static final class CQf extends b90 {
        public /* synthetic */ Object A;
        public int C;
        public od3 z;

        public CQf(z80<? super CQf> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.A = obj;
            this.C |= Integer.MIN_VALUE;
            return od3.this.R(this);
        }
    }

    @if0(c = "androidx.compose.foundation.gestures.PressGestureScopeImpl", f = "TapGestureDetector.kt", l = {320}, m = "awaitRelease")
    public static final class QnHx extends b90 {
        public int B;
        public /* synthetic */ Object z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.z = obj;
            this.B |= Integer.MIN_VALUE;
            return od3.this.u0(this);
        }
    }

    public od3(ij0 ij0Var) {
        this.w = ij0Var;
    }

    @Override // defpackage.ij0
    public final float Q(float f) {
        return this.w.Q(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nd3
    public final Object R(z80<? super Boolean> z80Var) throws Throwable {
        CQf cQf;
        od3 od3Var;
        if (z80Var instanceof CQf) {
            cQf = (CQf) z80Var;
            int i = cQf.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cQf.C = i - Integer.MIN_VALUE;
            } else {
                cQf = new CQf(z80Var);
            }
        } else {
            cQf = new CQf(z80Var);
        }
        Object obj = cQf.A;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = cQf.C;
        if (i2 == 0) {
            C0239D.H(obj);
            if (!this.x && !this.y) {
                cQf.z = this;
                cQf.C = 1;
                if (this.z.b(null, cQf) == va0Var) {
                    return va0Var;
                }
            }
            od3Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od3Var = cQf.z;
            C0239D.H(obj);
        }
        return Boolean.valueOf(od3Var.x);
    }

    @Override // defpackage.ij0
    public final float U() {
        return this.w.U();
    }

    @Override // defpackage.ij0
    public final float b0(float f) {
        return this.w.b0(f);
    }

    @Override // defpackage.ij0
    public final float getDensity() {
        return this.w.getDensity();
    }

    @Override // defpackage.ij0
    public final float j(int i) {
        return this.w.j(i);
    }

    @Override // defpackage.ij0
    public final int p0(float f) {
        return this.w.p0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nd3
    public final Object u0(z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.B = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objR = qnHx.z;
        Object obj = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.B;
        if (i2 == 0) {
            C0239D.H(objR);
            qnHx.B = 1;
            objR = R(qnHx);
            if (objR == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0239D.H(objR);
        }
        if (((Boolean) objR).booleanValue()) {
            return sd5.a;
        }
        throw new GestureCancellationException(0);
    }

    @Override // defpackage.ij0
    public final long v(long j) {
        return this.w.v(j);
    }

    @Override // defpackage.ij0
    public final long v0(long j) {
        return this.w.v0(j);
    }

    @Override // defpackage.ij0
    public final float x0(long j) {
        return this.w.x0(j);
    }
}
