package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class cm1 extends cx1 implements h81<yr3> {
    public final /* synthetic */ dm1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm1(dm1 dm1Var) {
        super(0);
        this.w = dm1Var;
    }

    @Override // defpackage.h81
    public final yr3 invoke() {
        dm1 dm1Var = this.w;
        Context context = dm1Var.a.getContext();
        W8 w8 = dm1Var.b;
        return new yr3(context, w8.e(), w8.l());
    }
}
