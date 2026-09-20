package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jj2 extends cx1 implements j81<fj2, fj2> {
    public final /* synthetic */ String w;
    public final /* synthetic */ List<uj2> x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj2(String str, List<uj2> list) {
        super(1);
        this.w = str;
        this.x = list;
    }

    @Override // defpackage.j81
    public final fj2 invoke(fj2 fj2Var) {
        return new fj2(this.w, new kj1(this.x));
    }
}
