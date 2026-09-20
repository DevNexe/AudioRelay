package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ir2<T> extends Z<T, T> {
    public final InterfaceC1443fH x;

    public static final class QnHx<T> extends d9<T> implements ht2<T> {
        public boolean A;
        public final ht2<? super T> w;
        public final InterfaceC1443fH x;
        public vl0 y;
        public kh3<T> z;

        public QnHx(ht2<? super T> ht2Var, InterfaceC1443fH interfaceC1443fH) {
            this.w = ht2Var;
            this.x = interfaceC1443fH;
        }

        @Override // defpackage.vl0
        public final void a() {
            this.y.a();
            d();
        }

        @Override // defpackage.ht2
        public final void b() {
            this.w.b();
            d();
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.y, vl0Var)) {
                this.y = vl0Var;
                if (vl0Var instanceof kh3) {
                    this.z = (kh3) vl0Var;
                }
                this.w.c(this);
            }
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.z.clear();
        }

        public final void d() {
            if (compareAndSet(0, 1)) {
                try {
                    this.x.run();
                } catch (Throwable th) {
                    XTd3.w(th);
                    m14.b(th);
                }
            }
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.y.e();
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            this.w.g(t);
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.z.isEmpty();
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            kh3<T> kh3Var = this.z;
            if (kh3Var == null || (i & 4) != 0) {
                return 0;
            }
            int iL = kh3Var.l(i);
            if (iL != 0) {
                this.A = iL == 1;
            }
            return iL;
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            this.w.onError(th);
            d();
        }

        @Override // defpackage.uk4
        public final T poll() {
            T tPoll = this.z.poll();
            if (tPoll == null && this.A) {
                d();
            }
            return tPoll;
        }
    }

    public ir2(us2<T> us2Var, InterfaceC1443fH interfaceC1443fH) {
        super(us2Var);
        this.x = interfaceC1443fH;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        this.w.a(new QnHx(ht2Var, this.x));
    }
}
