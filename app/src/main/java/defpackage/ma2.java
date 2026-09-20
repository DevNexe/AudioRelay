package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ma2<S> extends u23<S> {
    public int p0;
    public ef0<S> q0;
    public com.google.android.material.datepicker.QnHx r0;

    public class QnHx extends wu2<S> {
        public QnHx() {
        }

        @Override // defpackage.wu2
        public final void a(S s) {
            Iterator<wu2<S>> it = ma2.this.o0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void r(Bundle bundle) {
        super.r(bundle);
        if (bundle == null) {
            bundle = this.B;
        }
        this.p0 = bundle.getInt("THEME_RES_ID_KEY");
        this.q0 = (ef0) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.r0 = (com.google.android.material.datepicker.QnHx) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(j(), this.p0));
        ef0<S> ef0Var = this.q0;
        new QnHx();
        return ef0Var.u();
    }

    @Override // androidx.fragment.app.Fragment
    public final void y(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.q0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.r0);
    }
}
