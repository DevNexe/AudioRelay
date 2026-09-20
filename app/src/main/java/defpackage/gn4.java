package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gn4 extends cx1 implements j81<o94, sd5> {
    public final /* synthetic */ float A;
    public final /* synthetic */ j81<Float, sd5> B;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ rt<Float> x;
    public final /* synthetic */ int y;
    public final /* synthetic */ List<Float> z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gn4(boolean z, rt<Float> rtVar, int i, List<Float> list, float f, j81<? super Float, sd5> j81Var) {
        super(1);
        this.w = z;
        this.x = rtVar;
        this.y = i;
        this.z = list;
        this.A = f;
        this.B = j81Var;
    }

    @Override // defpackage.j81
    public final sd5 invoke(o94 o94Var) {
        o94 o94Var2 = o94Var;
        if (!this.w) {
            qv1<Object>[] qv1VarArr = l94.a;
            o94Var2.a(i94.i, sd5.a);
        }
        fn4 fn4Var = new fn4(this.x, this.y, this.z, this.A, this.B);
        qv1<Object>[] qv1VarArr2 = l94.a;
        o94Var2.a(w84.f, new FA4(null, fn4Var));
        return sd5.a;
    }
}
