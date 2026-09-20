package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dm3 extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ m24 w;
    public final /* synthetic */ String x;
    public final /* synthetic */ is4<d34<Object, Object>> y;
    public final /* synthetic */ is4<Object> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm3(m24 m24Var, String str, ri2 ri2Var, ri2 ri2Var2) {
        super(1);
        this.w = m24Var;
        this.x = str;
        this.y = ri2Var;
        this.z = ri2Var2;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        String str;
        is4<d34<Object, Object>> is4Var = this.y;
        is4<Object> is4Var2 = this.z;
        m24 m24Var = this.w;
        cm3 cm3Var = new cm3(is4Var, is4Var2, m24Var);
        Object objInvoke = cm3Var.invoke();
        if (objInvoke == null || m24Var.a(objInvoke)) {
            return new bm3(m24Var.b(this.x, cm3Var));
        }
        if (objInvoke instanceof pp4) {
            pp4 pp4Var = (pp4) objInvoke;
            if (pp4Var.j() == eo2.a || pp4Var.j() == tv4.a || pp4Var.j() == ml3.a) {
                str = "MutableState containing " + pp4Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = objInvoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new IllegalArgumentException(str);
    }
}
