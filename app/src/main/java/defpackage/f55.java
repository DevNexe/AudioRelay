package defpackage;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f55 implements co1 {
    public final /* synthetic */ d55 a;

    public f55(d55 d55Var) {
        this.a = d55Var;
    }

    @Override // defpackage.co1
    public final void a(KeyEvent keyEvent) {
        ((BaseInputConnection) this.a.i.getValue()).sendKeyEvent(keyEvent);
    }

    @Override // defpackage.co1
    public final void b(ArrayList arrayList) {
        this.a.d.invoke(arrayList);
    }

    @Override // defpackage.co1
    public final void c(int i) {
        this.a.e.invoke(new hj1(i));
    }
}
