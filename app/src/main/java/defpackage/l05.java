package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l05 extends cx1 implements h81<Object> {
    public final /* synthetic */ m05<Object> w;
    public final /* synthetic */ zj0<Object> x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l05(m05 m05Var, rv1 rv1Var, Object obj) {
        super(0);
        this.w = m05Var;
        this.x = rv1Var;
        this.y = obj;
    }

    @Override // defpackage.h81
    public final Object invoke() {
        m05<Object> m05Var = this.w;
        if (m05Var.X()) {
            return m05Var.O(this.x);
        }
        m05Var.getClass();
        return null;
    }
}
