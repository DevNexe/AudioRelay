package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zs2<T> extends Z<T, T> {
    public final long x;

    public static final class QnHx<T> implements ht2<T>, vl0 {
        public final ht2<? super T> w;
        public boolean x;
        public vl0 y;
        public long z;

        public QnHx(ht2<? super T> ht2Var, long j) {
            this.w = ht2Var;
            this.z = j;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.x) {
                return;
            }
            this.x = true;
            this.y.a();
            this.w.b();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                long j = this.z;
                ht2<? super T> ht2Var = this.w;
                if (j != 0) {
                    ht2Var.c(this);
                    return;
                }
                this.x = true;
                vl0Var.a();
                ht2Var.c(yr0.INSTANCE);
                ht2Var.b();
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.x) {
                return;
            }
            long j = this.z;
            long j2 = j - 1;
            this.z = j2;
            if (j > 0) {
                boolean z = j2 == 0;
                this.w.g(t);
                if (z) {
                    b();
                }
            }
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.x) {
                m14.b(th);
                return;
            }
            this.x = true;
            this.y.a();
            this.w.onError(th);
        }
    }

    public zs2(us2 us2Var) {
        super(us2Var);
        this.x = 1L;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
