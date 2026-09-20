package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c94 {

    public static final class QnHx extends cx1 implements y81<pg2, g30, Integer, pg2> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ j81<o94, sd5> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(j81 j81Var, boolean z) {
            super(3);
            this.w = z;
            this.x = j81Var;
        }

        @Override // defpackage.y81
        public final pg2 invoke(pg2 pg2Var, g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            num.intValue();
            g30Var2.e(-140499264);
            g30Var2.e(-492369756);
            Object objF = g30Var2.f();
            if (objF == g30.QnHx.a) {
                objF = Integer.valueOf(b94.y.addAndGet(1));
                g30Var2.B(objF);
            }
            g30Var2.G();
            b94 b94Var = new b94(((Number) objF).intValue(), this.w, this.x);
            g30Var2.G();
            return b94Var;
        }
    }

    public static final pg2 a(pg2 pg2Var, boolean z, j81<? super o94, sd5> j81Var) {
        return f30.a(pg2Var, wo1.a, new QnHx(j81Var, z));
    }
}
