package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ab5 implements iw0 {
    public final /* synthetic */ int a;
    public final og3 b;
    public final og3 c;
    public final og3 d;
    public final og3 e;
    public final og3 f;

    public /* synthetic */ ab5(iw0 iw0Var, iw0 iw0Var2, iw0 iw0Var3, int i) {
        s75 s75Var = s75.QnHx.a;
        t75 t75Var = t75.QnHx.a;
        this.a = i;
        this.b = s75Var;
        this.c = t75Var;
        this.d = iw0Var;
        this.e = iw0Var2;
        this.f = iw0Var3;
    }

    @Override // defpackage.og3
    public final Object get() {
        pz1 sm0Var;
        int i = this.a;
        og3 og3Var = this.f;
        og3 og3Var2 = this.e;
        og3 og3Var3 = this.d;
        og3 og3Var4 = this.c;
        og3 og3Var5 = this.b;
        switch (i) {
            case 0:
                return new ya5((at) og3Var5.get(), (at) og3Var4.get(), (b54) og3Var3.get(), (ne5) og3Var2.get(), (ln5) og3Var.get());
            default:
                at atVar = (at) og3Var5.get();
                at atVar2 = (at) og3Var4.get();
                Object obj = og3Var3.get();
                Object obj2 = og3Var2.get();
                Object obj3 = sm0.c;
                if (og3Var instanceof pz1) {
                    sm0Var = (pz1) og3Var;
                } else {
                    og3Var.getClass();
                    sm0Var = new sm0(og3Var);
                }
                return new y14(atVar, atVar2, (nu0) obj, (r54) obj2, sm0Var);
        }
    }
}
