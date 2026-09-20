package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wl5 {
    public static final CQf d = new CQf();
    public static final Dt<wl5> e = new Dt<>("Websocket");
    public final long a;
    public final long b;
    public final d7G c;

    public static final class CQf implements kf1<QnHx, wl5> {
        @Override // defpackage.kf1
        public final void a(wl5 wl5Var, ue1 ue1Var) {
            wl5 wl5Var2 = wl5Var;
            boolean zContains = ue1Var.w.G().contains(ql5.a);
            ue1Var.A.f(pg1.i, new xl5(wl5Var2, null, zContains));
            ue1Var.B.f(ug1.h, new yl5(wl5Var2, null, zContains));
        }

        @Override // defpackage.kf1
        public final wl5 b(j81<? super QnHx, sd5> j81Var) {
            QnHx qnHx = new QnHx();
            j81Var.invoke(qnHx);
            return new wl5(qnHx.b, qnHx.c, qnHx.a);
        }

        @Override // defpackage.kf1
        public final Dt<wl5> getKey() {
            return wl5.e;
        }
    }

    public static final class QnHx {
        public final d7G a = new d7G(22);
        public final long b = -1;
        public final long c = 2147483647L;
    }

    public wl5(long j, long j2, d7G d7g) {
        this.a = j;
        this.b = j2;
        this.c = d7g;
    }

    public wl5() {
        this(-1L, 2147483647L, new d7G(22));
    }
}
