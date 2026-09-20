package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a22 extends cx1 implements j81<Object, Integer> {
    public final /* synthetic */ o02 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a22(p02 p02Var) {
        super(1);
        this.w = p02Var;
    }

    @Override // defpackage.j81
    public final Integer invoke(Object obj) {
        o02 o02Var = this.w;
        int iG = o02Var.g();
        int i = 0;
        while (i < iG) {
            if (ur1.a(o02Var.a(Integer.valueOf(i).intValue()), obj)) {
                return Integer.valueOf(i);
            }
            i++;
        }
        i = -1;
        return Integer.valueOf(i);
    }
}
