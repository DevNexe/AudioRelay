package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ok1 extends cx1 implements j81<Context, w71> {
    public final /* synthetic */ jk1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok1(jk1 jk1Var) {
        super(1);
        this.w = jk1Var;
    }

    @Override // defpackage.j81
    public final w71 invoke(Context context) {
        jk1 jk1Var = this.w;
        return new w71(jk1Var.b.getContext(), new Dz(jk1Var.f(), jk1Var.g(), new nk1(jk1Var)));
    }
}
