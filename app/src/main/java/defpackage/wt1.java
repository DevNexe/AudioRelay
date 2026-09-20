package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wt1 {
    public final yq0 a;
    public boolean b;

    public /* synthetic */ class QnHx extends l91 implements x81<pa4, Integer, Boolean> {
        public QnHx(Object obj) {
            super(2, obj, wt1.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // defpackage.x81
        public final Boolean invoke(pa4 pa4Var, Integer num) {
            pa4 pa4Var2 = pa4Var;
            int iIntValue = num.intValue();
            wt1 wt1Var = (wt1) this.x;
            wt1Var.getClass();
            boolean z = !pa4Var2.k(iIntValue) && pa4Var2.j(iIntValue).c();
            wt1Var.b = z;
            return Boolean.valueOf(z);
        }
    }

    public wt1(pa4 pa4Var) {
        this.a = new yq0(pa4Var, new QnHx(this));
    }
}
