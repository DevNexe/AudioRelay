package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class to2 extends cx1 implements j81<uy2<? extends String, ? extends String>, CharSequence> {
    public static final to2 w = new to2();

    public to2() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j81
    public final CharSequence invoke(uy2<? extends String, ? extends String> uy2Var) {
        uy2<? extends String, ? extends String> uy2Var2 = uy2Var;
        return ((String) uy2Var2.w) + ": " + ((String) uy2Var2.x) + '\n';
    }
}
