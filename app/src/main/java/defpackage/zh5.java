package defpackage;

import android.text.TextUtils;
import android.view.View;
import com.azefsw.audioconnect.R;

/* JADX INFO: loaded from: classes.dex */
public final class zh5 extends bi5.CQf<CharSequence> {
    public zh5() {
        super(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    @Override // bi5.CQf
    public final CharSequence b(View view) {
        return bi5.RBi.a(view);
    }

    @Override // bi5.CQf
    public final void c(View view, CharSequence charSequence) {
        bi5.RBi.b(view, charSequence);
    }

    @Override // bi5.CQf
    public final boolean f(CharSequence charSequence, CharSequence charSequence2) {
        return !TextUtils.equals(charSequence, charSequence2);
    }
}
