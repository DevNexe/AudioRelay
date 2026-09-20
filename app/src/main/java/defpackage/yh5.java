package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class yh5 extends bi5.CQf<CharSequence> {
    public yh5() {
        super(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    @Override // bi5.CQf
    public final CharSequence b(View view) {
        return bi5.PRnFixed.b(view);
    }

    @Override // bi5.CQf
    public final void c(View view, CharSequence charSequence) {
        bi5.PRnFixed.h(view, charSequence);
    }

    @Override // bi5.CQf
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
