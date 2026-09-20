package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yo2 implements um {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.um
    public final void cancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ap2 ap2Var = (ap2) obj;
                ap2Var.a.unregisterReceiver((ex1) ap2Var.d.getValue());
                break;
            default:
                ((fl3) obj).w = false;
                break;
        }
    }
}
