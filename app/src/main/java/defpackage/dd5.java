package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dd5 extends cx1 implements j81<uy2<? extends String, ? extends String>, CharSequence> {
    public static final dd5 w = new dd5();

    public dd5() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final CharSequence invoke(uy2<? extends String, ? extends String> uy2Var) {
        uy2<? extends String, ? extends String> uy2Var2 = uy2Var;
        String str = (String) uy2Var2.w;
        Object obj = uy2Var2.x;
        if (obj == null) {
            return str;
        }
        return str + '=' + String.valueOf(obj);
    }
}
