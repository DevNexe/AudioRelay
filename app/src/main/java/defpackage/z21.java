package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z21 {
    public static final mg3<a31> a = new mg3<>(QnHx.w);

    public static final class CQf extends cx1 implements h81<sd5> {
        public final /* synthetic */ r21 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(r21 r21Var) {
            super(0);
            this.w = r21Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            r21 r21Var = this.w;
            a31 a31Var = r21Var.E;
            if (a31Var != null) {
                a31Var.b(r21Var.F);
            }
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements h81<a31> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ a31 invoke() {
            return null;
        }
    }

    public static final void a(r21 r21Var) {
        cx2 snapshotObserver;
        kz1 kz1Var = r21Var.H;
        if (kz1Var == null) {
            return;
        }
        y21 y21Var = r21Var.F;
        y21Var.a = true;
        b31 b31Var = b31.b;
        y21Var.b = b31Var;
        y21Var.c = b31Var;
        y21Var.d = b31Var;
        y21Var.e = b31Var;
        y21Var.f = b31Var;
        y21Var.g = b31Var;
        y21Var.h = b31Var;
        y21Var.i = b31Var;
        ww2 ww2Var = kz1Var.A.C;
        if (ww2Var != null && (snapshotObserver = ww2Var.getSnapshotObserver()) != null) {
            snapshotObserver.a(r21Var, r21.L, new CQf(r21Var));
        }
        if (!y21Var.a) {
            OW8.n(r21Var);
            return;
        }
        int iOrdinal = r21Var.z.ordinal();
        if (iOrdinal == 3) {
            r21Var.b(g31.Inactive);
        } else {
            if (iOrdinal != 4) {
                return;
            }
            r21Var.b(g31.ActiveParent);
        }
    }
}
