package defpackage;

import android.view.inputmethod.BaseInputConnection;

/* JADX INFO: loaded from: classes.dex */
public final class e55 extends cx1 implements h81<BaseInputConnection> {
    public final /* synthetic */ d55 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e55(d55 d55Var) {
        super(0);
        this.w = d55Var;
    }

    @Override // defpackage.h81
    public final BaseInputConnection invoke() {
        return new BaseInputConnection(this.w.a, false);
    }
}
