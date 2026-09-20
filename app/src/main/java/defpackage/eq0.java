package defpackage;

import android.widget.AutoCompleteTextView;
import com.google.android.material.textfield.CQf;

/* JADX INFO: loaded from: classes3.dex */
public final class eq0 implements AutoCompleteTextView.OnDismissListener {
    public final /* synthetic */ CQf a;

    public eq0(CQf cQf) {
        this.a = cQf;
    }

    @Override // android.widget.AutoCompleteTextView.OnDismissListener
    public final void onDismiss() {
        CQf cQf = this.a;
        cQf.i = true;
        cQf.k = System.currentTimeMillis();
        cQf.f(false);
    }
}
