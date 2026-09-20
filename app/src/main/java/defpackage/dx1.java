package defpackage;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class dx1 extends cx1 implements x81<Context, Intent, sd5> {
    public final /* synthetic */ h81<sd5> w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(zo2 zo2Var) {
        super(2);
        this.w = zo2Var;
    }

    @Override // defpackage.x81
    public final sd5 invoke(Context context, Intent intent) {
        this.w.invoke();
        return sd5.a;
    }
}
