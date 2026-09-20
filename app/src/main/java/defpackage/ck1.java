package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 extends cx1 implements h81<sd5> {
    public final /* synthetic */ Object w;
    public final /* synthetic */ bk1.QnHx<Object, Object> x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ ak1<Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck1(Number number, bk1.QnHx qnHx, Number number2, ak1 ak1Var) {
        super(0);
        this.w = number;
        this.x = qnHx;
        this.y = number2;
        this.z = ak1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    @Override // defpackage.h81
    public final sd5 invoke() {
        bk1.QnHx<Object, Object> qnHx = this.x;
        Object obj = qnHx.w;
        ?? r2 = this.w;
        boolean zA = ur1.a(r2, obj);
        ?? r3 = this.y;
        if (!zA || !ur1.a(r3, qnHx.x)) {
            qnHx.w = r2;
            qnHx.x = r3;
            ak1<Object> ak1Var = this.z;
            qnHx.z = ak1Var;
            qnHx.B = new t05<>(ak1Var, qnHx.y, r2, r3);
            bk1.this.b.setValue(Boolean.TRUE);
            qnHx.C = false;
            qnHx.D = true;
        }
        return sd5.a;
    }
}
