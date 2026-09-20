package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class tZ implements k4 {
    public final View a;
    public final w4 b;
    public final AutofillManager c;

    public tZ(View view, w4 w4Var) {
        this.a = view;
        this.b = w4Var;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.".toString());
        }
        this.c = autofillManager;
        view.setImportantForAutofill(1);
    }
}
