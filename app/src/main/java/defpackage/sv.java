package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class sv {
    public static final jt4 a = new jt4(QnHx.w);

    public static final class QnHx extends cx1 implements h81<rv> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final rv invoke() {
            return sv.c(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long a(rv rvVar, long j) {
        if (yu.c(j, rvVar.g())) {
            return rvVar.d();
        }
        if (yu.c(j, rvVar.h())) {
            return rvVar.d();
        }
        if (yu.c(j, rvVar.i())) {
            return rvVar.e();
        }
        if (yu.c(j, rvVar.j())) {
            return rvVar.e();
        }
        if (yu.c(j, rvVar.a())) {
            return rvVar.c();
        }
        if (yu.c(j, rvVar.k())) {
            return rvVar.f();
        }
        return yu.c(j, rvVar.b()) ? ((yu) rvVar.l.getValue()).a : yu.h;
    }

    public static final long b(long j, g30 g30Var) {
        long jA = a((rv) g30Var.E(a), j);
        return (jA > yu.h ? 1 : (jA == yu.h ? 0 : -1)) != 0 ? jA : ((yu) g30Var.E(r70.a)).a;
    }

    public static rv c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, int i) {
        return new rv((i & 1) != 0 ? hH.d(4284612846L) : j, (i & 2) != 0 ? hH.d(4281794739L) : j2, (i & 4) != 0 ? hH.d(4278442694L) : j3, (i & 8) != 0 ? hH.d(4278290310L) : j4, (i & 16) != 0 ? yu.d : j5, (i & 32) != 0 ? yu.d : j6, (i & 64) != 0 ? hH.d(4289724448L) : j7, (i & 128) != 0 ? yu.d : 0L, (i & 256) != 0 ? yu.b : 0L, (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? yu.b : j8, (i & 1024) != 0 ? yu.b : j9, (i & 2048) != 0 ? yu.d : 0L, true);
    }
}
