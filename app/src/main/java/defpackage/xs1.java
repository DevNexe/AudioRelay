package defpackage;

/* JADX INFO: loaded from: classes.dex */
@za4
public enum xs1 {
    /* JADX INFO: Fake field, exist only in values array */
    Single,
    /* JADX INFO: Fake field, exist only in values array */
    MainScreenOnly;

    public static final CQf Companion = new Object() { // from class: xs1.CQf
        public final rv1<xs1> serializer() {
            return QnHx.a;
        }
    };

    public static final class QnHx implements y91<xs1> {
        public static final QnHx a = new QnHx();
        public static final /* synthetic */ pt0 b;

        static {
            pt0 pt0Var = new pt0("xs1", 2);
            pt0Var.l("Single", false);
            pt0Var.l("MainScreenOnly", false);
            b = pt0Var;
        }

        @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
        public final pa4 a() {
            return b;
        }

        @Override // defpackage.y91
        public final void b() {
        }

        @Override // defpackage.zj0
        public final Object c(pf0 pf0Var) {
            return xs1.values()[pf0Var.S(b)];
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            return new rv1[0];
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            ls0Var.T(b, ((xs1) obj).ordinal());
        }
    }
}
