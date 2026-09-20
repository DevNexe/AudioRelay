package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class ko1 implements jo1 {
    public final oz1 a;

    public static final class QnHx extends cx1 implements h81<InputMethodManager> {
        public final /* synthetic */ Context w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(Context context) {
            super(0);
            this.w = context;
        }

        @Override // defpackage.h81
        public final InputMethodManager invoke() {
            Object systemService = this.w.getSystemService("input_method");
            if (systemService != null) {
                return (InputMethodManager) systemService;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    public ko1(Context context) {
        this.a = qLd.h(3, new QnHx(context));
    }

    @Override // defpackage.jo1
    public final void a(IBinder iBinder) {
        ((InputMethodManager) this.a.getValue()).hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // defpackage.jo1
    public final void b(View view) {
        ((InputMethodManager) this.a.getValue()).showSoftInput(view, 0);
    }

    @Override // defpackage.jo1
    public final void c(View view, int i, int i2, int i3, int i4) {
        ((InputMethodManager) this.a.getValue()).updateSelection(view, i, i2, i3, i4);
    }

    @Override // defpackage.jo1
    public final void d(View view, int i, ExtractedText extractedText) {
        ((InputMethodManager) this.a.getValue()).updateExtractedText(view, i, extractedText);
    }

    @Override // defpackage.jo1
    public final void e(View view) {
        ((InputMethodManager) this.a.getValue()).restartInput(view);
    }
}
