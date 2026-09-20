package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mg1 {
    public static final QnHx a = new QnHx();
    public static final Dt<mg1> b = new Dt<>("RequestLifecycle");

    public static final class QnHx implements kf1<sd5, mg1> {
        @Override // defpackage.kf1
        public final void a(mg1 mg1Var, ue1 ue1Var) {
            ue1Var.A.f(pg1.f, new lg1(ue1Var, null));
        }

        @Override // defpackage.kf1
        public final mg1 b(j81<? super sd5, sd5> j81Var) {
            return new mg1();
        }

        @Override // defpackage.kf1
        public final Dt<mg1> getKey() {
            return mg1.b;
        }
    }
}
