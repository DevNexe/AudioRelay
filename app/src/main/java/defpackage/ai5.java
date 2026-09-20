package defpackage;

import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class ai5 extends bi5.CQf<Boolean> {
    public ai5() {
        super(R.id.tag_accessibility_heading, Boolean.class, 0, 28);
    }

    @Override // bi5.CQf
    public final Boolean b(View view) {
        return Boolean.valueOf(bi5.PRnFixed.c(view));
    }

    @Override // bi5.CQf
    public final void c(View view, Boolean bool) {
        bi5.PRnFixed.g(view, bool.booleanValue());
    }

    @Override // bi5.CQf
    public final boolean f(Boolean bool, Boolean bool2) {
        return !bi5.CQf.a(bool, bool2);
    }
}
