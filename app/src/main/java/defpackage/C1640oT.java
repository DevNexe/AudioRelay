package defpackage;

import android.graphics.Typeface;

/* JADX INFO: renamed from: o€T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1640oT extends cx1 implements a91<e41, x41, v41, w41, Typeface> {
    public final /* synthetic */ h w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1640oT(h hVar) {
        super(4);
        this.w = hVar;
    }

    @Override // defpackage.a91
    public final Typeface I(e41 e41Var, x41 x41Var, v41 v41Var, w41 w41Var) {
        int i = v41Var.a;
        int i2 = w41Var.a;
        h hVar = this.w;
        jc5 jc5Var = new jc5(hVar.e.a(e41Var, x41Var, i, i2));
        hVar.j.add(jc5Var);
        return (Typeface) jc5Var.b;
    }
}
