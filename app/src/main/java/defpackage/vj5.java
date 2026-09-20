package defpackage;

import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes3.dex */
public final class vj5 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        Field field = bi5.a;
        bi5.T23.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
