package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q11<T> extends MZ<T, T> {
    public final i91<? super a11<Throwable>, ? extends sg3<?>> y;

    public static final class QnHx<T> extends p11<T, Throwable> {
        public QnHx(hb4 hb4Var, n11 n11Var, o11 o11Var) {
            super(hb4Var, n11Var, o11Var);
        }

        @Override // defpackage.gw4
        public final void b() {
            this.G.cancel();
            this.E.b();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.gw4
        public final void onError(Throwable th) {
            h(js0.INSTANCE);
            long j = this.H;
            if (j != 0) {
                this.H = 0L;
                f(j);
            }
            this.G.a(1L);
            this.F.g((U) th);
        }
    }

    public q11(a11<T> a11Var, i91<? super a11<Throwable>, ? extends sg3<?>> i91Var) {
        super(a11Var);
        this.y = i91Var;
    }

    @Override // defpackage.a11
    public final void f(gw4<? super T> gw4Var) {
        hb4 hb4Var = new hb4(gw4Var);
        rd5 rd5Var = new rd5();
        boolean z = rd5Var instanceof fb4;
        n11 fb4Var = rd5Var;
        if (!z) {
            fb4Var = new fb4(rd5Var);
        }
        try {
            sg3<?> sg3VarApply = this.y.apply(fb4Var);
            mq2.b(sg3VarApply, "handler returned a null Publisher");
            sg3<?> sg3Var = sg3VarApply;
            o11 o11Var = new o11(this.x);
            QnHx qnHx = new QnHx(hb4Var, fb4Var, o11Var);
            o11Var.z = qnHx;
            gw4Var.d(qnHx);
            sg3Var.a(o11Var);
            o11Var.g(0);
        } catch (Throwable th) {
            XTd3.w(th);
            gw4Var.d(js0.INSTANCE);
            gw4Var.onError(th);
        }
    }
}
