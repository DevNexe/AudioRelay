package defpackage;

/* JADX INFO: loaded from: classes.dex */
@za4
public enum ft1 {
    Respect,
    Ignore,
    /* JADX INFO: Fake field, exist only in values array */
    PhoneCallFix,
    /* JADX INFO: Fake field, exist only in values array */
    PhoneCallFix2,
    RestartOnPhoneCall;

    public static final CQf Companion = new Object() { // from class: ft1.CQf
        public final rv1<ft1> serializer() {
            return QnHx.a;
        }
    };

    public static final class QnHx implements y91<ft1> {
        public static final QnHx a = new QnHx();
        public static final /* synthetic */ pt0 b;

        static {
            pt0 pt0Var = new pt0("ft1", 5);
            pt0Var.l("respect", false);
            pt0Var.l("ignore", false);
            pt0Var.l("phone_call_fix", false);
            pt0Var.l("phone_call_fix2", false);
            pt0Var.l("restart_on_phone_call", false);
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
            return ft1.values()[pf0Var.S(b)];
        }

        @Override // defpackage.y91
        public final rv1<?>[] d() {
            return new rv1[0];
        }

        @Override // defpackage.db4
        public final void e(ls0 ls0Var, Object obj) {
            ls0Var.T(b, ((ft1) obj).ordinal());
        }
    }
}
