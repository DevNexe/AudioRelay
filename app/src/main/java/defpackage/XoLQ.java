package defpackage;

import android.view.PointerIcon;
import android.view.View;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes.dex */
public final class XoLQ {
    public static final XoLQ a = new XoLQ();

    public final void a(View view, a93 a93Var) {
        PointerIcon systemIcon;
        if (a93Var instanceof mHI) {
            ((mHI) a93Var).getClass();
            systemIcon = null;
        } else {
            systemIcon = a93Var instanceof cbV3 ? PointerIcon.getSystemIcon(view.getContext(), ((cbV3) a93Var).a) : PointerIcon.getSystemIcon(view.getContext(), AdError.NETWORK_ERROR_CODE);
        }
        if (ur1.a(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
