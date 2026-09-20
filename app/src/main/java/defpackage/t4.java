package defpackage;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;

/* JADX INFO: loaded from: classes.dex */
public final class t4 {
    public static final t4 a = new t4();

    public final AutofillId a(ViewStructure viewStructure) {
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i) {
        viewStructure.setAutofillId(autofillId, i);
    }

    public final void h(ViewStructure viewStructure, int i) {
        viewStructure.setAutofillType(i);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        return autofillValue.getTextValue();
    }
}
