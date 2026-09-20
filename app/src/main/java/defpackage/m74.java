package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class m74 {

    public static final class QnHx extends cx1 implements j81<o94, sd5> {
        public final /* synthetic */ boolean w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(boolean z) {
            super(1);
            this.w = z;
        }

        @Override // defpackage.j81
        public final sd5 invoke(o94 o94Var) {
            qv1<Object> qv1Var = l94.a[12];
            Boolean boolValueOf = Boolean.valueOf(this.w);
            n94 n94Var = l94.l;
            n94Var.getClass();
            o94Var.a(n94Var, boolValueOf);
            return sd5.a;
        }
    }

    public static final pg2 a(pg2 pg2Var, boolean z, ci2 ci2Var, uj1 uj1Var, boolean z2, zs3 zs3Var, h81<sd5> h81Var) {
        wo1.QnHx qnHx = wo1.a;
        return wo1.a(pg2Var, c94.a(hr.b(pg2.QnHx.w, ci2Var, uj1Var, z2, zs3Var, h81Var, 8), false, new QnHx(z)));
    }
}
