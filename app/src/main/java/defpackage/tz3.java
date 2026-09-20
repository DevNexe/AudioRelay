package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class tz3 extends cx1 implements j81<Context, fy1> {
    public final /* synthetic */ vp w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz3(vp vpVar) {
        super(1);
        this.w = vpVar;
    }

    @Override // defpackage.j81
    public final fy1 invoke(Context context) {
        fy1 fy1Var = new fy1(context);
        fy1Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        fy1Var.a(this.w);
        return fy1Var;
    }
}
