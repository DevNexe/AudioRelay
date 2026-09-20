package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wf2 extends cx1 implements j81<Boolean, sd5> {
    public final /* synthetic */ j81<ev3, sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wf2(j81<? super ev3, sd5> j81Var) {
        super(1);
        this.w = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ev3.Com1Fixed com1 = new ev3.Com1Fixed(zBooleanValue);
        j81<ev3, sd5> j81Var = this.w;
        j81Var.invoke(com1);
        if (zBooleanValue) {
            j81Var.invoke(new ev3.SjP(zk5.QnHx.C0234QnHx.a));
        }
        return sd5.a;
    }
}
