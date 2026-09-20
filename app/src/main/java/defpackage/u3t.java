package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class u3t extends cx1 implements j81<zl0, yl0> {
    public final /* synthetic */ Context w;
    public final /* synthetic */ ORW x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3t(Context context, ORW orw) {
        super(1);
        this.w = context;
        this.x = orw;
    }

    @Override // defpackage.j81
    public final yl0 invoke(zl0 zl0Var) {
        Context context = this.w;
        Context applicationContext = context.getApplicationContext();
        ORW orw = this.x;
        applicationContext.registerComponentCallbacks(orw);
        return new uc(context, orw);
    }
}
