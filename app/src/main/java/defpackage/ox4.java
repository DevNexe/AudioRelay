package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ox4<TSubject, TContext> extends k33<TSubject, TContext> {
    public final z80<TSubject>[] A;
    public int B;
    public int C;
    public final List<y81<k33<TSubject, TContext>, TSubject, z80<? super sd5>, Object>> x;
    public final QnHx y;
    public TSubject z;

    public static final class QnHx implements z80<sd5>, wa0 {
        public int w = Integer.MIN_VALUE;
        public final /* synthetic */ ox4<TSubject, TContext> x;

        public QnHx(ox4<TSubject, TContext> ox4Var) {
            this.x = ox4Var;
        }

        @Override // defpackage.z80
        public final la0 getContext() {
            la0 context;
            ox4<TSubject, TContext> ox4Var = this.x;
            z80<TSubject> z80Var = ox4Var.A[ox4Var.B];
            if (z80Var == null || (context = z80Var.getContext()) == null) {
                throw new IllegalStateException("Not started".toString());
            }
            return context;
        }

        @Override // defpackage.wa0
        public final wa0 k() {
            z80<TSubject> z80Var = pr4.w;
            int i = this.w;
            ox4<TSubject, TContext> ox4Var = this.x;
            if (i == Integer.MIN_VALUE) {
                this.w = ox4Var.B;
            }
            int i2 = this.w;
            if (i2 < 0) {
                this.w = Integer.MIN_VALUE;
                z80Var = null;
            } else {
                try {
                    z80<TSubject> z80Var2 = ox4Var.A[i2];
                    if (z80Var2 != null) {
                        this.w = i2 - 1;
                        z80Var = z80Var2;
                    }
                } catch (Throwable unused) {
                }
            }
            if (z80Var instanceof wa0) {
                return (wa0) z80Var;
            }
            return null;
        }

        @Override // defpackage.z80
        public final void x(Object obj) {
            boolean z = obj instanceof fq3.QnHx;
            ox4<TSubject, TContext> ox4Var = this.x;
            if (z) {
                ox4Var.i(new fq3.QnHx(fq3.a(obj)));
            } else {
                ox4Var.h(false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ox4(TSubject tsubject, TContext tcontext, List<? extends y81<? super k33<TSubject, TContext>, ? super TSubject, ? super z80<? super sd5>, ? extends Object>> list) {
        super(tcontext);
        this.x = list;
        this.y = new QnHx(this);
        this.z = tsubject;
        this.A = new z80[list.size()];
        this.B = -1;
    }

    @Override // defpackage.k33
    public final Object a(TSubject tsubject, z80<? super TSubject> z80Var) {
        this.C = 0;
        if (this.x.size() == 0) {
            return tsubject;
        }
        this.z = tsubject;
        if (this.B < 0) {
            return d(z80Var);
        }
        throw new IllegalStateException("Already started");
    }

    @Override // defpackage.k33
    public final TSubject c() {
        return this.z;
    }

    @Override // defpackage.k33
    public final Object d(z80<? super TSubject> z80Var) {
        if (this.C == this.x.size()) {
            return this.z;
        }
        int i = this.B + 1;
        this.B = i;
        z80<TSubject>[] z80VarArr = this.A;
        z80VarArr[i] = z80Var;
        if (!h(true)) {
            return va0.COROUTINE_SUSPENDED;
        }
        int i2 = this.B;
        if (i2 < 0) {
            throw new IllegalStateException("No more continuations to resume");
        }
        this.B = i2 - 1;
        z80VarArr[i2] = null;
        return this.z;
    }

    @Override // defpackage.k33
    public final Object e(TSubject tsubject, z80<? super TSubject> z80Var) {
        this.z = tsubject;
        return d(z80Var);
    }

    @Override // defpackage.ua0
    public final la0 g() {
        return this.y.getContext();
    }

    public final boolean h(boolean z) {
        int i;
        List<y81<k33<TSubject, TContext>, TSubject, z80<? super sd5>, Object>> list;
        do {
            i = this.C;
            list = this.x;
            if (i == list.size()) {
                if (z) {
                    return true;
                }
                i(this.z);
                return false;
            }
            this.C = i + 1;
            try {
            } catch (Throwable th) {
                i(new fq3.QnHx(th));
                return false;
            }
        } while (list.get(i).invoke(this, this.z, this.y) != va0.COROUTINE_SUSPENDED);
        return false;
    }

    public final void i(Object obj) {
        Throwable thB;
        int i = this.B;
        if (i < 0) {
            throw new IllegalStateException("No more continuations to resume".toString());
        }
        z80<TSubject>[] z80VarArr = this.A;
        z80<TSubject> z80Var = z80VarArr[i];
        this.B = i - 1;
        z80VarArr[i] = null;
        if (!(obj instanceof fq3.QnHx)) {
            z80Var.x(obj);
            return;
        }
        Throwable thA = fq3.a(obj);
        try {
            Throwable cause = thA.getCause();
            if (cause != null && !ur1.a(thA.getCause(), cause) && (thB = zu0.b(thA, cause)) != null) {
                thB.setStackTrace(thA.getStackTrace());
                thA = thB;
            }
        } catch (Throwable unused) {
        }
        z80Var.x(new fq3.QnHx(thA));
    }
}
