package defpackage;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: loaded from: classes.dex */
public final class u4 extends AutofillManager.AutofillCallback {
    public static final u4 a = new u4();

    public final void a(tZ tZVar) {
        tZVar.c.registerCallback(this);
    }

    public final void b(tZ tZVar) {
        tZVar.c.unregisterCallback(this);
    }

    public final void onAutofillEvent(View view, int i, int i2) {
        String str;
        super.onAutofillEvent(view, i, i2);
        if (i2 == 1) {
            str = "Autofill popup was shown.";
        } else if (i2 != 2) {
            str = i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account";
        } else {
            str = "Autofill popup was hidden.";
        }
        Log.d("Autofill Status", str);
    }
}
