package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class t85 {

    public static class QnHx {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            QnHx.a(view, charSequence);
            return;
        }
        v85 v85Var = v85.G;
        if (v85Var != null && v85Var.w == view) {
            v85.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new v85(view, charSequence);
            return;
        }
        v85 v85Var2 = v85.H;
        if (v85Var2 != null && v85Var2.w == view) {
            v85Var2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
