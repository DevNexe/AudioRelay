package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k94 extends cx1 implements x81<FA4<t81<? extends Boolean>>, FA4<t81<? extends Boolean>>, FA4<t81<? extends Boolean>>> {
    public static final k94 w = new k94();

    public k94() {
        super(2);
    }

    @Override // defpackage.x81
    public final FA4<t81<? extends Boolean>> invoke(FA4<t81<? extends Boolean>> fa4, FA4<t81<? extends Boolean>> fa5) {
        String str;
        t81 t81Var;
        FA4<t81<? extends Boolean>> fa6 = fa4;
        FA4<t81<? extends Boolean>> fa7 = fa5;
        if (fa6 == null || (str = fa6.a) == null) {
            str = fa7.a;
        }
        if (fa6 == null || (t81Var = fa6.b) == null) {
            t81Var = fa7.b;
        }
        return new FA4<>(str, t81Var);
    }
}
