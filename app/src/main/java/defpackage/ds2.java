package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ds2<T> extends Z<T, T> {
    public final c54 x;
    public final boolean y;
    public final int z;

    public static final class QnHx<T> extends d9<T> implements ht2<T>, Runnable {
        public uk4<T> A;
        public vl0 B;
        public Throwable C;
        public volatile boolean D;
        public volatile boolean E;
        public int F;
        public boolean G;
        public final ht2<? super T> w;
        public final c54.F1 x;
        public final boolean y;
        public final int z;

        public QnHx(ht2<? super T> ht2Var, c54.F1 f1, boolean z, int i) {
            this.w = ht2Var;
            this.x = f1;
            this.y = z;
            this.z = i;
        }

        @Override // defpackage.vl0
        public final void a() {
            if (this.E) {
                return;
            }
            this.E = true;
            this.B.a();
            this.x.a();
            if (this.G || getAndIncrement() != 0) {
                return;
            }
            this.A.clear();
        }

        @Override // defpackage.ht2
        public final void b() {
            if (this.D) {
                return;
            }
            this.D = true;
            if (getAndIncrement() == 0) {
                this.x.c(this);
            }
        }

        @Override // defpackage.ht2
        public final void c(vl0 vl0Var) {
            if (bm0.p(this.B, vl0Var)) {
                this.B = vl0Var;
                if (vl0Var instanceof kh3) {
                    kh3 kh3Var = (kh3) vl0Var;
                    int iL = kh3Var.l(7);
                    if (iL == 1) {
                        this.F = iL;
                        this.A = kh3Var;
                        this.D = true;
                        this.w.c(this);
                        if (getAndIncrement() == 0) {
                            this.x.c(this);
                            return;
                        }
                        return;
                    }
                    if (iL == 2) {
                        this.F = iL;
                        this.A = kh3Var;
                        this.w.c(this);
                        return;
                    }
                }
                this.A = new jr4(this.z);
                this.w.c(this);
            }
        }

        @Override // defpackage.uk4
        public final void clear() {
            this.A.clear();
        }

        public final boolean d(boolean z, boolean z2, ht2<? super T> ht2Var) {
            if (this.E) {
                this.A.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.C;
            if (this.y) {
                if (!z2) {
                    return false;
                }
                this.E = true;
                if (th != null) {
                    ht2Var.onError(th);
                } else {
                    ht2Var.b();
                }
                this.x.a();
                return true;
            }
            if (th != null) {
                this.E = true;
                this.A.clear();
                ht2Var.onError(th);
                this.x.a();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.E = true;
            ht2Var.b();
            this.x.a();
            return true;
        }

        @Override // defpackage.vl0
        public final boolean e() {
            return this.E;
        }

        @Override // defpackage.ht2
        public final void g(T t) {
            if (this.D) {
                return;
            }
            if (this.F != 2) {
                this.A.offer(t);
            }
            if (getAndIncrement() == 0) {
                this.x.c(this);
            }
        }

        @Override // defpackage.uk4
        public final boolean isEmpty() {
            return this.A.isEmpty();
        }

        @Override // defpackage.nh3
        public final int l(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.G = true;
            return 2;
        }

        @Override // defpackage.ht2
        public final void onError(Throwable th) {
            if (this.D) {
                m14.b(th);
                return;
            }
            this.C = th;
            this.D = true;
            if (getAndIncrement() == 0) {
                this.x.c(this);
            }
        }

        @Override // defpackage.uk4
        public final T poll() {
            return this.A.poll();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.G) {
                int iAddAndGet = 1;
                while (!this.E) {
                    boolean z = this.D;
                    Throwable th = this.C;
                    if (!this.y && z && th != null) {
                        this.E = true;
                        this.w.onError(this.C);
                        this.x.a();
                        return;
                    }
                    this.w.g(null);
                    if (z) {
                        this.E = true;
                        Throwable th2 = this.C;
                        if (th2 != null) {
                            this.w.onError(th2);
                        } else {
                            this.w.b();
                        }
                        this.x.a();
                        return;
                    }
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                }
                return;
            }
            uk4<T> uk4Var = this.A;
            ht2<? super T> ht2Var = this.w;
            int iAddAndGet2 = 1;
            while (!d(this.D, uk4Var.isEmpty(), ht2Var)) {
                while (true) {
                    boolean z2 = this.D;
                    try {
                        T tPoll = uk4Var.poll();
                        boolean z3 = tPoll == null;
                        if (d(z2, z3, ht2Var)) {
                            return;
                        }
                        if (z3) {
                            break;
                        } else {
                            ht2Var.g(tPoll);
                        }
                    } catch (Throwable th3) {
                        XTd3.w(th3);
                        this.E = true;
                        this.B.a();
                        uk4Var.clear();
                        ht2Var.onError(th3);
                        this.x.a();
                        return;
                    }
                }
                iAddAndGet2 = addAndGet(-iAddAndGet2);
                if (iAddAndGet2 == 0) {
                    return;
                }
            }
        }
    }

    public ds2(us2 us2Var, c54 c54Var, int i) {
        super(us2Var);
        this.x = c54Var;
        this.y = false;
        this.z = i;
    }

    @Override // defpackage.vq2
    public final void z(ht2<? super T> ht2Var) {
        c54 c54Var = this.x;
        boolean z = c54Var instanceof k95;
        us2<T> us2Var = this.w;
        if (z) {
            us2Var.a(ht2Var);
        } else {
            us2Var.a(new QnHx(ht2Var, c54Var.a(), this.y, this.z));
        }
    }
}
